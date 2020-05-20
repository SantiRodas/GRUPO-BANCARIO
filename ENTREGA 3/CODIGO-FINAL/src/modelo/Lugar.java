/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Lugar {
	
	// ---------------------------------------------------------------------------------------
	
	private String nombre;
	private String id;
	private String direccion;
	private String estratoEconomico;
	private String email;
	
	// ******************************************
	
	private Lugar izquierda;
	private Lugar derecha;
	
	// ---------------------------------------------------------------------------------------
	
	public Lugar(String nombre, String id, String direccion, String estratoEconomico, String email) {

		this.nombre = nombre;
		this.id = id;
		this.direccion = direccion;
		this.estratoEconomico = estratoEconomico;
		this.email = email;
		
		izquierda = null;
		derecha = null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
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
	
	public Lugar getIzquierda() {
		return izquierda;
	}
	
	public Lugar getDerecha() {
		return derecha;
	}
	
	// ---------------------------------------------------------------------------------------
	
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
	
	public void setIzquierda(Lugar izquierda) {
		this.izquierda = izquierda;
	}
	
	public void setDerecha(Lugar derecha) {
		this.derecha = derecha;
	}
	
	// ---------------------------------------------------------------------------------------

}
