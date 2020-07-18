package modelo;

public class Neognato extends Neornithe{
	
	private Galloanserae galloanserae;
	private Neoave neoave;
	
	protected int numeroHuesosEnPatas;
	protected double longitudTercerDedo;

	
	public Neognato(String col, double alt, double pes, double longC, double densO, char ranM, int numHEP, double longTD){
		super(col, alt, pes, longC, densO, ranM);
		numeroHuesosEnPatas = numHEP;
		longitudTercerDedo = longTD;
		
	}
	public Galloanserae darGalloanserae(){
		return galloanserae;
	}
	
	public Neoave darNeoave(){
		return neoave;
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
	public double calcularPromedioPesoAve(){
		double peso = 0;
		
		peso = neoave.darPeso() + neoave.calcularPromedioPesoAve();

		if(galloanserae != null){
			peso += galloanserae.darPeso();
		}
		
		return peso;
	}
		
	/**@Override
	*/
	
	public double calcularSumaAltura(){	
		double suma = 0;
		
		suma = neoave.darAltura() + neoave.calcularSumaAltura();
		
		if(galloanserae != null){
			suma += galloanserae.darAltura();
		}
		
		return suma;
	}
	
	/**@Override
	*/
	public int calcularTotalBajo(){
		int bajo = 0;
			if( neoave.darRangoMetabolico() == 'B'){
				bajo++;
			}
			
			bajo += neoave.calcularTotalBajo();
			
			if(galloanserae != null && galloanserae.darRangoMetabolico() == 'B'){
				bajo++;
			}
			
			return bajo;
	}
	/**@Override
	*/
	public int calcularTotalMedio(){
		int medio = 0;
			if( neoave.darRangoMetabolico() == 'M'){
				medio++;
			}
			
			medio += neoave.calcularTotalMedio();
			
			if(galloanserae != null && galloanserae.darRangoMetabolico() == 'M'){
				medio++;
			}
			
			return medio;
	}
	/**@Override
	*/
	public int calcularTotalAlto(){
		int alto = 0;
			if( neoave.darRangoMetabolico() == 'A'){
				alto++;
			}
			
			alto += neoave.calcularTotalAlto();
			
			if(galloanserae != null && galloanserae.darRangoMetabolico() == 'A'){
				alto++;
			}
			
			return alto;
	}
	
}