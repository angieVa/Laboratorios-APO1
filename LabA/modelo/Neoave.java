package modelo;

/**
*@Author: Angie Valentina Cordoba Pinzon
*Fecha: 20/11/2017
*Clase que contiene los valores de un ave Neoave
*/


public class Neoave extends Neognato implements MetodosAvesVoladoras{
	
	
	
	protected double longitudPatas;
	protected int numeroDedosPorPata;
	protected double alturaMaxVuelo;
	protected double velPromVuelo;
	protected boolean esMigratorio;
	
	public Neoave (String nom, String col, double alt, double pes, char ranM, double longC, double densO, int numHEP, double longTD, double longP, int numD){
		super(nom,  col, alt, pes, ranM, longC,  densO, numHEP,  longTD);
		longitudPatas = longP;
		numeroDedosPorPata = numD;
		alturaMaxVuelo = 0;
		velPromVuelo = 0;
	}
	
	
	
	public double darLongitudPatas(){
		return longitudPatas;
	}
	
	public int darNumeroDedosPorPata(){
		return numeroDedosPorPata;
	}
	
	public void modificarLongitudPatas( double longP){
		longitudPatas = longP;
	}
	
	public void modificarNumeroDedosPorPata(int numD){
		numeroDedosPorPata = numD;
	}
	
	public double calcularAlturaMaxVuelo(){
		alturaMaxVuelo = (altura*(numeroHuesosEnPatas/100));
		return alturaMaxVuelo;
	}
	
	public double calcularVelPromedio(){
		velPromVuelo = (densidadOsea*(longitudTercerDedo/100));
		return velPromVuelo;
	}
	
	/**@Overload 
	*/
	public boolean esMigratoria(){
		if ( rangoMetabolico == 'M' && velPromVuelo < 100 ){
			esMigratorio = true;
		}
		return esMigratorio;
	}

	
	/**@Override
	*/
	public String toString(){
		return super.toString() + "\n" + "Longitud de las patas: " + longitudPatas + "\n" + "Numero de dedos por pata: " + numeroDedosPorPata +"\n" + "Altura maxima de vuelo: " + calcularAlturaMaxVuelo() + "\n" + "Velocidad promedio de vuelo: " + calcularVelPromedio() + "\n" + "Migratoria: " + esMigratoria();
	}
	
}