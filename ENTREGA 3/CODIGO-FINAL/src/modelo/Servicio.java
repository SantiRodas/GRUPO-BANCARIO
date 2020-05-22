/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

import java.util.ArrayList;

import excepciones.InformacionExisteExcepcion;
import excepciones.NoExisteInformacionExcepcion;

public class Servicio implements General {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE SERVICIO
	
	private String nombre;
	private int valor;
	
	// ******************************************
	
	// RELACION IZQUIERDA Y DERECHA DE LA CLASE SERVICIO
	
	private Servicio izquierda;
	private Servicio derecha;
	
	// RELACION PAPA CON LA CLASE SERVICIO
	
	private Servicio papa;
	
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
		
		papa = null;
		
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
	
	// METODO GET DE LA RELACION PAPA
	
	public Servicio getPapa() {
		return papa;
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
	
	// METODO SET DE LA RELACION PAPA
	
	public void setPapa(Servicio papa) {
		this.papa = papa;
	}

	// ******************************************
	
	// METODO SET DE LA RELACION TIPO ARRAYLIST CON LA CLASE CUENTA

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA AGREGAR UNA CUENTA AL SERVICIO
	
	public void agregarCuenta(String id, int valor) throws InformacionExisteExcepcion {
		
		if(buscar(id) == true) {
			
			throw new InformacionExisteExcepcion("LA INFORMACION QUE DESEA AGREGAR YA EXISTE EN EL PROGRAMA");
			
		} else {
			
			Cuenta cuenta = new Cuenta(id, valor);
			
			cuentas.add(cuenta);
			
		}
		
	}

	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR UNA CUENTA EN EL SERVICIO (RETORNA UN BOOLEAN)
	
	@Override
	public boolean buscar(String id) {
		
		for(int i = 0 ; i < cuentas.size() ; i ++) {
			
			if(cuentas.get(i).getId().equalsIgnoreCase(id)) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR UNA CUENTA EN EL SERVICIO (RETORNA LA CUENTA)
	
	public Cuenta buscarCuentaCuenta(String id) {
		
		for(int i = 0 ; i < cuentas.size() ; i++) {
			
			if(cuentas.get(i).getId().equalsIgnoreCase(id)) {
				
				return cuentas.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA ELIMINAR UNA CUENTA DEL SERVICIO (RETORNA UN BOOLEAN O UNA EXCEPCION)

	@Override
	public boolean eliminar(String id) throws NoExisteInformacionExcepcion {
		
		for(int i = 0 ; i < cuentas.size() ; i ++) {
			
			if(cuentas.get(i).getId().equalsIgnoreCase(id)) {
				
				cuentas.remove(i);
				
				return true;
				
			}
			
		}
		
		throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
		
	}
	
	// ---------------------------------------------------------------------------------------
	
}