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
    public void agregar(ActionEvent event) throws InformacionExisteExcepcion, InterruptedException, InformacionVacia {
		
		CuadradoHilo ch = new CuadradoHilo(true, this);
		
		ch.setValidacion(true);
		
		try {
			
			String nombre = nombreBancoTexto.getText();
			
			String id = idBancoTexto.getText();
			
			if(nombre.isEmpty() == false && id.isEmpty() == false) {
				
				controladora.agregar(nombre, id);
				
				ch.start();
				
			} else {
				
				throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
				
			}
								
		} catch(InformacionExisteExcepcion ejemplo) {
			
			Alert alert1 = new Alert(AlertType.ERROR);
			alert1.setTitle("Error");
			alert1.setHeaderText("No se puede agregar el banco");
			alert1.setContentText("Esta informacion ya existe en el sistema");

			alert1.showAndWait();
			
			ch.setValidacion(false);
			
			nombreBancoTexto.setText(null);
			
			idBancoTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert2 = new Alert(AlertType.WARNING);
			alert2.setTitle("Atencion");
			alert2.setHeaderText("No se puede agregar el banco");
			alert2.setContentText("Digite la informacion correspondiente");

			alert2.showAndWait();
			
			ch.setValidacion(false);
			
		} catch(NullPointerException a2) {
			
			Alert alert3 = new Alert(AlertType.WARNING);
			alert3.setTitle("Atencion");
			alert3.setHeaderText("No se puede agregar el banco");
			alert3.setContentText("Digite la informacion correspondiente");

			alert3.showAndWait();
			
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
		
		Alert alert4 = new Alert(AlertType.INFORMATION);
		alert4.setTitle("Informacion importante");
		alert4.setHeaderText(null);
		alert4.setContentText("Banco agregado correctamente");

		alert4.showAndWait();
		
		nombreBancoTexto.setText(null);
		
		idBancoTexto.setText(null);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void buscar(ActionEvent event) throws InformacionVacia {
		
		nombrela.setText("...");
		
		idla.setText("...");
		
		try {
			
			String id = buscarTexto.getText();
			
			if(id.isEmpty() == false) {
				
				if(controladora.buscar(id) == true) {
					
					nombrela.setText(controladora.buscarBanco(id).getNombre());
					
					idla.setText(controladora.buscarBanco(id).getId());
					
					buscarTexto.setText(null);
					
				} else {
					
					buscarTexto.setText(null);
					
					throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
					
				}
				
			} else {
				
				throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
				
			}
			
		} catch(NoExisteInformacionExcepcion a1) {
			
			Alert alert5 = new Alert(AlertType.ERROR);
			alert5.setTitle("Error");
			alert5.setHeaderText("No se puede buscar el banco");
			alert5.setContentText("Esta informacion no existe en el sistema");

			alert5.showAndWait();
			
		} catch(NullPointerException a2) {
			
			Alert alert6 = new Alert(AlertType.WARNING);
			alert6.setTitle("Atencion");
			alert6.setHeaderText("No se puede buscar el banco");
			alert6.setContentText("Digite la informacion correspondiente");

			alert6.showAndWait();
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert7 = new Alert(AlertType.WARNING);
			alert7.setTitle("Atencion");
			alert7.setHeaderText("No se puede buscar el banco");
			alert7.setContentText("Digite la informacion correspondiente");

			alert7.showAndWait();
						
		}

    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void eliminarBanco(ActionEvent event) throws NoExisteInformacionExcepcion, InformacionVacia {
		
		try {
			
			String id = eliminarTexto.getText();
			
			if(id.isEmpty() == false) {
				
				controladora.eliminar(id);
				
				Alert alert8 = new Alert(AlertType.INFORMATION);
				alert8.setTitle("Informacion importante");
				alert8.setHeaderText(null);
				alert8.setContentText("Banco eliminado correctamente");
				
				alert8.showAndWait();
				
				eliminarTexto.setText(null);
				
			} else {
				
				throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
				
			}
			
		} catch(NullPointerException e) {
			
			Alert alert9 = new Alert(AlertType.WARNING);
			alert9.setTitle("Atencion");
			alert9.setHeaderText("No se puede eliminar el banco");
			alert9.setContentText("Digite la informacion correspondiente");

			alert9.showAndWait();
			
		} catch(NoExisteInformacionExcepcion e1) {
			
			Alert alert10 = new Alert(AlertType.ERROR);
			alert10.setTitle("Error");
			alert10.setHeaderText("No se puede eliminar el banco");
			alert10.setContentText("Esta informacion no existe en el sistema");

			alert10.showAndWait();
			
			eliminarTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert11 = new Alert(AlertType.WARNING);
			alert11.setTitle("Atencion");
			alert11.setHeaderText("No se puede eliminar el banco");
			alert11.setContentText("Digite la informacion correspondiente");

			alert11.showAndWait();
						
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
