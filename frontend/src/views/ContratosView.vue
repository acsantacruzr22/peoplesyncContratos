<script setup>
import ContratoForm from '../components/contratos/ContratoForm.vue'
import ContratoTable from '../components/contratos/ContratoTable.vue'
import { ref, onMounted } from 'vue'
import ContratoService from '../services/ContratoService'

const contratos = ref([])

const nuevoContrato = ref({
  idEmpleado: '',
  fechaInicio: '',
  estado: 'ACTIVO',
  observaciones: ''
})

onMounted(() => {

  cargarContratos()

})

function guardarContrato() {

  if (nuevoContrato.value.idContrato) {

    ContratoService.actualizar(nuevoContrato.value)

      .then(() => {

        cargarContratos()

        limpiarFormulario()

        alert("Contrato actualizado correctamente.")

      })

      .catch(error => console.error(error))

  } else {

    ContratoService.guardar(nuevoContrato.value)

      .then(response => {

        contratos.value.push(response.data)

        limpiarFormulario()

        alert("Contrato registrado correctamente.")

      })

      .catch(error => console.error(error))

  }

}

function cargarContratos() {

  ContratoService.listar()
    .then(response => {
      contratos.value = response.data
    })
    .catch(error => {
      console.error(error)
    })

}

function limpiarFormulario() {

  nuevoContrato.value = {

    idEmpleado: '',
    fechaInicio: '',
    estado: 'ACTIVO',
    observaciones: ''

  }

}

function eliminarContrato(id) {

  if (!confirm("¿Desea eliminar este contrato?")) {
    return
  }

  ContratoService.eliminar(id)
    .then(() => {

      contratos.value = contratos.value.filter(
        contrato => contrato.idContrato !== id
      )

      alert("Contrato eliminado correctamente.")

    })
    .catch(error => {

      console.error(error)

      alert("No fue posible eliminar el contrato.")

    })

}

function editarContrato(contrato) {

  nuevoContrato.value = { ...contrato }

}


</script>

<template>
  <div class="contenedor">

    <h1>Gestión de Contratos</h1>


    <ContratoForm
      v-model="nuevoContrato"
      @guardar="guardarContrato" />

    <hr>

    <ContratoTable
      :contratos="contratos"
      @editar="editarContrato"
      @eliminar="eliminarContrato"
    />

  </div>
</template>

<style scoped>

.contenedor{
  max-width:1000px;
  margin:auto;
  padding:40px;
  font-family:Arial, Helvetica, sans-serif;
}

table{
  width:100%;
  border-collapse:collapse;
  margin-top:20px;
}

th,td{
  border:1px solid #ccc;
  padding:10px;
  text-align:center;
}

th{
  background:#1976D2;
  color:white;
}

</style>