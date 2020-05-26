/*
 * UNIVERSIDAD ICESI
 * ALGORITMOS Y PROGRAMACION II
 * PROYECTO FINAL DEL CURSO
 * SANTIAGO RODAS Y JULIAN ANDRES RIVERA
 * GRUPO BANCARIO
 */

package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;
import excepciones.InformacionExisteExcepcion;
import excepciones.InformacionVacia;
import excepciones.Mayor183Excepcion;
import excepciones.Mayor365Excepcion;
import excepciones.NoExisteInformacionExcepcion;
import excepciones.ValorIncorrectoExcepcion;
import hilos.CuadradosHilo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.shape.Rectangle;
import javafx.stage.StageStyle;
import javafx.scene.control.Alert.AlertType;
import modelo.Lugar;

public class ControladoraEmpleado {
	
	// ---------------------------------------------------------------------------------------
	
	private Lugar lugar;
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    private TextField nombreEmpleadoTexto;

    @FXML
    private TextField idEmpleadoTexto;

    @FXML
    private TextField direccionEmpleadoTexto;

    @FXML
    private TextField extratoEconomicoEmpleadoTexto;

    @FXML
    private TextField codigoPostalEmpleadoTexto;

    @FXML
    private TextField tipoEmpleadoTexto;

    @FXML
    private TextField salarioEmpleadoTexto;
    
    @FXML
    private Button agregarEmpleadoBoton;
    
    // ---------------------------------------------------------------------------------------

    @FXML
    private TextField buscarTexto;

    @FXML
    private Button buscarBoton;
    	
	// ---------------------------------------------------------------------------------------
	
    @FXML
    private TextField eliminarTexto;

    @FXML
    private Button eliminarBoton;
        
	// ---------------------------------------------------------------------------------------
	
    @FXML
    private TextField salarioLiquidacionTexto;

    @FXML
    private Button liquidarBoton;

    @FXML
    private TextField trabajoTexto;

    @FXML
    private TextField faltaTexto;

    @FXML
    private Label cesantiasla;

    @FXML
    private Label primala;

    @FXML
    private Label vacacionesla;

    @FXML
    private Label totalla;

    @FXML
    private Rectangle cuadrado1;

    @FXML
    private Rectangle cuadrado2;
    
    // ---------------------------------------------------------------------------------------
    
    @FXML
    private TextField salarioTexto;
	
	@FXML
    private RadioButton opcion1;
	
	@FXML
    private RadioButton opcion2;
	
	@FXML
    private RadioButton opcion3;
	
	@FXML
    private Button calcular;
	
	@FXML
    private Label deuda;
	
	@FXML
    private Label cuota;
    
	// ---------------------------------------------------------------------------------------
		
