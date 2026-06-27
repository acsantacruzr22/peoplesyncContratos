package com.edu.sena.peoplesyncContratos.controller;

import com.edu.sena.peoplesyncContratos.entity.ProcesoDisciplinario;
import com.edu.sena.peoplesyncContratos.service.IProcesoDisciplinarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/procesos")
@CrossOrigin(origins = "http://localhost:5173")
public class ProcesoDisciplinarioController {

    @Autowired
    private IProcesoDisciplinarioService procesoService;

    @GetMapping
    public List<ProcesoDisciplinario> listar() {
        return procesoService.listar();
    }

    @GetMapping("/{id}")
    public ProcesoDisciplinario buscarPorId(@PathVariable Integer id) {
        return procesoService.buscarPorId(id);
    }

    @PostMapping
    public ProcesoDisciplinario guardar(@RequestBody ProcesoDisciplinario proceso) {
        return procesoService.guardar(proceso);
    }

    @PutMapping
    public ProcesoDisciplinario actualizar(@RequestBody ProcesoDisciplinario proceso) {
        return procesoService.actualizar(proceso);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        procesoService.eliminar(id);
    }
}