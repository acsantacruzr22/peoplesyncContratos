import axios from 'axios'

const API_URL = 'http://localhost:8081/contratos'

export default {

  listar() {
    return axios.get(API_URL)
  },

  buscarPorId(id) {
    return axios.get(`${API_URL}/${id}`)
  },

  guardar(contrato) {
    return axios.post(API_URL, contrato)
  },

  actualizar(contrato) {
    return axios.put(API_URL, contrato)
  },

  eliminar(id) {
    return axios.delete(`${API_URL}/${id}`)
  }

}