package Mundo;

public class Empleados {

	//ATRIBUTOS
	private String nombre;
	private String tipodeEmpleado;
	private String DocumentodeIdentidad;
	private double salarioDevengado;
	private double descuentos;
	private double salarioNeto;

	//CONSTRUCTOR
	public Empleados(String elNombre, String tipoEmpleado, String numDocumento, double saDevengado, double descuen, double salNeto) {
	
	nombre = elNombre;
	tipodeEmpleado = tipoEmpleado;
	DocumentodeIdentidad = numDocumento;
	salarioDevengado = saDevengado;
	descuentos = descuen;
	salarioNeto = salNeto;
	}
	
	public String darNombre() {
		return nombre;
	}
	
	public void ModificarNombre(String elNombre) {
		elNombre = nombre;
	}
	
	public String darTipodeEmpleado() {
		return tipodeEmpleado;
	}
	
	public void ModificarTipodeEmpleado(String tipoEmpleado) {
		tipoEmpleado = tipodeEmpleado; 
	}
	public String darDocumento() {
		return DocumentodeIdentidad;
	}
	
	public void modificarDocumento(String numDocumento) {
		numDocumento = DocumentodeIdentidad;
	}
	
	public double darSalarioDevengado() {
		return salarioDevengado;
	}
	
	public void modificarSalarioDevengado(double saDevengado){
		saDevengado = salarioDevengado;
	}
	public double darSalarioNeto() {
		return salarioNeto;
	}
	
	public void modificardarSalarioNeto(double salNeto){
		salarioNeto = salNeto;
	}
	
	public double darDescuentos() {
		return descuentos;
	}
	
	public void modificardarDescuentos(double descuen){
		descuentos = descuen;
	}
	public double calcularDescuentos() {
		descuentos = ((salarioDevengado * 4) / 100);
		return descuentos;
	}
	
	public double calcularSalarioNeto() {
		salarioNeto = (salarioDevengado - descuentos);
		return salarioNeto;
	}
	
	
	
}