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

public class Persona implements General {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE PERSONA

	private String nombre;
	private String id;
	private String direccion;
	private String estratoEconomico;
	private String email;
	
	// ******************************************
	
	// RELACION ANTERIOR Y SIGUIENTE DE LA CLASE PERSONA
	
	private Persona anterior;
	private Persona siguiente;
	
	// ******************************************
	
	// RELACION PRIMER SERVICIO CON LA CLASE SERVICIO
	
	private Servicio root;
	
	// ******************************************
	
	// RELACION TIPO ARRAYLIST CON LA CLASE BENEFICIO
	
	private ArrayList<Beneficio> beneficios;
	
	// ******************************************
	
	// RELACION TIPO ARRAYLIST CON LA CLASE SEGURO
	
	private ArrayList<Seguro> seguros;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE PERSONA
	
	public Persona(String nombre, String id, String direccion, String estratoEconomico, String email) {

		this.nombre = nombre;
		this.id = id;
		this.direccion = direccion;
		this.estratoEconomico = estratoEconomico;
		this.email = email;

		anterior = null;
		siguiente = null;
		
		root = null;
		
		beneficios = new ArrayList<Beneficio>();
		
		seguros = new ArrayList<Seguro>();
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LOS ATRIBUTOS DE LA CLASE PERSONA
	
	public String getNombre() {
		return nombre;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getEstratoEconomico() {
		return estratoEconomico;
	}
	
	public String getEmail() {
		return email;
	}
	
	// ******************************************
	
	// METODOS GET DE LA RELACION ANTERIOR Y SIGUIENTE DE LA CLASE PERSONA
	
	public Persona getAnterior() {
		return anterior;
	}
	
	public Persona getSiguiente() {
		return siguiente;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION ROOT CON LA CLASE SERVICIO
	
	public Servicio getRoot() {
		return root;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION TIPO ARRAYLIST CON LA CLASE BENEFICIO
	
	public ArrayList<Beneficio> getBeneficios() {
		return beneficios;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION TIPO ARRAYLIST CON LA CLASE SEGURO
	
	public ArrayList<Seguro> getSeguros() {
		return seguros;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LOS ATRIBUTOS DE LA CLASE PERSONA
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setEstratoEconomico(String estratoEconomico) {
		this.estratoEconomico = estratoEconomico;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// ******************************************
	
	// METODOS SET DE LA RELACION ANTERIOR Y SIGUIENTE DE LA CLASE PERSONA
	
	public void setAnterior(Persona anterior) {
		this.anterior = anterior;
	}
	
	public void setSiguiente(Persona siguiente) {
		this.siguiente = siguiente;
	}
	
	// ******************************************
	
	// METODO SET DE LA RELACION ROOT CON LA CLASE SERVICIO
	
	public void setRoot(Servicio root) {
		this.root = root;
	}

	// ******************************************
	
	// METODO SET DE LA RELACION TIPO ARRAYLIST CON LA CLASE BENEFICIO

	public void setBeneficios(ArrayList<Beneficio> beneficios) {
		this.beneficios = beneficios;
	}
	
	// ******************************************
	
	// METODO SET DE LA RELACION TIPO ARRAYLIST CON LA CLASE SEGURO
	
	public void setSeguros(ArrayList<Seguro> seguros) {
		this.seguros = seguros;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PRINCIPAL AGREGAR QUE HACE EL LLAMADO AL METODO RECURSIVO
	
	public Servicio agregarServicio(String nombre, int valor) throws InformacionExisteExcepcion{
		
		if(buscar(nombre) == true ) {
			
			throw new InformacionExisteExcepcion("LA INFORMACION QUE DESEA AGREGAR YA EXISTE EN EL PROGRAMA");
			
		} else {
			
			Servicio nuevo = new Servicio(nombre, valor);
			
			if(root == null) {
				
				root = nuevo;
				
			} else {
				
				return agregarServicioRecursivo(root, nuevo);
				
			}
			
			return root;
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO RECURSIVO PARA AGREGAR UN SERVICIO
	
	private Servicio agregarServicioRecursivo(Servicio primero, Servicio nuevo) {
		
		if(nuevo.getNombre().compareTo(primero.getNombre()) >= 0) {
			
			if(primero.getDerecha() == null) {
				
				primero.setDerecha(nuevo);
				
			} else {
				
				return agregarServicioRecursivo(primero.getDerecha(), nuevo);
				
			}
			
		} else {
			
			if(primero.getIzquierda() == null) {
				
				primero.setIzquierda(nuevo);
				
				nuevo.setPapa(primero);
				
			} else {
				
				return agregarServicioRecursivo(primero.getIzquierda(), nuevo);
				
			}
			
		}
		
		return nuevo;
	
	}
	
	// ---------------------------------------------------------------------------------------	
	
	// METODO PRINCIPAL DE BUSQUEDA QUE HACE EL LLAMADO AL METODO RECURSIVO
	
	@Override
	public boolean buscar(String nombre) {

		return buscarRecursivo(nombre, root);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO RECURSIVO DE BUSQUEDA
	
	private boolean buscarRecursivo(String nombre, Servicio nodo) {
		
		if(nodo == null) {
			
			return false;
			
		} else if(nodo.getNombre().equalsIgnoreCase(nombre)) {
			
			return true;
			
		} else if(nombre.compareTo(nodo.getNombre()) <= 0) {
			
			return buscarRecursivo(nombre, nodo.getIzquierda());
			
		} else {
			
			return buscarRecursivo(nombre, nodo.getDerecha());
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR UN SERVICIO QUE RETORNA EL SERVICIO O NULL
	
	public Servicio buscarServicio(String nombre) {
		
		Servicio temporal = root;
		
		while(temporal != null) {
			
			if(temporal.getNombre().equalsIgnoreCase(nombre)) {
				
				return temporal;
				
			} else if(id.compareTo(temporal.getNombre()) <= 0) {
				
				temporal =temporal.getIzquierda();
				
			} else {
				
				temporal = temporal.getDerecha();
				
			}
			
		}
		
		return null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PRINCIPAL PARA ELIMINAR SERVICIO QUE HACE UN LLAMADO AL METODO RECURSIVO

	@Override
	public boolean eliminar(String nombre) throws NoExisteInformacionExcepcion {
		
		if(buscar(nombre) == true) {
			
			root = eliminarRecursivo(root, nombre);
			
			return true;
			
		} else {
			
			throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO RECURSIVO QUE ELIMINA EL SERVICIO
	
	private Servicio eliminarRecursivo(Servicio nodo, String nombre) {
		
		if(root == null) {
			
			return null;
			
		}
		
		if(nodo.getNombre().equalsIgnoreCase(nombre)) {
			
			return unir(nodo.getIzquierda(), nodo.getDerecha());
			
		}
		
		if(nombre.compareTo(nodo.getNombre()) <= 0) {
			
			nodo.getIzquierda();
			
			return eliminarRecursivo(nodo.getIzquierda(), nombre);
			
		} else {
			
			nodo.getDerecha();
			
			return eliminarRecursivo(nodo.getDerecha(), nombre);
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO EXTRA PARA UNIR (SE UTILIZA EN EL METODO RECURSIVO)
	
	private Servicio unir(Servicio izquierda, Servicio derecha) {
		
		if(izquierda == null) {
			
			return derecha;
			
		}
		
		if(derecha == null) {
			
			return izquierda;
			
		}
		
		Servicio centro = unir(izquierda.getDerecha(), derecha.getIzquierda());
		
		izquierda.setDerecha(centro);
		
		derecha.setIzquierda(izquierda);
		
		return derecha;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA AGREGAR UN BENEFICIO (PROMOCION) AL ARRAYLIST DE BENEFICIOS
	
	public void agregarBeneficioPromocion(String nombre, String id, String contrasena, int valor) throws InformacionExisteExcepcion {
		
		if(buscarBeneficio(id) == true) {
			
			throw new InformacionExisteExcepcion("LA INFORMACION QUE DESEA AGREGAR YA EXISTE EN EL PROGRAMA");
			
		} else {
			
			Promocion promocion = new Promocion(nombre, id, contrasena, valor);
			
			beneficios.add(promocion);
			
			seleccionValor();
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA AGREGAR UN BENEFICIO (DESCUENTO) AL ARRAYLIST DE BENEFICIOS
	
	public void agregarBeneficioDescuento(String nombre, String id, String contrasena, int valor) throws InformacionExisteExcepcion {
		
		if(buscarBeneficio(id) == true) {
			
			throw new InformacionExisteExcepcion("LA INFORMACION QUE DESEA AGREGAR YA EXISTE EN EL PROGRAMA");
			
		} else {
			
			Descuento descuento = new Descuento(nombre, id, contrasena, valor);
			
			beneficios.add(descuento);
			
			seleccionValor();
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR UN BENEFICIO
	
	public boolean buscarBeneficio(String id) {
		
		seleccionNombre();
		
		for(int i = 0 ; i < beneficios.size() ; i ++) {
			
			if(beneficios.get(i).getId().equalsIgnoreCase(id)) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR UN BENEFICIO RETORNANDO EL BENEFICIO
	
	public Beneficio buscarBeneficioBeneficio(String id) {
		
		seleccionNombre();
		
		for(int i = 0 ; i < beneficios.size() ; i++) {
			
			if(beneficios.get(i).getId().equalsIgnoreCase(id)) {
				
				return beneficios.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA ELIMINAR UN BENEFICIO 
	
	public boolean eliminarBeneficio(String id) throws NoExisteInformacionExcepcion {
		
		seleccionNombre();

		if(buscarBeneficio(id) == true) {
			
			beneficios.remove(buscarBeneficioBeneficio(id));
			
			return true;
			
		} else {
			
			throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA AGREGAR SEGURO DE TIPO SALUD
	
	public void agregarSalud(String nombre, String id, String direccion, String estratoEconomico, String email) throws InformacionExisteExcepcion {
		
		if(buscarSeguro(id) == true) {
			
			throw new InformacionExisteExcepcion("LA INFORMACION QUE DESEA AGREGAR YA EXISTE EN EL PROGRAMA");
			
		} else {
			
			Salud salud = new Salud(nombre, id, direccion, estratoEconomico, email);
			
			seguros.add(salud);
			
			insercionNombre();
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA AGREGAR SEGURO DE TIPO ARL
	
	public void agregarArl(String nombre, String id, String direccion, String estratoEconomico, String email) throws InformacionExisteExcepcion {
		
		if(buscarSeguro(id) == true) {
			
			throw new InformacionExisteExcepcion("LA INFORMACION QUE DESEA AGREGAR YA EXISTE EN EL PROGRAMA");
			
		} else {
			
			Arl arl = new Arl(nombre, id, direccion, estratoEconomico, email);
			
			seguros.add(arl);
			
			insercionNombre();
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR SEGURO RETORNA BOOLEAN
	
	public boolean buscarSeguro(String id) {
		
		insercionId();
		
		for(int i = 0 ; i < seguros.size() ; i ++) {
			
			if(seguros.get(i).getId().equalsIgnoreCase(id)) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR SEGURO RETORNA EL SEGURO
	
	public Seguro buscarSeguroSeguro(String id) {
		
		insercionId();
		
		for(int i = 0 ; i < seguros.size() ; i ++){
			
			if(seguros.get(i).getId().equalsIgnoreCase(id)) {
				
				return seguros.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA ELIMINAR SEGURO RETORNA BOOLEAN
	
	public boolean eliminarSeguro(String id) throws NoExisteInformacionExcepcion {
		
		insercionId();

		if(buscarSeguro(id) == true) {
			
			seguros.remove(buscarSeguroSeguro(id));
			
			return true;
			
		} else {
			
			throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO DE ORDENAMIENTO SELECCION POR CRITERIO VALOR (BENEFICIO)
	
	// METODO QUE ORDENA DE MENOR A MAYOR
	
	public void seleccionValor() {
		
		for(int i = 0 ; i < beneficios.size() - 1 ; i++) {
			
			int min = i;
			
			for(int j = i + 1 ; j < beneficios.size() ; j++) {
				
				if(beneficios.get(j).getValor() < beneficios.get(min).getValor()) {
					
					min = j;
					
				}
				
			}
			
			if(i != min) {
				
				Beneficio auxiliar = beneficios.get(i);
				
				beneficios.set(i, beneficios.get(min));
				
				beneficios.set(min, auxiliar);
				
			}
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO DE ORDENAMIENTO SELECCION POR CRITERIO NOMBRE (BENEFICIO)
	
	// METODO QUE ORDENA DE MENOR A MAYOR
	
	public void seleccionNombre() {
		
		for(int i = 0 ; i < beneficios.size() - 1 ; i ++) {
			
			int min = i;
			
			for(int j = i ; j < beneficios.size() ; j ++) {
				
				if(beneficios.get(j).getNombre().compareTo(beneficios.get(min).getNombre()) <= 0 ) {
					
					min = j;
					
				}
				
			}
			
			if(i != min) {
				
				Beneficio auxiliar = beneficios.get(i);
				
				beneficios.set(i, beneficios.get(min));
				
				beneficios.set(min, auxiliar);
				
			}
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO DE ORDENAMIENTO INSERCION POR CRITERIO NOMBRE (SEGURO)
	
	// METODO QUE ORDENA DE MENOR A MAYOR
	
	public void insercionNombre() {
		
		int p, j;
		
		Seguro auxiliar = null;
		
		for(p = 1 ; p < seguros.size() ; p ++){
			
			auxiliar = seguros.get(p);
			
			j = p - 1;
			
			while((j >= 0) && (auxiliar.getNombre().compareTo(seguros.get(j).getNombre()) <= 0 )) {
				
				seguros.set(j + 1, seguros.get(j));
				
				j--;
				
			}
			
			seguros.set(j + 1, auxiliar);
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO DE ORDENAMIENTO INSERCION POR CRITERIO ID (SEGURO)
	
	// METODO QUE ORDENA DE MENOR A MAYOR
	
	public void insercionId() {
		
		int p, j;
		
		Seguro auxiliar = null;
		
		for(p = 1 ; p < seguros.size() ; p ++){
			
			auxiliar = seguros.get(p);
			
			j = p - 1;
			
			while((j >= 0) && (auxiliar.getId().compareTo(seguros.get(j).getId()) <= 0 )) {
				
				seguros.set(j + 1, seguros.get(j));
				
				j--;
				
			}
			
			seguros.set(j + 1, auxiliar);
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO BINARIO DE BUSQUEDA
	
	public boolean busquedaBinariaSeguro(String nombre) {
					
		int inicio = 0;
		int fin = seguros.size() - 1;
		int posicion;
			
		while(inicio <= fin) {
			
			posicion = (inicio + fin) / 2;
				
			if(seguros.get(posicion).getNombre().equalsIgnoreCase(nombre)) {
					
				return true;
						
			} else if(seguros.get(posicion).getNombre().compareTo(nombre) <= 0) {
					
				inicio = posicion + 1;
					
			} else {
					
				fin = posicion + 1;
					
			}
				
				
		}
			
		return false;
			
	}
			
	// ---------------------------------------------------------------------------------------
	
	// METODO BINARIO DE BUSQUEDA
	
	public boolean busquedaBinariaBeneficio(int valor) {
						
		int inicio = 0;
		int fin = beneficios.size() - 1;
		int posicion;
				
		while(inicio <= fin) {
				
			posicion = (inicio + fin) / 2;
					
			if(beneficios.get(posicion).getValor() == valor) {
						
				return true;
							
			} else if(beneficios.get(posicion).getValor() < 0) {
						
				inicio = posicion + 1;
						
			} else {
						
				fin = posicion + 1;
						
			}
						
		}
				
		return false;
				
	}
				
	// ---------------------------------------------------------------------------------------
	
}
