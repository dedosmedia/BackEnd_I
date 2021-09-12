package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@GetMapping("/path/{nombre}/{apellido}")
	public String path(@PathVariable String nombre, @PathVariable String apellido){
		return  "Hola "+nombre+" "+apellido;
	}

	@GetMapping("/param")
	public String param(@RequestParam String name, @RequestParam("lastname") String apellido){
		return "Hola "+name+" - "+apellido;
	}


	@PostMapping("/empleado")
	public Empleado agregar(@RequestBody Empleado empleado){

		System.out.println(empleado);
		return empleado;
	}




}
