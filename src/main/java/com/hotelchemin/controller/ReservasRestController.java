package com.hotelchemin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelchemin.modelo.Pasajero;
import com.hotelchemin.service.PasajerosService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ReservasRestController {

	@Autowired
	PasajerosService pasajerosService;

	@PostMapping(value = "pasajeros/savepasajero")
	public ResponseEntity<String> savePassenger(@RequestBody String pasajero) throws Exception {
		return pasajerosService.guardarPasajero(pasajero);

	}

	/*
	 * @GetMapping(value = "pasajeros/listar") public List<Pasajero> listPassenger()
	 * {
	 * 
	 * pasajeroRepositorio.findAll().forEach(elemento->listaPasajero.add(elemento));
	 * 
	 * listaPasajero.forEach(y->{ System.out.println(y); });
	 * 
	 * //ResponseEntity<List<Pasajero>> response = new
	 * ResponseEntity<List<Pasajero>>(listaPasajero, HttpStatus.OK); //return
	 * pasajerosService.listarPasajero();
	 * 
	 * 
	 * //}
	 * 
	 * 
	 * @GetMapping(value = "pasajeros/eliminar/{id}") public ResponseEntity<String>
	 * deletePassenger(@PathVariable("id") Integer itemId) { return
	 * pasajerosService.eliminarPasajero(itemId); }
	 */

}
