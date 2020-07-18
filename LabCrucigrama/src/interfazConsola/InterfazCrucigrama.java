package interfazConsola;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import mundo.Crucigrama;

public class InterfazCrucigrama {

	private Crucigrama crucigrama;

	public InterfazCrucigrama() throws IOException {
		crucigrama = new Crucigrama();
		cargarCrucigrama();
		mostrarBanner();
		mostrarCrucigrama();
		Menu();

	}

	/**
	 * Este método permite Leer el archivo, que contiene las preguntas, respuestas y el crucigrama <br>
	 * 
	 */
	private void cargarCrucigrama() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("data/crucigrama1.txt"));
		String linea = br.readLine();
		int k = 0;
		int hor = 0;
		int ver = 0;
		int j = 0;
		// preguntas
		if (linea != null) {
			String[] pre = linea.split("-");
			hor = Integer.parseInt(pre[0]);
			ver = Integer.parseInt(pre[1]);
		}
		linea = br.readLine();
		// Preguntas horizontales
		while (linea != null && k < hor) {
			crucigrama.cargarPreguntas('H', linea);
			linea = br.readLine();
			k++;
		}
		k = 0;
		// Preguntas verticales
		while (linea != null && k < ver) {
			crucigrama.cargarPreguntas('V', linea);
			linea = br.readLine();
			k++;
		}
		// respuestas
		String[] res = linea.split("-");
		for (int i = 0; i < res.length; i++) {
			crucigrama.cargarRespuestas(res[i]);
		}
		linea = br.readLine();
		// Crucigrama
		while (linea != null) {
			String[] campos = linea.split("  ");
			for (int i = 0; i < campos.length; i++) {
				String cam = campos[i];
				if (!(cam.length() > 1)) {
					crucigrama.cargarMatriz(j, i, cam.charAt(0));
				}
			}
			j++;
			linea = br.readLine();
		}
		br.close();
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
		all.append("************************** CRUCIGRAMA ***************************\n");
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
	 * Este método permite concatenar los caracteres para el banner. <br>
	 */
	static void appendChars(StringBuilder sb, char c, int count) {
		for (int i = 0; i < count; i++) {
			sb.append(c);
		}
	}

	/**
	 * Este método permite mostrar las preguntas y el crucigrama por Consola. <br>
	 */
	public void mostrarCrucigrama(){
		
		agregarPreguntas();
		crucigrama.imprimirCrucigrama();
	}

	/**
	 * Este método permite mostrar El menú al usuario. <br>
	 */
	public void Menu() {
		Scanner lector = new Scanner(System.in);
		int pregunta = 0;
		String respuesta = "";
		int tipo = 0;
		int continuar = 1;

		while (!crucigrama.estaTerminado() && continuar == 1) {
			System.out.format("+------------------------------+%n%n");
			System.out.println("************  MENU  ***************");
			System.out.println("Por favor digite el número de la pregunta ");
			pregunta = lector.nextInt();
			System.out.println("Digite 1 si es horizontal o 2 si es vertical");
			tipo = lector.nextInt();
			System.out.println("Digite la respuesta");
			respuesta = lector.next();

			String resultado = crucigrama.buscarRespuesta(pregunta, respuesta.toUpperCase());
			System.out.println("Su respuesta es " + resultado);
			if (resultado.equals("Correcta"))
				crucigrama.actualizarCrucigrama(pregunta, respuesta, tipo);
			mostrarCrucigrama();
			System.out.println("Desea continuar? 1.SI 2.NO");
			continuar = lector.nextInt();
		}
		if(crucigrama.estaTerminado() == true){
			System.out.println("Se ha completado el crucigrama, gracias por jugar!!!");
		}
		else {
		System.out.println("Gracias por jugar!");
		}
		System.exit(0);
	}

	/**
	 * Este método permite mostrar las preguntas en formato tabla. <br>
	 */
	private void agregarPreguntas() {

		String formato = "|%-80s| %-80s | %n";
		String formato2 = "%-60s %-10s  %-60s  %n";
		String hor = "";
		String ver = "";
		String l = "----------------------------------------------------------------------------";
		System.out.format(formato2, l, "PREGUNTAS", l);
		System.out.format(
				"+---------------------+--------------------------------+------------------------------+------------------------+--------------------+-------+---------------+-------+%n");
		System.out.format(formato, "Verticales", "Horizontales");
		System.out.format(
				"+---------------------+--------------------------------+------------------------------+------------------------+--------------------+-------+---------------+-------+%n");

		for (int i = 0; i < crucigrama.darPreguntasH().size() || i < crucigrama.darPreguntasV().size(); i++) {
			if (i < crucigrama.darPreguntasH().size())
				hor = crucigrama.darPreguntasH().get(i);
			else
				hor = " ";
			if (i < crucigrama.darPreguntasV().size())
				ver = crucigrama.darPreguntasV().get(i);
			else
				ver = " ";
			System.out.format(formato, hor, ver);
		}
		System.out.format(
				"+---------------------+--------------------------------+------------------------------+------------------------+--------------------+-------+---------------+-------+%n%n%n");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InterfazCrucigrama wordCross = new InterfazCrucigrama();

	}

}
