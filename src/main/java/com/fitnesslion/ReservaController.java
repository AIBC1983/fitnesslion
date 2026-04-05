package com.fitnesslion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ClaseRepository claseRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Mostrar reservas
    @GetMapping("/reservas")
    public String verReservas(Model model) {
        List<Reserva> reservas = reservaRepository.findAll();
        model.addAttribute("reservas", reservas);
        return "reservas";
    }

    // Mostrar formulario para reservar
    @GetMapping("/reservar")
    public String mostrarFormularioReserva(Model model) {
        model.addAttribute("clases", claseRepository.findAll());
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "reservar";
    }

    // Guardar reserva
    @PostMapping("/reservar")
    public String guardarReserva(@RequestParam Long claseId, @RequestParam Long usuarioId) {
        Clase clase = claseRepository.findById(claseId).orElse(null);
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);

        if (clase != null && usuario != null) {
            Reserva reserva = new Reserva();
            reserva.setClase(clase);
            reserva.setUsuario(usuario);
            reservaRepository.save(reserva);
        }

        return "redirect:/reservas";
    }

    // Cancelar reserva
    @GetMapping("/cancelar-reserva/{id}")
    public String cancelarReserva(@PathVariable Long id) {
        reservaRepository.deleteById(id);
        return "redirect:/reservas";
    }
}