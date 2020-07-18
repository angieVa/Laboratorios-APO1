package interfazConsola;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.Candidato;
import modelo.SeleccionDePersonal;
import modelo.ZonaReclutamiento;

public class InterfazProcesoSeleccionLaboral{

	private SeleccionDePersonal miSeleccionDePersonal;

	
	public InterfazProcesoSeleccionLaboral() throws IOException{

		miSeleccionDePersonal = new SeleccionDePersonal();

		cargarCandidatos();	

		mostrarBanner();

		menu();
	}





	private void menu() {
		Scanner lector = new Scanner(System.in);


		int valor = 0;


		while (valor != 7) {

			System.out.println("Por favor digite la opcion que desea revisar: ");
			System.out.println("1.  Para ver la informaci�n de los Candidatos");
			System.out.println("2.  Para ver la zona con m�s candidatos en el umbral");
			System.out.println("3.  Para ver el total de candidatos");
			System.out.println("4.  Para ver el promedio total");
			System.out.println("5.  Para ver el porcentaje total de mujeres");
			System.out.println("6.  Para ver un filtrado especial");
			System.out.println("7.  Para Salir");



			valor = lector.nextInt();


			switch (valor) {
			case 1:
				MostrarTablaColaboradores();
				break;
				
			case 2:
				gestionarZonaMasCandidatosUmbral();
				break;
				
			case 3:
				gestionarTotalCandidatos();
				break;
				
			case 4:
				gestionarPromedioTotal();
				break;
				
			case 5:
				gestionarPorcentajeTotalMujeres();
				break;
							
			case 6:
				gestionarFiltradoEspecial();
				break;

			case 7:
				System.out.println("Gracias por usar nuestro programa!");
				break;
			default:
				System.out.println("Digita una opci�n v�lida");
				break;

			}

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {

			}

		}

		System.exit(0);


	}





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

		all.append("******************************************************************\n");
		all.append("*** BIENVENIDO AL SOFTWARE DE PROCESO DE SELECCION DE PERSONAL ***\n");
		all.append("******************************************************************\n");

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

	static void appendChars(StringBuilder sb, char c, int count) {
		for(int i = 0; i < count; i++) {
			sb.append(c);
		}
	}




	public void gestionarZonaMasCandidatosUmbral(){
		String reporte = miSeleccionDePersonal.ZonaMasSuperanUmbral();
		System.out.println(reporte);
	}

	public void gestionarPorcentajeTotalMujeres(){
		double porcMuj = miSeleccionDePersonal.calcularPorcentajeToMujeres();
		DecimalFormat df = new DecimalFormat("0.##");
		System.out.println("El % total de mujeres es: " + df.format(porcMuj));
	}

	public void gestionarFiltradoEspecial(){
		String reporte = miSeleccionDePersonal.hacerFiltradoEspecial();
		System.out.println(reporte);
		MostrarTablaColaboradores();
	}

	public void gestionarTotalCandidatos() {
		int totalC = miSeleccionDePersonal.calcularTotalCandidatos();
		System.out.println("El total de candidatos son: " +totalC);
	}

	public void gestionarPromedioTotal() {
		DecimalFormat df = new DecimalFormat("0.##");
		double promT = miSeleccionDePersonal.calcularPromedioTotalCandidatos();
		System.out.println("El promedio total  de los candidatos es: " + df.format(promT));
	}

	private void MostrarTablaColaboradores() {

		ZonaReclutamiento[] zr = miSeleccionDePersonal.darZonaReclutamientos();
		for (int i = 0; i < zr.length; i++) {
			agregarTabla(zr[i].darPais(),zr[i].darCandidatos());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}


	}


	private void agregarTabla(String pais, ArrayList<Candidato> candidatos) {

		String formato = "|%-11s| %-20s | %-20s | %-5s | %-5s | %-5s | %-5s | %-5s | %n";
		String formato2 = "%-35s %-10s  %-35s  %n";

		String l = "-------------------------------------------";
		System.out.format(formato2, l,pais,l);
		System.out.format("+-----------+----------------------+----------------------+-------+-------+-------+-------+-------+%n");
		System.out.format(formato, "ID", "Apellidos" ,"Nombres", "Sexo", "Comu", "Labo" , "T�cni" , "Acti");
		System.out.format("+-----------+----------------------+----------------------+-------+-------+-------+-------+-------+%n");		
		DecimalFormat df = new DecimalFormat("0.###");

		for (int i = 0; i < candidatos.size(); i++) {
			Candidato c = candidatos.get(i);
			System.out.format(formato, c.darId(),c.darApellidos(),c.darNombres(),c.darSexo(), df.format(c.darHabilidadesComunicacion()),
					df.format(c.darHistoriaLaboral()),
					df.format(c.darCompetenciaTecnica()),
					df.format(c.darActitud()));
		}
		System.out.format("+-----------+----------------------+----------------------+-------+-------+-------+-------+-------+%n%n%n");		


	}





//	public void agregarZonaCandidatos(String nombreZ, ArrayList<Candidato> valores){
//
//		for (int i = 0; i < valores.size(); i++) {
//			Candidato c = valores.get(i);
//
//		}
//
//	}

	private void cargarCandidatos() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("data/txt/candidates"));
		String linea = br.readLine();
		String zonaAnterior = "";
		int k = -1;
		while(linea!=null){
			String[] campos = linea.split("\t");
			if(!zonaAnterior.equals(campos[0])){
				zonaAnterior = campos[0];
				k++;
				miSeleccionDePersonal.agregarNuevaZona(k, campos[0]);
			}			
			miSeleccionDePersonal.agregarCandidato(k, campos[1], campos[2], campos[3], campos[4].charAt(0), 
					Double.parseDouble(campos[5]), Double.parseDouble(campos[6]), 
					Double.parseDouble(campos[7]), Double.parseDouble(campos[8]));

			linea = br.readLine();
		}
		br.close();
	}

	public static void main(String[] args) throws IOException{
		InterfazProcesoSeleccionLaboral ipsl = new InterfazProcesoSeleccionLaboral();
	}
}
