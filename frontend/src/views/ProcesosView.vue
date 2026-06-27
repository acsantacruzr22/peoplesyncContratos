<script setup>
import { ref, onMounted } from 'vue'
import ProcesoForm from '../components/procesos/ProcesoForm.vue'
import ProcesoTable from '../components/procesos/ProcesoTable.vue'
import ProcesoDisciplinarioService from '../services/ProcesoDisciplinarioService'

const procesos = ref([])

const nuevoProceso = ref({
  idEmpleado: '',
  fechaApertura: '',
  tipoFalta: '',
  descripcion: '',
  estado: 'ABIERTO',
  decision: '',
  fechaCierre: ''
})

function cargarProcesos() {
  ProcesoDisciplinarioService.listar()
    .then(response => {
      procesos.value = response.data
    })
    .catch(error => console.error(error))
}

onMounted(() => {
  cargarProcesos()
})

function guardarProceso() {

  if (nuevoProceso.value.idProceso) {

    ProcesoDisciplinarioService.actualizar(nuevoProceso.value)
      .then(() => {

        cargarProcesos()
        limpiarFormulario()

        alert("Proceso actualizado correctamente.")

      })
      .catch(error => console.error(error))

  } else {

    ProcesoDisciplinarioService.guardar(nuevoProceso.value)
      .then(response => {

        procesos.value.push(response.data)

        limpiarFormulario()

        alert("Proceso registrado correctamente.")

      })
      .catch(error => console.error(error))

  }

}

function editarProceso(proceso) {
  nuevoProceso.value = { ...proceso }
}

function eliminarProceso(id) {

  if (!confirm("¿Eliminar el proceso disciplinario?")) {
    return
  }

  ProcesoDisciplinarioService.eliminar(id)
    .then(() => {

      procesos.value = procesos.value.filter(
        proceso => proceso.idProceso !== id
      )

      alert("Proceso eliminado correctamente.")

    })
    .catch(error => console.error(error))

}

function limpiarFormulario() {

  nuevoProceso.value = {
    idEmpleado: '',
    fechaApertura: '',
    tipoFalta: '',
    descripcion: '',
    estado: 'ABIERTO',
    decision: '',
    fechaCierre: ''
  }

}
</script>

<template>

<div class="contenedor">

<h1>Gestión de Procesos Disciplinarios</h1>

<ProcesoForm
v-model="nuevoProceso"
@guardar="guardarProceso" />

<hr><br>

<ProcesoTable
:procesos="procesos"
@editar="editarProceso"
@eliminar="eliminarProceso" />

</div>

</template>

<style scoped>

.contenedor{
    max-width:1000px;
    margin:auto;
    padding:40px;
}

</style>