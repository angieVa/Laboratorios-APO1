package modelo;

public class Paleognato extends Neornithe{
	
	private Ratite ratite;
	private Tiramue tiramue;
	
	protected int numHuesosEnPaladar;
	
	public Paleognato (String col, double alt, double pes, double longC, double densO, char ranM, int numH ){
		super(col, alt, pes, longC, densO, ranM);
		numHuesosEnPaladar = numH;
	}
	
	public Ratite darRatite(){
		return ratite;
	}
	
	public Tiramue darTiramue(){
		return tiramue;
	}
	
	public int darNumHuesosEnPaladar(){
		return numHuesosEnPaladar;
	}
	
	public void modificarNumHuesosEnPaladar (int numH ){
		numHuesosEnPaladar = numH;
	}
	
	/**@Override
	*/
	public double calcularPromedioPesoAve(){
		double peso = 0;
		
		if(tiramue != null){
			peso = tiramue.darPeso();
		}
		if(ratite != null) {
			peso += ratite.darPeso();
		}
		
		return peso;
	}
	
	/**@Override
	*/
	public double calcularSumaAltura(){	
		double suma = 0;
		
		if(tiramue != null){
			suma = tiramue.darAltura();
		}
		if(ratite != null) {
			suma += ratite.darAltura();
		}
		return suma; 
	}
	
	/**@Override
	*/
	public int calcularTotalBajo(){
		int bajo = 0;
			if(tiramue != null && tiramue.darRangoMetabolico() == 'B'){
				bajo++;
			}
			
			if(ratite != null && ratite.darRangoMetabolico() == 'B'){
				bajo++;
			}
			
			return bajo;
	}
	/**@Override
	*/
	public int calcularTotalMedio(){
		int medio = 0;
			if(tiramue != null && tiramue.darRangoMetabolico() == 'M'){
				medio++;
			}
			
			if(ratite != null && ratite.darRangoMetabolico() == 'M'){
				medio++;
			}
			
			return medio;
	}
	/**@Override
	*/
	public int calcularTotalAlto(){
		int alto = 0;
			if(tiramue != null && tiramue.darRangoMetabolico() == 'A'){
				alto++;
			}
			
			if(ratite != null && ratite.darRangoMetabolico() == 'A'){
				alto++;
			}
			
			return alto;
	}

	
}