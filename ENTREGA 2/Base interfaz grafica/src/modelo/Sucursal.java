package modelo;

import java.util.ArrayList;

public class Sucursal {
	
	private ArrayList <Cliente> clientes;

	public Sucursal() {
		
		clientes = new ArrayList<Cliente>();
		
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
    public int calcularMaximo(int valor) {
		
		int retorno = 0;
		
		retorno = (valor / 50000) * 1000000;
		
		return retorno;
		
	}
	
	public int calcularDeuda(int valor1) {
		
		int retorno1 = 0;
		
		retorno1 = (int) (valor1 + (valor1 * 0.1));
		
		return retorno1;
		
	}
	
    public int calcularCuota(int valor2, int cuotas) {
		
		int retorno2 = 0;
		
		retorno2 = valor2 / cuotas;
		
		return retorno2;
		
	}
	
	
	
	

}
