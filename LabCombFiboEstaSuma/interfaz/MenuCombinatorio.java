package interfaz;
import modelo.Combinatorio;
import java.util.Scanner;


public class MenuCombinatorio{

	public static void main(String[] args){
		
	Combinatorio Menu;
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Ingrese el primer numero: ");
	int num1 = entrada.nextInt();
	System.out.println("Ingrese el segundo numero: ");
	int num2 = entrada.nextInt();
	
	Menu = new Combinatorio(num1, num2);
	
	System.out.println("El combinatorio es: " + Menu.calcularCombinatorio());
	
}

}