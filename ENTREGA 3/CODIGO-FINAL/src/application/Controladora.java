/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controladora {
	
	ControladoraBanco controladoraBanco = new ControladoraBanco();
	
	ControladoraSucursal controladoraSucursal = new ControladoraSucursal();
	
	ControladoraServicio controladoraServicio = new ControladoraServicio();
	
	ControladoraEmpleado controladoraEmpleado = new ControladoraEmpleado();
	
	ControladoraCliente controladoraCliente = new ControladoraCliente();
	
	ControladoraCuenta controladoraCuenta = new ControladoraCuenta();
	
	ControladoraEps controladoraEps = new ControladoraEps();
	
	@FXML
    private BorderPane panelPrincipal;
	
	// ---------------------------------------------------------------------------------------
	
	public Controladora() {
		
		
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void agregarBanco(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("agregarBancoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraBanco);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setCenter(addContactPane);
    	
    }
	
	//*********************************************************************
	
	@FXML
    public void buscarBanco(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bancoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraBanco);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void eliminarBanco(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bancoPantalla1.fxml"));
		
		fxmlLoader.setController(controladoraBanco);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void informeBanco(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bancoPantalla2.fxml"));
		
		fxmlLoader.setController(controladoraBanco);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void agregarSucursal(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("agregarSucursalPantalla.fxml"));
		
		fxmlLoader.setController(controladoraSucursal);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void buscarSucursal(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sucursalPantalla.fxml"));
		
		fxmlLoader.setController(controladoraSucursal);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void eliminarSucursal(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sucursalPantalla.fxml"));
		
		fxmlLoader.setController(controladoraSucursal);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void moverSucursal(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sucursalPantalla.fxml"));
		
		fxmlLoader.setController(controladoraSucursal);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void informeSucursal(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sucursalPantalla.fxml"));
		
		fxmlLoader.setController(controladoraSucursal);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void agregarServicio(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("agregarServicioPantalla.fxml"));
		
		fxmlLoader.setController(controladoraServicio);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void buscarServicio(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("servicioPantalla.fxml"));
		
		fxmlLoader.setController(controladoraServicio);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void eliminarServicio(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("servicioPantalla.fxml"));
		
		fxmlLoader.setController(controladoraServicio);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void informeServicio(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("servicioPantalla.fxml"));
		
		fxmlLoader.setController(controladoraServicio);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void agregarEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("agregarEmpleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void asignarBeneficioEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("empleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void asignarEpsEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("empleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void cambiarEpsEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("empleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void buscarEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("empleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void eliminarEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("empleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void moverBancoEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("empleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void moverSucursalEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("empleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void informeEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("empleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void liquidarEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("empleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void dineroEmpleado(ActionEvent event) throws IOException {

		
		
    }
	
	//*********************************************************************
	
	@FXML
    public void prestamoEmpleado(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("empleadoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEmpleado);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void agregarCliente(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("agregarCliente.fxml"));
		
		fxmlLoader.setController(controladoraCliente);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void asignarBeneficioCliente(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clientePantalla.fxml"));
		
		fxmlLoader.setController(controladoraCliente);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void buscarCliente(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clientePantalla.fxml"));
		
		fxmlLoader.setController(controladoraCliente);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void eliminarCliente(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clientePantalla.fxml"));
		
		fxmlLoader.setController(controladoraCliente);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void moverBancoCliente(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clientePantalla.fxml"));
		
		fxmlLoader.setController(controladoraCliente);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void informeCliente(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clientePantalla.fxml"));
		
		fxmlLoader.setController(controladoraCliente);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void dineroCliente(ActionEvent event) throws IOException {

		
		
    }
	
	//*********************************************************************
	
	@FXML
    public void prestamoCliente(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("requerimiento.fxml"));
		
		fxmlLoader.setController(controladoraCliente);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void agregarCuenta(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("agregarCuentaPantalla.fxml"));
		
		fxmlLoader.setController(controladoraCuenta);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void buscarCuenta(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cuentaPantalla.fxml"));
		
		fxmlLoader.setController(controladoraCuenta);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void eliminarCuenta(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cuentaPantalla.fxml"));
		
		fxmlLoader.setController(controladoraCuenta);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void agregarEps(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("agregarEpsPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEps);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void buscarEps(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("epsPantalla.fxml"));
		
		fxmlLoader.setController(controladoraEps);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void nosotros(ActionEvent event) throws IOException {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("nosotros.fxml"));
		    
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setCenter(addContactPane);

    }
	
	//*********************************************************************
	
	@FXML
    public void inversion(ActionEvent event) {

		final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Inversion del grupo Aval al medio ambiente en millones");
        
        final LineChart<String,Number> lineChart = new LineChart<String,Number>(xAxis,yAxis);
                          
        XYChart.Series<String,Number> series1 = new XYChart.Series<String,Number>();
        
        series1.setName("2017");
        
        series1.getData().add(new XYChart.Data<String,Number>("Ene", 1.5));
        series1.getData().add(new XYChart.Data<String,Number>("Feb", 2));
        series1.getData().add(new XYChart.Data<String,Number>("Mar", 3));
        series1.getData().add(new XYChart.Data<String,Number>("Apr", 4));
        series1.getData().add(new XYChart.Data<String,Number>("May", 5));
        series1.getData().add(new XYChart.Data<String,Number>("Jun", 6));
        series1.getData().add(new XYChart.Data<String,Number>("Jul", 7));
        series1.getData().add(new XYChart.Data<String,Number>("Ago", 8));
        series1.getData().add(new XYChart.Data<String,Number>("Sep", 9));
        series1.getData().add(new XYChart.Data<String,Number>("Oct", 10));
        series1.getData().add(new XYChart.Data<String,Number>("Nov", 11));
        series1.getData().add(new XYChart.Data<String,Number>("Dec", 20));
        
        XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
        
        series2.setName("2018");
        
        series2.getData().add(new XYChart.Data<String,Number>("Ene", 2.5));
        series2.getData().add(new XYChart.Data<String,Number>("Feb", 4));
        series2.getData().add(new XYChart.Data<String,Number>("Mar", 6));
        series2.getData().add(new XYChart.Data<String,Number>("Apr", 8));
        series2.getData().add(new XYChart.Data<String,Number>("May", 10));
        series2.getData().add(new XYChart.Data<String,Number>("Jun", 12));
        series2.getData().add(new XYChart.Data<String,Number>("Jul", 14));
        series2.getData().add(new XYChart.Data<String,Number>("Ago", 16));
        series2.getData().add(new XYChart.Data<String,Number>("Sep", 18));
        series2.getData().add(new XYChart.Data<String,Number>("Oct", 20));
        series2.getData().add(new XYChart.Data<String,Number>("Nov", 22));
        series2.getData().add(new XYChart.Data<String,Number>("Dec", 40));
        
        XYChart.Series<String,Number> series3 = new XYChart.Series<String,Number>();
        
        series3.setName("2019");
        
        series3.getData().add(new XYChart.Data<String,Number>("Ene", 3.5));
        series3.getData().add(new XYChart.Data<String,Number>("Feb", 6));
        series3.getData().add(new XYChart.Data<String,Number>("Mar", 9));
        series3.getData().add(new XYChart.Data<String,Number>("Apr", 12));
        series3.getData().add(new XYChart.Data<String,Number>("May", 15));
        series3.getData().add(new XYChart.Data<String,Number>("Jun", 18));
        series3.getData().add(new XYChart.Data<String,Number>("Jul", 21));
        series3.getData().add(new XYChart.Data<String,Number>("Ago", 24));
        series3.getData().add(new XYChart.Data<String,Number>("Sep", 27));
        series3.getData().add(new XYChart.Data<String,Number>("Oct", 30));
        series3.getData().add(new XYChart.Data<String,Number>("Nov", 33));
        series3.getData().add(new XYChart.Data<String,Number>("Dec", 60));
        
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
		
        bc.getData().addAll(series1, series2, series3);
        
        panelPrincipal.getChildren().clear();
        
        panelPrincipal.setCenter(bc);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void covid(ActionEvent event) {
		
		final String rusia = "Medellin";
	    final String brazil = "Cali";
	    final String france = "Barranquilla";
	    final String italy = "Huila";
	    final String usa = "Bogota";
	    
	    final CategoryAxis xAxis = new CategoryAxis();
	    
        final NumberAxis yAxis = new NumberAxis();
        
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
        
        bc.setTitle("Cuentas de banco existentes");
        
        xAxis.setLabel("Ciudad");       
        yAxis.setLabel("Numero");
        
        XYChart.Series<String,Number> series1 = new XYChart.Series<String,Number>();
        series1.setName("2000");       
        series1.getData().add(new XYChart.Data<String,Number>(rusia, 130000));
        series1.getData().add(new XYChart.Data<String,Number>(brazil, 100000));
        series1.getData().add(new XYChart.Data<String,Number>(france, 70000));
        series1.getData().add(new XYChart.Data<String,Number>(italy, 100000));
        series1.getData().add(new XYChart.Data<String,Number>(usa, 100000));      
        
        XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
        series2.setName("2010");
        series2.getData().add(new XYChart.Data<String,Number>(rusia, 210000));
        series2.getData().add(new XYChart.Data<String,Number>(brazil, 200000));
        series2.getData().add(new XYChart.Data<String,Number>(france, 100000));
        series2.getData().add(new XYChart.Data<String,Number>(italy, 180000));
        series2.getData().add(new XYChart.Data<String,Number>(usa, 500000));  
        
        XYChart.Series<String,Number> series3 = new XYChart.Series<String,Number>();
        series3.setName("2020");
        series3.getData().add(new XYChart.Data<String,Number>(rusia, 344000));
        series3.getData().add(new XYChart.Data<String,Number>(brazil, 360000));
        series3.getData().add(new XYChart.Data<String,Number>(france, 144000));
        series3.getData().add(new XYChart.Data<String,Number>(italy, 225000));
        series3.getData().add(new XYChart.Data<String,Number>(usa, 1000000)); 
        
        bc.getData().addAll(series1, series2, series3);
        
        panelPrincipal.getChildren().clear();
        
        panelPrincipal.setCenter(bc);

    }
	
	//*********************************************************************
	
	@FXML
    public void video(ActionEvent event) {
		
		StackPane root = new StackPane();

        MediaPlayer player = new MediaPlayer( new Media(getClass().getResource("video.mp4").toExternalForm()));
        
        MediaView mediaView = new MediaView(player);

        root.getChildren().add( mediaView);
        
        panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setCenter(root);

        player.play();

    }
	
	// ---------------------------------------------------------------------------------------

}
