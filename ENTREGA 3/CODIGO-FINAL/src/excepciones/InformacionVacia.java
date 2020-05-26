/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package excepciones;

public class InformacionVacia extends Exception{
	
	// ---------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;
	
	// ---------------------------------------------------------------------------------------

	public InformacionVacia(String mensaje) {
		
		super("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
		
	}
	
	// ---------------------------------------------------------------------------------------

}
