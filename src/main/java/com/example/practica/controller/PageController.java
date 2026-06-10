package com.example.practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    private static final String DEMO_USER = "admin";
    private static final String DEMO_PASSWORD = "1234";

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(
            @RequestParam String usuario,
            @RequestParam String password,
            Model model) {

        if (DEMO_USER.equals(usuario) && DEMO_PASSWORD.equals(password)) {
            model.addAttribute("mensaje", "Inicio de sesión correcto.");
            model.addAttribute("tipoMensaje", "success");
        } else {
            model.addAttribute("mensaje", "Usuario o contraseña incorrectos.");
            model.addAttribute("tipoMensaje", "danger");
        }

        return "login";
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }

    @GetMapping("/recuperar")
    public String recuperar() {
        return "recuperar";
    }
}
