package com.anda.prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class MyController {

	 @GetMapping
	    public String saludos(@RequestParam(required = false, defaultValue = "") String nombre) {
	        return "".equals(nombre) ? "Hola Mundo!" : "Hola " + nombre;
	    }
	
	
}
