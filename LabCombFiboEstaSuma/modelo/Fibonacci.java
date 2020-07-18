package modelo;

public class Fibonacci {

private int suma;
	
	public Fibonacci(){
		suma = 1;
	
	}

public static void main (String[] args) 
	{
	
	
	//VARIABLES  

	int num = 1;
	int cero = 0;
	int suma = 1;
	int modulo = 0;
	//CICLO
	
	System.out.println(" " + cero + "*");
	System.out.println(" " + num);
	
	while(suma < 50) {
		
		
		if(suma % 2 == 0){
	
		System.out.println(" " + suma + "*");
		
		}else{
		
		System.out.println(" " + suma);
		}
		
		suma = num + suma;
		num = suma - num;
	}
}	
}