package modelo;
//Angie Valentina Córdoba A00347829
public class Usuario {

	
	//ATRIBUTOS
	
	private String nombre;
	private String cedula;
	
	//RELACIONES
	
	private Vehiculo vehiculoUno;
	private Vehiculo vehiculoDos;
	private Licencia Licen;
	
	
	//CONSTRUCTOR
	
	public Usuario(String elNombre, String cedu) {
		
		nombre = elNombre;
		cedula = cedu;
		
	//INICIALIZAR OBJETOS                     
	vehiculoUno = new Vehiculo("", 0, 0, "", "", 0);
	vehiculoDos = new Vehiculo("", 0, 0, "", "", 0);
	Licen = new Licencia("");
		
	}
	
	//METODOS
	
	public String darNombre(){
		return nombre;
	}
	public void modificarNombre(String elNombre){
		nombre = elNombre;
	}
	
	public String darCedula(){
		return cedula;
	}
	public void modificarCedula(String cedu){
		cedula = cedu;
	}
	
	public Vehiculo darVehiculoUno(){
		return vehiculoUno;
	}

	public void modificarVehiculo1(Vehiculo vehiculoUno){
		this.vehiculoUno = vehiculoUno;
	}
	
	
	public Vehiculo darVehiculoDos(){
		return vehiculoDos;
	}
		
	public void modificarVehiculoDos (Vehiculo vehiculoDos){
		this.vehiculoDos = vehiculoDos;
	}
	
	public Licencia darLicen() {
		return Licen;
	}
	
	public void modificarLic(Licencia Licen) {
		this.Licen = Licen;
	}
	

}	