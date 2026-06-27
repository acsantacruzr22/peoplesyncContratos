import axios from 'axios'

const API_URL = 'http://localhost:8081/procesos'

export default {

  listar() {
    return axios.get(API_URL)
  },

  buscarPorId(id) {
    return axios.get(`${API_URL}/${id}`)
  },

  guardar(proceso) {
    return axios.post(API_URL, proceso)
  },

  actualizar(proceso) {
    return axios.put(API_URL, proceso)
  },

  eliminar(id) {
    return axios.delete(`${API_URL}/${id}`)
  }

}