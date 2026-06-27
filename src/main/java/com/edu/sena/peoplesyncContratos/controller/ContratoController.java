package com.edu.sena.peoplesyncContratos.controller;

import com.edu.sena.peoplesyncContratos.entity.Contrato;
import com.edu.sena.peoplesyncContratos.service.IContratoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    private IContratoService contratoService;

    @GetMapping
    public List<Contrato> listar() {
        return contratoService.listar();
    }

    @GetMapping("/{id}")
    public Contrato buscarPorId(@PathVariable Integer id) {
        return contratoService.buscarPorId(id);
    }

    @PostMapping
    public Contrato guardar(@RequestBody Contrato contrato) {
        return contratoService.guardar(contrato);
    }

    @PutMapping
    public Contrato actualizar(@RequestBody Contrato contrato) {
        return contratoService.actualizar(contrato);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        contratoService.eliminar(id);
    }
}