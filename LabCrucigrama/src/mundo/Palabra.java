package mundo;

public class Palabra {

	// Atributos
	private Letra[] letras;

	/**
	 * Construye una palabra <br>
	 * <b>post: </b> Se construyó la palabra, inicializando el arreglo de letras
	 * y llenandolo, con los caracteres de la palabra
	 * @param palabra - Cadena con la palabra
	 */
	public Palabra(String palabra) {
		letras = new Letra[palabra.length()];
		char[] letricas = palabra.toCharArray();
		for (int i = 0; i < letricas.length; i++) {
			letras[i] = new Letra(letricas[i]);
		}
	}

	// Método dar
	public Letra[] darLetras() {
		return letras;
	}

	public boolean esIgual(Palabra p){
		
		boolean iguales = letras.length==p.darLetras().length;
		
		for (int i = 0; i < letras.length && iguales; i++) {
			
			iguales &= letras[i].esIgual(p.darLetras()[i].darCaracter());
						
		}
		
		return iguales;
	}
	
}
