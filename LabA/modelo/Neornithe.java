package modelo;

/**
*@Author: Angie Valentina Cordoba Pinzon
*Fecha: 20/11/2017
*Esta clase es la mas grande de las clasificaciones de las aves, a partir de esta clase se desprenden otras subclases <br>
*/


public class Neornithe extends Ave{
	
	protected double longitudCola;
	protected double densidadOsea;
	
	
	public Neornithe (String nom, String col, double alt, double pes, char ranM, double longC, double densO){
		super(nom, col, alt, pes, ranM );
		longitudCola = longC;
		densidadOsea = densO;
		
	}
	

	public double darLongitudCola(){
		return longitudCola;
	}
	
	public double darDensidadOsea(){
		return densidadOsea;
	}
	
	public void modificarLongitudCola(double longC){
		longitudCola = longC;
	}
	
	public void modificarDensidadOsea(double densO){
		densidadOsea = densO;
	}
	
	
	
	/**@Override
	*/
	public String toString(){
		return super.toString() + "\n" + "Longitud de la cola: " + longitudCola + "\n" + "Densidad osea: " + densidadOsea;
	}
		
}	