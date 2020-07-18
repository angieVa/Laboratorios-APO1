package modelo;

public class Neornithe extends Ave{
	
	private Neognato neognato;
	private Paleognato paleognato;
	
	protected final char RANGO_METABOLICO_ALTO = 'A';
	protected final char RANGO_METABOLICO_MEDIO = 'M';
	protected final char RANGO_METABOLICO_BAJO = 'B';
	protected double longitudCola;
	protected double densidadOsea;
	protected char rangoMetabolico;
	
	public Neornithe ( String col, double alt, double pes, double longC, double densO, char ranM){
		super( col, alt, pes );
		longitudCola = longC;
		densidadOsea = densO;
		rangoMetabolico = ranM;
	}
	
	public Neognato darNeognato(){
		return neognato;
	}
	
	public Paleognato darPaleognato(){
		return paleognato;
	}
	
	public double darLongitudCola(){
		return longitudCola;
	}
	
	public double darDensidadOsea(){
		return densidadOsea;
	}
	
	public char darRangoMetabolico(){
		return rangoMetabolico;
	}
	
	public void modificarLongitudCola(double longC){
		longitudCola = longC;
	}
	
	public void modificarDensidadOsea(double densO){
		densidadOsea = densO;
	}
	
	/**@Override
	*/
		
	public double calcularPromedioPesoAve(){
		double peso = 0;
	
			peso = neognato.calcularPromedioPesoAve();
			peso += paleognato.calcularPromedioPesoAve();
		return peso;
	}
	
	/**@Override
	*/
	public double calcularSumaAltura(){	
		double suma = 0;
			suma = neognato.calcularSumaAltura();
			suma += paleognato.calcularSumaAltura();

		return suma;
	}
	
	/**@Override
	*/
	public int calcularTotalBajo(){
		int bajo = 0;
			
			bajo = neognato.calcularTotalBajo();
			bajo += paleognato.calcularTotalBajo();
			
			return bajo;
	}
	/**@Override
	*/
	public int calcularTotalMedio(){
		int medio = 0;
		
			medio = neognato.calcularTotalMedio();
			medio += paleognato.calcularTotalMedio();
			
			return medio;
	}
	/**@Override
	*/
	public int calcularTotalAlto(){
		int alto = 0;
			
			alto = neognato.calcularTotalAlto();
			alto += paleognato.calcularTotalAlto();
			
			return alto;
	}
		
}	