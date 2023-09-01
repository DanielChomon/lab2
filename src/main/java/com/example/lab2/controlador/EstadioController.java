package com.example.lab2.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/estadio")
public class EstadioController {


    final EstadioRepository estadioRepository;

    public EstadioController(EstadioRepository estadioRepository) {
        this.estadioRepository = estadioRepository;
    }

    @GetMapping(value = {"/listar", ""})
    public String listarEstadios(Model model) {

        List<Estadio> lista = estadioRepository.findAll();
        model.addAttribute("estadioList", lista);

        return "/estadio/listar";
    }

    @GetMapping("/nuevo")
    public String nuevoEstadioFrm() {
        return "estadio/newFrm";
    }

    @PostMapping("/guardar")
    public String guardarNuevoEstadio(Estadio estadio) {
        estadioRepository.save(estadio);
        return "redirect:/estadio/listar";
    }

    @GetMapping("/borrar")
    public String borrarEstadio(Model model,
                                @RequestParam("id") int id) {

        Optional<Jugador> optShipper = jugadorRepository.findById(id);

        if (optShipper.isPresent()) {
            jugadorRepository.deleteById(id);
        }
        return "redirect:/jugador/listar";

    }
}
