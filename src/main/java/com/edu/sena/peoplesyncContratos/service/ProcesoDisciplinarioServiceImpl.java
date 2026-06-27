package com.edu.sena.peoplesyncContratos.service;

import com.edu.sena.peoplesyncContratos.entity.ProcesoDisciplinario;
import com.edu.sena.peoplesyncContratos.repository.ProcesoDisciplinarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcesoDisciplinarioServiceImpl implements IProcesoDisciplinarioService {

    @Autowired
    private ProcesoDisciplinarioRepository repository;

    @Override
    public List<ProcesoDisciplinario> listar() {
        return repository.findAll();
    }

    @Override
    public ProcesoDisciplinario buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public ProcesoDisciplinario guardar(ProcesoDisciplinario proceso) {
        return repository.save(proceso);
    }

    @Override
    public ProcesoDisciplinario actualizar(ProcesoDisciplinario proceso) {
        return repository.save(proceso);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

}