package com.fitnesslion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ClaseRepository claseRepository;

    @GetMapping("/reservas")
    public String verReservas(Model model) {
        model.addAttribute("reservas", reservaRepository.findAll());
        return "reservas";
    }

    @GetMapping("/reservar")
    public String mostrarFormularioReserva(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        model.addAttribute("clases", claseRepository.findAll());
        model.addAttribute("reserva", new Reserva());
        return "reservar";
    }

    @PostMapping("/reservar")
    public String guardarReserva(@RequestParam Long usuarioId, @RequestParam Long claseId) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        Clase clase = claseRepository.findById(claseId).orElse(null);

        if (usuario != null && clase != null) {
            Reserva reserva = new Reserva(usuario, clase);
            reservaRepository.save(reserva);
        }

        return "redirect:/reservas";
    }
}