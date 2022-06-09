package com.georincon.escenarios.controller;
// Es bueno docuemntarlo todo para tener un mejor entendimiento del proyecto
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("")
    public String verPaginaDeInicio() {
        return "index";
    }
}
