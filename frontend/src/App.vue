<script setup>

import Navbar from './components/layout/Navbar.vue'
import Sidebar from './components/layout/Sidebar.vue'

</script>

<template>

<Navbar/>

<div class="contenido">

    <Sidebar/>

    <main>

        <RouterView/>

    </main>

</div>

</template>

<style>

body{

    margin:0;

}

.contenido{

    display:flex;

}

main{

    flex:1;

    padding:30px;

}

</style>