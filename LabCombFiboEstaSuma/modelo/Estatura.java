package modelo;

public class Estatura {

	//CONSTANTE
	public final static int TOTAL_EST= 24;
	
	//ATRIBUTOS
	private double promedio;
	private int estMayores;
	private int estMenores;

	//ARREGLO

	private double[] estatura;
	
	//INICIALIZAR ARREGLOS
	
	public Estatura() {
	estatura = new double[ TOTAL_EST ];
	
	estatura [0] = 1.65;
	estatura [1] = 1.70;
	estatura [2] = 1.57;
	estatura [3] = 1.69;
	estatura [4] = 1.78;
	estatura [5] = 1.86;
	estatura [6] = 1.59;
	estatura [7] = 1.87;
	estatura [8] = 1.62;
	estatura [9] = 1.89;
	estatura [10] = 1.78;
	estatura [11] = 1.68;
	estatura [12] = 1.76;
	estatura [13] = 1.52;
	estatura [14] = 1.55;
	estatura [15] = 1.52;
	estatura [16] = 1.75;
	estatura [17] = 1.65;
	estatura [18] = 1.89;
	estatura [19] = 1.80;
	estatura [20] = 1.90;
	estatura [21] = 1.76;
	estatura [22] = 1.57;
	estatura [23] = 1.55;
		
}

		
		//Requerimientos
		
	public double calcularPromedio() {
		
		for(int indice = 0; indice < TOTAL_EST; indice++){
		
		promedio = estatura[ indice ] + promedio;
	}
		
		promedio = promedio / TOTAL_EST;	
		
 		return promedio;
		
	}	
	
	public double calcularMayores() {
	
	for(int indice = 0; indice < TOTAL_EST; indice++)
		
		if(estatura[ indice ] > promedio){
		estMayores = estMayores + 1;
		}
		return estMayores;
	}
	
	public double calcularEstMayores() {
		
		for(int indice = 0; indice < TOTAL_EST; indice++)
		
		if(estatura[ indice ] > promedio){
		estMayores = estMayores + 1;
		}
		return estMayores;
	}
	
	public double calcularEstMenores() {

	for(int indice = 0; indice < TOTAL_EST; indice++)
		
		if(estatura[ indice ] < promedio){
		estMenores = estMenores + 1;
		}
		return estMenores;
	}
}
	
		
	
		
		
		
		
		

	
