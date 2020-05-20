/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Cliente extends Persona {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE CLIENTE
	
	private String contrasena;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE CLIENTE QUE HEREDA DE LA CLASE PERSONA

	public Cliente(String nombre, String id, String direccion, String estratoEconomico, String email, String contrasena) {
		
		super(nombre, id, direccion, estratoEconomico, email);
		
		this.contrasena = contrasena;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE CLIENTE

	public String getContrasena() {
		return contrasena;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE CLIENTE

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	// ---------------------------------------------------------------------------------------
	
}
