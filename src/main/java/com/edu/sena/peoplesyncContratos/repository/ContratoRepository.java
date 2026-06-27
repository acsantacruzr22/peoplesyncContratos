package com.edu.sena.peoplesyncContratos.repository;

import com.edu.sena.peoplesyncContratos.entity.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Integer> {

}
