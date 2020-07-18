package modelo;

public class Libro {

	//ATRIBUTOS
	
	private int diaAgreLibre;
	private int mesAgreLibre;
	private int anoAgreLibre;
	private String pais;
	private int cantidadPag;
	private String nombre;
	private String nombreDelAutor;
	private String regisISBN;
	private boolean editAnoActu;
	
	
	//CONSTRUCTOR
	
	public Libro(int dia, int mes, int ano, String elPais, int cant, String elNombre, String autor, String ISBN) {
		
		diaAgreLibre = dia;
		mesAgreLibre = mes;
		anoAgreLibre = ano;
		pais = elPais;
		cantidadPag = cant;
		nombre = elNombre;
		nombreDelAutor = autor;
		regisISBN = ISBN;
		editAnoActu = false;
		
	}
	
	public int darDia() {
		return diaAgreLibre;
	}
	public void modificarDia(int dia) {
		diaAgreLibre = dia;
	}
	
	public int darMes() {
		return mesAgreLibre;
	}
	public void modificarMes(int mes) {
		mesAgreLibre = mes;
	}
	
	public int darAno() {
		return anoAgreLibre;
	}
	public void modificarAno(int ano) {
		anoAgreLibre = ano;
	}
	
	public String darPais() {
		return pais;
	}
	public void modificarPais(String elPais) {
		pais = elPais;
	}
	
	public int darCantidadPag() {
		return cantidadPag;
	}
	public void modificarCantidadPag(int cant) {
		cantidadPag = cant;
	}
	
	public String darNombre() {
		return nombre;
	}
	public void modificarNombre(String elNombre) {
		nombre = elNombre;
	}
	
	public String darNombreDelAutor() {
		return nombreDelAutor;
	}
	public void modificarNombreDelAutor(String autor) {
		nombreDelAutor = autor;
	}
	
	public String darRegisISBN() {
		return regisISBN;
	}
	public void modificarRegisISBN(String ISBN) {
		regisISBN = ISBN;
	}
	
	public boolean darEditadoAnoActu() {
		return editAnoActu;
	}
	public void modificarEditado(boolean editado) {
		editAnoActu = false;
	}
	
}