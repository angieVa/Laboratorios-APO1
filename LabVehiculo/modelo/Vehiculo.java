package modelo;
//Angie Valentina Córdoba A00347829
public class Vehiculo {


	//CONSTANTES

	public final static double BASE_INICIAL_CARROS = 70000;
	public final static double BASE_INICIAL_MOTOS = 50000;
	public final static double TARIFA = 1600;
	public final static int ANIO_ACTUAL = 2017;
	public final static double BASE_IMPUESTOS = 10.000;


	//ATRIBUTOS
	
	private String placa;
	private int modelo;
	private int kilometraje;
	private String tipoVehiculo;
	private String cilindraje;
	private double totalImpuestos;
	private double avaluo;
	private int valorCilindraje;

	//RELACIONES

	
	private Tecnomecanica tecnoVehUno;
	private Tecnomecanica tecnoVehDos;
	
	
	//CONSTRUCTOR 
	
	public Vehiculo(String laPlaca, int model, int kilomet, String tipoV, String cilin, double elAvaluo) {
	
	
	placa = laPlaca;
	modelo = model;
	kilometraje = kilomet;
	tipoVehiculo = tipoV;
	cilindraje = cilin;
	avaluo = elAvaluo;
	totalImpuestos = 0;
	
	//OBJETOS
	
	tecnoVehUno = new Tecnomecanica( 4.0, 70.0, 35.0, 60.0, 1.0, 200);
	tecnoVehDos = new Tecnomecanica( 5.0, 60.0, 40.0, 50.0, 1.0, 200);
	
}
	//METODOS 
	public String darPlaca() {
		return placa;
	}
	public void modificarPlaca(String laPlaca) {
		placa = laPlaca;
	}
	
	public int darModelo() {
		return modelo;
	}
	public void modificarModelo(int model) {
		modelo = model;
	}
	
	public String darTipoVehiculo() {
		return tipoVehiculo;
	}
	public void modificarTipoVehiculo(String tipoV) {
		tipoVehiculo = tipoV;
	}
	
	public int darKilometraje() {
		return kilometraje;
	}
	public void modificarKilometraje(int kilomet) {
		kilometraje = kilomet;
	}
	
	public String darCilindraje() {
		return cilindraje;
	}
	public void modificarCilindraje(String cilin) {
		cilindraje = cilin;
	}
	public double darAvaluo() {
		return avaluo;
	}
	
	public void modificarAvaluo(double elAvaluo) {
		avaluo = elAvaluo;
	}
	
	public double darTotalImpuestos() {
		return totalImpuestos;
	}
	
	public void modificarTotalImpuestos(double totalImp) {
		totalImpuestos = totalImp;
	}
	
	public int darValorCilindraje() {
		return valorCilindraje;
	}
	
	public void modificarValorCilindraje(int valorCilind) {
		valorCilindraje = valorCilind;
	}

	//REQUERIMIENTOS
	
	
		//REQUERIMIENTO  PICO Y PLACA 
	
	public String calcularPicoPlacaMoto(){  
		
		String picoplacaMoto = tipoVehiculo == "moto" && (placa.charAt(3)== 1) ? "Lunes y viernes" : tipoVehiculo == "moto" && (placa.charAt(5)== 'A' || placa.charAt(5)== 'E' || placa.charAt(5)== 'I' || placa.charAt(5)== 'O' || placa.charAt(5)== 'U') ? "Martes, miercoles y jueves" : "No Tiene Pico Placa";
		return picoplacaMoto;
	}
	
	public String calcularPicoPlacaAuto(){
		
		String picoplacaCarro = tipoVehiculo == "carro" && (placa.charAt(5) == '2' || placa.charAt(5) == '4'|| placa.charAt(5) == '6' || placa.charAt(5) == '8' || placa.charAt(5) == '0') ? "Lunes, miercoles y viernes": tipoVehiculo == "carro" &&( placa.charAt(5) == '1' || placa.charAt(5) == '3'|| placa.charAt(5) == '5' || placa.charAt(5) == '7' || placa.charAt(5) == '9') ? "Martes, jueves y viernes": "No Tiene Pico Placa";
		return picoplacaCarro;
	}
	
	//REQUERIMIENTO  TECNO-MECANICA
	
	
	public String calcularTecnomecanica() {
		
		int FabricacionVehiculo = ANIO_ACTUAL - modelo;
		String tecnomecanica = (kilometraje > 99999) || (FabricacionVehiculo > 5) ? "SI" : "NO";
		return tecnomecanica;
	}
	
	
	//REQUERIMIENTO  SOAT
	
	
	public double darValorSeguroSOATmoto() {
		
	double pagoModelo = modelo <= 2010 ? 10000.00 : 0;
	double SeguroSOATmoto = (BASE_INICIAL_MOTOS + (kilometraje * 0.25) * TARIFA + pagoModelo);
	double descuentosMoto = cilindraje == "alto" ? 0 : 0.25 * SeguroSOATmoto;
	double SOATfinalMoto = SeguroSOATmoto - descuentosMoto;
		return SOATfinalMoto;
	}
		
	public double darValorSeguroSOATcarro() {
		
	double pagoModelo = modelo <= 2010 ? 10000.00 : 0;
	double SeguroSOATcarro = (BASE_INICIAL_CARROS + (kilometraje * 0.25) * TARIFA + pagoModelo);
	double descuentosCarro = cilindraje == "alto" ? 0 : 0.25 * SeguroSOATcarro;
	double SOATfinalCarro = SeguroSOATcarro - descuentosCarro;
		return SOATfinalCarro;
	}
	
	//REQUERIMIENTO IMPUESTO
	
		public double calcularImpCarro() {
			
		
		int difAnio;
		difAnio = 0;
		
		if (tipoVehiculo.equals("carro")) {
			
			if ((avaluo <= 25000000)) {
				totalImpuestos = avaluo * 0.015;
			}
			
			else if ((avaluo > 25000000) && (avaluo <= 40000000)) {
				totalImpuestos = avaluo * 0.025;
			}
			
			else if ((avaluo > 40000000)) {
				totalImpuestos = avaluo * 0.035;
			}
			
			
		if (ANIO_ACTUAL > modelo) {
			difAnio = ANIO_ACTUAL - modelo;
			}
		
			else if (ANIO_ACTUAL < modelo) {
			difAnio = modelo - ANIO_ACTUAL;
			}
		
		}
		
		totalImpuestos += (difAnio * BASE_IMPUESTOS);
			
			return totalImpuestos;
			
	}
	

		
		public double calcularImpMoto() {
			
			
			int difAnio;
			difAnio = 0;
		
		if (tipoVehiculo.equals("moto")) {
		}	
			
			else if (cilindraje.equals("alto")) {
				totalImpuestos = avaluo * 0.015;
			}
			
		if (ANIO_ACTUAL > modelo) {
			difAnio = ANIO_ACTUAL - modelo;
			}
		
			else if (ANIO_ACTUAL < modelo) {
			difAnio = modelo - ANIO_ACTUAL;
			}
		

		totalImpuestos += (difAnio * BASE_IMPUESTOS);
			
		return totalImpuestos;	
}
	
}