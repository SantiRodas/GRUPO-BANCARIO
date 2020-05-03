package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

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
	
	//-----------------------------------------------------------------------------------
	
	public Controladora() {
		
		
		
	}
	
	//-----------------------------------------------------------------------------------
	
	@FXML
    public void agregarBanco(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("agregarBancoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraBanco);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
    	
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

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bancoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraBanco);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//*********************************************************************
	
	@FXML
    public void informeBanco(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bancoPantalla.fxml"));
		
		fxmlLoader.setController(controladoraBanco);    
		
		Parent addContactPane = fxmlLoader.load();
    	
		panelPrincipal.getChildren().clear();
		
    	panelPrincipal.setTop(addContactPane);
		
    }
	
	//-----------------------------------------------------------------------------------
	
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
	
	//-----------------------------------------------------------------------------------
	
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
	
	//-----------------------------------------------------------------------------------
	
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
	
	//-----------------------------------------------------------------------------------
	
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
	
	//-----------------------------------------------------------------------------------
	
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
	
	//-----------------------------------------------------------------------------------
	
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
	
	//-----------------------------------------------------------------------------------

}
