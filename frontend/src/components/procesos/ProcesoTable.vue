<script setup>

defineProps({
  procesos: Array
})

const emit = defineEmits(['editar','eliminar'])

</script>

<template>

<table>

<thead>

<tr>
<th>ID</th>
<th>Empleado</th>
<th>Tipo falta</th>
<th>Estado</th>
<th>Decisión</th>
<th>Acciones</th>
</tr>

</thead>

<tbody>

<tr
v-for="proceso in procesos"
:key="proceso.idProceso">

<td>{{ proceso.idProceso }}</td>
<td>{{ proceso.idEmpleado }}</td>
<td>{{ proceso.tipoFalta }}</td>
<td>{{ proceso.estado }}</td>
<td>{{ proceso.decision }}</td>

<td>

<button @click="emit('editar', proceso)">
Editar
</button>

<button @click="emit('eliminar', proceso.idProceso)">
Eliminar
</button>

</td>

</tr>

</tbody>

</table>

</template>

<style scoped>

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