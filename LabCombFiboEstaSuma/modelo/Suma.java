package modelo;


public class Suma {

	//ATRIBUTOS 

	private int numero;
	private int suma;

	//CONSTRUCTOR
	public Suma(int num){
		numero = num;
	}

public int calcularSuma() {

int suma = 0;

if( numero % 2 == 0) {
	
	
	while(numero<98){
	
		numero += 2;
		
		suma = numero + suma;
	}
	
	}
	else{ 
	
	numero++;
	
	while(numero<100) {
		
		suma = numero + suma;
		
		numero +=2;
	}
}

	return suma;
}
		
 }