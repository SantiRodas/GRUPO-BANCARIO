/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package excepciones;

public class Mayor365Excepcion extends Exception {
	
	// ---------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	// ---------------------------------------------------------------------------------------
	
	public Mayor365Excepcion(String mensaje) {
		
		super("EL NUMERO DE DIAS NO ES CORRECTO");
		
	}
	
	// ---------------------------------------------------------------------------------------

}
