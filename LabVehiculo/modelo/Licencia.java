package modelo;
//Angie Valentina Córdoba A00347829
public class Licencia {


	//CONSTANTES
	
	public final static String CATE1 = "A1";
	public final static String CATE2 = "A2";
	public final static String CATE3 = "B1";
	public final static String CATE4 = "C";

	//ATRIBUTOS
	
	private String numero;
	private String estado;
	private String categoria;
	private double multa;
	
	//RELACIONES
	
	private Fecha FechaLicen;
	
	//CONSTRUCTOR
	
	public Licencia(String elNumero) {
	
		numero = elNumero;
		estado = "";
		categoria = "";
		multa = 0.0;
		
	//OBJETOS
	
		FechaLicen = new Fecha( 0, 0, 0, 0, 0, 0);
		
	}
	
	//Metodos
	
	public String darNumero() {
		return numero;
	}
	
	public void modificarNumero(String elNumero) {
		numero = elNumero;
	}
	
	public String darEstado() {
		return estado;
	}
	
	public void modificarEstado(String elEstado) {
		estado = elEstado;
	}
	
	public String darCategoria() {
		return categoria;
	}
	
	public void modificarCategoria(String laCategoria) {
		categoria = laCategoria;
	}

	public double darMulta() {
		return multa;
	}
	
	public void modificarMultas(double laMulta) {
		multa = laMulta;
	}
	
	public Fecha darFechaLicen() {
		return FechaLicen;
	}
	
	public void modificarFechaLicen(Fecha FechaLicen) {
		this.FechaLicen = FechaLicen;
	}
	
	//REQUERIMIENTOS
	
	//CATEGORIA
	
	public String categoria(Vehiculo vehiculoUno, Vehiculo vehiculoDos) {
		
	if (vehiculoUno != null || vehiculoDos != null) {

		if ((vehiculoUno.darTipoVehiculo().equals("moto")) & (vehiculoDos.darTipoVehiculo().equals("carro")) || (vehiculoUno.darTipoVehiculo().equals("carro")) & (vehiculoDos.darTipoVehiculo().equals("moto"))) {
			categoria = CATE4;
		}
		
		else if ((vehiculoUno.darTipoVehiculo().equals("moto")) && (vehiculoUno.darValorCilindraje() <= 125)) {
			categoria = CATE1;
		}
		
		else if ((vehiculoUno.darTipoVehiculo().equals("moto")) && (vehiculoUno.darValorCilindraje() > 125)) {
			categoria = CATE2;
		}
		
		else if ((vehiculoDos.darTipoVehiculo().equals("moto")) && (vehiculoUno.darValorCilindraje() <= 125)) {
			categoria = CATE1;
		}
		
		else if ((vehiculoDos.darTipoVehiculo().equals("moto")) && (vehiculoDos.darValorCilindraje() > 125)) {
			categoria = CATE2;
		}
		
		else if ((vehiculoUno.darTipoVehiculo().equals("carro"))) {
			categoria = CATE3;
		}
		
		else if ((vehiculoDos.darTipoVehiculo().equals("carro"))) {
			categoria = CATE3;
		}
	
		}
	
		return categoria;
	}
	
	
	public double calcularMultaVen(Fecha vencimiento) {
		
		FechaLicen.vencimiento();

	if (vencimiento.equals("La licencia esta vencida")) {
		multa = 165000;
	}
	
	else {
		multa = 0;
	}
	
	return multa; 
	}
	
	//ESTADO DE LA LICENCIA
	
	public String estadoLicenia(Fecha vencimiento) {
		
		FechaLicen.vencimiento();
		
		if (vencimiento.equals("La licencia esta vencida")) {
			estado = "Vencida";
		}
		
		else {
			estado = "Activa";
		}
	
		return estado;
	
	}
	
	//MULTA
	
	public double multa(Usuario Licen,Fecha vencimiento) {
		
		FechaLicen.vencimiento();

	if (vencimiento.equals("La licencia esta vencida")) {
		multa = 165000;
	}
	
	else {
		multa = 0;
	}
		
		
		if (Licen == null) {
			multa = multa + 165.000;
		}
	return multa;
	}

	
}

	