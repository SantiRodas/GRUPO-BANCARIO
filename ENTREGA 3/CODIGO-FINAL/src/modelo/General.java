/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

import excepciones.NoExisteInformacionExcepcion;

public interface General {
	
	// ---------------------------------------------------------------------------------------
	
	// METODO COMPARTIDO PARA BUSCAR
	
	public boolean buscar(String id);
	
	// ******************************************
	
	// METODO COMPARTIDO PARA ELIMINAR
	
	public boolean eliminar(String id) throws NoExisteInformacionExcepcion;

	// ---------------------------------------------------------------------------------------

}
