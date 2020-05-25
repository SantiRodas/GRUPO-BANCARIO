/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package hilos;

import application.PrimeraControladoraGUI;
import figuras.Barra;

public class BarraHilo extends Thread {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DEL HILO BARRA
	
	private Barra barra;
	
	private PrimeraControladoraGUI controladora;
	
	private int time;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DEL HILO BARRA

	public BarraHilo(Barra barra, PrimeraControladoraGUI controladora, int time) {

		this.barra = barra;
		this.controladora = controladora;
		this.time = time;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DEL HILO BARRA

	public Barra getBarra() {
		return barra;
	}
	
	public PrimeraControladoraGUI getControladora() {
		return controladora;
	}
	
	public int getTime() {
		return time;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DEL HILO BARRA

	public void setBarra(Barra barra) {
		this.barra = barra;
	}

	public void setControladora(PrimeraControladoraGUI controladora) {
		this.controladora = controladora;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO RUN DEL HILO BARRA
	
	public void run() {
		
		while(barra.isValidacion()) {
			
			barra.avanzar();
			
			controladora.actualizarBarra();
			
			try {
				
				sleep(time);
				
			} catch(InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		controladora.iniciarContinuar();
		
	}
	
	// ---------------------------------------------------------------------------------------
	
}
