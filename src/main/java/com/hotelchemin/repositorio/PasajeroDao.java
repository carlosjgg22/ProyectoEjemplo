package com.hotelchemin.repositorio;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hotelchemin.modelo.Pasajero;


@Transactional
@Repository
public class PasajeroDao {

	

		@Autowired
		private JdbcTemplate jdbcTemplate;

		private static final String qryPasajeros = "INSERT INTO pasajeros (idpasajero, nombre, apellido, fechanacimiento, nacionalidad, pasaporte, direccion,email, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
;

		public void savePasajero(Pasajero pasajero) throws Exception {


			try {
			
				jdbcTemplate.update(qryPasajeros,
						new Object[] { pasajero.getId(), pasajero.getNombre(), pasajero.getApellido(), 
								pasajero.getFechanacimiento(),pasajero.getNacionalidad(), pasajero.getPasaporte(),
								pasajero.getDireccion(), pasajero.getEmail(), pasajero.getTelefono()});

			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Ocurrio un error", e);

			}

		
		}

		
	
}
