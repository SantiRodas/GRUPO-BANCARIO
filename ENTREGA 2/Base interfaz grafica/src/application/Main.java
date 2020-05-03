package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			Controladora controladora = new Controladora();
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pantallaPrincipal.fxml"));

			fxmlLoader.setController(controladora);
			
			Parent root = fxmlLoader.load();
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("Grupo Bancario");
			
			primaryStage.show();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
}
