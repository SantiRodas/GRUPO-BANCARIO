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
import modelo.Banco;

public class ControladoraSucursal {
	
	// ---------------------------------------------------------------------------------------
	
	private Banco banco;
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField nombreSucursalTexto;

    @FXML
    private TextField idSucursalTexto;

    @FXML
    private TextField direccionSucursalTexto;

    @FXML
    private TextField estratoTexto;

    @FXML
    private TextField emailTexto;
    
    @FXML
    private Button sucursalBoton;
    
    // ---------------------------------------------------------------------------------------
    
    @FXML
    private TextField buscarTexto;

    @FXML
    private Button buscarBoton;
    
    @FXML
    private Label nombrela;

    @FXML
    private Label idla;

    @FXML
    private Label direccionla;

    @FXML
    private Label estratola;

    @FXML
    private Label emailla;
    
    // ---------------------------------------------------------------------------------------
	
    @FXML
    private TextField eliminarTexto;

    @FXML
    private Button eliminarBoton;
	
	// ---------------------------------------------------------------------------------------
	
    @FXML
    private TextField informeTexto;

    @FXML
    private Button informeBoton;
	
	// ---------------------------------------------------------------------------------------
	
	
	public ControladoraSucursal() {
		
		banco = new Banco(null, null);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
    @FXML
    public void agregar(ActionEvent event) throws InformacionVacia {
    	
    	try {
    		
    		String nombre = nombreSucursalTexto.getText();
        	
        	String id = idSucursalTexto.getText();
        	
        	String direccion = direccionSucursalTexto.getText();
        	
        	String estrato = estratoTexto.getText();
        	
        	String email = emailTexto.getText();
        	
        	if(nombre.isEmpty() == false && id.isEmpty() == false && direccion.isEmpty() == false && estrato.isEmpty() == false && email.isEmpty() == false) {
        		
        		banco.agregar(nombre, id, direccion, estrato, email);
        		
        		Alert alert12 = new Alert(AlertType.INFORMATION);
        		alert12.setTitle("Informacion importante");
        		alert12.setHeaderText(null);
        		alert12.setContentText("Sucursal agregado correctamente");

        		alert12.showAndWait();
        		
        		nombreSucursalTexto.setText(null);
    			
    			idSucursalTexto.setText(null);
    			
    			direccionSucursalTexto.setText(null);
    			
    			estratoTexto.setText(null);
    			
    			emailTexto.setText(null);
        		
        	} else {
        		
        		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
        		
        	}

    	} catch(InformacionExisteExcepcion ejemplo) {
			
			Alert alert13 = new Alert(AlertType.ERROR);
			alert13.setTitle("Error");
			alert13.setHeaderText("No se puede agregar la sucursal");
			alert13.setContentText("Esta informacion ya existe en el sistema");

			alert13.showAndWait();
			
			nombreSucursalTexto.setText(null);
			
			idSucursalTexto.setText(null);
			
			direccionSucursalTexto.setText(null);
			
			estratoTexto.setText(null);
			
			emailTexto.setText(null);
			
					
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert14 = new Alert(AlertType.WARNING);
			alert14.setTitle("Atencion");
			alert14.setHeaderText("No se puede agregar la sucursal");
			alert14.setContentText("Digite la informacion correspondiente");

			alert14.showAndWait();
						
		} catch(NullPointerException a2) {
			
			Alert alert15 = new Alert(AlertType.WARNING);
			alert15.setTitle("Atencion");
			alert15.setHeaderText("No se puede agregar la sucursal");
			alert15.setContentText("Digite la informacion correspondiente");

			alert15.showAndWait();
			
		}
   
    }
    
    // ---------------------------------------------------------------------------------------
    
    @FXML
    public void buscar(ActionEvent event) {
    	
    	nombrela.setText("...");
    	
    	idla.setText("...");
    	
    	direccionla.setText("...");
    	
    	estratola.setText("...");
    	
    	emailla.setText("...");
    	
    	try {
    		
    		String id = buscarTexto.getText();
    		
    		if(id.isEmpty() == false) {
    			
    			if(banco.buscar(id) == true) {
    				
    				nombrela.setText(banco.buscarLugar(id).getNombre());
    				
    				idla.setText(banco.buscarLugar(id).getId());
    				
    				direccionla.setText(banco.buscarLugar(id).getDireccion());
    				
    				estratola.setText(banco.buscarLugar(id).getEstratoEconomico());
    				
    				emailla.setText(banco.buscarLugar(id).getEmail());
    				
    				buscarTexto.setText(null);
    				
    			} else {
    				
    				buscarTexto.setText(null);
    				
    				throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
    				
    			}
    			
    		} else {
    			
    			throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
    			
    		}
    		
    	} catch(NoExisteInformacionExcepcion a1) {
			
			Alert alert16 = new Alert(AlertType.ERROR);
			alert16.setTitle("Error");
			alert16.setHeaderText("No se puede buscar la sucursal");
			alert16.setContentText("Esta informacion no existe en el sistema");

			alert16.showAndWait();
			
		} catch(NullPointerException a2) {
			
			Alert alert17 = new Alert(AlertType.WARNING);
			alert17.setTitle("Atencion");
			alert17.setHeaderText("No se puede buscar la sucursal");
			alert17.setContentText("Digite la informacion correspondiente");

			alert17.showAndWait();
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert18 = new Alert(AlertType.WARNING);
			alert18.setTitle("Atencion");
			alert18.setHeaderText("No se puede buscar la sucursal");
			alert18.setContentText("Digite la informacion correspondiente");

			alert18.showAndWait();
						
		}

    }
    
    // ---------------------------------------------------------------------------------------
    
    @FXML
    public void eliminar(ActionEvent event) throws NoExisteInformacionExcepcion, InformacionVacia {
    	
    	try {
    		
    		String id = eliminarTexto.getText();
        	
        	if(id.isEmpty() == false) {
        		
        		banco.eliminar(id);
        		
        		Alert alert19 = new Alert(AlertType.INFORMATION);
    			alert19.setTitle("Informacion importante");
    			alert19.setHeaderText(null);
    			alert19.setContentText("Sucursal eliminada correctamente");
    			
    			alert19.showAndWait();
    			
    			eliminarTexto.setText(null);
        		
        	} else {
        		
        		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
        		
        	}
    		
    	} catch(NullPointerException e) {
			
			Alert alert20 = new Alert(AlertType.WARNING);
			alert20.setTitle("Atencion");
			alert20.setHeaderText("No se puede eliminar la sucursal");
			alert20.setContentText("Digite la informacion correspondiente");

			alert20.showAndWait();
			
		} catch(NoExisteInformacionExcepcion e1) {
			
			Alert alert21 = new Alert(AlertType.ERROR);
			alert21.setTitle("Error");
			alert21.setHeaderText("No se puede eliminar la sucursal");
			alert21.setContentText("Esta informacion no existe en el sistema");

			alert21.showAndWait();
			
			eliminarTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert22 = new Alert(AlertType.WARNING);
			alert22.setTitle("Atencion");
			alert22.setHeaderText("No se puede eliminar la sucursal");
			alert22.setContentText("Digite la informacion correspondiente");

			alert22.showAndWait();
						
		}
   
    }
    
    // ---------------------------------------------------------------------------------------
    
    @FXML
    public void informe(ActionEvent event) {

    }
    
    // ---------------------------------------------------------------------------------------

}
