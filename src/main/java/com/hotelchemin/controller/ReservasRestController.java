package com.hotelchemin.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelchemin.modelo.Pasajero;
import com.hotelchemin.service.PasajerosService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")

public class ReservasRestController {

	@Autowired
	PasajerosService pasajerosService;

	@PostMapping(value = "pasajeros/savepasajero")
	public ResponseEntity<String> savePassenger(@RequestBody String pasajero) throws Exception {
		return pasajerosService.guardarPasajero(pasajero);
	}

	
	@GetMapping(value = "pasajeros/listar") public List<Pasajero> listPassenger(){
		return  pasajerosService.listarPasajero();
	  }
	  
	
	@GetMapping(value="/ejecucion") public String sayHello() {
		return "Ejecución Exitosa!";
	 }
}
