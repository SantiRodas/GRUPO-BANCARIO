/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Seguro {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE SEGURO
	
	private String nombre;
	private String id;
	private String direccion;
	private String estratoEconomico;
	private String email;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE SEGURO
	
	public Seguro(String nombre, String id, String direccion, String estratoEconomico, String email) {

		this.nombre = nombre;
		this.id = id;
		this.direccion = direccion;
		this.estratoEconomico = estratoEconomico;
		this.email = email;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE SEGURO
	
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
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE SEGURO
	
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
	
	// ---------------------------------------------------------------------------------------

}
