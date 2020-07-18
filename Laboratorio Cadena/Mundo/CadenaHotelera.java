package Mundo;

public class CadenaHotelera {

	// ATRIBUTOS
	private String nombre;
	private String nit;
	private double totalNomina;

	//RELACIONES
	private Hotel H1;
	private Hotel H2;
	private Hotel H3;
	private Hotel nomina;
	
	
	
	//CONSTRUCTOR
	
	public CadenaHotelera(String elNombre, String elNit) {
		
		nombre = elNombre;
		nit = elNit;
		totalNomina = 0;
		
	
	
	//OBJETOS
	H1 = new Hotel("Hotel Luna de Hierro","897654321", 8, 16);
	H1.modificarEmpleado1(new Empleados("Daniel Castro Lara", "Recepcionista", "798654321", 1500000, 60000, 1440000));
	H1.modificarEmpleado2(new Empleados("Elvis Rosero Cuero","Botones","698754321",1500000, 60000, 1440000));
	H1.modificarEmpleado3(new Empleados("Camilo Perez Gomez", "Aseador","598764321",1500000, 60000, 1440000));
	H1.modificarHab1(new Habitacion(1, "1", 2, 0));
	H1.modificarHab2(new Habitacion(2, "1", 2, 0));
	H1.modificarHab3(new Habitacion(3, "1", 2, 0));
	H1.modificarHab4(new Habitacion(4, "1", 2, 0));
	H1.modificarHab5(new Habitacion(5, "2", 2, 0));
	H1.modificarHab6(new Habitacion(6, "2", 2, 0));
	H1.modificarHab7(new Habitacion(7, "2", 2, 0));
	H1.modificarHab8(new Habitacion(8, "2", 2, 0));
	
	//hotel dos
	H2 = new Hotel("Hotel Luna de Acero","498765321", 8, 16);
	H2.modificarEmpleado1(new Empleados("Cristina Ochoa Lemos", "Recepcionista", "398765421", 1500000, 60000, 1440000));
	H2.modificarEmpleado2(new Empleados("Damian Caicedo Torres", "Aseador", "2987654321", 1500000, 60000, 1440000));
	H2.modificarEmpleado3(new Empleados("Ramiro Patiño Lopez", "Botones", "198765432", 1500000, 60000, 1440000));
	H2.modificarHab1(new Habitacion(1, "1", 2, 0));
	H2.modificarHab2(new Habitacion(2, "1", 2, 0));
	H2.modificarHab3(new Habitacion(3, "1", 2, 0));
	H2.modificarHab4(new Habitacion(4, "1", 2, 0));
	H2.modificarHab5(new Habitacion(5, "2", 2, 0));
	H2.modificarHab6(new Habitacion(6, "2", 2, 0));
	H2.modificarHab7(new Habitacion(7, "2", 2, 0));
	H2.modificarHab8(new Habitacion(8, "2", 2, 0));
	
	// hotel Tres
	H3 = new Hotel("Hotel Luna de Metal","912345678", 8, 16);
	H3.modificarEmpleado1(new Empleados("Andres Riascos Pinzon", "Recepcionista", "812345679", 1500000, 60000, 1440000));
	H3.modificarEmpleado2(new Empleados("Sebastian Lopez Montoya", "Aseador", "712345689", 1500000, 60000, 1440000));
	H3.modificarEmpleado3(new Empleados("Tomas Hernandez Hernandez", "Botones", "612345789", 1500000, 60000, 1440000));
	H3.modificarHab1(new Habitacion(1, "1", 2, 0));
	H3.modificarHab2(new Habitacion(2, "1", 2, 0));
	H3.modificarHab3(new Habitacion(3, "1", 2, 0));
	H3.modificarHab4(new Habitacion(4, "1", 2, 0));
	H3.modificarHab5(new Habitacion(5, "2", 2, 0));
	H3.modificarHab6(new Habitacion(6, "2", 2, 0));
	H3.modificarHab7(new Habitacion(7, "2", 2, 0));
	H3.modificarHab8(new Habitacion(8, "2", 2, 0));
	
	}
	
	//HOTEL
	
	public Hotel darH1() {
		return H1;
	}
	public void modificarH1(Hotel Hot1) {
		H1 = Hot1;
	}
	
	public Hotel darH2() {
		return H2;
	}
	public void modificarH2(Hotel Hot2) {
		H2 = Hot2;
	}
	
	public Hotel darH3() {
		return H3;
	}
	public void modificarH3(Hotel Hot3) {
		H3 = Hot3;
	}
	
	
	
	// INICIALIZAR
	public String darNombre() {
		return nombre;
	}
	
	public void modificarNombre(String elNombre) {
		elNombre = nombre;
	}
	
	public String darNit() {
		return nit;
	}
	
	public void modificarNit(String elNit) {
		elNit = nit;
	}
	
	public double calcularTotalNomina() {
		totalNomina = H1.calcularNomina() + H2.calcularNomina() + H3.calcularNomina();
		return totalNomina;
	}
	
	

}