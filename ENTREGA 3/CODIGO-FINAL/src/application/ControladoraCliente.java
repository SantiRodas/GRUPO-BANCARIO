package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import modelo.Cliente;
import modelo.Sucursal;

public class ControladoraCliente {
	
	//-----------------------------------------------------------------------
	
	@FXML
    private BorderPane panelPrincipal;
	
	//-----------------------------------------------------------------------
	
	Sucursal sucursal = new Sucursal(null, null, null, null, null);
	
	//-----------------------------------------------------------------------
	
	public ControladoraCliente() {
		
		
		
	}
	
	//-----------------------------------------------------------------------
	
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
	
	//-----------------------------------------------------------------------
	
	@FXML
    private Button realizarClienteBoton;
	
	//-----------------------------------------------------------------------
	
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
	
	//-----------------------------------------------------------------------
	
	@FXML
    public void calcularTodo(ActionEvent event) throws IOException {

		try {
			
			int salario = Integer.parseInt(salarioTexto.getText());
			
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
			
			/*int maximo = sucursal.calcularMaximo(salario);
			
			int deudan = sucursal.calcularDeuda(maximo);
			
			int cuotan = sucursal.calcularCuota(deudan, numeroCuotas);
			
			String mensaje1 = deudan+ "";
			
			String mensaje2 = cuotan + "";
			
			deuda.setText(mensaje1);
			
			cuota.setText(mensaje2);
			*/
			
		}catch(NullPointerException ejemplo1) {
			
			Alert alert = new Alert(Alert.AlertType.ERROR);
    	    alert.setHeaderText(null);
    	    alert.setTitle("Error");
    	    alert.setContentText("Por favor ingrese todos los datos correspondidos");
    	    alert.showAndWait();
			
		}catch(NumberFormatException ejemplo2) {
			
			Alert alert = new Alert(Alert.AlertType.ERROR);
    	    alert.setHeaderText(null);
    	    alert.setTitle("Error");
    	    alert.setContentText("Datos invalidos, intente nuevamente");
    	    alert.showAndWait();
			
		}
		
    }
	
	//-----------------------------------------------------------------------
	
	@FXML
    public void agregar(ActionEvent event) throws IOException{
		
		try {
			/*
			String nombre = nombreClienteTexto.getText();
			
			String id = idClienteTexto.getText();
			
			String direccion = direccionClienteTexto.getText();
			
			int estrato = Integer.parseInt(estratoEconomicoClienteTexto.getText());
			
			String codigo = codigoPostalClienteTexto.getText();
			
			String clave = claveUnicaClienteTexto.getText();
			
			Cliente cliente = new Cliente(nombre, id, direccion, estrato, codigo, clave);
			
			sucursal.getClientes().add(cliente);
			
			*/
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	    alert.setHeaderText(null);
    	    alert.setTitle("Info");
    	    alert.setContentText("Agregado correctamente");
    	    alert.showAndWait();
    	    
    	    nombreClienteTexto.setText("");
    	    
    	    idClienteTexto.setText("");
    	    
    	    direccionClienteTexto.setText("");
    	    
    	    estratoEconomicoClienteTexto.setText("");
    	    
    	    codigoPostalClienteTexto.setText("");
    	    
    	    claveUnicaClienteTexto.setText("");
			
			
		}catch(NullPointerException ejemplo) {
			
			Alert alert = new Alert(Alert.AlertType.ERROR);
    	    alert.setHeaderText(null);
    	    alert.setTitle("Error");
    	    alert.setContentText("Por favor ingrese todos los datos correspondidos");
    	    alert.showAndWait();
			
		}catch(NumberFormatException ejemplo) {
			
			Alert alert = new Alert(Alert.AlertType.ERROR);
    	    alert.setHeaderText(null);
    	    alert.setTitle("Error");
    	    alert.setContentText("Por favor ingrese todos los datos correctamente");
    	    alert.showAndWait();
			
		}
		
		
		
	}
	
	//-----------------------------------------------------------------------
	
    @FXML
    public void realizar(ActionEvent event) throws IOException {
    	
    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    alert.setHeaderText(null);
	    alert.setTitle("Info");
	    alert.setContentText("Esta opcion no esta implementada en esta version");
	    alert.showAndWait();
    	
    }
    
	//-----------------------------------------------------------------------

	
}
