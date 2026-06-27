import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import ContratosView from '../views/ContratosView.vue'
import ProcesosView from '../views/ProcesosView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),

  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/contratos',
      name: 'contratos',
      component: ContratosView
    },

    {
      path: '/procesos',
      name: 'procesos',
      component: ProcesosView
    }
  ]
})

export default router