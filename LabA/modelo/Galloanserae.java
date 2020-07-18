package modelo;

/**
*@Author: Angie Valentina Cordoba Pinzon
*Fecha: 20/11/2017
*Clase que contiene los valores de un ave Galloanserae
*/


public class Galloanserae extends Neognato{
	
	
	public final char MONOGAMA = 'O';
	public final char POLIGAMA = 'P';
	public final char ES_DOMESTICA = 'D';
	public final char ES_DE_CAZA = 'C';
	private char tipoAve;
	private char tipoReproduccion;
	
	public Galloanserae (String nom, String col, double alt, double pes, char ranM, double longC, double densO, int numHEP, double longTD, char tA, char mP){
		super(nom, col, alt, pes, ranM, longC,  densO, numHEP,  longTD );
		tipoAve = tA;
		tipoReproduccion = mP;
	
		
	}
	
	public char darTipoAve(){
		return tipoAve;
	}
	
	public char darTipoReproduccion(){
		return tipoReproduccion;
	}
	
	public void modificarTipoAve (char tA ){	
		tipoAve = tA;
	}
	
	public void modificarTipoReproduccion (char mP ){
		tipoReproduccion = mP;
	}
	
	/**@Override
	*/
	public String toString(){
		return super.toString() + "\n" + "Tipo de ave: " + tipoAve + " \n" + "Tipo de reproduccion: " + tipoReproduccion;
	}
	
}