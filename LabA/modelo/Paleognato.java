package modelo;

/**
*@Author: Angie Valentina Cordoba Pinzon
*Fecha: 20/11/2017
*Clase que contiene los valores de un ave Paleognato
*/

public class Paleognato extends Neornithe{
	
	
	
	protected int numHuesosEnPaladar;
	
	public Paleognato (String nom, String col, double alt, double pes, char ranM, double longC, double densO, int numH ){
		super(nom, col, alt, pes, ranM, longC, densO);
		numHuesosEnPaladar = numH;
	}
	

	
	public int darNumHuesosEnPaladar(){
		return numHuesosEnPaladar;
	}
	
	public void modificarNumHuesosEnPaladar (int numH ){
		numHuesosEnPaladar = numH;
	}
	
	
	/**@Override
	*/
	public String toString(){
		return super.toString() + "\n" + "Numero de huesos en paladar: " + 	numHuesosEnPaladar;
	}
	
}