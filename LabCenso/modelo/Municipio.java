package modelo;

public class Municipio {


	//CONSTANTES


	//ATRIBUTOS
	
	private String nombre;
	private int poblacion;
	private int cantHombres;
	private int cantMujeres;
	private int cantAdulMayores;
	private double edadProm;
	private double ingresoProm;
	
	
	//CONSTRUCTOR
	
	public Municipio(String elNombre, int laPoblacion, int cHombres, int cMujeres, int cAdultosM, double Epromedio, double Ipromedio){
		
		nombre = elNombre;
		poblacion = laPoblacion;
		cantHombres = cHombres;
		cantMujeres = cMujeres;
		cantAdulMayores = cAdultosM;
		edadProm = Epromedio;
		ingresoProm = Ipromedio;
		
	}
	
	
	public String darNombre() {
		return nombre;
	}
	public void modificarNombre(String elNombre){
		nombre = elNombre;
	}
	
	public int darPoblacion() {
		return poblacion;
	}
	public void modificarPoblacion(int laPoblacion){
		poblacion = laPoblacion;
	}
	
	public int darCantidadHombres() {
		return cantHombres;
	}
	public void modificarCantidadHombres(int cHombres) {
		cantHombres = cHombres;
	}
	
	public int darCantidadMujeres(){
		return cantMujeres;
	}
	public void modificarCantidadMujeres(int cMujeres){
		cantMujeres = cMujeres;
	}
	
	public int darCantidadAdulMayores() {
		return cantAdulMayores;
	}
	public void modificarCantidadAdulMayores(int cAdultosM) {
		cantAdulMayores = cAdultosM;
	}
	
	public double darEdadPromedio() {
		return edadProm;
	}
	public void modificarEdadPromedio(double Epromedio) {
		edadProm = Epromedio;
	}
	
	public double darIngresoPromedio() {
		return ingresoProm;
	}
	public void modificarIngresoPromedio(double Ipromedio) {
		ingresoProm = Ipromedio;
	}
}