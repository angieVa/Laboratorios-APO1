package inter;

import Mundo.CadenaHotelera;
import Mundo.Hotel;
import Mundo.Empleados;
import Mundo.Habitacion;
import Mundo.Cama;

public class Menu2 {

	public static void main(String[] args) {
	
	CadenaHotelera cadena;
	
	cadena = new CadenaHotelera("Hoteles ....", " 685865865");
	
	cadena.calcularTotalNomina();
	
	System.out.println("La cadena hotelera es: " + cadena.darNombre()+ " y el nit es: " +cadena.darNit());
	
	System.out.println("La nomina total es: " + cadena.calcularTotalNomina());
	

	
	
	
	}
}