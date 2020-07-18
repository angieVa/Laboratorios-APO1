package modelo;

public class Tiramue extends Paleognato implements Interfaz {


	public final int ESPECIES_IDENTIFICADAS = 47;
	protected boolean esMigratorio;
	protected double velPromVuelo;
	protected double alturaMaxVuelo;
	private double velEnTierra;
	
	public Tiramue (String col, double alt, double pes, double longC, double densO, char ranM, int numH, double velET ){	
	super( col, alt, pes, longC,  densO,  ranM,  numH);
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
	
}