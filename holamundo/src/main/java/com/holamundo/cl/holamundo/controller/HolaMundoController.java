package com.holamundo.cl.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HolaMundoController {

    @GetMapping("/hola")
    public String hola(){
        return "Hola Mundo";
    }

    @GetMapping("/suma/{valor_uno}/{valor_dos}")
    public String suma(@PathVariable int valor_uno, @PathVariable int valor_dos){

        return String.valueOf(valor_uno + valor_dos);
    }

    @GetMapping("/resta/{valor_uno}/{valor_dos}")
    public String resta(@PathVariable int valor_uno, @PathVariable int valor_dos){
        return String.valueOf(valor_uno - valor_dos);
    }

    @GetMapping("/multiplicacion/{valor_uno}/{valor_dos}")
    public Integer multiplicacion(@PathVariable int valor_uno, @PathVariable int valor_dos){
        return valor_uno * valor_dos;
    }

    @GetMapping("/division/{valor_uno}/{valor_dos}")
    public String division(@PathVariable int valor_uno, @PathVariable int valor_dos){
        try{
            return String.valueOf(valor_uno / valor_dos);
        }catch(ArithmeticException e){
            return "no se puede dividir por zero";
        }

    }

    @GetMapping("/hola2/{aaa}")
    public String hola2(@PathVariable String aaa){
        return "Hola " + aaa;
    }
}
