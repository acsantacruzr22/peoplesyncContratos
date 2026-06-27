<script setup>

const proceso = defineModel()

const emit = defineEmits(['guardar'])

function guardar() {
  emit('guardar')
}

</script>

<template>

<form @submit.prevent="guardar">

  <div>
    <label>ID Empleado</label><br>
    <input type="number" v-model="proceso.idEmpleado">
  </div>

  <br>

  <div>
    <label>Fecha apertura</label><br>
    <input type="date" v-model="proceso.fechaApertura">
  </div>

  <br>

  <div>
    <label>Tipo de falta</label><br>
    <input type="text" v-model="proceso.tipoFalta">
  </div>

  <br>

  <div>
    <label>Descripción</label><br>
    <textarea v-model="proceso.descripcion"></textarea>
  </div>

  <br>

  <div>
    <label>Estado</label><br>

    <select v-model="proceso.estado">
      <option value="ABIERTO">ABIERTO</option>
      <option value="CERRADO">CERRADO</option>
    </select>

  </div>

  <br>

  <div>
    <label>Decisión</label><br>
    <textarea v-model="proceso.decision"></textarea>
  </div>

  <br>

  <div>
    <label>Fecha cierre</label><br>
    <input type="date" v-model="proceso.fechaCierre">
  </div>

  <br>

  <button type="submit">Guardar proceso</button>

</form>

</template>