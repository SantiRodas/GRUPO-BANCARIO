/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package application;

import java.io.IOException;
import excepciones.InformacionExisteExcepcion;
import excepciones.InformacionVacia;
import excepciones.NoExisteInformacionExcepcion;
import excepciones.ValorIncorrectoExcepcion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import modelo.Lugar;

public class ControladoraCliente {
	
	// ---------------------------------------------------------------------------------------
	
	private Lugar lugar;
	
	// ---------------------------------------------------------------------------------------
	
	public ControladoraCliente() {
		
		lugar = new Lugar(null, null, null, null, null);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField nombreClienteTexto;

    @FXML
    private TextField idClienteTexto;

    @FXML
    private TextField direccionClienteTexto;

    @FXML
    private TextField estratoEconomicoClienteTexto;

    @FXML
    private TextField codigoPostalClienteTexto;

    @FXML
    private PasswordField claveUnicaClienteTexto;
    
    @FXML
    private Button agregarClienteBoton;
	
	// ---------------------------------------------------------------------------------------
	
    @FXML
    private Button buscarBoton;

    @FXML
    private TextField buscarTexto;
    
    // ---------------------------------------------------------------------------------------
	
    @FXML
    private Button eliminarBoton;

    @FXML
    private TextField eliminarTexto;
    
	// ---------------------------------------------------------------------------------------
    
    @FXML
    private Button informeBoton;

    @FXML
    private TextField informeTexto;
    
    // ---------------------------------------------------------------------------------------
    
	@FXML
    private TextField salarioTexto;
	
	@FXML
    private RadioButton opcion1;
	
	@FXML
    private RadioButton opcion2;
	
	@FXML
    private RadioButton opcion3;
	
	@FXML
    private Button calcular;
	
	@FXML
    private Label deuda;
	
	@FXML
    private Label cuota;
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void agregar(ActionEvent event) {
    	
    	try {
    		
    		String nombre = nombreClienteTexto.getText();
    		
    		String id = idClienteTexto.getText();
    		
    		String direccion = direccionClienteTexto.getText();
    		
    		String estrato = estratoEconomicoClienteTexto.getText();
    		
    		String email = codigoPostalClienteTexto.getText();
    		
    		String clave = claveUnicaClienteTexto.getText();
    		
    		if(nombre.isEmpty() == false && id.isEmpty() == false && direccion.isEmpty() == false && estrato.isEmpty() == false && email.isEmpty() == false && clave.isEmpty() == false) {
    			
    			lugar.agregarCliente(nombre, id, direccion, estrato, email, clave);
    			
    			Alert alert101 = new Alert(AlertType.INFORMATION);
        		alert101.setTitle("Informacion importante");
        		alert101.setHeaderText(null);
        		alert101.setContentText("Empleado agregado correctamente");

        		alert101.showAndWait();
        		
        		nombreClienteTexto.setText(null);
        		
        		idClienteTexto.setText(null);
        		
        		direccionClienteTexto.setText(null);
        		
        		estratoEconomicoClienteTexto.setText(null);
        		
        		codigoPostalClienteTexto.setText(null);
        		
        		claveUnicaClienteTexto.setText(null);
    			
    		} else {
    			
    			throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
    			
    		}
    		
    	} catch(InformacionExisteExcepcion ejemplo) {
			
			Alert alert35 = new Alert(AlertType.ERROR);
			alert35.setTitle("Error");
			alert35.setHeaderText("No se puede agregar el empleado");
			alert35.setContentText("Esta informacion ya existe en el sistema");

			alert35.showAndWait();
			
			nombreClienteTexto.setText(null);
    		
    		idClienteTexto.setText(null);
    		
    		direccionClienteTexto.setText(null);
    		
    		estratoEconomicoClienteTexto.setText(null);
    		
    		codigoPostalClienteTexto.setText(null);
    		
    		claveUnicaClienteTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert361 = new Alert(AlertType.WARNING);
			alert361.setTitle("Atencion");
			alert361.setHeaderText("No se puede agregar el empleado");
			alert361.setContentText("Digite la informacion correspondiente");

			alert361.showAndWait();
						
		} catch(NullPointerException a2) {
			
			Alert alert371 = new Alert(AlertType.WARNING);
			alert371.setTitle("Atencion");
			alert371.setHeaderText("No se puede agregar el empleado");
			alert371.setContentText("Digite la informacion correspondiente");

			alert371.showAndWait();
			
		} catch(NumberFormatException a8) {
			
			Alert alert200 = new Alert(AlertType.WARNING);
			alert200.setTitle("Atencion");
			alert200.setHeaderText("No se puede agregar el empleado");
			alert200.setContentText("Digite la informacion correspondiente");

			alert200.showAndWait();
			
		} 

    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void buscar(ActionEvent event) {
    	
    	try {
    		
    		String id = buscarTexto.getText();
    		
    		if(id.isEmpty() == false) {
    			
    			if(lugar.buscar(id) == true) {
    				
    				Alert alert100 = new Alert(AlertType.INFORMATION);
					alert100.setTitle("Informacion importante");
					alert100.setHeaderText(null);
					alert100.setContentText("Felicitaciones, este cliente si existe y fue encontrado satisfactoriamente");
					
					alert100.showAndWait();
					
					buscarTexto.setText(null);
    				
    			} else {
    				
    				buscarTexto.setText(null);
    				
    				throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
    				
    			}
    			
    		} else {
    			
    			throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
    			
    		}
    		
    	} catch(NoExisteInformacionExcepcion a1) {
			
			Alert alert4011 = new Alert(AlertType.ERROR);
			alert4011.setTitle("Error");
			alert4011.setHeaderText("No se puede buscar el cliente");
			alert4011.setContentText("Esta informacion no existe en el sistema");

			alert4011.showAndWait();
			
		} catch(NullPointerException a2) {
			
			Alert alert414 = new Alert(AlertType.WARNING);
			alert414.setTitle("Atencion");
			alert414.setHeaderText("No se puede buscar el cliente");
			alert414.setContentText("Digite la informacion correspondiente");

			alert414.showAndWait();
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert428 = new Alert(AlertType.WARNING);
			alert428.setTitle("Atencion");
			alert428.setHeaderText("No se puede buscar el cliente");
			alert428.setContentText("Digite la informacion correspondiente");

			alert428.showAndWait();
						
		}

    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void eliminar(ActionEvent event) {
		
		try {
			
			String id = eliminarTexto.getText();
			
			if(id.isEmpty() == false) {
				
				lugar.eliminar(id);
				
				Alert alert437 = new Alert(AlertType.INFORMATION);
				alert437.setTitle("Informacion importante");
				alert437.setHeaderText(null);
				alert437.setContentText("Cliente eliminado correctamente");
				
				alert437.showAndWait();
				
				eliminarTexto.setText(null);
				
			} else {
	    		
	    		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
	    		
	    	}
			
		} catch(NullPointerException e) {
			
			Alert alert449 = new Alert(AlertType.WARNING);
			alert449.setTitle("Atencion");
			alert449.setHeaderText("No se puede eliminar el cliente");
			alert449.setContentText("Digite la informacion correspondiente");

			alert449.showAndWait();
			
		} catch(NoExisteInformacionExcepcion e1) {
			
			Alert alert458 = new Alert(AlertType.ERROR);
			alert458.setTitle("Error");
			alert458.setHeaderText("No se puede eliminar el cliente");
			alert458.setContentText("Esta informacion no existe en el sistema");

			alert458.showAndWait();
			
			eliminarTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert467 = new Alert(AlertType.WARNING);
			alert467.setTitle("Atencion");
			alert467.setHeaderText("No se puede eliminar el cliente");
			alert467.setContentText("Digite la informacion correspondiente");

			alert467.showAndWait();
						
		}

    }
		
	// ---------------------------------------------------------------------------------------

    @FXML
    public void informe(ActionEvent event) {
    	
    	

    }
    
    // ---------------------------------------------------------------------------------------
    
    @FXML
    public void calcularTodo(ActionEvent event) throws IOException, ValorIncorrectoExcepcion {

		try {
			
			Integer salario = Integer.parseInt(salarioTexto.getText());
			
			if(salario > 0) {
				
				int numeroCuotas = 0;
				
				if(opcion1.isSelected()) {
					
					numeroCuotas = 12;
					
				}
				
				if(opcion2.isSelected()) {
					
					numeroCuotas = 24;
					
					
				}
				
				if(opcion3.isSelected()) {
					
					numeroCuotas = 36;
					
				}
				
				int maximo = lugar.calcularMaximo(salario);
				
				int deudan = lugar.calcularDeuda(maximo);
				
				int cuotan = lugar.calcularCuota(deudan, numeroCuotas);
				
				String mensaje1 = deudan+ "";
				
				String mensaje2 = cuotan + "";
				
				deuda.setText(mensaje1);
				
				cuota.setText(mensaje2);
				
			} else {
				
				throw new ValorIncorrectoExcepcion("Valor incorrecto");
				
			}
			
		} catch(NullPointerException ejemplo1) {
			
			Alert alert700 = new Alert(Alert.AlertType.ERROR);
    	    alert700.setHeaderText(null);
    	    alert700.setTitle("Error");
    	    alert700.setContentText("Por favor ingrese todos los datos correspondidos");
    	    alert700.showAndWait();
			
		} catch(NumberFormatException ejemplo2) {
			
			Alert alert800 = new Alert(Alert.AlertType.ERROR);
    	    alert800.setHeaderText(null);
    	    alert800.setTitle("Error");
    	    alert800.setContentText("Datos invalidos, intente nuevamente");
    	    alert800.showAndWait();
			
		} catch(ValorIncorrectoExcepcion a4) {
			
			Alert alert900 = new Alert(Alert.AlertType.ERROR);
    	    alert900.setHeaderText(null);
    	    alert900.setTitle("Error");
    	    alert900.setContentText("Datos invalidos, intente nuevamente");
    	    alert900.showAndWait();
			
		}
		
    }
    
    // ---------------------------------------------------------------------------------------

	
}
