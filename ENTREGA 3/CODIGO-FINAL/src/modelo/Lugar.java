/*
 * * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

import excepciones.InformacionExisteExcepcion;
import excepciones.Mayor183Excepcion;
import excepciones.Mayor365Excepcion;
import excepciones.NoExisteInformacionExcepcion;

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
	
	public Cliente agregarCliente(String nombre, String id, String direccion, String estratoEconomico, String email, String contrasena) throws InformacionExisteExcepcion {
		
		if(buscar(id) == true) {
			
			throw new InformacionExisteExcepcion("LA INFORMACION QUE DESEA AGREGAR YA EXISTE EN EL PROGRAMA");
			
		} else {
			
			return agregarRecursivoCliente(nombre, id, direccion, estratoEconomico, email, contrasena, primerCliente);
			
		}
		
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
	
	public Empleado agregarEmpleado(String nombre, String id, String direccion, String estratoEconomico, String email, String tipo, int salario) throws InformacionExisteExcepcion {
		
		if(buscarEmpleado(id) == true) {
			
			throw new InformacionExisteExcepcion("LA INFORMACION QUE DESEA AGREGAR YA EXISTE EN EL PROGRAMA");
			
		} else {
			
			return agregarRecursivoEmpleado(nombre, id, direccion, estratoEconomico, email, tipo, salario, primerEmpleado);
			
		}
		
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
	
	// METODO PRINCIPAL DE BUSCAR CLIENTE QUE HACE EL LLAMADO AL METODO RECURSIVO
	
	@Override
	public boolean buscar(String id) {
	
		return buscarRecursivo(id, (Cliente) primerCliente);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO RECURSIVO PARA BUSCAR CLIENTE
	
	private boolean buscarRecursivo(String id, Cliente nodo) {
		
		if(nodo == null) {
			
			return false;
			
		} else if(nodo.getId().equalsIgnoreCase(id)) {
			
			return true;
			
		} else {
			
			return buscarRecursivo(id, (Cliente) nodo.getSiguiente());
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PRINCIPAL DE BUSCAR EMPLEADO QUE HACE EL LLAMADO AL METODO RECURSIVO
	
	public boolean buscarEmpleado(String id) {
		
		return buscarEmpleadoRecursivo(id, (Empleado) primerEmpleado);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO RECURSIVO PARA BUSCAR EMPLEADO
	
	private boolean buscarEmpleadoRecursivo(String id, Empleado nodo) {
		
		if(nodo == null) {
			
			return false;
			
		} else if(nodo.getId().equalsIgnoreCase(id)) {
			
			return true;
			
		} else {
			
			return buscarEmpleadoRecursivo(id, (Empleado) nodo.getSiguiente());
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO BUSCAR CLIENTE QUE RETORNA EL CLIENTE O UN NULL EN EL CASO QUE NO EXISTA
	
	public Cliente buscarClienteCliente(String id) {
		
		if(primerCliente != null) {
			
			Cliente temporal = (Cliente) primerCliente;
			
			while(temporal != null) {
				
				if(temporal.getId().equalsIgnoreCase(id)) {
					
					return temporal;
					
				}
				
				temporal = (Cliente) temporal.getSiguiente();
				
			}
			
		}
		
		return null;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO BUSCAR EMPLEADO QUE RETORNA EL CLIENTE O UN NULL EN EL CASO QUE NO EXISTA
	
	public Empleado buscarEmpleadoEmpleado(String id) {
		
		if(primerCliente != null) {
			
			Empleado temporal = (Empleado) primerEmpleado;
			
			while(temporal != null) {
				
				if(temporal.getId().equalsIgnoreCase(id)) {
					
					return temporal;
					
				}
				
				temporal = (Empleado) temporal.getSiguiente();
				
			}
			
		}
		
		return null;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PRINCIPAL PARA ELIMINAR UN CLIENTE QUE HACE EL LLAMADO AL METODO RECURSIVO
	
	@Override
	public boolean eliminar(String id) throws NoExisteInformacionExcepcion {

		return eliminarRecursivoCliente(id, (Cliente) primerCliente, null);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO RECURSIVO PARA ELIMINAR UN CLIENTE
	
	private boolean eliminarRecursivoCliente(String id, Cliente nodo, Cliente anterior) throws NoExisteInformacionExcepcion {
		
		if(nodo == null) {
			
			throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
			
		} else if(nodo.getId().equalsIgnoreCase(id)) {
			
			if(anterior == null) {
				
				primerCliente = primerCliente.getSiguiente();
				
				nodo.setSiguiente(null);
				
				nodo = (Cliente) primerCliente;
				
				return true;
				
			} else {
				
				anterior.setSiguiente(nodo.getSiguiente());
				
				nodo.setSiguiente(null);
				
				nodo = (Cliente) anterior.getSiguiente();
				
				return true;
				
			}
			
		} else {
			
			anterior = nodo;
			
			return eliminarRecursivoCliente(id, (Cliente) nodo.getSiguiente(), anterior);
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO PRINCIPAL PARA ELIMINAR UN EMPLEADO QUE HACE EL LLAMADO AL METODO RECURSIVO
	
	public boolean eliminarEmpleado(String id) throws NoExisteInformacionExcepcion {
		
		return eliminarEmpleadoRecursivo(id, (Empleado) primerEmpleado, null);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO RECURSIVO PARA ELIMINAR UN EMPLEADO
	
	private boolean eliminarEmpleadoRecursivo(String id, Empleado nodo, Empleado anterior) throws NoExisteInformacionExcepcion {
		
		if(nodo == null) {
			
			throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
			
		} else if(nodo.getId().equalsIgnoreCase(id)) {
			
			if(anterior == null) {
				
				primerEmpleado = primerEmpleado.getSiguiente();
				
				nodo.setSiguiente(null);
				
				nodo = (Empleado) primerEmpleado;
				
				return true;
				
			} else {
				
				anterior.setSiguiente(nodo.getSiguiente());
				
				nodo.setSiguiente(null);
				
				nodo = (Empleado) anterior.getSiguiente();
				
				return true;
				
			}
			
		} else {
			
			anterior = nodo;
			
			return eliminarEmpleadoRecursivo(id, (Empleado) nodo.getSiguiente(), anterior);
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	public int calcularMaximo(int valor) {
		
		int retorno = 0;
		
		retorno = (valor / 50000) * 1000000;
		
		return retorno;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	public int calcularDeuda(int valor1) {
		
		int retorno1 = 0;
		
		retorno1 = (int) (valor1 + (valor1 * 0.1));
		
		return retorno1;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	public int calcularCuota(int valor2, int cuotas) {
		
		int retorno2 = 0;
		
		retorno2 = valor2 / cuotas;
		
		return retorno2;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	public int calcularCesantias(int salario, int dias) throws Mayor365Excepcion {
		
		int total = 0;
		
		if(dias >= 365) {
			
			total = salario;
			
		} else if( dias < 365) {
			
			total = ((salario / 365) * dias);
			
		} else {
			
			throw new Mayor365Excepcion("EL NUMERO DE DIAS NO ES CORRECTO");
			
		}
		
		return total;
	}
	
	// ---------------------------------------------------------------------------------------
	
	public int calcularPrima(int salario, int dias) throws Mayor183Excepcion {
		
		int total = 0;
		
		if(dias == 183) {
			
			total = salario / 2;
			
		} else if(dias < 183) {
			
			int salario2 = salario / 2;
			
			total = ((salario2 / 183) * dias);
			
		} else {
			
			throw new Mayor183Excepcion("EL NUMERO DE DIAS NO ES CORRECTO");
			
		}
		
		return total;
	}
	
	// ---------------------------------------------------------------------------------------
	
	public int calcularVacaciones(int salario, int dias) throws Mayor365Excepcion {
		
		int total = 0;
		
		if(dias == 365) {
			
			total = (salario / 2);
			
		} else if(dias < 365) {
			
			int salario2 = salario / 2;
			
			total = ((salario2 / 365) * dias);
			
		} else {
			
			throw new Mayor365Excepcion("EL NUMERO DE DIAS NO ES CORRECTO");
			
		}
		
		
		return total;
		
	}
	
	// ---------------------------------------------------------------------------------------
	
}
