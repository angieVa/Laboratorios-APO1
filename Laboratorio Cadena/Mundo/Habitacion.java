package Mundo;

public class Habitacion {

	private int numero;
	private int capacidad;
	private String piso;
	private int PersonasAlojadas;
	
	private Cama tipocama;
	
	//Constructor
	
	public Habitacion(int numeroHab, String pisoHab, int capaHab, int persoAl){
	
	numero = numeroHab;
	piso = pisoHab;
	capacidad = capaHab;
	PersonasAlojadas = persoAl;
	}
	
	
	public int darNumero() {
		return numero;
	}
	public void modificarNumero(int numeroHab) {
		numeroHab = numero;
	}
	
	public String darPiso() {
		return piso;
	}
	public void modificarPiso(String pisoHab) {
		pisoHab = piso;
	}
	
	public int darCapacidad() {
		return capacidad;
	}
	public void modificarCapacidad(int capaHab) {
		capaHab = capacidad;
	}
	
	public int darPersonasAlojadas() {
		return PersonasAlojadas;
	}
	public void modificarPersonasAlojadas(int persoAl) {
		persoAl = PersonasAlojadas;
	}
}