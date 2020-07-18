package modelo;

public class Galloanserae extends Neognato{
	
	
	public final char MONOGAMA = 'O';
	public final char POLIGAMA = 'P';
	public final char ES_DOMESTICA = 'D';
	public final char ES_DE_CAZA = 'C';
	private char tipoAve;
	private char tipoReproduccion;
	
	public Galloanserae (String col, double alt, double pes, double longC, double densO, char ranM, int numHEP, double longTD, char tA, char mP){
		super( col, alt, pes, longC,  densO,  ranM,  numHEP,  longTD );
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
	
}