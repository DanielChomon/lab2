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
@RequestMapping("/jugador")
public class JugadorController {

    final JugadorRepository jugadorRepository;

    public JugadorController(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    @GetMapping(value = {"/listar", ""})
    public String listarJugadores(Model model) {

        List<Jugador> lista = jugadorRepository.findAll();
        model.addAttribute("jugadorList", lista);

        return "/jugador/listar";
    }

    @GetMapping("/nuevo")
    public String nuevoJugadorFrm() {
        return "jugador/newFrm";
    }

    @PostMapping("/guardar")
    public String guardarNuevoJugador(Jugador jugador) {
        jugadorRepository.save(jugador);
        return "redirect:/jugador/listar";
    }

    @GetMapping("/borrar")
    public String borrarJugador(Model model,
                                      @RequestParam("id") int id) {

        Optional<Jugador> optShipper = jugadorRepository.findById(id);

        if (optShipper.isPresent()) {
            jugadorRepository.deleteById(id);
        }
        return "redirect:/jugador/listar";

    }

}
