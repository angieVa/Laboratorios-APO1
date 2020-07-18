package interfaz;

import modelo.Matriz;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MenuConsola {
	
	Scanner entrada = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Matriz userItem;
	
	/**
	 * Método constructor de la clase MenuConsola 
	*/
	public MenuConsola() throws IOException {
		
		String[] peliculas =  { "Toy story 2", "Jumanji", "Amelie", "Wolverine", "Spider Man", "Yes Men", "Sabrina",
				"Shrek", "X Men", "GoldenEye" };
		String[] usuarios = { "Jhon", "Michael", "Jimmy", "Janis", "Carla", "Angie" };
		userItem = new Matriz(peliculas, usuarios);
		cargarMatriz();
		
		
		boolean salir = false;
		for(int indice = 0; indice < 100 && !salir; indice++){
		
		
		
		mostrarBanner();
		mostrarUsuarios();
		System.out.println("\n");
		mostrarPeliculas();
		System.out.println("\n");
		todo();
		System.out.println("Presione 1 si desea salir");
		System.out.println("Presione 2 si desea volver al menu");
		int salida = entrada.nextInt();
			
				if(salida == 1){
					System.out.println("Gracias por usar nuestro programa c:");
				salir = true;
				}

		//System.out.println(mostrarMatriz());
		}
	}
	/**
	 * Método que permite cargar la matriz de calificaciones
	*/
	public void cargarMatriz(){
		userItem.cargarCalificaciones();
	}
	
	/**
	 * Método que muestra la matriz al usuario <br>
	 * <b>pre:</b> la Matriz debe ser != null <br>
	 * @return una matriz de tipo String con los datos
	*/
	public String mostrarMatriz(){
		return userItem.mostrarMatriz();
	}
	
	/**
	 * Este método permite concatenar los caracteres para el banner. <br>
	 */
	static void appendChars(StringBuilder sb, char c, int count) {
		for (int i = 0; i < count; i++) {
			sb.append(c);
		}
	}
	
	/**
	 * Este método permite mostrar un banner en el Menu. <br>
	 */
	public void mostrarBanner() {
		StringBuilder all = new StringBuilder();
		all.append("\n");
		int ancho = 17;
		for (int a = 1; a <= 4; a++) {
			int cantidadAsteriscos = ancho - a;
			int cantidadEspacios = ancho - cantidadAsteriscos;
			int cantidadSlashes = (ancho - a) * 2;
			int cantidadDeBackSlashes = (a - 1) * 2;
			appendChars(all, '*', cantidadAsteriscos);
			appendChars(all, ' ', cantidadEspacios);
			appendChars(all, '/', cantidadSlashes);
			appendChars(all, '\\', cantidadDeBackSlashes);
			appendChars(all, ' ', cantidadEspacios);
			appendChars(all, '*', cantidadAsteriscos);
			all.append("\n");
		}

		all.append("*****************************************************************\n");
		all.append("************************** Icesi-Movie ***************************\n");
		all.append("*****************************************************************\n");

		for (int a = 4; a >= 1; a--) {
			int cantidadAsteriscos = ancho - a;
			int cantidadEspacios = ancho - cantidadAsteriscos;
			int cantidadDeBackSlashes = (ancho - a) * 2;
			int cantidadSlashes = (a - 1) * 2;
			appendChars(all, '*', cantidadAsteriscos);
			appendChars(all, ' ', cantidadEspacios);
			appendChars(all, '/', cantidadSlashes);
			appendChars(all, '\\', cantidadDeBackSlashes);
			appendChars(all, ' ', cantidadEspacios);
			appendChars(all, '*', cantidadAsteriscos);
			all.append("\n");
		}
		all.append("\n");
		System.out.println(all.toString());
	}
	
	/**
	 * Este método permite mostrar por consola los usuarios <br>
	 */
	public void mostrarUsuarios(){
		System.out.println("Usuarios:");
		
		String[] usuarios = userItem.obtenerUsuarios();
		int c = 1;
		for(String us : usuarios){
			System.out.println(c + ". " + us + "\t");
			c++;
		}
	}
	
	/**
	 * Este método permite mostrar por consola las peliculas <br>
	 */	
	public void mostrarPeliculas(){
		System.out.println("Peliculas:");
		
		String[] pelis = userItem.obtenerPeliculas();
		int c = 1;
		for(String pel : pelis){
			System.out.println(c + ". " + pel + "\t");
			c++;
		}
	
	}
	
	public void todo() throws IOException {
		
		
	System.out.println("Presione 1 si desea saber el promedio de calificacion de un usuario");
	System.out.println("Presione 2 si desea saber la calificacion promedio de una pelicula");
	System.out.println("Presione 3 si desea saber la pelicula con el promedio de calificacion mas alto");
	System.out.println("Presione 4 si desea saber la película con el promedio de calificacion más bajo");
	System.out.println("Presione 5 si desea saber las peliculas que un usuario no ha visto");
	int eleccion = entrada.nextInt();
	
		if (eleccion == 1){
			System.out.println("Ingrese el nombre del usuario del que desea saber el promedio de calificaciones");
			String Usu = entrada.next();
			
			System.out.println("El promedio de calificaciones es: " + userItem.promedioCalificacionUsuario(Usu));
		}
		
		else if(eleccion == 2){
			System.out.println("Ingrese el nombre de la pelicula que desea saber el promedio de calificaciones");
			String Peli = br.readLine();
			
			System.out.println("El promedio de calificaciones es: " + userItem.promedioCalificacionPelicula(Peli));
			
		}
		
		else if(eleccion == 3){
			
			System.out.println("La pelicula con el promedio de calificaciones mas alto es: ");
			System.out.println(userItem.darPeliculaMayorPromedio());
		}
		
		else if(eleccion == 4){
			
			System.out.println("La pelicula con el promedio de calificaciones mas bajo es: ");
			System.out.println(userItem.darPeliculaMenorPromedio());
		}
		
		else if(eleccion == 5){
			System.out.println("Ingrese el nombre del usuario");
			String User = entrada.next();
			
			System.out.println("Las peeliculas sin ver son: " + userItem.darPeliculasSinVer(User));
		}
		
	}

	public static void main(String[] args) throws IOException {
	
		MenuConsola menu = new MenuConsola();

	}

}
