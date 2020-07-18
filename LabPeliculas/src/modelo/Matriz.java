package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Matriz {

	private String[] peliculas;
	private String[] usuarios;

	private int[][] calificaciones;
	
	/**
	 * Clase Matriz, la cual encapsula la colección de usuarios y de peliculas. También incluye la matriz con 
	 * con las calificaciones de los usuarios sobre las peliculas <br>
	 *@param pelis: es un array de String que contiene los nombres de las peliculas <br>
	 *@param users: es un array de String con los nombres de los usuarios <br>
	 */

	public Matriz(String[] pelis, String[] users) {
		this.peliculas = pelis;
		this.usuarios = users;
		calificaciones = new int[users.length][pelis.length];
	}

	/**
	 * Este método permite cargar la matriz de calificaciones apartir del archivo de texto userItem.txt. <br>
	 */
	public void cargarCalificaciones() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("data/userItem.txt"));

			String linea = "";
			int fila = 0;
			while ((linea = br.readLine()) != null) {

				String[] data = linea.split("\t");
				int col = 0;
				for (String strRatig : data) {
					calificaciones[fila][col] = Integer.parseInt(strRatig);
					col++;
				}

				fila++;
			}

			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {

		}

	}
	
	/**
	 * Este método permite mostrar por consola la matriz de calificaciones. <br>
	 */
	public String mostrarMatriz(){
		
		String mensaje = "";
		for(int i = 0; i<calificaciones.length; i++){
			for(int j = 0; j < calificaciones[0].length; j++){
				mensaje += " " + calificaciones[i][j];
			}
			mensaje += "\n";
		}
		
		return (mensaje);
	}

	/**
	 * Este método permite obtener la colección de películas <br>
	 * @return arreglo de tipo String, con el conjunto de peliculas de la clase Matriz
	 */
	public String[] obtenerPeliculas() {
		return peliculas;
	}

	/**
	 * Este método permite obtener la colección de usuarios <br>
	 * @return arreglo de tipo String, con el conjunto de usuarios de la clase Matriz
	 */
	public String[] obtenerUsuarios() {
		return usuarios;
	}

	/**
	 * Este método permite dar el promedio de calificación de un usuario <br>
	 * <b>pre:</b> el array usuarios debe ser != null <br>
	 * @param Usu: es el nombre del usuario <br>
	 * @return un double con el promedio del usuario <br>
	*/
	public double promedioCalificacionUsuario(String Usu){
		int posi = 0;
		double prom = 0;
		int pelis = 0;
		for(int i = 0; i < usuarios.length && posi == 0; i++){
			if(Usu.equals(usuarios[i])){
				posi = i;
			}
		}
		
		for(int j = 0; j < calificaciones[posi].length; j++){
			
			if(calificaciones[posi][j] != 0){
				pelis++;
				prom += calificaciones[posi][j];
			}
		}
		
		prom /= pelis;

	return prom;
	}
	
	/**
	 * Este método sirve para dar el promedio de calificaciones de una película <br>
	 * <b>pre:</b> La matriz de calificaciones y el array películas debe ser !=null <br>
	 * @param Peli : es el nombre de la pelicula <br>
	 * @return un double con el promedio de la película seleccionada <br>
	*/
	public double promedioCalificacionPelicula(String Peli){
		int posi = 0;
		double prom = 0;
		int usua = 0;
		
		for(int indi = 0; indi < peliculas.length && posi == 0; indi++){
			if(Peli.equals(peliculas[indi])){
				posi = indi;
			}
		}
		
		for(int i = 0; i < calificaciones.length; i++){
			
			if(calificaciones[i][posi] != 0){
				usua++;
				prom += calificaciones[i][posi];
			}
		}
		
		prom /= usua;
		
		return prom;
	}
	
	
	/**
	 * Este método sirve para obtener la película que tenga la mayor calificación promedio de todas <br>
	 * <b>pre:</b> La matriz de calificaciones y el arreglo de películas deben ser !=null <br>
	 * @return un String con el nombre de la película con mayor calificacion <br>
	 */
	public String darPeliculaMayorPromedio(){
		
		String mayor = "";
		double pelicu = promedioCalificacionPelicula(peliculas[0]);
		
		for(int i = 0; i < peliculas.length; i++){
			if(promedioCalificacionPelicula(peliculas[i]) > pelicu){
				
				pelicu = promedioCalificacionPelicula(peliculas[i]);
				mayor = peliculas[i];
			}
		}
		return mayor + " con un promedio de: " + pelicu;
	}

	/**
	 * Este método sirve para obtener la película que tenga la menor calificación promedio de todas <br>
	 * <b>pre:</b> La matriz de calificaciones y el arreglo de películas deben ser !=null <br>
	 * @return un String con el nombre de la película con menor calificacion <br>
	 */
	public String darPeliculaMenorPromedio(){
		
		String menor = "";
		double pelicu = promedioCalificacionPelicula(peliculas[0]);
		
		for(int i = 0; i < peliculas.length; i++){
			if(promedioCalificacionPelicula(peliculas[i]) < pelicu){
				
				pelicu = promedioCalificacionPelicula(peliculas[i]);
				menor = peliculas[i];
			}
		}
		return menor + " con un promedio de: " + pelicu;

	}
	
	/**
	 * Método que retorna las peliculas que no ha visto el usuario <br>
	 * <b>pre:</b> el paramentro User debe ser != null <br>
	 * @param User : es el nombre del usuario <br>
	 * @return un ArrayList con los nombres de las películas que no ha visto el usuario <br>
	*/
	public ArrayList<String> darPeliculasSinVer(String User){
		int posi = 0;
		ArrayList <String> pelisSinVer = new ArrayList <String> ();
		
		for(int i = 0; i < usuarios.length && posi == 0; i++){
			if(User.equals(usuarios[i])){
				posi = i;
			}
		}
		
		for (int j = 0; j < calificaciones[posi].length; j++ ){
				
			if (calificaciones[posi][j] == 0){
					
				pelisSinVer.add(peliculas[j]);
			}
		}
	return pelisSinVer;
		
	}
	
}
