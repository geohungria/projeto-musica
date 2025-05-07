package com.geovana.projetomusica.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cantor")
public class CantorController {

    @GetMapping("/numero")
    public int numero() {
        System.out.println(5);
        return 5;
    }

    @GetMapping("/teste")
    public String teste() {
        System.out.println("Entrou em teste");
        return "teste";
    }



}
