/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package application;

import excepciones.InformacionExisteExcepcion;
import excepciones.InformacionVacia;
import excepciones.NoExisteInformacionExcepcion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import modelo.Servicio;

public class ControladoraCuenta {
	
	// ---------------------------------------------------------------------------------------
	
	private Servicio servicio;
	
	// ---------------------------------------------------------------------------------------
	
	public ControladoraCuenta() {
		
		servicio = new Servicio(null, 0);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField idCuentaTexto;

    @FXML
    private TextField valorCuentaTexto;
    
    @FXML
    private Button agregarCuentaBoton;
	
	// ---------------------------------------------------------------------------------------
	
    @FXML
    private TextField buscarTexto;

    @FXML
    private Button buscarBoton;
    
    @FXML
    private Label idla;

    @FXML
    private Label valorla;
    
	// ---------------------------------------------------------------------------------------
	
    @FXML
    private TextField eliminarTexto;

    @FXML
    private Button eliminarBoton;
    
	// ---------------------------------------------------------------------------------------
	
    @FXML
    public void agregar(ActionEvent event) {

    	try {
    		
    		String id = idCuentaTexto.getText();
    		
    		Integer valor = Integer.parseInt(valorCuentaTexto.getText());
    		
    		if(id.isEmpty() == false && valor != null) {
    			
    			servicio.agregarCuenta(id, valor);
    			
    			Alert alert1277 = new Alert(AlertType.INFORMATION);
        		alert1277.setTitle("Informacion importante");
        		alert1277.setHeaderText(null);
        		alert1277.setContentText("Cuenta agregada correctamente");

        		alert1277.showAndWait();
        		
        		idCuentaTexto.setText(null);
        		
        		valorCuentaTexto.setText(null);
    			
    		} else {
        		
        		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
        		
        	}
    		
    		
    	} catch(InformacionExisteExcepcion ejemplo) {
			
			Alert alert1399 = new Alert(AlertType.ERROR);
			alert1399.setTitle("Error");
			alert1399.setHeaderText("No se puede agregar la cuenta");
			alert1399.setContentText("Esta informacion ya existe en el sistema");

			alert1399.showAndWait();
			
			idCuentaTexto.setText(null);
    		
    		valorCuentaTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert1499 = new Alert(AlertType.WARNING);
			alert1499.setTitle("Atencion");
			alert1499.setHeaderText("No se puede agregar la cuenta");
			alert1499.setContentText("Digite la informacion correspondiente");

			alert1499.showAndWait();
						
		} catch(NullPointerException a2) {
			
			Alert alert1599 = new Alert(AlertType.WARNING);
			alert1599.setTitle("Atencion");
			alert1599.setHeaderText("No se puede agregar la cuenta");
			alert1599.setContentText("Digite la informacion correspondiente");

			alert1599.showAndWait();
			
		} catch(NumberFormatException a4) {
			
			Alert alert159974 = new Alert(AlertType.WARNING);
			alert159974.setTitle("Atencion");
			alert159974.setHeaderText("No se puede agregar la cuenta");
			alert159974.setContentText("Digite la informacion correspondiente");

			alert159974.showAndWait();
			
		}
    	
    }
    
	// ---------------------------------------------------------------------------------------
    
    @FXML
    public void buscar(ActionEvent event) {
    	
    	idla.setText("...");
    	
    	valorla.setText("...");
    	
    	try {
    		
    		String id = buscarTexto.getText();
    		
    		if(id.isEmpty() == false) {
    			
    			if(servicio.buscar(id) == true) {
    				
    				idla.setText(servicio.buscarCuentaCuenta(id).getId());
    				
    				valorla.setText(Integer.toString(servicio.buscarCuentaCuenta(id).getValor()));
    				
    				buscarTexto.setText(null);
    				
    			} else {
    				
    				buscarTexto.setText(null);
    				
    				throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
    				
    			}
    			
    		}  else {
    			
    			throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
    			
    		}
    			
    	} catch(NoExisteInformacionExcepcion a1) {
			
			Alert alert1644 = new Alert(AlertType.ERROR);
			alert1644.setTitle("Error");
			alert1644.setHeaderText("No se puede buscar la cuenta");
			alert1644.setContentText("Esta informacion no existe en el sistema");

			alert1644.showAndWait();
			
		} catch(NullPointerException a2) {
			
			Alert alert1744 = new Alert(AlertType.WARNING);
			alert1744.setTitle("Atencion");
			alert1744.setHeaderText("No se puede buscar la cuenta");
			alert1744.setContentText("Digite la informacion correspondiente");

			alert1744.showAndWait();
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert1844 = new Alert(AlertType.WARNING);
			alert1844.setTitle("Atencion");
			alert1844.setHeaderText("No se puede buscar la cuenta");
			alert1844.setContentText("Digite la informacion correspondiente");

			alert1844.showAndWait();
						
		}
    	
    }
    
    // ---------------------------------------------------------------------------------------
	
    @FXML
    public void eliminar(ActionEvent event) {
    	
    	String id = eliminarTexto.getText();
    	
    	try {
    		
    		if(id.isEmpty() == false) {
    			
    			servicio.eliminar(id);
    			
    			Alert alert1911 = new Alert(AlertType.INFORMATION);
    			alert1911.setTitle("Informacion importante");
    			alert1911.setHeaderText(null);
    			alert1911.setContentText("Cuenta eliminada correctamente");
    			
    			alert1911.showAndWait();
    			
    			eliminarTexto.setText(null);
    			
    		} else {
        		
        		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
        		
        	}
    		
    	} catch(NullPointerException e) {
			
			Alert alert2044 = new Alert(AlertType.WARNING);
			alert2044.setTitle("Atencion");
			alert2044.setHeaderText("No se puede eliminar la cuenta");
			alert2044.setContentText("Digite la informacion correspondiente");

			alert2044.showAndWait();
			
		} catch(NoExisteInformacionExcepcion e1) {
			
			Alert alert2188 = new Alert(AlertType.ERROR);
			alert2188.setTitle("Error");
			alert2188.setHeaderText("No se puede eliminar la cuenta");
			alert2188.setContentText("Esta informacion no existe en el sistema");

			alert2188.showAndWait();
			
			eliminarTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert2277 = new Alert(AlertType.WARNING);
			alert2277.setTitle("Atencion");
			alert2277.setHeaderText("No se puede eliminar la cuenta");
			alert2277.setContentText("Digite la informacion correspondiente");

			alert2277.showAndWait();
						
		}

    }
    
    // ---------------------------------------------------------------------------------------

}
