package com.fitnesslion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClaseController {

    @Autowired
    private ClaseRepository claseRepository;

    @GetMapping("/clases")
    public String listarClases(Model model) {
        model.addAttribute("clases", claseRepository.findAll());
        return "clases";
    }
}