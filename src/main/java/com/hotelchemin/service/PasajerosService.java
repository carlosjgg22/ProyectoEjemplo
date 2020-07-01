package com.hotelchemin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.hotelchemin.modelo.Pasajero;
import com.hotelchemin.repositorio.PasajeroDao;

@Service
public class PasajerosService {

@Autowired 
PasajeroDao pasajeroDAO;  

List<Pasajero> listaPasajero = new ArrayList<Pasajero>();

	public ResponseEntity<String> guardarPasajero(String pasajero) throws Exception {
		
	
		Pasajero pass1 = new Gson().fromJson(pasajero, Pasajero.class);
		if (!(pass1.getNombre()==null)&&!(pass1.getId()==null)&&!(pass1.getApellido()==null)) {
		
		this.pasajeroDAO.savePasajero(pass1);
		ResponseEntity<String> response = new ResponseEntity<String>("Se guardo el pasajero", HttpStatus.OK);

		return response;
			
		}else {
			
			return ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body("Ocurrió un Error al Intentar Almacenar los datos");
		
		
	}
		}
	/**
	public List<Pasajero> listarPasajero(){
		listaPasajero = (List<Pasajero>) pasajeroRepositorio.findAll();
		return listaPasajero; 
	}
	
	public ResponseEntity<String> eliminarPasajero(Integer id) {
		
		boolean existe= pasajeroRepositorio.existsById(id);
	
		if(existe) {
			this.pasajeroRepositorio.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK)
	        .body("Recurso Eliminado");
			
		}else {

			return ResponseEntity.status(HttpStatus.OK)
		            .body("Recurso No Encontrado");
		}
		
	}
	**/
}
