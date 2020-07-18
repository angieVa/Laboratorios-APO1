package Modelo;

public class Actor {

//CONSTANTES

public static final String ACTOR_PRIN = "Actor Principal";
public static final String ACTOR_R = "Actor de Reparto";


	//ATRIBUTOS
	private String nombre;
	private int edad;
	private int cedula;
	private int CuentaBancaria;
	private String[] tipo;
	
	//METODO
	public Actor(String elNombre, int laEdad, int laCedula, int laCuentaBancaria, String tipoAct) {
		
		nombre = elNombre;
		edad = laEdad;
		cedula = laCedula;
		CuentaBancaria = laCuentaBancaria;
		tipo = tipo;
	}
	
		//ACABO DE INICIALIZAR ATRIBUTOS
	public String darNombre() {
		return nombre;
	}
	
	public void modificarNombre(String elNombre) {
		nombre = elNombre;
	}
	
	public int darEdad() {
		return edad;
	}
	
	public void modificarEdad(int laEdad) {
		edad = laEdad;
	}
	
	public int darCedula() {
		return cedula;
	}
	
	public void modificarCedula(int laCedula) {
		cedula = laCedula;
	}
	
	public int darCuentaBancaria() {
		return CuentaBancaria;
	}
	
	public void modificarCuentaBancaria(int laCuentaBancaria) {
		CuentaBancaria = laCuentaBancaria;
	}
	
	
	
}


