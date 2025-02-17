package com.solucion_promedio_notas.promedio_notas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromedioNotasController {

    @GetMapping("/api/promedio")
    public String calcularPromedio (@RequestParam double nota1,
                                    @RequestParam double nota2,
                                    @RequestParam double nota3) {

        double promedio = (nota1 + nota2 + nota3)/3;
        return "El promedio de las notas es: " + promedio;
    }


}
