package com.holamundo.cl.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/otro")
public class OtroController {

    @GetMapping("/hola")
    public String hola(){
        return "Hola Mundo otro";
    }

    @GetMapping("/hola2")
    public String hola2(){
        return "Hola Mundo 2 otro";
    }
}
