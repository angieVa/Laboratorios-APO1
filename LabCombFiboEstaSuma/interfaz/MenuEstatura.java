package interfaz;
import modelo.Estatura;

public class MenuEstatura {
	

	public static void main(String [] args) {
		
	Estatura Estatu;
	Estatu = new Estatura();
		

	System.out.println("El promedio de la estatura es " + Estatu.calcularPromedio());
	System.out.println("Cantidad de estudiantes con estatura mayor al promedio " + Estatu.calcularEstMayores());
	System.out.println("Cantidad de estudiantes con estatura menor al promedio " + Estatu.calcularEstMenores());

	}
	
}