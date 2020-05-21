/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package modelo;

public class Empleado extends Persona {
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE EMPLEADO
	
	private String tipo;
	private int salario;
		
	// ---------------------------------------------------------------------------------------
	
	// METODO CONTRUCTOR DE LA CLASE EMPLEADO QUE HEREDA DE LA CLASE PERSONA
	
	public Empleado(String nombre, String id, String direccion, String estratoEconomico, String email, String tipo, int salario) {
		
		super(nombre, id, direccion, estratoEconomico, email);
		
		this.tipo = tipo;
		this.salario = salario;
				
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE EMPLEADO

	public String getTipo() {
		return tipo;
	}
	
	public int getSalario() {
		return salario;
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE EMPLEADO

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
		
	// ---------------------------------------------------------------------------------------

}
