<script setup>

defineProps({
  contratos: {
    type: Array,
    required: true
  }
})

const emit = defineEmits(['editar', 'eliminar'])

</script>

<template>

<table>

    <thead>

        <tr>
            <th>ID</th>
            <th>Empleado</th>
            <th>Fecha Inicio</th>
            <th>Fecha Fin</th>
            <th>Estado</th>
            <th>Acciones</th>
        </tr>

    </thead>

    <tbody>

        <tr
            v-for="contrato in contratos"
            :key="contrato.idContrato"
        >

            <td>{{ contrato.idContrato }}</td>
            <td>{{ contrato.idEmpleado }}</td>
            <td>{{ contrato.fechaInicio }}</td>
            <td>{{ contrato.fechaFin }}</td>
            <td>{{ contrato.estado }}</td>
            <td>
                <button @click="$emit('editar', contrato)">
                    Editar
                </button>
                <button @click="$emit('eliminar', contrato.idContrato)">
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