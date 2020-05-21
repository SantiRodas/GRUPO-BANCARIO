/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Banco implements General {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE BANCO
	
	private String nombre;
	private String id;
	
	// ******************************************
	
	// RELACION ANTERIOR Y SIGUIENTE DE LA CLASE BANCO
	
	private Banco anterior;
	private Banco siguiente;
	
	// ******************************************
	
	// RELACION ROOT CON LA CLASE LUGAR
	
	private Lugar root;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE BANCO
	
	public Banco(String nombre, String id) {

		this.nombre = nombre;
		this.id = id;
		
		anterior = null;
		siguiente = null;
		
		root = null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LOS ATRIBUTOS DE LA CLASE BANCO

	public String getNombre() {
		return nombre;
	}
	
	public String getId() {
		return id;
	}
	
	// ******************************************
	
	// METODOS GET DE LA RELACION ANTERIOR Y SIGUIENTE DE LA CLASE BANCO
	
	public Banco getAnterior() {
		return anterior;
	}
	
	public Banco getSiguiente() {
		return siguiente;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION CON LA CLASE LUGAR (ROOT)
	
	public Lugar getRoot() {
		return root;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LOS ATRIBUTOS DE LA CLASE BANCO

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	// ******************************************
	
	// METODOS GET DE LA RELACION ANTERIOR Y SIGUIENTE DE LA CLASE BANCO

	public void setAnterior(Banco anterior) {
		this.anterior = anterior;
	}

	public void setSiguiente(Banco siguiente) {
		this.siguiente = siguiente;
	}
	
	// ******************************************
	
	// METODO SET DE LA RELACION CON LA CLASE LUGAR (ROOT)
	
	public void setRoot(Lugar root) {
		this.root = root;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PRINCIPAL DE AGREGAR QUE HACE EL LLAMADO AL METODO RECURSIVO
	
	public Sucursal agregar(String nombre, String id, String direccion, String estratoEconomico, String email) {
		
		Sucursal lugar = new Sucursal(nombre, id, direccion, estratoEconomico, email);
		
		if(root == null) {
			
			root = lugar;
			
		} else {
			
			return (Sucursal) agregarRecursivo((Sucursal) root, lugar);
			
		}
		
		return (Sucursal) root;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO RECURSIVO PARA AGREGAR RECURSIVO
	
	private Sucursal agregarRecursivo(Sucursal primero, Sucursal nuevo) {
		
		if(nuevo.getId().compareTo(primero.getId()) >= 0) {
			
			if(primero.getDerecha() == null) {
				
				primero.setDerecha(nuevo);
				
			} else {
				
				return agregarRecursivo((Sucursal) primero.getDerecha(), nuevo);
				
			}
			
		} else {
			
			if(primero.getIzquierda() == null) {
				
				primero.setIzquierda(nuevo);
				
				nuevo.setPapa(primero);
				
			} else {
				
				return agregarRecursivo((Sucursal) primero.getIzquierda(), nuevo);
				
			}
			
		}
		
		return nuevo;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR PRINCIPAL QUE HACE EL LLAMADO AL METODO RECURSIVO (RETORNA BOOLEAN)
	
	@Override
	public boolean buscar(String id) {

		return buscarRecursivo(id, (Sucursal) root);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR UN LUGAR EN EL SISTEMA RECURSIVO (RETORNA BOOLEAN)
	
	private boolean buscarRecursivo(String id, Sucursal lugar) {
		
		if(lugar == null) {
			
			return false;
			
		} else if(lugar.getId().equalsIgnoreCase(id)) {
			
			return true;
			
		} else if(id.compareTo(lugar.getId()) <= 0) {
			
			return buscarRecursivo(id, (Sucursal) lugar.getIzquierda());
			
		} else {
			
			return buscarRecursivo(id, (Sucursal) lugar.getDerecha());
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA BUSCAR UN LUGAR EN EL SISTEMA (RETORNA EL LUGAR O NULL)
	
	public Sucursal buscarLugar(String id) {
		
		Sucursal lugar = (Sucursal) root;
		
		while(lugar != null) {
			
			if(lugar.getId().equalsIgnoreCase(id)) {
				
				return lugar;
				
			} else if(id.compareTo(lugar.getId()) <= 0) {
				
				lugar = (Sucursal) lugar.getIzquierda();
				
			} else {
				
				lugar = (Sucursal) lugar.getDerecha();
				
			}
			
		}
		
		return null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA ELIMINAR PRINCIPAL QUE HACE EL LLAMADO AL METODO RECURSIVO (RETORNA BOOLEAN)

	@Override
	public boolean eliminar(String id) {
		
		if(buscar(id) == true) {
			
			root = eliminarRecursivo((Sucursal) root, id);
			
			return true;
			
		} else {
			
			return true;
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA ELIMINAR UN LUGAR EN EL SISTEMA RECURSIVO (RETORNA BOOLEAN)
	
	private Sucursal eliminarRecursivo(Sucursal nodo, String id) {
		
		if(root == null) {
			
			return null;
			
		}
		
		if(nodo.getId().equalsIgnoreCase(id)) {
			
			return (Sucursal) unir((Sucursal) nodo.getIzquierda(), (Sucursal) nodo.getDerecha());
			
		}
		
		if(id.compareTo(nodo.getId()) <= 0) {
			
			nodo.getIzquierda();
			
			return eliminarRecursivo((Sucursal) nodo.getIzquierda(), id);
			
		} else {
			
			nodo.getDerecha();
			
			return eliminarRecursivo((Sucursal) nodo.getDerecha(), id);
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO EXTRA PARA UNIR DOS NODOS (SE UTILIZA EN EL ABB)
	
	private Sucursal unir(Sucursal izquierda, Sucursal derecha) {
		
		if(izquierda == null) {
			
			return (Sucursal) derecha;
			
		}
		
		if(derecha == null) {
			
			return izquierda;
			
		}
		
		Sucursal centro = unir((Sucursal) izquierda.getDerecha(), (Sucursal) derecha.getIzquierda());
		
		izquierda.setDerecha(centro);
		
		derecha.setIzquierda(izquierda);
		
		return (Sucursal) derecha;
		
	}
	
	// ---------------------------------------------------------------------------------------

}
