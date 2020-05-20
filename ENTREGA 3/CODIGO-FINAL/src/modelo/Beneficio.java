/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Beneficio {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE BENEFICIO
	
	private String nombre;
	private String id;
	private String contrasena;
	private int valor;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE BENEFICIO
	
	public Beneficio(String nombre, String id, String contrasena, int valor) {

		this.nombre = nombre;
		this.id = id;
		this.contrasena = contrasena;
		this.valor = valor;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE BENEFICIO

	public String getNombre() {
		return nombre;
	}
	
	public String getId() {
		return id;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public int getValor() {
		return valor;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE BENEFICIO

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	// ---------------------------------------------------------------------------------------

}
