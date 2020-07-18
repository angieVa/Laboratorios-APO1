package modelo;

public class Neoave extends Neognato implements Interfaz{
	
	private Passeriforme passeriforme;
	
	protected double longitudPatas;
	protected int numeroDedosPorPata;
	protected double alturaMaxVuelo;
	protected double velPromVuelo;
	protected boolean esMigratorio;
	
	public Neoave (String col, double alt, double pes, double longC, double densO, char ranM, int numHEP, double longTD, double longP, int numD){
		super( col, alt, pes, longC,  densO,  ranM,  numHEP,  longTD);
		longitudPatas = longP;
		numeroDedosPorPata = numD;
		alturaMaxVuelo = 0;
		velPromVuelo = 0;
	}
	
	public Passeriforme darPasseriforme(){
		return passeriforme;
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
	public double calcularPromedioPesoAve(){
		double peso = 0;
		
		if(passeriforme != null){
			
			peso = passeriforme.darPeso();
		}
		return peso;
	}
	
	/**@Override
	*/
	public double calcularSumaAltura(){
		double suma = 0;
		
		if(passeriforme != null){
			suma = passeriforme.darAltura();
		}
		
		return suma;
	}
	
	/**@Override
	*/
	
	public int calcularTotalBajo(){
		int bajo = 0;
			if(passeriforme != null && passeriforme.darRangoMetabolico() == 'B'){
				bajo++;
			}
			return bajo;
	}
	/**@Override
	*/
	public int calcularTotalMedio(){
		int medio = 0;
			if(passeriforme != null && passeriforme.darRangoMetabolico() == 'M'){
				medio++;
			}
			return medio;
	}
	/**@Override
	*/
	public int calcularTotalAlto(){
		int alto = 0;
			if(passeriforme != null && passeriforme.darRangoMetabolico() == 'A'){
				alto++;
			}
			return alto;
	}
	
	public String toString(){
		
		return "neoave: " + longitudPatas + "vel" + velPromVuelo;
	}
	
	
}