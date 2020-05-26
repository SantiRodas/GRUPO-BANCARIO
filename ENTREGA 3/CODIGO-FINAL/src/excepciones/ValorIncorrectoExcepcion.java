/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package excepciones;

public class ValorIncorrectoExcepcion extends Exception {
	
	// ---------------------------------------------------------------------------------------
	
	private static final long serialVersionUID = 1L;
	
	// ---------------------------------------------------------------------------------------

	public ValorIncorrectoExcepcion(String mensaje) {
		
		super("Valor ingresado incorrecto");
		
	}
	
	// ---------------------------------------------------------------------------------------

}
