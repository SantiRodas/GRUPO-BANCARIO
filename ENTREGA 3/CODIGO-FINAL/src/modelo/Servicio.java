/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

import java.util.ArrayList;

public class Servicio {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE SERVICIO
	
	private String nombre;
	private int valor;
	
	// ******************************************
	
	// RELACION IZQUIERDA Y DERECHA DE LA CLASE SERVICIO
	
	private Servicio izquierda;
	private Servicio derecha;
	
	// ******************************************
	
	// RELACION TIPO ARRAYLIST CON LA CLASE CUENTA
	
	private ArrayList<Cuenta> cuentas;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE SERVICIO
	
	public Servicio(String nombre, int valor) {

		this.nombre = nombre;
		this.valor = valor;
		
		izquierda = null;
		derecha = null;
		
		cuentas = new ArrayList<Cuenta>();
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE SERVICIO
	
	public String getNombre() {
		return nombre;
	}
	
	public int getValor() {
		return valor;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION IZQUIERDA Y DERECHA DE LA CLASE SERVICIO
	
	public Servicio getIzquierda() {
		return izquierda;
	}
	
	public Servicio getDerecha() {
		return derecha;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION TIPO ARRAYLIST CON LA CLASE CUENTA
	
	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE SERVICIO
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	// ******************************************
	
	// METODO SET DE LA RELACION IZQUIERDA Y DERECHA DE LA CLASE SERVICIO
	
	public void setIzquierda(Servicio izquierda) {
		this.izquierda = izquierda;
	}
	
	public void setDerecha(Servicio derecha) {
		this.derecha = derecha;
	}

	// ******************************************
	
	// METODO SET DE LA RELACION TIPO ARRAYLIST CON LA CLASE CUENTA

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	// ---------------------------------------------------------------------------------------

	
	
}
