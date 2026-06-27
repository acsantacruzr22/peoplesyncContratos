package com.edu.sena.peoplesyncContratos.service;

import com.edu.sena.peoplesyncContratos.entity.ProcesoDisciplinario;
import java.util.List;

public interface IProcesoDisciplinarioService {

    List<ProcesoDisciplinario> listar();

    ProcesoDisciplinario buscarPorId(Integer id);

    ProcesoDisciplinario guardar(ProcesoDisciplinario proceso);

    ProcesoDisciplinario actualizar(ProcesoDisciplinario proceso);

    void eliminar(Integer id);

}