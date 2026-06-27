<template>

<aside class="sidebar">

    <RouterLink to="/">Inicio</RouterLink>

    <RouterLink to="/contratos">
        Contratos
    </RouterLink>

    <RouterLink to="/procesos">
        Procesos disciplinarios
    </RouterLink>

</aside>

</template>

<style scoped>

.sidebar{

    width:220px;
    background:#f4f4f4;
    padding:20px;
    min-height:100vh;

    display:flex;
    flex-direction:column;
    gap:15px;

}

a{

    text-decoration:none;
    color:#333;
    font-weight:bold;

}

a.router-link-active{

    color:#1976D2;

}

</style>