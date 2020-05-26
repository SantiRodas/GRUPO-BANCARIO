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

public class ControladoraEps {
	
	// ---------------------------------------------------------------------------------------
	
	private Persona persona;
	
	// ---------------------------------------------------------------------------------------
	
	public ControladoraEps() {
		
		persona = new Persona(null, null, null, null, null);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
	private TextField nombreEpsTexto;

	@FXML
	private TextField idEpsText;

	@FXML
	private TextField direccionEpsTexto;

	@FXML
	private TextField estratoEconomicoEpsTexto;

	@FXML
	private TextField emailEpsTexto;

	@FXML
	private Button agregarEpsBoton;
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField buscarTexto;

    @FXML
    private Button BuscarBoton;
    
    @FXML
    private Label nombrela;

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
	public void agregar(ActionEvent event) {
		
		try {
			
			String nombre = nombreEpsTexto.getText();
			
			String id = idEpsText.getText();
			
			String direccion = direccionEpsTexto.getText();
			
			String estrato = estratoEconomicoEpsTexto.getText();
			
			String email = emailEpsTexto.getText();
			
			if(nombre.isEmpty() == false && id.isEmpty() == false && direccion.isEmpty() == false && estrato.isEmpty() == false && email.isEmpty() == false) {
				
				persona.agregarSalud(nombre, id, direccion, estrato, email);
				
				Alert alert12778 = new Alert(AlertType.INFORMATION);
        		alert12778.setTitle("Informacion importante");
        		alert12778.setHeaderText(null);
        		alert12778.setContentText("Eps agregada correctamente");

        		alert12778.showAndWait();
        		
        		nombreEpsTexto.setText(null);
        		
        		idEpsText.setText(null);
        		
        		direccionEpsTexto.setText(null);
        		
        		estratoEconomicoEpsTexto.setText(null);
        		
        		emailEpsTexto.setText(null);
				
			} else {
        		
        		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
        		
        	}
			
		} catch(InformacionExisteExcepcion ejemplo) {
			
			Alert alert13997 = new Alert(AlertType.ERROR);
			alert13997.setTitle("Error");
			alert13997.setHeaderText("No se puede agregar la eps");
			alert13997.setContentText("Esta informacion ya existe en el sistema");

			alert13997.showAndWait();
			
			nombreEpsTexto.setText(null);
    		
    		idEpsText.setText(null);
    		
    		direccionEpsTexto.setText(null);
    		
    		estratoEconomicoEpsTexto.setText(null);
    		
    		emailEpsTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert14994 = new Alert(AlertType.WARNING);
			alert14994.setTitle("Atencion");
			alert14994.setHeaderText("No se puede agregar la eps");
			alert14994.setContentText("Digite la informacion correspondiente");

			alert14994.showAndWait();
						
		} catch(NullPointerException a2) {
			
			Alert alert15994 = new Alert(AlertType.WARNING);
			alert15994.setTitle("Atencion");
			alert15994.setHeaderText("No se puede agregar la eps");
			alert15994.setContentText("Digite la informacion correspondiente");

			alert15994.showAndWait();
			
		}

	}
	 
	// ---------------------------------------------------------------------------------------
	 
	@FXML
    public void buscar(ActionEvent event) {
		
		nombrela.setText("...");
		
		direccionla.setText("...");
		
		estratola.setText("...");
		
		emailla.setText("...");
		
		try {
			
			String id = buscarTexto.getText();
			
			if(id.isEmpty() == false) {
				
				if(persona.buscarSeguro(id) == true) {
					
					nombrela.setText(persona.buscarSeguroSeguro(id).getNombre());
					
					direccionla.setText(persona.buscarSeguroSeguro(id).getDireccion());
					
					estratola.setText(persona.buscarSeguroSeguro(id).getEstratoEconomico());
					
					emailla.setText(persona.buscarSeguroSeguro(id).getEmail());
					
					buscarTexto.setText(null);
					
				} else {
    				
    				buscarTexto.setText(null);
    				
    				throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
    				
    			}
				
			} else {
    			
    			throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
    			
    		}
			
		} catch(NoExisteInformacionExcepcion a1) {
			
			Alert alert164412 = new Alert(AlertType.ERROR);
			alert164412.setTitle("Error");
			alert164412.setHeaderText("No se puede buscar la eps");
			alert164412.setContentText("Esta informacion no existe en el sistema");

			alert164412.showAndWait();
			
		} catch(NullPointerException a2) {
			
			Alert alert174412 = new Alert(AlertType.WARNING);
			alert174412.setTitle("Atencion");
			alert174412.setHeaderText("No se puede buscar la eps");
			alert174412.setContentText("Digite la informacion correspondiente");

			alert174412.showAndWait();
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert184412 = new Alert(AlertType.WARNING);
			alert184412.setTitle("Atencion");
			alert184412.setHeaderText("No se puede buscar la eps");
			alert184412.setContentText("Digite la informacion correspondiente");

			alert184412.showAndWait();
						
		}

    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
	public void eliminar(ActionEvent event) {
		
		String id = eliminarTexto.getText();
		
		try {
			
			if(id.isEmpty() == false) {
				
				persona.eliminarSeguro(id);
				
				Alert alert191144 = new Alert(AlertType.INFORMATION);
    			alert191144.setTitle("Informacion importante");
    			alert191144.setHeaderText(null);
    			alert191144.setContentText("Eps eliminada correctamente");
    			
    			alert191144.showAndWait();
    			
    			eliminarTexto.setText(null);
				
			} else {
        		
        		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
        		
        	}
			
		} catch(NullPointerException e) {
			
			Alert alert204477 = new Alert(AlertType.WARNING);
			alert204477.setTitle("Atencion");
			alert204477.setHeaderText("No se puede eliminar la eps");
			alert204477.setContentText("Digite la informacion correspondiente");

			alert204477.showAndWait();
			
		} catch(NoExisteInformacionExcepcion e1) {
			
			Alert alert218811 = new Alert(AlertType.ERROR);
			alert218811.setTitle("Error");
			alert218811.setHeaderText("No se puede eliminar la eps");
			alert218811.setContentText("Esta informacion no existe en el sistema");

			alert218811.showAndWait();
			
			eliminarTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert227766 = new Alert(AlertType.WARNING);
			alert227766.setTitle("Atencion");
			alert227766.setHeaderText("No se puede eliminar la eps");
			alert227766.setContentText("Digite la informacion correspondiente");

			alert227766.showAndWait();
						
		}
		 
	}
	
	// ---------------------------------------------------------------------------------------
	
}
