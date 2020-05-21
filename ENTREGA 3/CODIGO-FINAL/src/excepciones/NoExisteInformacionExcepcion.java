/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package excepciones;

public class NoExisteInformacionExcepcion extends Exception {
	
	// ---------------------------------------------------------------------------------------
	
	// (CONSTANTE DE LA EXCEPCION NO EXISTE INFORMACION)

	private static final long serialVersionUID = 1L;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA EXCEPCION PROPIA NO EXISTE INFORMACION EN EL PROGRAMA

	public NoExisteInformacionExcepcion(String mensaje) {
		
		super("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
		
	}
	
	// ---------------------------------------------------------------------------------------
	
}
