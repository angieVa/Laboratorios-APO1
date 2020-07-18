package modelo;

/**
*@Author: Angie Valentina Cordoba Pinzon
*Fecha: 20/11/2017
*Clase que contiene los valores de un ave Passeriforme
*/

public class Passeriforme extends Neoave{
	
	private Neoave neoave;
	
	/**
	*Atributo que representa los acordes de canto
	*/
	private String acordesCanto;
	/**
	*Atributo que representa los acordes de reclamo
	*/
	private String acordesReclamo;

	/**
	*Metodo constructor de la clase Passeriforme
	*@param String nom : es el nombre del ave
	*@param String col : es el color del ave
	*@param double alt : es la altura del ave
	*@param double pes : es el peso del ave
	*@param char ranM : es el rango metabolico del ave
	*@param double longC : es la longitud de la cola del ave
	*@param double densO : es la densidad osea del ave
	*@param int numHEP : son los numeros de huesos en paladar
	*@param double longTD : es la longitud del tercer dedo del ave
	*@param double longP : es la longitud de las patas del ave
	*@param int numD : es el numero de dedos por pata del ave
	*@param String aC : son los acordes de canto del ave
	*@param String aR : son los acordes de reclamo del ave
	*Post: Se creo un objeto de la clase Passeriforme
	*/
	public Passeriforme (String nom, String col, double alt, double pes, char ranM, double longC, double densO, int numHEP, double longTD, double longP, int numD, String aC, String aR){
		super(nom, col, alt, pes, ranM, longC,  densO, numHEP,  longTD,  longP,  numD);
		acordesCanto = aC;
		acordesReclamo = aR;
	}
	
	/** 
	*Nombre : darAcordesCanto
	*Metodo que retorna los acordes de canto
	*Pre : la longitud de patas debe ser mayor a 5 
	*@return los acordes de canto del ave
	*/
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
	/** 
	*Nombre : darAcordesReclamo
	*Metodo que retorna los acordes de reclamo
	*Pre : el numero de dedos por pata debe ser mayor a 3
	*@return los acordes de reclamo del ave
	*/
	public String darAcordesReclamo(){
		String acordeReclamo = "No hay acordes";
		if ( numeroDedosPorPata > 3 ){
		 acordeReclamo = "Los acordes de reclamo son: "+ acordesReclamo;
		}
		else {
			acordeReclamo = "No se pueden consultar los acordes.";
		}
		return acordeReclamo;
	}
	
	/**@Override
	*Este métood permite calcular si el ave es migratoria o no <br>
	*pre : los atributos deben estar inicializados <br>
	* @return un boolean diciendo si el ave es migratoria o no 
	*/
	public boolean esMigratoria(){
		if ( rangoMetabolico == 'M' && velPromVuelo < 100 ){
			esMigratorio = true;
		}
		return esMigratorio;
	}
	
	/**@Override
	*Metodo que retorna la informacion del ave
	*/
	public String toString(){
		return super.toString() + "\n" + "Acordes de canto: " + darAcordesCanto() + " \n" + "Acordes de reclamo: " + darAcordesReclamo();
	}
}