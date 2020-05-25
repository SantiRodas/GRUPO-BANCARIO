/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package application;

import java.io.IOException;
import figuras.Barra;
import hilos.BarraHilo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PrimeraControladoraGUI {
	
	// ---------------------------------------------------------------------------------------
	
	// RELACIONES
	
	private Barra barra;
	
	private Controladora controladora;
	
	// ---------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE PRIMERACONTROLADORAGUI
	
	@FXML
    private Button botonIniciar;

    @FXML
    private Button botonContinuar;

    @FXML
    private Rectangle rectangulo;
    

    // ---------------------------------------------------------------------------------------
    
    // METODO CONSTRUCTOR DE LA PRIMERA CONTROLADORA GUI
    
    public PrimeraControladoraGUI() {
		
		barra = new Barra();
		
		controladora = new Controladora();
		
		rectangulo = new Rectangle();
		
		actualizarBarra();
		
	}
    
    // ---------------------------------------------------------------------------------------
    
    // METODO CONTINUAR DE LA CLASE PRIMERACONTROLADORAGUI

    @FXML
    public void continuar(ActionEvent event) throws IOException {
    	
    	Node source = (Node) event.getSource();
    	
        Stage stage = (Stage) source.getScene().getWindow();
        
        stage.close();
        
     // ******************************************
    	
    	Stage primaryStage = new Stage();
    	
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pantallaPrincipal.fxml"));

		fxmlLoader.setController(controladora);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Grupo Aval");
		
		primaryStage.show();

    }
    
    // ---------------------------------------------------------------------------------------
    
    // METODO INICIAR DE LA CLASE PRIMERACONTROLADORAGUI

    @FXML
    public void iniciar(ActionEvent event) {
    	
    	BarraHilo bh = new BarraHilo(barra, this, 20);
    	
    	bh.start();
    	
    	barra.setValidacion(true);
    	
    }
    
    // ---------------------------------------------------------------------------------------
    
    // METODO ACTUALIZAR BARRA
	
	public void actualizarBarra() {
		
		rectangulo.setWidth(barra.getValor() + 1);
				
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO INICIALIZAR BARRA
	
	public void initialize() {
		
		botonIniciar.setDisable(false);
    	
    	botonContinuar.setDisable(true);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METODO INICIAR CONTINUAR
	
	public void iniciarContinuar() {
		
		botonIniciar.setDisable(true);
		
		botonContinuar.setDisable(false);
		
		barra.setValidacion(false);
		
	}
	
	// ---------------------------------------------------------------------------------------

}
