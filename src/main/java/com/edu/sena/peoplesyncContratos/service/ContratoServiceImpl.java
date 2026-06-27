package com.edu.sena.peoplesyncContratos.service;

import com.edu.sena.peoplesyncContratos.entity.Contrato;
import com.edu.sena.peoplesyncContratos.repository.ContratoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratoServiceImpl implements IContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public List<Contrato> listar() {
        return contratoRepository.findAll();
    }

    @Override
    public Contrato buscarPorId(Integer id) {
        return contratoRepository.findById(id).orElse(null);
    }

    @Override
    public Contrato guardar(Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    @Override
    public Contrato actualizar(Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    @Override
    public void eliminar(Integer id) {
        contratoRepository.deleteById(id);
    }

}