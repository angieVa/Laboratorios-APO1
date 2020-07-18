package modelo;

/**
*@Author: Angie Valentina Cordoba Pinzon
*Fecha: 20/11/2017
*Clase que contiene los valores de un ave Ratite
*/

public class Ratite extends Paleognato {
	
	/**
	Atributo boolean que define si el ave tiene quilla
	*/
	private boolean tieneQuilla;
	
	/**
	*Constructor de la clase Ratite
	*@param String nom que representa el nombre del ave
	*@param String col que representa el color del ave
	*@param double alt que representa la altura del ave
	*@param double pes que representa el peso del ave
	*@param double longC que representa la longitud de la cola del ave
	*@param double densO que representa la densidad osea del ave
	*@param char ranM que representa el rango metabolico
	*@param int numH que representa el numero de huesos del ave
	*@param boolean tQ que representa si el ave tiene quilla o nom
	*pos: Se creo un objeto de la case ratite
	*/
	public Ratite (String nom, String col, double alt, double pes, char ranM, double longC, double densO, int numH, boolean tQ ){
		super(nom, col, alt, pes, ranM, longC,  densO,  numH);
		tieneQuilla = tQ;
	}
	
	/**
	*metodo dar que devuelve si el ave tiene quilla
	*pre: el atributo debe estar definido
	*@return boolean que define si el ave tiene quilla o no 
	*/
	public boolean darTieneQuilla(){
		return tieneQuilla;
	}
	/**
	*metodo modificar que modifica el valor de quilla del ave
	*pre: el atributo debe estar definido
	*@param boolean tQ que representa si el ave tiene quilla o no
	*/
	public void modificarTieneQuilla (boolean tQ){
		tieneQuilla = tQ;
	}
	
	/**
	Este metodo retorna la informacion del ave
	@Override
	*/
	public String toString(){
		return super.toString() + "\n" + "Quilla: " + tieneQuilla; 
	}
	
	
}