package interfaz;
import modelo.Suma;
import java.util.Scanner;
	
	public class MenuSuma{

	public static void main(String[] args){
		
	Suma Menu;
		
	Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero: ");
		int num = entrada.nextInt();
		Menu = new Suma(num);

		System.out.println("La suma es: " + Menu.calcularSuma());
 
}

}