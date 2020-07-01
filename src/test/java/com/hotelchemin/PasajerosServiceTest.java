package com.hotelchemin;

import static org.mockito.Mockito.mock;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.hotelchemin.modelo.Pasajero;
import com.hotelchemin.repositorio.PasajeroDao;
import com.hotelchemin.service.PasajerosService;

import junit.framework.Assert;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PasajerosServiceTest {

	@InjectMocks 
	PasajerosService pasajerosService; 
	
	@Mock
	PasajeroDao pasajeroDAO; 
	
	@Before(value = "")
	public void initMocks(){
	    MockitoAnnotations.initMocks(this);  
	}
	/**dado un objeto pasajero, se invoca 
	 * al método savePasajero del DAO 
	 * y se almacena en la base de datos
	 * @throws Exception
	 */
	
	@Test 
	public void registrarPasajero() throws Exception{
		
		PasajeroDao pasajeroDao = mock(PasajeroDao.class);
		Pasajero pasajero = new Pasajero(16, "Rodrigo", "Guzman", "22-01-1990", "Venezolano", "98556745", "Pichincha 564", "howtodoinjava@gmail.com", 1126573770);
					
		String pasajerJ = "{\r\n" + 
				"\"id\":\"16\",\r\n" + 
				"\"nombre\":\"Rodrigo\", \r\n" + 
				"\"apellido\":\"Guzman\", \r\n" + 
				"\"fechanacimiento\":\"22-01-1990\",\r\n" + 
				"\"nacionalidad\":\"Venezolano\",\r\n" + 
				"\"pasaporte\":\"98556745\",\r\n" + 
				"\"direccion\":\"Pichincha 564\",\r\n" + 
				"\"email\":\"howtodoinjava@gmail.com\",\r\n" + 
				"\"telefono\":\"1126573770\"\r\n" + 
				"}";
		
		
		Mockito.doNothing().when(pasajeroDAO).savePasajero(pasajero);
		//pasajeroRepositorio.save(pasajero);
		
		ResponseEntity response = pasajerosService.guardarPasajero(pasajerJ);
				
		Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
		

	}
	
	/**dado un objeto pasajero, se invoca 
	 * al método savePasajero del DAO 
	 * y arroja una excepcion al guardar en la base de datos
	 * @throws Exception
	 */
	
	

@Test
public void errorRegistrpPasajero() throws Exception{
		
		PasajeroDao pasajeroDao = mock(PasajeroDao.class);
		Pasajero pasajero = new Pasajero(16, "Rodrigo", "Guzman", "22-01-1990", "Venezolano", "98556745", "Pichincha 564", "howtodoinjava@gmail.com", 1126573770);
					
		String pasajerJ = "{\r\n" + 
				"\"id\":\"16\",\r\n" + 
				"\"nombre\":\"Rodrigo\", \r\n" + 
				"\"apellido\":\"Guzman\", \r\n" + 
				"\"fechanacimiento\":\"22-01-1990\",\r\n" + 
				"\"nacionalidad\":\"Venezolano\",\r\n" + 
				"\"pasaporte\":\"98556745\",\r\n" + 
				"\"direccion\":\"Pichincha 564\",\r\n" + 
				"\"email\":\"howtodoinjava@gmail.com\",\r\n" + 
				"\"telefono\":\"1126573770\"\r\n" + 
				"}";
		
		Mockito.doThrow(Exception.class).when(pasajeroDAO).savePasajero(pasajero);

		
	
		

	}
}
