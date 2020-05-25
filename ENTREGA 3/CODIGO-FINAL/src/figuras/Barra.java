/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package figuras;

public class Barra {
	
	// ---------------------------------------------------------------------------------------
	
	// CONTANTES DE LA CLASE BARRA
	
	public final static int MAX_LEVEL = 500;
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE BARRA
	
	private int valor;
	private boolean validacion;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE BARRA
	
	public Barra() {

		valor = 0;
		
		validacion = true;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE BARRA

	public int getValor() {
		return valor;
	}
	
	public boolean isValidacion() {
		return validacion;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE BARRA

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setValidacion(boolean validacion) {
		this.validacion = validacion;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO AVANZAR DE LA CLASE BARRA
	
	public void avanzar() {
		
		if(valor == MAX_LEVEL) {
						
			setValidacion(false);
			
		} else { 
			
			setValor(getValor() + 1 );
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------

}
