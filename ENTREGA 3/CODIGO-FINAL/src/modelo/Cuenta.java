/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Cuenta {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE CUENTA
	
	private String id;
	private int valor;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE CUENTA
	
	public Cuenta(String id, int valor) {

		this.id = id;
		this.valor = valor;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE CUENTA

	public String getId() {
		return id;
	}
	
	public int getValor() {
		return valor;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE CUENTA

	public void setId(String id) {
		this.id = id;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	// ---------------------------------------------------------------------------------------

}
