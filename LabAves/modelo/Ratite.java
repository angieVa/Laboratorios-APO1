package modelo;

public class Ratite extends Paleognato {
	
	
	private boolean tieneQuilla;
	
	public Ratite (String col, double alt, double pes, double longC, double densO, char ranM, int numH, boolean tQ ){
		super(col, alt, pes, longC,  densO,  ranM,  numH);
		tieneQuilla = tQ;
	}
	
	public boolean darTieneQuilla(){
		return tieneQuilla;
	}
	
	public void modificarTieneQuilla (boolean tQ){
		tieneQuilla = tQ;
	}
	
	
}