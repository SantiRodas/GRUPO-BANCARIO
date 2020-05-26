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

public class ControladoraBeneficio {
	
	// ---------------------------------------------------------------------------------------
	
	private Persona persona;
	
	// ---------------------------------------------------------------------------------------
	
	public ControladoraBeneficio() {
		
		persona = new Persona(null, null, null, null, null);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField nombreBeneficio;

    @FXML
    private TextField idBeneficio;

    @FXML
    private TextField claveBeneficio;

    @FXML
    private TextField valorBeneficio;

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
    private Label clavela;

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
    		
    		String nombre = nombreBeneficio.getText();
    		
    		String id = idBeneficio.getText();
    		
    		String clave = claveBeneficio.getText();
    		
    		Integer valor = Integer.parseInt(valorBeneficio.getText());
    		
    		if(nombre.isEmpty() == false && id.isEmpty() == false && clave.isEmpty() == false && valor != null) {
    			
    			persona.agregarBeneficioDescuento(nombre, id, clave, valor);
    			
    			Alert alert1277877 = new Alert(AlertType.INFORMATION);
        		alert1277877.setTitle("Informacion importante");
        		alert1277877.setHeaderText(null);
        		alert1277877.setContentText("Beneficio agregado correctamente");

        		alert1277877.showAndWait();
        		
        		nombreBeneficio.setText(null);
        		
        		idBeneficio.setText(null);
        		
        		claveBeneficio.setText(null);
        		
        		valorBeneficio.setText(null);
    			
    		} else {
        		
        		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
        		
        	}
    		
    	} catch(InformacionExisteExcepcion ejemplo) {
			
			Alert alert1399711 = new Alert(AlertType.ERROR);
			alert1399711.setTitle("Error");
			alert1399711.setHeaderText("No se puede agregar el beneficio");
			alert1399711.setContentText("Esta informacion ya existe en el sistema");

			alert1399711.showAndWait();
			
			nombreBeneficio.setText(null);
    		
    		idBeneficio.setText(null);
    		
    		claveBeneficio.setText(null);
    		
    		valorBeneficio.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert1499411 = new Alert(AlertType.WARNING);
			alert1499411.setTitle("Atencion");
			alert1499411.setHeaderText("No se puede agregar el beneficio");
			alert1499411.setContentText("Digite la informacion correspondiente");

			alert1499411.showAndWait();
						
		} catch(NullPointerException a2) {
			
			Alert alert1599411 = new Alert(AlertType.WARNING);
			alert1599411.setTitle("Atencion");
			alert1599411.setHeaderText("No se puede agregar el beneficio");
			alert1599411.setContentText("Digite la informacion correspondiente");

			alert1599411.showAndWait();
			
		} catch(NumberFormatException a3) {
			
			Alert alert15994114 = new Alert(AlertType.WARNING);
			alert15994114.setTitle("Atencion");
			alert15994114.setHeaderText("No se puede agregar el beneficio");
			alert15994114.setContentText("Digite la informacion correspondiente");

			alert15994114.showAndWait();
			
		}

    }
    
	// ---------------------------------------------------------------------------------------
	
    @FXML
    public void buscar(ActionEvent event) {
    	
    	nombrela.setText("...");
    	
    	clavela.setText("...");
    	
    	valorla.setText("...");
    	
    	try {
    		
    		String id = buscarTexto.getText();
    		
    		if(id.isEmpty() == false) {
    			
    			if(persona.buscarBeneficio(id) == true) {
    				
    				nombrela.setText(persona.buscarBeneficioBeneficio(id).getNombre());
    				
    				clavela.setText(persona.buscarBeneficioBeneficio(id).getContrasena());
    				
    				valorla.setText(Integer.toString(persona.buscarBeneficioBeneficio(id).getValor()));
    				
    				buscarTexto.setText(null);
    				
    			} else {
    				
    				buscarTexto.setText(null);
    				
    				throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
    				
    			}
    			
    		} else {
    			
    			throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
    			
    		}
    		
    	} catch(NoExisteInformacionExcepcion a1) {
			
			Alert alert16441288 = new Alert(AlertType.ERROR);
			alert16441288.setTitle("Error");
			alert16441288.setHeaderText("No se puede buscar el beneficio");
			alert16441288.setContentText("Esta informacion no existe en el sistema");

			alert16441288.showAndWait();
			
		} catch(NullPointerException a2) {
			
			Alert alert17441288 = new Alert(AlertType.WARNING);
			alert17441288.setTitle("Atencion");
			alert17441288.setHeaderText("No se puede buscar el beneficio");
			alert17441288.setContentText("Digite la informacion correspondiente");

			alert17441288.showAndWait();
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert18441277 = new Alert(AlertType.WARNING);
			alert18441277.setTitle("Atencion");
			alert18441277.setHeaderText("No se puede buscar el beneficio");
			alert18441277.setContentText("Digite la informacion correspondiente");

			alert18441277.showAndWait();
						
		}

    }
    
	// ---------------------------------------------------------------------------------------
	
    @FXML
    public void eliminar(ActionEvent event) {
    	
    	String id = eliminarTexto.getText();
    	
    	try {
    		
    		if(id.isEmpty() == false) {
    			
    			persona.eliminarBeneficio(id);
				
				Alert alert19114444 = new Alert(AlertType.INFORMATION);
    			alert19114444.setTitle("Informacion importante");
    			alert19114444.setHeaderText(null);
    			alert19114444.setContentText("Beneficio eliminado correctamente");
    			
    			alert19114444.showAndWait();
    			
    			eliminarTexto.setText(null);
    			
    		} else {
        		
        		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
        		
        	}
    		
    	} catch(NullPointerException e) {
			
			Alert alert2044779 = new Alert(AlertType.WARNING);
			alert2044779.setTitle("Atencion");
			alert2044779.setHeaderText("No se puede eliminar el beneficio");
			alert2044779.setContentText("Digite la informacion correspondiente");

			alert2044779.showAndWait();
			
		} catch(NoExisteInformacionExcepcion e1) {
			
			Alert alert2188113 = new Alert(AlertType.ERROR);
			alert2188113.setTitle("Error");
			alert2188113.setHeaderText("No se puede eliminar el beneficio");
			alert2188113.setContentText("Esta informacion no existe en el sistema");

			alert2188113.showAndWait();
			
			eliminarTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert2277664 = new Alert(AlertType.WARNING);
			alert2277664.setTitle("Atencion");
			alert2277664.setHeaderText("No se puede eliminar el beneficio");
			alert2277664.setContentText("Digite la informacion correspondiente");

			alert2277664.showAndWait();
						
		}

    }
    
	// ---------------------------------------------------------------------------------------

}
