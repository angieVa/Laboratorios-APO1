package interfaz;
//Angie Valentina Córdoba A00347829
import modelo.Usuario; 
import modelo.Vehiculo;
import modelo.Fecha;
import java.util.Scanner;
	
	
	public class Menu {

	public static void main(String[] args) {
		
		Usuario UsuarioUno;
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("BIENVENIDO AL PROGRAMA DE TRANSITO DE LA ALCALDIA DE JAMUNDI ");
		System.out.println("--------------------------------------------------------------------------------");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre:");
		String elNombre = entrada.nextLine(); 
		System.out.println("Ingrese su cedula:");
		String cedu = entrada.nextLine(); 
		UsuarioUno = new Usuario(elNombre, cedu);
		
		System.out.println("Usuario: "+ UsuarioUno.darNombre() + "      Cedula: "+ UsuarioUno.darCedula());
		
		System.out.println(".................................................................................");
		
		System.out.println("Informacion Primer vehiculo:");
		
		System.out.print("Escriba la placa: ");
			String laPlaca = entrada.nextLine();
		
		System.out.print("Ingrese el modelo: "); 
			int model = entrada.nextInt();
		
		System.out.print("Ingrese el kilometraje: "); 
			int kilomet = entrada.nextInt();
			entrada.nextLine();
		System.out.print("Ingrese el tipo de vehiculo: "); 
			String tipoV = entrada.nextLine();
		
		System.out.print("Ingrese el cilindraje: "); 
			String cilin = entrada.nextLine();
		
		System.out.print("Ingrese el avaluo: "); 
			double elAvaluo = entrada.nextDouble();
			entrada.nextLine();
		UsuarioUno.modificarVehiculo1(new Vehiculo(laPlaca, model, kilomet, tipoV, cilin, elAvaluo));

		System.out.println(".................................................................................");
		
		System.out.println("Su vehiculo necesita revision tecnomecanica?: " +  UsuarioUno.darVehiculoUno().calcularTecnomecanica());
		
		System.out.println("Valor del SOAT de su vehiculo: " + UsuarioUno.darVehiculoUno().darValorSeguroSOATcarro());
		
		System.out.println("Dias pico y placa de su vehiculo: " + UsuarioUno.darVehiculoUno().calcularPicoPlacaAuto());
		
		System.out.println(".................................................................................");
		
		System.out.println("Informacion Segundo vehiculo:");
		
		System.out.print("Escriba la placa: ");
			String laPlaca2 = entrada.nextLine();
		
		System.out.print("Ingrese el modelo: "); 
			int model2 = entrada.nextInt();
		
		System.out.print("Ingrese el kilometraje: "); 
			int kilomet2 = entrada.nextInt();
			entrada.nextLine();
		System.out.print("Ingrese el tipo de vehiculo: "); 
			String tipoV2 = entrada.nextLine();
		
		System.out.print("Ingrese el cilindraje: "); 
			String cilin2 = entrada.nextLine();
		
		System.out.print("Ingrese el avaluo: "); 
			double elAvaluo2 = entrada.nextDouble();
			
		UsuarioUno.modificarVehiculoDos(new Vehiculo(laPlaca2, model2, kilomet2, tipoV2, cilin2, elAvaluo2));
		
		System.out.println("................................................................................");
		
		System.out.println("Su vehiculo necesita revision tecnomecanica?: " +  UsuarioUno.darVehiculoDos().calcularTecnomecanica());
		
		System.out.println("Valor del SOAT de su vehiculo: " + UsuarioUno.darVehiculoDos().darValorSeguroSOATmoto());
		
		System.out.println("Dias pico y placa de su vehiculo: " + UsuarioUno.darVehiculoDos().calcularPicoPlacaMoto());
	
		System.out.println("*******************************************************************************");
		
		System.out.print("Ingrese el dia actual: "); 
			int elDiaAct = entrada.nextInt();
		System.out.print("Ingrese el mes actual: "); 
			int elMesAct = entrada.nextInt();
		System.out.print("Ingrese el anio actual: "); 
			int elAnioAct = entrada.nextInt();
			entrada.nextLine();
		System.out.println("................................................................................");
		
		System.out.println("Datos sobre la licencia");
		System.out.println("Ingrese el numero de la licencia:");
		String elNumero = entrada.nextLine();
	
		UsuarioUno.darLicen().modificarNumero(elNumero);
		
		System.out.print("Ingrese el dia de expedicion: "); 
			int elDiaExped = entrada.nextInt();
		System.out.print("Ingrese el mes de expedicion: "); 
			int elMesExped = entrada.nextInt();
		System.out.print("Ingrese el anio de expedicion: "); 
			int elAnioExped = entrada.nextInt();
		
		Fecha fechaLicen = new Fecha(elDiaAct, elMesAct, elAnioAct, elDiaExped, elMesExped, elAnioExped);
		
		System.out.println("Licencia: "+ UsuarioUno.darLicen().darNumero());
		System.out.println("Estado: "+fechaLicen.vencimiento());
		System.out.println("Categoria: "+UsuarioUno.darLicen().categoria(UsuarioUno.darVehiculoUno(), UsuarioUno.darVehiculoDos()));
		
	
	
	
	}
	
}