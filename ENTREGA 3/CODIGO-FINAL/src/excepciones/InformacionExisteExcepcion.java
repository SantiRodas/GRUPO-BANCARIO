/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package excepciones;

public class InformacionExisteExcepcion extends Exception {
	
	// ---------------------------------------------------------------------------------------
	
	// (CONSTANTE DE LA EXCEPCION INFORMACION EXISTE)

	private static final long serialVersionUID = 1L;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA EXCEPCION PROPIA INFORMACION EXISTE EN EL PROGRAMA

	public InformacionExisteExcepcion(String mensaje) {
		
		super("LA INFORMACION QUE DESEA AGREGAR YA EXISTE EN EL PROGRAMA");
		
	}
	
	// ---------------------------------------------------------------------------------------

}
