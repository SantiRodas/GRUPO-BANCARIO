/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Controladora {
	
	// ---------------------------------------------------------------------------------------
	
	// RELACION PRIMER BANCO CON LA CLASE BANCO
	
	private Banco primerBanco;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE CONTROLADORA

	public Controladora() {

		primerBanco = null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE CONTROLADORA

	public Banco getPrimerBanco() {
		return primerBanco;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LAS CLASE CONTROLADORA

	public void setPrimerBanco(Banco primerBanco) {
		this.primerBanco = primerBanco;
	}
	
	// ---------------------------------------------------------------------------------------
	

}
