package modelo;
import java.util.ArrayList;

/**
*@Author: Angie Valentina Cordoba Pinzon
*Fecha: 20/11/2017
*Clase que contiene los valores de un ave 
*/


public class Ave{
	
	protected final char RANGO_METABOLICO_ALTO = 'A';
	protected final char RANGO_METABOLICO_MEDIO = 'M';
	protected final char RANGO_METABOLICO_BAJO = 'B';
	
	protected String nombre;
	protected String color;
	protected double altura;
	protected double peso;
	protected char rangoMetabolico;
	
	
	public Ave (String nom, String col, double alt, double pes, char ranM){
		nombre = nom;
		color = col;
		altura = alt;
		peso = pes;
		rangoMetabolico = ranM;
	}	

	public String darNombre(){
		return nombre;
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
	
	public char darRangoMetabolico(){
		return rangoMetabolico;
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
	

	public String toString(){
		return "Nombre: " + nombre + "\n" + "Color: " + color + "\n" + "Altura: " + altura + "\n" + "Peso: " + peso + "\n" + "Rango metabolico: " + rangoMetabolico;
	}
		
}