package modelo;
import java.util.*;

	/** Nombre de la clase: Videojuego<br>
	*Esta clase contiene los valores de los objetos de la lista de productos<br>
	*@author : Angie Valentina Córdoba Pinzón<br>
	*/
	
public class Videojuego{

	//ATRIBUTOS


    private String codigo;
    private String nombre;
    private double precio;
	
	//CONSTRUCTOR
	
	/**Nombre : Videojuego<br>
	*Metodo constructor de la clase Videojuego<br>
	*@param elCodigo : es un atributo de tipo String que contiene el codigo del objeto<br>
	*@param elNombre : es un atributo de tipo String que contiene el nombre del objeto<br>
	*@param elPrecio : es un atributo de tipo double que contiene el precio del objeto<br>
	*<b>post</b>: Se crea un objeto de la clase Videojuego<br>
	*/

    public Videojuego(String elCodigo, String elNombre, double elPrecio) {
		
		codigo = elCodigo;
		nombre = elNombre;
		precio = elPrecio;
		
	}

	//METODOS
	
	/** Nombre: darNombre<br>
	*Metodo que retorna el nombre del objeto<br>
	*<b>pre</b>: El atributo nombre debe ser diferente a null<br>
	*@return un String nombre del objeto<br>
	*/	
	public String darNombre(){
		return nombre;
	}
	
	/** Nombre: darCodigo<br>
	*Metodo que retorna el codigo del objeto<br>
	*<b>pre</b>: El atributo codigo debe ser diferente a null<br>
	*@return un String codigo del objeto<br>
	*/	
	public String darCodigo(){
		return codigo;
	}
	
	/** Nombre: darPre<br>
	*Metodo que retorna el precio del objeto<br>
	*<b>pre</b>: El atributo precio debe ser diferente a null<br>
	*@return un double precio del objeto<br>
	*/
	public double darPrecio(){
		return precio;
	}
	
	/** Nombre: ModificarNombre<br>
	*Metodo que modifica el nombre <br>
	*<b>pre</b>: El atributo nombre debe ser diferente a null<br>
	*<b>post</b>: Se modifica el atributo nombre<br>
	*@param elNombre: un String valido que modificará el valor anterior<br>
	*/
	public void modificarNombre(String elNombre){
		nombre = elNombre;
	}
	
	/** Nombre: ModificarCodigo<br>
	*Metodo que modifica el código <br>
	*<b>pre</b>: El atributo codigo debe ser diferente a null<br>
	*<b>post</b>: Se modifica el atributo codigo<br>
	*@param elCodigo: un String valido que modificará el valor anterior<br>
	*/
	public void modificarCodigo(String elCodigo){
		codigo = elCodigo;
	}

	/** Nombre: ModificarPrecio<br>
	*Metodo que modifica el precio<br>
	*<b>pre</b>: El atributo precio debe ser diferente a null<br>
	*<b>post</b>: Se modifica el atributo precio<br>
	*@param elPrecio: un double valido que modificará el valor anterior<br>
	*/
	public void modificarPrecio(double elPrecio){
		precio = elPrecio;
	}
}