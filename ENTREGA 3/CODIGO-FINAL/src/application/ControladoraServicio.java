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
import modelo.Persona;

public class ControladoraServicio {
	
	// ---------------------------------------------------------------------------------------
	
	private Persona persona;
	
	// ---------------------------------------------------------------------------------------
	
	public ControladoraServicio() {
		
		persona = new Persona(null, null, null, null, null);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField nombreServicioTexto;

    @FXML
    private TextField valorServicioTexto;

    @FXML
    private Button agregarBoton;
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField buscarTexto;

    @FXML
    private Button buscarBoton;
    
    @FXML
    private Label nombrela;

    @FXML
    private Label valorla;
    
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

    @FXML
    public void agregarservicio(ActionEvent event) {
    	
    	try {
    		
    		String nombre = nombreServicioTexto.getText();
    		
    		Integer valor = Integer.parseInt(valorServicioTexto.getText());
    		
    		if(nombre.isEmpty() == false && valor != null) {
    			
    			persona.agregarServicio(nombre, valor);
    			
    			Alert alert23 = new Alert(AlertType.INFORMATION);
        		alert23.setTitle("Informacion importante");
        		alert23.setHeaderText(null);
        		alert23.setContentText("Servicio agregado correctamente");

        		alert23.showAndWait();
        		
        		nombreServicioTexto.setText(null);
        		
        		valorServicioTexto.setText(null);
    			
    		} else {
    			
    			throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
    			
    		}
    		
    		
    	} catch(InformacionExisteExcepcion ejemplo) {
			
			Alert alert24 = new Alert(AlertType.ERROR);
			alert24.setTitle("Error");
			alert24.setHeaderText("No se puede agregar el servicio");
			alert24.setContentText("Esta informacion ya existe en el sistema");

			alert24.showAndWait();
			
			nombreServicioTexto.setText(null);
    		
    		valorServicioTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert25 = new Alert(AlertType.WARNING);
			alert25.setTitle("Atencion");
			alert25.setHeaderText("No se puede agregar el servicio");
			alert25.setContentText("Digite la informacion correspondiente");

			alert25.showAndWait();
						
		} catch(NullPointerException a2) {
			
			Alert alert26 = new Alert(AlertType.WARNING);
			alert26.setTitle("Atencion");
			alert26.setHeaderText("No se puede agregar el servicio");
			alert26.setContentText("Digite la informacion correspondiente");

			alert26.showAndWait();
			
		} catch(NumberFormatException a8) {
			
			Alert alert27 = new Alert(AlertType.WARNING);
			alert27.setTitle("Atencion");
			alert27.setHeaderText("No se puede agregar el servicio");
			alert27.setContentText("Digite la informacion correspondiente");

			alert27.showAndWait();
			
		}

    }
    
	// ---------------------------------------------------------------------------------------
	
    @FXML
    public void buscar(ActionEvent event) {
    	
    	nombrela.setText("...");
    	
    	valorla.setText("...");
    	
    	try {
    		
    		String nombre = buscarTexto.getText();
    		
    		if(nombre.isEmpty() == false) {
    			
    			if(persona.buscar(nombre) == true) {
    				
    				nombrela.setText(persona.buscarServicio(nombre).getNombre());
    				
    				valorla.setText(Integer.toString(persona.buscarServicio(nombre).getValor()));
    				
    				buscarTexto.setText(null);
    				
    			} else {
    				
    				buscarTexto.setText(null);
    				
    				throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
    				
    			}
    			
    		} else {
    			
    			throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
    			
    		}
    		
    	} catch(NoExisteInformacionExcepcion a1) {
			
			Alert alert28 = new Alert(AlertType.ERROR);
			alert28.setTitle("Error");
			alert28.setHeaderText("No se puede buscar el servicio");
			alert28.setContentText("Esta informacion no existe en el sistema");

			alert28.showAndWait();
			
		} catch(NullPointerException a2) {
			
			Alert alert29 = new Alert(AlertType.WARNING);
			alert29.setTitle("Atencion");
			alert29.setHeaderText("No se puede buscar el servicio");
			alert29.setContentText("Digite la informacion correspondiente");

			alert29.showAndWait();
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert29 = new Alert(AlertType.WARNING);
			alert29.setTitle("Atencion");
			alert29.setHeaderText("No se puede buscar el servicio");
			alert29.setContentText("Digite la informacion correspondiente");

			alert29.showAndWait();
						
		}
    	
    }
	
	// ---------------------------------------------------------------------------------------
    
    @FXML
    public void eliminar(ActionEvent event) {

    	try {
    		
    		String nombre = eliminarTexto.getText();
 
    		if(nombre.isEmpty() == false) {
    			
    			persona.eliminar(nombre);
    			
    			Alert alert30 = new Alert(AlertType.INFORMATION);
    			alert30.setTitle("Informacion importante");
    			alert30.setHeaderText(null);
    			alert30.setContentText("Servicio eliminado correctamente");
    			
    			alert30.showAndWait();
    			
    			eliminarTexto.setText(null);
    			
    		} else {
        		
        		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
        		
        	}
    		
    	} catch(NullPointerException e) {
			
			Alert alert31 = new Alert(AlertType.WARNING);
			alert31.setTitle("Atencion");
			alert31.setHeaderText("No se puede eliminar el servicio");
			alert31.setContentText("Digite la informacion correspondiente");

			alert31.showAndWait();
			
		} catch(NoExisteInformacionExcepcion e1) {
			
			Alert alert32 = new Alert(AlertType.ERROR);
			alert32.setTitle("Error");
			alert32.setHeaderText("No se puede eliminar el servicio");
			alert32.setContentText("Esta informacion no existe en el sistema");

			alert32.showAndWait();
			
			eliminarTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert33 = new Alert(AlertType.WARNING);
			alert33.setTitle("Atencion");
			alert33.setHeaderText("No se puede eliminar el servicio");
			alert33.setContentText("Digite la informacion correspondiente");

			alert33.showAndWait();
						
		}
    	
    }
    
    // ---------------------------------------------------------------------------------------
    
    @FXML
    public void informe(ActionEvent event) {

    	
    	
    }
    
    // ---------------------------------------------------------------------------------------

}
