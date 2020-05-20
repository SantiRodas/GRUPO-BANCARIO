/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Sucursal extends Lugar {
	
	// ---------------------------------------------------------------------------------------
	
	// RELACION PRIMERA PERSONA CON LA CLASE PERSONA
	
	private Persona primeraPersona;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE SUCURSAL QUE HEREDA DE LA CLASE LUGAR

	public Sucursal(String nombre, String id, String direccion, String estratoEconomico, String email) {
		
		super(nombre, id, direccion, estratoEconomico, email);
		
		primeraPersona = null;

	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO GET DE LA RELACION PRIMERA PERSONA

	public Persona getPrimeraPersona() {
		return primeraPersona;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO SET DE LA RELACION PRIMERA PERSONA

	public void setPrimeraPersona(Persona primeraPersona) {
		this.primeraPersona = primeraPersona;
	}
	
	// ---------------------------------------------------------------------------------------

	
	
}
