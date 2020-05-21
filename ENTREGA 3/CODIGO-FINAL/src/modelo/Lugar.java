/*
 * * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Lugar implements General {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE LUGAR
	
	private String nombre;
	private String id;
	private String direccion;
	private String estratoEconomico;
	private String email;
	
	// ******************************************
	
	// RELACION IZQUIERDA Y DERECHA DE LA CLASE LUGAR
	
	private Lugar izquierda;
	private Lugar derecha;
	
	// RELACION PAPA DE LA CLASE LUGAR
	
	private Lugar papa;
	
	// ******************************************
	
	// RELACION PRIMERA PERSONA CON LA CLASE PERSONA
	
	private Persona primerCliente;
	
	private Persona primerEmpleado;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR
	
	public Lugar(String nombre, String id, String direccion, String estratoEconomico, String email) {

		this.nombre = nombre;
		this.id = id;
		this.direccion = direccion;
		this.estratoEconomico = estratoEconomico;
		this.email = email;
		
		izquierda = null;
		derecha = null;
		
		papa = null;
		
		primerCliente = null;
		
		primerEmpleado = null;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LOS ATRIBUTOS DE LA CLASE LUGAR
	
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
	
	// METODO GET DE LA RELACION IZQUIERDA Y DERECHA
	
	public Lugar getIzquierda() {
		return izquierda;
	}
	
	public Lugar getDerecha() {
		return derecha;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION PAPA
	
	public Lugar getPapa() {
		return papa;
	}
	
	// ******************************************
	
	// METODO GET DE LA RELACION PRIMERA PERSONA
	
	public Persona getPrimerCliente() {
		return primerCliente;
	}
	
	public Persona getPrimerEmpleado() {
		return primerEmpleado;		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LOS ATRIBUTOS DE LA CLASE LUGAR
	
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
	
	// METODO SET DE LA RELACION IZQUIERDA Y DERECHA
	
	public void setIzquierda(Lugar izquierda) {
		this.izquierda = izquierda;
	}
	
	public void setDerecha(Lugar derecha) {
		this.derecha = derecha;
	}
	
	// ******************************************
	
	// METODO SET DE LA RELACION PAPA
	
	public void setPapa(Lugar papa) {
		this.papa = papa;
	}
	
	// ******************************************
	
	// METODO SET DE LA RELACION PRIMERA PERSONA
	
	public void setPrimerCliente(Persona primerCliente) {
		this.primerCliente = primerCliente;
	}
	
	public void setPrimerEmpleado(Persona primerEmpleado) {
		this.primerEmpleado = primerEmpleado;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PRINCIPAL AGREGAR QUE HACE EL LLAMADO AL METODO RECURSIVO
	
	public Cliente agregarCliente(String nombre, String id, String direccion, String estratoEconomico, String email, String contrasena) {
		
		return agregarRecursivoCliente(nombre, id, direccion, estratoEconomico, email, contrasena, primerCliente);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PARA AGREGAR UN CLIENTE AL SISTEMA RECURSIVO
	
	private Cliente agregarRecursivoCliente(String nombre, String id, String direccion, String estratoEconomico, String email, String contrasena, Persona nodo) {
		
		if(primerCliente == null) {
			
			primerCliente = new Cliente(nombre, id, direccion, estratoEconomico, email, contrasena);
			
			return (Cliente) primerCliente;
			
		} else {
			
			if(nodo.getSiguiente() != null) {
				
				return agregarRecursivoCliente(nombre, id, direccion, estratoEconomico, email, contrasena, nodo.getSiguiente());
				
			} else {
				
				nodo.setSiguiente(new Cliente(nombre, id, direccion, estratoEconomico, email, contrasena));
				
				return (Cliente) nodo;
				
			}
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PRINCIPAL AGREGAR QUE HACE EL LLAMADO AL METODO RECURSIVO
	
	public Empleado agregarEmpleado(String nombre, String id, String direccion, String estratoEconomico, String email, String tipo, int salario) {
		
		return agregarRecursivoEmpleado(nombre, id, direccion, estratoEconomico, email, tipo, salario, primerEmpleado);
		
	}
	
	// ---------------------------------------------------------------------------------------

	// METODO PARA AGREGAR UN EMPLEADO AL SISTEMA RECURSIVO
	
	private Empleado agregarRecursivoEmpleado(String nombre, String id, String direccion, String estratoEconomico, String email, String tipo, int salario, Persona nodo) {
		
		if(primerEmpleado == null) {
			
			primerEmpleado = new Empleado(nombre, id, direccion, estratoEconomico, email, tipo, salario);
			
			return (Empleado) primerEmpleado;
			
		} else {
			
			if(nodo.getSiguiente() != null) {
				
				return agregarRecursivoEmpleado(nombre, id, direccion, estratoEconomico, email, tipo, salario, nodo.getSiguiente());
				
			} else {
				
				nodo.setSiguiente(new Empleado(nombre, id, direccion, estratoEconomico, email, tipo, salario));
				
				return (Empleado) nodo;
				
			}
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@Override
	public boolean buscar(String id) {
		return false;
	}
	
	// ---------------------------------------------------------------------------------------
	
	@Override
	public boolean eliminar(String id) {
		return false;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// ---------------------------------------------------------------------------------------
	
	// ---------------------------------------------------------------------------------------
	
	// ---------------------------------------------------------------------------------------
	
}
