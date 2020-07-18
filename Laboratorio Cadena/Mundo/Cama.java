package Mundo;

public class Cama {

	private String tipo;
	
	//Constructor 
	
	public Cama(String camaTipo) {
		tipo = camaTipo;
	
	}
	public String darTipo() {
		return tipo;
	}
	
	public void ModificarTipo(String camaTipo) {
		tipo = camaTipo;
	}
	
	
}