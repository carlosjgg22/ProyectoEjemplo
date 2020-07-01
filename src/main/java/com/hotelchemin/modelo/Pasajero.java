package com.hotelchemin.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pasajeros")
public class Pasajero {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idpasajero")
	private Integer id; 
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="fechanacimiento")
	private String fechanacimiento;
	
	@Column(name="nacionalidad")
	private String nacionalidad;
	
	@Column(name="pasaporte")
	private String pasaporte;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefono")
	private Integer telefono;
	
	
	public Pasajero() {
		super();
	
	} 
	
	public Pasajero(Integer id, String nombre, String apellido, String fechanacimiento, String nacionalidad,
			String pasaporte, String direccion, String email, Integer telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanacimiento = fechanacimiento;
		this.nacionalidad = nacionalidad;
		this.pasaporte = pasaporte;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
	} 
	
	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public String getFechanacimiento() {
		return fechanacimiento;
	}




	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}




	public String getNacionalidad() {
		return nacionalidad;
	}




	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}




	public String getPasaporte() {
		return pasaporte;
	}




	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Integer getTelefono() {
		return telefono;
	}




	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}




	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechanacimiento="
				+ fechanacimiento + ", nacionalidad=" + nacionalidad + ", pasaporte=" + pasaporte + ", direccion="
				+ direccion + ", email=" + email + ", telefono=" + telefono + "]";
	}




	
		
	



	
}
