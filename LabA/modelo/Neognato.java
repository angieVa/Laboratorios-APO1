package modelo;

/**
*@Author: Angie Valentina Cordoba Pinzon
*Fecha: 20/11/2017
*Clase que contiene los valores de un ave Neognato
*/


public class Neognato extends Neornithe{
	
	
	
	protected int numeroHuesosEnPatas;
	protected double longitudTercerDedo;

	
	public Neognato(String nom, String col, double alt, double pes, char ranM, double longC, double densO, int numHEP, double longTD){
		super(nom, col, alt, pes, ranM, longC, densO);
		numeroHuesosEnPatas = numHEP;
		longitudTercerDedo = longTD;
		
	}
	
	
	public int darNumeroHuesosEnPatas(){
		return numeroHuesosEnPatas;
	}
	
	public double darLongitudTercerDedo(){
		return longitudTercerDedo;
	}
	
	
	public void modificarNumeroHuesosEnPatas(int numHEP){
		numeroHuesosEnPatas = numHEP;
	}
	
	public void modificarLongitudTercerDedo(double longTD){
		longitudTercerDedo = longTD;
	}
	
	
	/**@Override
	*/
	public String toString(){
		return super.toString() + "\n" + "Numero de huesos en patas: " + numeroHuesosEnPatas + "\n" + "Longitud del tercer dedo: " +longitudTercerDedo;
	}
}