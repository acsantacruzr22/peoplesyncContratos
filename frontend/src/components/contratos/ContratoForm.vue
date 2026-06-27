<script setup>

const contrato = defineModel()

const emit = defineEmits(['guardar'])

function guardar() {
  emit('guardar')
}

</script>

<template>

  <h2>
    {{ contrato.idContrato ? 'Editar Contrato' : 'Nuevo Contrato' }}
  </h2>

  <form @submit.prevent="guardar">

    <div>
      <label>ID Empleado</label><br>
      <input
        type="number"
        v-model="contrato.idEmpleado">
    </div>

    <br>

    <div>
      <label>Fecha Inicio</label><br>
      <input
        type="date"
        v-model="contrato.fechaInicio">
    </div>

    <br>

    <div>
      <label>Fecha Fin</label><br>
      <input
        type="date"
        v-model="contrato.fechaFin">
    </div>

<br>

    <div>
      <label>Estado</label><br>

      <select v-model="contrato.estado">

        <option value="ACTIVO">ACTIVO</option>
        <option value="FINALIZADO">FINALIZADO</option>

      </select>

    </div>

    <br>

    <div>
      <label>Observaciones</label><br>

      <textarea
        v-model="contrato.observaciones">
      </textarea>

    </div>

    <br>

    <button type="submit">
      {{ contrato.idContrato ? 'Actualizar' : 'Guardar' }}
    </button>

  </form>

</template>