/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	// ---------------------------------------------------------------------------------------
	
	// RELACION CON LA CLASE PRIMERA CONTROLADORA GUI
	
	private PrimeraControladoraGUI controladora;
	
	// ---------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE MAIN
	
	public Main() {
		
		controladora = new PrimeraControladoraGUI();
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// METOTO START 
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("primerPanel.fxml"));

			fxmlLoader.setController(controladora);
			
			Parent root = fxmlLoader.load();
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("Grupo Aval");
			
			primaryStage.show();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	// LAUNCH
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
}
