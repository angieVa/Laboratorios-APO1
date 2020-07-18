package mundo;

public class Letra {

	// Atributos
	private char caracter;
	
	/**
	 * Construye una Letra <br>
	 * <b>post: </b> Se construye una letra con un caracter dado
	 * @param caracter - caracter representado por la Letra
	 */
	public Letra(char caracter){
		this.caracter = caracter;
	}

	//métodos dar y cambiar
	public char darCaracter() {
		return caracter;
	}

	public void cambiarCaracter(char caracter) {
		this.caracter = caracter;
	}
	
	public boolean esIgual(char c){
		return caracter==c;
	}
}
