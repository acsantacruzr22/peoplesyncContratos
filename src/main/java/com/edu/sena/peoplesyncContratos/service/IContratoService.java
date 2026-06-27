package com.edu.sena.peoplesyncContratos.service;

import com.edu.sena.peoplesyncContratos.entity.Contrato;
import java.util.List;

public interface IContratoService {

    List<Contrato> listar();

    Contrato buscarPorId(Integer id);

    Contrato guardar(Contrato contrato);

    Contrato actualizar(Contrato contrato);

    void eliminar(Integer id);

}