package modelo;

public class Passeriforme extends Neoave{
	
	private Neoave neoave;
	
	private String acordesCanto;
	private String acordesReclamo;
	
	public Passeriforme (String col, double alt, double pes,double longC, double densO, char ranM, int numHEP, double longTD, double longP, int numD, String aC, String aR){
		super( col, alt, pes, longC,  densO,  ranM,  numHEP,  longTD,  longP,  numD);
		acordesCanto = aC;
		acordesReclamo = aR;
	}
	
	public String darAcordesCanto(){
		String acordeCanto = "";
		if ( longitudPatas > 5 ){
			acordeCanto = "Los acordes de canto son: "+ acordesCanto;
		}
		else {
			acordeCanto = "No se pueden consultar los acordes.";
		}
		return acordeCanto;
	}
	
	public String darAcordesReclamo (){
		String acordeReclamo = "No hay acordes";
		if ( numeroDedosPorPata > 3 ){
		 acordeReclamo = "Los acordes de reclamo son: "+ acordesReclamo;
		}
		else {
			acordeReclamo = "No se pueden consultar los acordes.";
		}
		return acordeReclamo;
	}
	
	public boolean esMigratoria(){
		if ( rangoMetabolico == 'M' && velPromVuelo < 100 ){
			esMigratorio = true;
		}
		return esMigratorio;
	}
}