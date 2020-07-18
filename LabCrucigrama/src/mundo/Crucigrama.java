package mundo;

import java.util.ArrayList;

public class Crucigrama {
	
	//Constantes
	public final static int FILASC = 10;
	public final static int COLUMNASC = 23;

	// Atributos
	// Matriz de caracteres que componen el crucigrama
	private Letra[][] caracteres;
	// Matriz espejo del crucigrama crucigrama
	private Letra[][] matrizEspejo;

	// Lista de respuestas del crucigrama
	private ArrayList<Palabra> respuestas;

	// Lista de respuestas correctas del crucigrama
	private ArrayList<Palabra> encontradas;

	// Lista de preguntas verticales del crucigrama
	private ArrayList<String> preguntasV;

	// Lista de preguntas horizontales del crucigrama
	private ArrayList<String> preguntasH;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Construye un crucigrama <br>
	 * <b>post: </b> Se construyó un crucigrama, inicializando las listas y la
	 * matriz de Letras
	 */
	public Crucigrama() {

		caracteres = new Letra[FILASC][COLUMNASC];
		matrizEspejo = new Letra[FILASC][COLUMNASC];
		respuestas = new ArrayList<Palabra>();
		encontradas = new ArrayList<Palabra>();
		preguntasH = new ArrayList<String>();
		preguntasV = new ArrayList<String>();

	}

	// Métodos dar
	public Letra[][] darCaracteres() {
		return caracteres;
	}

	public ArrayList<Palabra> darRespuestas() {
		return respuestas;
	}

	public ArrayList<String> darPreguntasV() {
		return preguntasV;
	}

	public ArrayList<String> darPreguntasH() {
		return preguntasH;
	}

	/**
	 * Este método permite cargar la matriz de letras con los caracteres leídos
	 * del archivo, en una fila y columna especifica <br>
	 * <b>post: </b> La matriz de caracteres ha sido llenada
	 * 
	 * @param fila
	 *            - Es un entero que indica la fila
	 * @param col
	 *            - Es un entero que incida la columna
	 * @param caracter
	 *            - Es una char con el caracter leido del crucigrama
	 * 
	 */
	public void cargarMatriz(int fila, int col, char caracter) {
		caracteres[fila][col] = new Letra(caracter);
		matrizEspejo[fila][col] = new Letra(caracter);
	}

	/**
	 * Este método permite cargar la lista de las preguntas horizontales y
	 * verticales. <br>
	 * <b>post: </b> La lista de preguntas verticales y horizontales han sido
	 * actualizadas
	 * 
	 * @param tipo
	 *            - Es un entero que indica si la pregunta es horizontal o
	 *            vertical
	 * @param pregunta
	 *            - cadena con la pregunta
	 */
	public void cargarPreguntas(int tipo, String pregunta) {
		switch (tipo) {
		case 'H':
			preguntasH.add(pregunta);
			break;
		case 'V':
			preguntasV.add(pregunta);
			break;
		}
	}

	/**
	 * Este método permite cargar la lista con las respuestas correctas del
	 * crucigrama. <br>
	 * <b>post: </b> La lista de respuestas ha sido actualizada
	 * 
	 * @param palabra
	 *            - cadena con la respuesta a guardar
	 */
	public void cargarRespuestas(String palabra) {
		respuestas.add(new Palabra(palabra));
	}

	/**
	 * Este método permite validar si el juego esta terminado. El juego se
	 * termina cuando se han encontrado la totalidad de las respuestas, que son
	 * almacenadas en la lista de encontradas. <br>
	 * 
	 * @return Retorna un boolean indicando si el juego se terminó
	 */
	public boolean estaTerminado() {
		
		boolean termi = false;
		
		if(encontradas.size() == 14){
			termi = true;
		}
		
		return termi;
	}

	/**
	 * Este método sirve para buscar en la pregunta especificada por el usuario,
	 * si la respuesta dada es correcta. <br>
	 * <b>post: </b> La lista de palabras encontradas se actualizó con la
	 * respuesta correcta
	 * 
	 * @param pregunta
	 *            - Es un entero con la pregunta seleccionada por el usuario y
	 *            la cual va a buscar la respuesta
	 * @param respuesta
	 *            - Es una cadena con la respuesta digitada por el usuario
	 * @return Retorna un mensaje indicando si la respuesta es incorrecta o
	 *         correcta
	 */
	public String buscarRespuesta(int pregunta, String respuesta) {
		
		String resultado = "";
		Palabra pal= new Palabra(respuesta);
		if(pal.esIgual(respuestas.get(pregunta - 1))){
			
			resultado = "Correcta"; 
			
			encontradas.add(pal);
		}
		else{
			resultado = "Incorrecta";
		}

		return resultado;
	}

	/**
	 * Este método permite actualizar la matriz de caracteres del crucigrama,
	 * con las respuestas correctas dadas por el usuario. debe tener en cuenta
	 * si la pregunta es vertical u horizontal <br>
	 * <b>post: </b> La matriz de caracteres ha sido actualizada
	 * 
	 * @param pregunta
	 *            - Es un entero con la pregunta seleccionada por el usuario,
	 *            para buscarla en la matriz y actualizarla con la respuesta
	 * 
	 * @param respuesta
	 *            - Es una cadena con la respuesta correcta
	 * @param tipo
	 *            - Es un entero con el tipo de la pregunta, 1 si es horizontal,
	 *            2 si es vertical
	 * 
	 */
	public void actualizarCrucigrama(int pregunta, String respuesta, int tipo) {
		Palabra resp= new Palabra(respuesta);
		
		char var = 'A';
		if ( pregunta == 10)
		{var = var;}
		else if (pregunta == 11)
		{var +=1;}
		else if (pregunta == 12)
		{var +=2;}
		else if (pregunta == 13)
		{var +=3;}
		else if ( pregunta == 14)
		{var +=4;}
		
				
		for ( int i = 0 ; i < matrizEspejo.length ; i++ ){
			for ( int j = 0 ; j< 23 ; j++ ){
		
		if(pregunta>=10 && pregunta <= 14){
	
			
			if ( matrizEspejo[i][j].darCaracter() == var ){
				if ( tipo == 1){
					for (int a = 0 ; a <respuesta.length() ; a++){
					Letra letr = new Letra(respuesta.charAt(a));
					caracteres[i][j] = letr;
					j += 1;
					}
				}else if ( tipo == 2){
					for (int a = 0 ; a <respuesta.length() ; a++){
					Letra letr = new Letra(respuesta.charAt(a));
					caracteres[i][j] = letr;
					i += 1;
					}
			
					}
				}
		}
		else{
		char c = (char)('0' + pregunta);
		if(matrizEspejo[i][j].darCaracter() == c){
			
				if ( tipo == 1){
					for (int a = 0 ; a <respuesta.length() ; a++){
					Letra letr = new Letra(respuesta.charAt(a));
					caracteres[i][j] = letr;
					j += 1;
					}
				}else if ( tipo == 2 ){
					for (int a = 0 ; a <respuesta.length() ; a++){
					Letra letr = new Letra(respuesta.charAt(a));
					caracteres[i][j] = letr;
					i += 1;
					}
			
					}
			}
		}
			}
			
		}
	}
	
	//metodo para imprimir crucigrama
	
	public void imprimirCrucigrama(){
		
	for(int i = 0; i < 10; i++){
			
			for(int j = 0; j < 23; j++){
				System.out.print(darCaracteres()[i][j].darCaracter());

				if (j == 22){
					System.out.print("\n");
				}
			}
		}	
		
		
	}
}