	public ControladoraEmpleado() {
		
		lugar = new Lugar(null, null, null, null, null);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void agregar(ActionEvent event) {
		
		try {
			
			String nombre = nombreEmpleadoTexto.getText();
			
			String id = idEmpleadoTexto.getText();
			
			String direccion = direccionEmpleadoTexto.getText();
			
			String estrato = extratoEconomicoEmpleadoTexto.getText();
			
			String email = codigoPostalEmpleadoTexto.getText();
			
			String tipo = tipoEmpleadoTexto.getText();
			
			Integer salario = Integer.parseInt(salarioEmpleadoTexto.getText());
			
			if(nombre.isEmpty() == false && id.isEmpty() == false && direccion.isEmpty() == false && estrato.isEmpty() == false && email.isEmpty() == false && tipo.isEmpty() == false && salario != null) {
				
				if(salario > 0) {
					
					lugar.agregarEmpleado(nombre, id, direccion, estrato, email, tipo, salario);
					
					Alert alert34 = new Alert(AlertType.INFORMATION);
	        		alert34.setTitle("Informacion importante");
	        		alert34.setHeaderText(null);
	        		alert34.setContentText("Empleado agregado correctamente");

	        		alert34.showAndWait();
	        		
	        		nombreEmpleadoTexto.setText(null);
	        		
	        		idEmpleadoTexto.setText(null);
	        		
	        		direccionEmpleadoTexto.setText(null);
	        		
	        		extratoEconomicoEmpleadoTexto.setText(null);
	        		
	        		codigoPostalEmpleadoTexto.setText(null);
	        		
	        		tipoEmpleadoTexto.setText(null);
	        		
	        		salarioEmpleadoTexto.setText(null);
					
				} else {
					
					throw new ValorIncorrectoExcepcion("Valor ingresado incorrecto");
					
				}
				
			} else {
    			
    			throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
    			
    		}
			
		} catch(InformacionExisteExcepcion ejemplo) {
			
			Alert alert35 = new Alert(AlertType.ERROR);
			alert35.setTitle("Error");
			alert35.setHeaderText("No se puede agregar el empleado");
			alert35.setContentText("Esta informacion ya existe en el sistema");

			alert35.showAndWait();
			
			nombreEmpleadoTexto.setText(null);
    		
    		idEmpleadoTexto.setText(null);
    		
    		direccionEmpleadoTexto.setText(null);
    		
    		extratoEconomicoEmpleadoTexto.setText(null);
    		
    		codigoPostalEmpleadoTexto.setText(null);
    		
    		tipoEmpleadoTexto.setText(null);
    		
    		salarioEmpleadoTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert36 = new Alert(AlertType.WARNING);
			alert36.setTitle("Atencion");
			alert36.setHeaderText("No se puede agregar el empleado");
			alert36.setContentText("Digite la informacion correspondiente");

			alert36.showAndWait();
						
		} catch(NullPointerException a2) {
			
			Alert alert37 = new Alert(AlertType.WARNING);
			alert37.setTitle("Atencion");
			alert37.setHeaderText("No se puede agregar el empleado");
			alert37.setContentText("Digite la informacion correspondiente");

			alert37.showAndWait();
			
		} catch(NumberFormatException a8) {
			
			Alert alert38 = new Alert(AlertType.WARNING);
			alert38.setTitle("Atencion");
			alert38.setHeaderText("No se puede agregar el empleado");
			alert38.setContentText("Datos erroneos, intente nuevamente");

			alert38.showAndWait();
			
		} catch(ValorIncorrectoExcepcion a9) {
			
			Alert alert39 = new Alert(AlertType.WARNING);
			alert39.setTitle("Atencion");
			alert39.setHeaderText("No se puede agregar el empleado");
			alert39.setContentText("Valor incorrecto");

			alert39.showAndWait();
			
		}

    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
    public void buscar(ActionEvent event) {
				
		try {
			
			String id = buscarTexto.getText();
			
			if(id.isEmpty() == false) {
				
				if(lugar.buscarEmpleado(id) == true) {
					
					Alert alert100 = new Alert(AlertType.INFORMATION);
					alert100.setTitle("Informacion importante");
					alert100.setHeaderText(null);
					alert100.setContentText("Felicitaciones, este empleado si existe y fue encontrado satisfactoriamente");
					
					alert100.showAndWait();
					
					buscarTexto.setText(null);
										
				} else {
    				
    				buscarTexto.setText(null);
    				
    				throw new NoExisteInformacionExcepcion("LA INFORMACION BUSCADA NO EXISTE EN EL PROGRAMA");
    				
    			}
				
			} else {
    			
    			throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
    			
    		}
			
		} catch(NoExisteInformacionExcepcion a1) {
			
			Alert alert40 = new Alert(AlertType.ERROR);
			alert40.setTitle("Error");
			alert40.setHeaderText("No se puede buscar el empleado");
			alert40.setContentText("Esta informacion no existe en el sistema");

			alert40.showAndWait();
			
		} catch(NullPointerException a2) {
			
			Alert alert41 = new Alert(AlertType.WARNING);
			alert41.setTitle("Atencion");
			alert41.setHeaderText("No se puede buscar el empleado");
			alert41.setContentText("Digite la informacion correspondiente");

			alert41.showAndWait();
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert42 = new Alert(AlertType.WARNING);
			alert42.setTitle("Atencion");
			alert42.setHeaderText("No se puede buscar el empleado");
			alert42.setContentText("Digite la informacion correspondiente");

			alert42.showAndWait();
						
		}

    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
	public void eliminar(ActionEvent event) throws NoExisteInformacionExcepcion, InformacionVacia {
		
		try {
			
			String id = eliminarTexto.getText();
			
			if(id.isEmpty() == false) {
				
				lugar.eliminarEmpleado(id);
				
				Alert alert43 = new Alert(AlertType.INFORMATION);
				alert43.setTitle("Informacion importante");
				alert43.setHeaderText(null);
				alert43.setContentText("Empleado eliminado correctamente");
				
				alert43.showAndWait();
				
				eliminarTexto.setText(null);
				
			} else {
	    		
	    		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
	    		
	    	}
			
		} catch(NullPointerException e) {
			
			Alert alert44 = new Alert(AlertType.WARNING);
			alert44.setTitle("Atencion");
			alert44.setHeaderText("No se puede eliminar el Empleado");
			alert44.setContentText("Digite la informacion correspondiente");

			alert44.showAndWait();
			
		} catch(NoExisteInformacionExcepcion e1) {
			
			Alert alert45 = new Alert(AlertType.ERROR);
			alert45.setTitle("Error");
			alert45.setHeaderText("No se puede eliminar el empleado");
			alert45.setContentText("Esta informacion no existe en el sistema");

			alert45.showAndWait();
			
			eliminarTexto.setText(null);
			
		} catch(InformacionVacia ejemplo1) {
			
			Alert alert46 = new Alert(AlertType.WARNING);
			alert46.setTitle("Atencion");
			alert46.setHeaderText("No se puede eliminar el empleado");
			alert46.setContentText("Digite la informacion correspondiente");

			alert46.showAndWait();
						
		}
		
	}
	 	 
	// ---------------------------------------------------------------------------------------
	 
	@FXML
    public void liquidar(ActionEvent event) throws InformacionVacia, ValorIncorrectoExcepcion, Mayor365Excepcion, Mayor183Excepcion {
		
		CuadradosHilo ch = new CuadradosHilo(true, this);
		
		ch.setValidacion(true);
		
		try {
			
			Integer salario = Integer.parseInt(salarioLiquidacionTexto.getText());
			
			Integer trabajo = Integer.parseInt(trabajoTexto.getText());
			
			Integer falta = Integer.parseInt(faltaTexto.getText());
			
			if(salario != null && trabajo != null && falta != null) {
				
				if(salario > 0 || trabajo > 0 || falta >= 0) {
					
					cesantiasla.setText(Integer.toString(lugar.calcularCesantias(salario, trabajo)));
					
					primala.setText(Integer.toString(lugar.calcularPrima(salario, falta)));
					
					vacacionesla.setText(Integer.toString(lugar.calcularVacaciones(salario, trabajo)));
					
					totalla.setText(Integer.toString(lugar.total(salario, trabajo, falta)));
					
					ch.start();
					
				} else {
					
					throw new ValorIncorrectoExcepcion("VALOR INGRESADO INCORRECTO");
				}
				
			} else {
	    		
	    		throw new InformacionVacia("INFORMACION VACIA, POR FAVOR LLENE LOS CAMPOS");
	    		
	    	}
			
		} catch(NumberFormatException e4) {
			
			Alert alert80044 = new Alert(Alert.AlertType.ERROR);
    	    alert80044.setHeaderText(null);
    	    alert80044.setTitle("Error");
    	    alert80044.setContentText("Datos erroneos, intente nuevamente");
    	    
    	    alert80044.showAndWait();
    	    
    	    ch.setValidacion(false);
			
		} catch(InformacionVacia a4) {
			
			Alert alert800447 = new Alert(Alert.AlertType.ERROR);
    	    alert800447.setHeaderText(null);
    	    alert800447.setTitle("Error");
    	    alert800447.setContentText("Complete los espacios");
    	    
    	    alert800447.showAndWait();
    	    
    	    ch.setValidacion(false);
			
		} catch(ValorIncorrectoExcepcion a2) {
			
			Alert alert8004478 = new Alert(Alert.AlertType.ERROR);
    	    alert8004478.setHeaderText(null);
    	    alert8004478.setTitle("Error");
    	    alert8004478.setContentText("Datos invalidos, intente nuevamente");
    	    
    	    alert8004478.showAndWait();
    	    
    	    ch.setValidacion(false);
			
		} catch(Mayor365Excepcion m3) {
			
			Alert alert80044781 = new Alert(Alert.AlertType.ERROR);
    	    alert80044781.setHeaderText(null);
    	    alert80044781.setTitle("Error");
    	    alert80044781.setContentText("No puede ser mayor a 365");
    	    
    	    alert80044781.showAndWait();
    	    
    	    ch.setValidacion(false);
			
		} catch(Mayor183Excepcion m1) {
			
			Alert alert800447814 = new Alert(Alert.AlertType.ERROR);
    	    alert800447814.setHeaderText(null);
    	    alert800447814.setTitle("Error");
    	    alert800447814.setContentText("No puede ser mayor a 183");
    	    
    	    alert800447814.showAndWait();
    	    
    	    ch.setValidacion(false);

		} catch(NullPointerException a2) {
			
			Alert alert8004475 = new Alert(Alert.AlertType.ERROR);
    	    alert8004475.setHeaderText(null);
    	    alert8004475.setTitle("Error");
    	    alert8004475.setContentText("Complete los espacios");
    	    
    	    alert8004475.showAndWait();
    	    
    	    ch.setValidacion(false);
			
		}

    }
	
	// ---------------------------------------------------------------------------------------
	
	@FXML
	public void girarCuadrados() {
		
		if(true) {
    		
    		cuadrado1.setRotate(cuadrado1.getRotate() + 1);
    		    		
    		cuadrado2.setRotate(cuadrado2.getRotate() + 1);
    		
    	}
		
	}
	 
	// ---------------------------------------------------------------------------------------
	
	@FXML
	public void mostrar() {
		
		cesantiasla.setVisible(true);
		
		primala.setVisible(true);
		
		vacacionesla.setVisible(true);
		
		totalla.setVisible(true);
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	public void iniciarLabels() {
		
		cesantiasla.setVisible(false);
		
		primala.setVisible(false);
		
		vacacionesla.setVisible(false);
		
		totalla.setVisible(false);
		
	}
	
	// ---------------------------------------------------------------------------------------
	 
	@FXML
    public void calcularTodo(ActionEvent event) throws IOException, ValorIncorrectoExcepcion {

		try {
			
			Integer salario = Integer.parseInt(salarioTexto.getText());
			
			if(salario >= 100000) {
				
				int numeroCuotas = 0;
				
				if(opcion1.isSelected()) {
					
					numeroCuotas = 12;
					
				}
				
				if(opcion2.isSelected()) {
					
					numeroCuotas = 24;
					
					
				}
				
				if(opcion3.isSelected()) {
					
					numeroCuotas = 36;
					
				}
				
				int maximo = lugar.calcularMaximo(salario);
				
				int deudan = lugar.calcularDeuda(maximo);
				
				int cuotan = lugar.calcularCuota(deudan, numeroCuotas);
				
				String empleado = pedirId();
				
				escribir(empleado, maximo, deudan, cuotan);
				
				String mensaje1 = deudan+ "";
				
				String mensaje2 = cuotan + "";
				
				deuda.setText(mensaje1);
				
				cuota.setText(mensaje2);
				
				leer(empleado);
				
			} else {
				
				throw new ValorIncorrectoExcepcion("Valor incorrecto");
				
			}
			
		} catch(NullPointerException ejemplo1) {
			
			Alert alert700 = new Alert(Alert.AlertType.ERROR);
    	    alert700.setHeaderText(null);
    	    alert700.setTitle("Error");
    	    alert700.setContentText("Por favor ingrese todos los datos correspondidos");
    	    alert700.showAndWait();
			
		} catch(NumberFormatException ejemplo2) {
			
			Alert alert800 = new Alert(Alert.AlertType.ERROR);
    	    alert800.setHeaderText(null);
    	    alert800.setTitle("Error");
    	    alert800.setContentText("Datos invalidos, intente nuevamente");
    	    alert800.showAndWait();
			
		} catch(ValorIncorrectoExcepcion a4) {
			
			Alert alert900 = new Alert(Alert.AlertType.ERROR);
    	    alert900.setHeaderText(null);
    	    alert900.setTitle("Error");
    	    alert900.setContentText("Salario insuficiente, intente con uno mayor");
    	    alert900.showAndWait();
			
		} catch(ArithmeticException a2) {
			
			Alert alert9004578 = new Alert(Alert.AlertType.ERROR);
    	    alert9004578.setHeaderText(null);
    	    alert9004578.setTitle("Error");
    	    alert9004578.setContentText("Seleccione el numero de cuotas");
    	    alert9004578.showAndWait();
    	    
		}
		
    }
	 
	// ---------------------------------------------------------------------------------------
	
	public void leer(String empleado) {
		
		File recibo = new File("reportes/" + empleado + ".txt");
		
		FileReader archivo = null;
		
		BufferedReader lector = null;
		
		try {
			archivo = new FileReader(recibo);
			
			lector = new BufferedReader(archivo);
			
			String txt = " ";
			
			String show = " ";
			
			while ((txt = lector.readLine()) != null) {
				
				show += txt + "\n";
				
			}
			
			Alert info = new Alert(Alert.AlertType.INFORMATION);
			info.setTitle("Recibo");
			info.setHeaderText("El recibo generado es el siguiente");
			info.setContentText(show);
			info.showAndWait();
			
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}finally {
			
			try {
				
				archivo.close();
				
				lector.close();
				
			} catch (IOException e) {
				
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	public void escribir(String empleado, int maximo, int deuda, int cuota) {
		
		FileWriter archivo = null;
		
		PrintWriter escritor = null;
		
		try {
			archivo = new FileWriter("reportes/" + empleado + ".txt");
			
			escritor = new PrintWriter(archivo);
			
			escritor.println("Prestamo Maximo: " + maximo);
			
			escritor.println("Deuda Adquirida: " + deuda);
			
			escritor.println("Cuotas Acordadas: " + cuota);
			
			escritor.println("Atendido Por: " + lugar.buscarEmpleadoEmpleado(empleado).getNombre());
		
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}finally {
			
			try {
				
				archivo.close();
				
				escritor.close();
				
			} catch (IOException e2) {
				
				// TODO Auto-generated catch block
				
				e2.printStackTrace();
				
			}
			
		}
		
	}
	
	// ---------------------------------------------------------------------------------------
	
	public String pedirId() {
		
		String id = " ";
		
		TextInputDialog empleado = new TextInputDialog();
		
		empleado.setTitle("Datos del empleado");
		empleado.setHeaderText("Porfavor ingresa el Id del empleado para guardar el archivo");
		empleado.setContentText("Recuerda que debe de existir el empleado");
		empleado.initStyle(StageStyle.UTILITY);
		
		Optional<String>txt = empleado.showAndWait();
		
		if (txt.isPresent()) {
			
			id = txt.get();
			
		}
	    
		return id;
		
	}
	
	// ---------------------------------------------------------------------------------------

}
