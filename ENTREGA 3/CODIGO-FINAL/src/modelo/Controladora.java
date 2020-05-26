/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import excepciones.InformacionExisteExcepcion;
import excepciones.NoExisteInformacionExcepcion;

public class Controladora implements General, Serializable {
	
	// ---------------------------------------------------------------------------------------
	
	// ID SERIALIZABLE
	
	private static final long serialVersionUID = 1L;
	
	// RELACION PRIMER BANCO CON LA CLASE BANCO
	
	private Banco primerBanco;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE CONTROLADORA

	public Controladora() {

		primerBanco = null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE CONTROLADORA

	public Banco getPrimerBanco() {
		return primerBanco;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LAS CLASE CONTROLADORA

	public void setPrimerBanco(Banco primerBanco) {
		this.primerBanco = primerBanco;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PRINCIPAL AGREGAR QUE HACE EL LLAMADO AL METODO RECURSIVO

	public Banco agregar(String nombre, String id) throws InformacionExisteExcepcion {
		
		if(buscar(id) == true) {
			
			throw new InformacionExisteExcepcion("LA INFORMACION QUE DESEA AGREGAR YA EXISTE EN EL PROGRAMA");
			
		} else {
			
			return agregarRecursivo(nombre, id, primerBanco);
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA AGREGAR UN BANCO AL SISTEMA RECURSIVO
	
	private Banco agregarRecursivo(String nombre, String id, Banco nodo) {
		
		if(primerBanco == null) {
			
			primerBanco = new Banco(nombre, id);
			
			return primerBanco;
			
		} else {
			
			if(nodo.getSiguiente() != null) {
				
				return agregarRecursivo(nombre, id, nodo.getSiguiente());
				
			} else {
				
				nodo.setSiguiente(new Banco(nombre, id));
				
				return nodo;
				
			}
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR PRINCIPAL QUE HACE EL LLAMADO AL METODO RECURSIVO (RETORNA BOOLEAN)

	@Override
	public boolean buscar(String id) {

		return buscarRecursivo(id, primerBanco);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR UN BANCO EN EL SISTEMA RECURSIVO (RETORNA BOOLEAN)
	
	private boolean buscarRecursivo(String id, Banco nodo){
		
		if(nodo == null) {
			
			return false;
			
		} else if(nodo.getId().equalsIgnoreCase(id)) {
			
			return true;
			
		} else {
			
			return buscarRecursivo(id, nodo.getSiguiente());
			
		}

	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR UN BANCO EN EL SISTEMA (RETORNA EL BANCO O NULL)
	
	public Banco buscarBanco(String id) {
		
		if(primerBanco != null) {
			
			Banco temporal = primerBanco;
			
			while(temporal != null) {
				
				if(temporal.getId().equalsIgnoreCase(id)) {
					
					return temporal;
					
				}
				
				temporal = temporal.getSiguiente();
				
			}
			
		}
		
		return null;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA ELIMINAR PRINCIPAL QUE HACE EL LLAMADO AL METODO RECURSIVO (RETORNA BOOLEAN)

	@Override
	public boolean eliminar(String id) throws NoExisteInformacionExcepcion {

		return eliminarRecursivo(id, primerBanco, null);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA ELIMINAR UN BANCO EN EL SISTEMA RECURSIVO (RETORNA BOOLEAN)
	
	private boolean eliminarRecursivo(String id, Banco nodo, Banco anterior) throws NoExisteInformacionExcepcion {
		
		if(nodo == null) {
			
			throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
			
		} else if(nodo.getId().equalsIgnoreCase(id)) {
			
			if(anterior == null) {
				
				primerBanco = primerBanco.getSiguiente();
				
				nodo.setSiguiente(null);
				
				nodo = primerBanco;
				
				return true;
				
			} else {
				
				anterior.setSiguiente(nodo.getSiguiente());
				
				nodo.setSiguiente(null);
				
				nodo = anterior.getSiguiente();
				
				return true;
				
			}
			
		} else {
			
			anterior = nodo;
			
			return eliminarRecursivo(id, nodo.getSiguiente(), anterior);
			
		}

	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA SERIALIZAR EL SISTEMA
	
	public void serial() {
		
		try {
			
			FileOutputStream obj = new FileOutputStream("data/Info_Bancos.txt");
			
			ObjectOutputStream data = new ObjectOutputStream(obj);
			
			
			data.writeObject(primerBanco);
			
			data.close();
			
			obj.close();
			
		} catch (IOException io) {
			
			System.err.println(io.getMessage());
			
		}
			
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA DESERIALIZAR EL SISTEMA
	
	public void deserial() {
		
		try {
			
			FileInputStream obj = new FileInputStream("data/Info_Bancos.txt");
			
			ObjectInputStream data = new ObjectInputStream(obj);
			
			Banco b = (Banco) data.readObject();
			
			data.close();
			
			obj.close();
			
		} catch (IOException io) {
			
			System.err.println(io.getMessage());
			
		} catch (ClassNotFoundException cln) {
			
			System.err.println(cln.getMessage());
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
}
