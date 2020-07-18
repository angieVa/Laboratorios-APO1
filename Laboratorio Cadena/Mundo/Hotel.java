package Mundo;

public class Hotel {

	//Atributos
	private String nombre;
	private int CantidadDeHabitaciones;
	private int CapacidadTotal;
	private String nit;
	private double nomina;
	
	//Relaciones 
	private Habitacion Hab1;
	private Habitacion Hab2;
	private Habitacion Hab3;
	private Habitacion Hab4;
	private Habitacion Hab5;
	private Habitacion Hab6;
	private Habitacion Hab7;
	private Habitacion Hab8;
	private Empleados empleado1;
	private Empleados empleado2;
	private Empleados empleado3;
	
	
	
	//Constructor
	

	public Hotel(String elNombre, String elNit, int cantHab, int capTotal) {
	
	nombre = elNombre; 
	CantidadDeHabitaciones = cantHab;
	CapacidadTotal = capTotal;
	nit = elNit;
	nomina = 0;
	
	}
	
	//INICIALIZAR
	
	public String darNombre() {
		return nombre;
	}
	
	public void modificarNombre(String elNombre) {
		elNombre = nombre;
	}
	
	public int darCantidadDeHabitaciones() {
		return CantidadDeHabitaciones;
	}
	
	public void modificarCanHabitaciones(int cantHab) {
		cantHab = CantidadDeHabitaciones;
	}
	
	public int darCapacidadTotal() {
		return CapacidadTotal;
	}
	
	public void modificarCapacidadTotal(int capTotal) {
		capTotal = CapacidadTotal;
	}
	
	//EMPLEADOS
	
	public Empleados darEmpleado1() {
		return empleado1;
	}
	public void modificarEmpleado1(Empleados Emp1) {
		empleado1 = Emp1;
	}
	
	public Empleados darEmpleado2() {
		return empleado2;
	}
	public void modificarEmpleado2(Empleados Emp2) {
		empleado2 = Emp2;
	}
	
	public Empleados darEmplado3() {
		return empleado3;
	}
	public void modificarEmpleado3(Empleados Emp3) {
		empleado3 = Emp3;
	}
	
	// HABITACIONES
	public Habitacion darHab1() {
		return Hab1;
	}
	public void modificarHab1(Habitacion Habita1){
		Hab1 = Habita1;
	}
	
	public Habitacion darHab2() {
		return Hab2;
	}
	public void modificarHab2(Habitacion Habita2) {
		Hab2 = Habita2;
	}
	
	public Habitacion darHab3() {
		return Hab3;
	}
	public void modificarHab3(Habitacion Habita3) {
		Hab3 = Habita3;
	}
	
	public Habitacion darHab4() {
		return Hab4;
	}
	public void modificarHab4(Habitacion Habita4) {
		Hab4 = Habita4;
	}
	
	public Habitacion darHab5() {
		return Hab5;
	}
	public void modificarHab5(Habitacion Habita5) {
		Hab5 = Habita5;
	}
	
	public Habitacion darHab6() {
		return Hab6;
	}
	public void modificarHab6(Habitacion Habita6) {
		Hab6 = Habita6;
	}
	
	public Habitacion darHab7() {
		return Hab7;
	}
	public void modificarHab7(Habitacion Habita7) {
		Hab7 = Habita7;
	}
	
	public Habitacion darHab8() {
		return Hab8;
	}
	public void modificarHab8(Habitacion Habita8) {
		Hab8 = Habita8;
	}
	
	
	//NOMINA
	public double calcularNomina() {
		nomina =(empleado1.calcularSalarioNeto() + empleado2.calcularSalarioNeto() + empleado3.calcularSalarioNeto());
		return nomina;
	}
	
}