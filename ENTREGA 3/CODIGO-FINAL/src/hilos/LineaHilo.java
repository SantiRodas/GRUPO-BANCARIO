/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package hilos;

import application.ControladoraBanco;
import javafx.application.Platform;

public class LineaHilo extends Thread {
	
	// ---------------------------------------------------------------------------------------
	
	private boolean validacion;
	
	// ---------------------------------------------------------------------------------------
	
	private ControladoraBanco controladora;
	
	// ---------------------------------------------------------------------------------------

	public LineaHilo(boolean validacion, ControladoraBanco controladora) {

		this.validacion = validacion;
		this.controladora = controladora;
		
	}
	
	// ---------------------------------------------------------------------------------------

	public boolean isValidacion() {
		return validacion;
	}
	
	public ControladoraBanco getControladora() {
		return controladora;
	}
	
	// ---------------------------------------------------------------------------------------

	public void setValidacion(boolean validacion) {
		this.validacion = validacion;
	}

	public void setControladora(ControladoraBanco controladora) {
		this.controladora = controladora;
	}
	
	// ---------------------------------------------------------------------------------------
	
	@Override
	public void run() {
		
		int contador = 0;
		
		while(validacion == true && contador <= 500) {
			
			try {
				
				controladora.girar();
				
				contador ++;
				
				sleep(10);
				
			}catch(InterruptedException e) {
				
				// NADA IMPORTANTE AQUI
				
				e.printStackTrace();
				
			}
			
		}
		
		Platform.runLater(() -> controladora.imprimirInforme());
		
	}
	
	// ---------------------------------------------------------------------------------------
	
}
