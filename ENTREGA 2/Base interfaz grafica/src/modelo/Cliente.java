package modelo;

public class Cliente {
	
	private String nombre;
	private String id;
	private String direccion;
	private int estratoEconomico;
	private String codigoPostal;
	private String clave;
	
	public Cliente(String nombre, String id, String direccion, int estratoEconomico, String codigoPostal, String clave) {

		this.nombre = nombre;
		this.id = id;
		this.direccion = direccion;
		this.estratoEconomico = estratoEconomico;
		this.codigoPostal = codigoPostal;
		this.clave = clave;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEstratoEconomico() {
		return estratoEconomico;
	}

	public void setEstratoEconomico(int estratoEconomico) {
		this.estratoEconomico = estratoEconomico;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
