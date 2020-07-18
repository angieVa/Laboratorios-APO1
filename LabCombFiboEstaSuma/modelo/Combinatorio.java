package modelo;

public class Combinatorio {

	
	private int numero1;
	private int numero2;
	
	public Combinatorio(int num1, int num2) {
	
	numero1 = num1;
	numero2 = num2;
	
	}
	
	public int calcularCombinatorio(){
		
		int fact1 = 1;
		int fact2 = 1;
		int fact3 = 1;
		int restaFact = 0;
		int combinatorio = 0;
		
		if(numero1 >= numero2){	
		
		restaFact = numero1 - numero2;
		
		while(numero1 > 0) {
		
			fact1 = fact1 * numero1;
			numero1--;
			}
			
			while(numero2 > 0) {
		
			fact2 = fact2 * numero2;
			numero2--;
			}
		
			while(restaFact > 0){
			
			fact3 = fact3 * restaFact;
			restaFact--;
			}
			
			combinatorio = fact1 / (fact3 * fact2);
			
		}
		else if(numero1 < numero2){
			
			System.out.println("el primer numero tiene que ser mayor");
		}
		
		return combinatorio;
		
}

}