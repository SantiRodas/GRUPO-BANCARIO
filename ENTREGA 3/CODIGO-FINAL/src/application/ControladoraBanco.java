/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package application;

import excepciones.InformacionExisteExcepcion;
import excepciones.NoExisteInformacionExcepcion;
import hilos.CuadradoHilo;
import hilos.LineaHilo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

import modelo.Controladora;

public class ControladoraBanco {
	
	// ---------------------------------------------------------------------------------------
	
	private Controladora controladora;
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField nombreBancoTexto;
	
	@FXML
    private TextField idBancoTexto;
	
	@FXML
    private Button agregarBancoBoton;
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField buscarTexto;
	
	@FXML
    private Button buscarBanco;
	
	@FXML
	private Label nombrela;
	
	@FXML
	private Label idla;
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField eliminarTexto;
	
	@FXML
    private Button eliminarBoton;
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private Button informeBoton;
	
	@FXML
	private Line linea;
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
	private Rectangle cuadrado1;
	
	@FXML
	private Rectangle cuadrado2;
	
	// ---------------------------------------------------------------------------------------
	
	
	public ControladoraBanco() {
		
		controladora = new Controladora();
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void agregar(ActionEvent event) throws InformacionExisteExcepcion, InterruptedException {
		
		CuadradoHilo ch = new CuadradoHilo(true, this);
		
		ch.setValidacion(true);
		
		try {
			
			String nombre = nombreBancoTexto.getText();
			
			String id = idBancoTexto.getText();
			
			controladora.agregar(nombre, id);
			
			ch.start();
									
		} catch(InformacionExisteExcepcion ejemplo) {
			
			Alert alert1 = new Alert(AlertType.ERROR);
			alert1.setTitle("Error");
			alert1.setHeaderText("No se puede agregar el banco");
			alert1.setContentText("Esta informacion ya existe en el sistema");

			alert1.showAndWait();
			
			ch.setValidacion(false);
			
		} catch(NullPointerException ejemplo1) {
			
			Alert alert2 = new Alert(AlertType.WARNING);
			alert2.setTitle("Atencion");
			alert2.setHeaderText("No se puede agregar el banco");
			alert2.setContentText("Digite la informacion correspondiente");

			alert2.showAndWait();
			
			ch.setValidacion(false);
			
		} 
		
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
	public void rotar() {
    	
    	if(true) {
    		
    		cuadrado1.setRotate(cuadrado1.getRotate() + 1);
    		    		
    		cuadrado2.setRotate(cuadrado2.getRotate() + 1);
    		
    	}
    	
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
	public void mensaje() {
		
		Alert alert3 = new Alert(AlertType.INFORMATION);
		alert3.setTitle("Informacion importante");
		alert3.setHeaderText(null);
		alert3.setContentText("Banco agregado correctamente");

		alert3.showAndWait();
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void buscar(ActionEvent event) {
		
		try {
			
			String id = buscarTexto.getText();
			
			if(controladora.buscar(id) == true) {
				
				nombrela.setText(controladora.buscarBanco(id).getNombre());
				
				idla.setText(controladora.buscarBanco(id).getId());
				
			} else {
				
				throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
				
			}
			
		} catch(NoExisteInformacionExcepcion a1) {
			
			Alert alert4 = new Alert(AlertType.ERROR);
			alert4.setTitle("Error");
			alert4.setHeaderText("No se puede buscar el banco");
			alert4.setContentText("Esta informacion no existe en el sistema");

			alert4.showAndWait();
			
		} catch(NullPointerException a2) {
			
			Alert alert5 = new Alert(AlertType.WARNING);
			alert5.setTitle("Atencion");
			alert5.setHeaderText("No se puede buscar el banco");
			alert5.setContentText("Digite la informacion correspondiente");

			alert5.showAndWait();
			
		}

    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void eliminarBanco(ActionEvent event) throws NoExisteInformacionExcepcion {
		
		try {
			
			String id = eliminarTexto.getText();
			
			controladora.eliminar(id);
			
			Alert alert6 = new Alert(AlertType.INFORMATION);
			alert6.setTitle("Informacion importante");
			alert6.setHeaderText(null);
			alert6.setContentText("Banco eliminado correctamente");

			alert6.showAndWait();
			
		} catch(NullPointerException e) {
			
			Alert alert7 = new Alert(AlertType.WARNING);
			alert7.setTitle("Atencion");
			alert7.setHeaderText("No se puede eliminar el banco");
			alert7.setContentText("Digite la informacion correspondiente");

			alert7.showAndWait();
			
		} catch(NoExisteInformacionExcepcion e1) {
			
			Alert alert8 = new Alert(AlertType.ERROR);
			alert8.setTitle("Error");
			alert8.setHeaderText("No se puede eliminar el banco");
			alert8.setContentText("Esta informacion no existe en el sistema");

			alert8.showAndWait();
			
		} 
		
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void informeBanco(ActionEvent event) {
		
		LineaHilo lh = new LineaHilo(true, this);
		
		lh.start();

    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
	public void girar() {
    	
    	if(true) {
    		
    		linea.setRotate(linea.getRotate() + 1);
    		
    	}
    	
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
	public void imprimirInforme() {
		
		
		
	}
	
	// ---------------------------------------------------------------------------------------

}
