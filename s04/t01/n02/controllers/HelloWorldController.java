package cat.itacademy.barcelonactiva.apellidos.nombre.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
	
	//localhost:9001/HolaMundo?nombre=Teresa
	@ GetMapping ("/HolaMundo")
	public  String  saluda(@ RequestParam(value = "nombre", required = false, defaultValue = "UNKNOWKN") String  nombre){
        return  "Hola " + nombre + ". Estás ejecutando un proyecto Gradle.";
	}

	//localhost:9001/HolaMundo2/Teresa
	@ GetMapping ({ "/HolaMundo2" , "/HolaMundo2/{nombre}" })
    public  String  saluda2(@ PathVariable(required = false) String  nombre){
		return  "Hola " + nombre + ". Estás ejecutando un proyecto Gradle.";
	}
}
