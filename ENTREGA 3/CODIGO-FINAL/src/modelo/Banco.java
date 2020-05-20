/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Banco {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE BANCO
	
	private String nombre;
	private String id;
	
	// ******************************************
	
	// RELACION ANTERIOR Y SIGUIENTE DE LA CLASE BANCO
	
	private Banco anterior;
	private Banco siguiente;
	
	// ******************************************
	
	// RELACION ROOT CON LA CLASE LUGAR
	
	private Lugar root;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE BANCO
	
	public Banco(String nombre, String id) {

		this.nombre = nombre;
		this.id = id;
		
		anterior = null;
		siguiente = null;
		
		root = null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LOS ATRIBUTOS DE LA CLASE BANCO

	public String getNombre() {
		return nombre;
	}
	
	public String getId() {
		return id;
	}
	
	// ******************************************
	
	// METODOS GET DE LA RELACION ANTERIOR Y SIGUIENTE DE LA CLASE BANCO
	
	public Banco getAnterior() {
		return anterior;
	}
	
	public Banco getSiguiente() {
		return siguiente;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION CON LA CLASE LUGAR (ROOT)
	
	public Lugar getRoot() {
		return root;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LOS ATRIBUTOS DE LA CLASE BANCO

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	// ******************************************
	
	// METODOS GET DE LA RELACION ANTERIOR Y SIGUIENTE DE LA CLASE BANCO

	public void setAnterior(Banco anterior) {
		this.anterior = anterior;
	}

	public void setSiguiente(Banco siguiente) {
		this.siguiente = siguiente;
	}
	
	// ******************************************
	
	// METODO SET DE LA RELACION CON LA CLASE LUGAR (ROOT)
	
	public void setRoot(Lugar root) {
		this.root = root;
	}
	
	// ---------------------------------------------------------------------------------------

}
