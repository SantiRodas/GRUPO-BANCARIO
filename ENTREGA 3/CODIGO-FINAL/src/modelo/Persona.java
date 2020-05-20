/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

import java.util.ArrayList;

public class Persona {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE PERSONA

	private String nombre;
	private String id;
	private String direccion;
	private String estratoEconomico;
	private String email;
	
	// ******************************************
	
	// RELACION ANTERIOR Y SIGUIENTE DE LA CLASE PERSONA
	
	private Persona anterior;
	private Persona siguiente;
	
	// ******************************************
	
	// RELACION PRIMER SERVICIO CON LA CLASE SERVICIO
	
	private Servicio root;
	
	// ******************************************
	
	// RELACION TIPO ARRAYLIST CON LA CLASE BENEFICIO
	
	private ArrayList<Beneficio> beneficios;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE PERSONA
	
	public Persona(String nombre, String id, String direccion, String estratoEconomico, String email) {

		this.nombre = nombre;
		this.id = id;
		this.direccion = direccion;
		this.estratoEconomico = estratoEconomico;
		this.email = email;

		anterior = null;
		siguiente = null;
		
		root = null;
		
		beneficios = new ArrayList<Beneficio>();
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LOS ATRIBUTOS DE LA CLASE PERSONA
	
	public String getNombre() {
		return nombre;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getEstratoEconomico() {
		return estratoEconomico;
	}
	
	public String getEmail() {
		return email;
	}
	
	// ******************************************
	
	// METODOS GET DE LA RELACION ANTERIOR Y SIGUIENTE DE LA CLASE PERSONA
	
	public Persona getAnterior() {
		return anterior;
	}
	
	public Persona getSiguiente() {
		return siguiente;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION ROOT CON LA CLASE SERVICIO
	
	public Servicio getRoot() {
		return root;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION TIPO ARRAYLIST CON LA CLASE BENEFICIO
	
	public ArrayList<Beneficio> getBeneficios() {
		return beneficios;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LOS ATRIBUTOS DE LA CLASE PERSONA
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setEstratoEconomico(String estratoEconomico) {
		this.estratoEconomico = estratoEconomico;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// ******************************************
	
	// METODOS SET DE LA RELACION ANTERIOR Y SIGUIENTE DE LA CLASE PERSONA
	
	public void setAnterior(Persona anterior) {
		this.anterior = anterior;
	}
	
	public void setSiguiente(Persona siguiente) {
		this.siguiente = siguiente;
	}
	
	// ******************************************
	
	// METODO SET DE LA RELACION ROOT CON LA CLASE SERVICIO
	
	public void setRoot(Servicio root) {
		this.root = root;
	}

	// ******************************************
	
	// METODO SET DE LA RELACION TIPO ARRAYLIST CON LA CLASE BENEFICIO

	public void setBeneficios(ArrayList<Beneficio> beneficios) {
		this.beneficios = beneficios;
	}
	
	// ---------------------------------------------------------------------------------------	
	
}
