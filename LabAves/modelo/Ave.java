package modelo;
import java.util.ArrayList;

public class Ave{
	
	private Neornithe neornithe;
	
	protected String color;
	protected double altura;
	protected double peso;
	
	
	public Ave ( String col, double alt, double pes){
		color = col;
		altura = alt;
		peso = pes;
	}	
	
	public Neornithe darNeornithe(){
		return neornithe;
	}
	
	public String darColor(){
		return color;
	}
	
	public double darAltura(){
		return altura;
	}
	
	public double darPeso(){
		return peso;
	}
	
	public void modificarColor(String col){
		color = col;
	}
	
	public void modificarAltura(double alt){
		altura = alt;
	}
	
	public void modificarPeso(double pes){
		peso = pes;
	}
	

	public double calcularPromedioPesoAve(){
		double peso = 0;
		
		peso = neornithe.calcularPromedioPesoAve();
		
		return peso;
	}
		
	public double calcularSumaAltura(){
		double suma = 0;
		suma = neornithe.calcularSumaAltura();
		return suma;		
	}	
	
	public int calcularTotalBajo(){
		int bajo = 0; 
		
		bajo = neornithe.calcularTotalBajo();
		
		return bajo;
	}
	
	public int calcularTotalMedio(){
		int medio = 0; 
		
		medio = neornithe.calcularTotalMedio();
		
		return medio;
	}
	
	public int calcularTotalAlto(){
		int alto = 0; 
		
		alto = neornithe.calcularTotalAlto();
		
		return alto;
	}
	
		
}