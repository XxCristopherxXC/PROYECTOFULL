package com.holamundo.cl.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @GetMapping
    public String index() {
        return "bienvenidos al listado de productos";
    }

    @GetMapping("/{idProducto}")
    public String productos(@PathVariable String idProducto) {

        List producto = new ArrayList<>();

        producto.add("a");
        producto.add("b");
        producto.add("c");

        if (producto.contains(idProducto)) {
            return "producto encontrado";
        }else{
            return "error 404";
        }
    }
}
