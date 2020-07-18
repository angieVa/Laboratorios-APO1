package modelo;

/**
*@Author: Angie Valentina Cordoba Pinzon
*Fecha: 20/11/2017
*Clase que contiene los valores de un ave Tiramue
*/


public class Tiramue extends Paleognato implements MetodosAvesVoladoras {


	public final int ESPECIES_IDENTIFICADAS = 47;
	protected boolean esMigratorio;
	protected double velPromVuelo;
	protected double alturaMaxVuelo;
	private double velEnTierra;
	
	public Tiramue (String nom, String col, double alt, double pes, char ranM, double longC, double densO, int numH, double velET ){	
	super(nom, col, alt, pes, ranM, longC,  densO,  numH);
	velEnTierra = velET;
	alturaMaxVuelo = 0;
	velPromVuelo = 0;
	esMigratorio = false;
	}
	
	public double darVelEnTierra (){
		return velEnTierra;
	}
	
	public void modificarVelEnTierra (double velET ){
		velEnTierra = velET;
	}
	
	public double calcularAlturaMaxVuelo(){
		
		alturaMaxVuelo = (altura*(numHuesosEnPaladar/1000));
		return alturaMaxVuelo;
	}
	
	public double calcularVelPromedio(){
		velPromVuelo = (longitudCola*(velEnTierra/100));
		return velPromVuelo;
	}
	
	/**@Overload 
	*/
	public boolean esMigratoria(){
		if ( rangoMetabolico == 'B' && velPromVuelo > 100 ){
			esMigratorio = true;
		}
		return esMigratorio;
	}
	
	/**@Override
	*/
	public String toString(){
		return super.toString() + "\n" + "Migratoria: " + esMigratoria() + "\n" + "Velocidad en tierra: " + velEnTierra +  "\n" + "Velocidad promdeio de vuelo: " + calcularVelPromedio() + "\n" + "Altura maxima de vuelo: " + calcularAlturaMaxVuelo();
	}
	
}