package modelo;
import java.util.*;

	/** Nombre de la clase: Carrito<br>
	*Esta clase contiene los valores de los objetos de la lista de compra del cliente<br>
	*@author : Angie Valentina Córdoba Pinzón<br>
	*/
	
public class Carrito {
	
	//ATRIBUTOS
	
	private String codigo;
	private String nombre;
	private double precio;
	private int cantidad;
	
	//CONSTRUCTOR
	
	/**Nombre : Carrito <br>
	*Metodo constructor de la clase Carrito<br>
	*@param elCodi : es un atributo de tipo String que contiene el codigo del objeto<br>
	*@param elNom : es un atributo de tipo String que contiene el nombre del objeto<br>
	*@param elPre : es un atributo de tipo double que contiene el precio del objeto<br>
	*@param cant  : es un atributo de tipo int que contiene la cantidad de productos pedidos<br>
	*<b>post</b>: Se crea un objeto de la clase Carrito<br>
	*/
	
	public Carrito (String elCodi, String elNom, double elPre, int cant){
		codigo = elCodi;
		nombre = elNom;
		precio = elPre;
		cantidad = cant;
	}
	
	//METODOS
	
	/** Nombre: darCodigo<br>
	*Metodo que retorna el codigo del objeto<br>
	*<b>pre</b>: El atributo codigo debe ser diferente a null<br>
	*@return un String codigo del objeto<br>
	*/	
	public String darCodigo(){
		return codigo;
	}
	
	/** Nombre: ModificarCodigo<br>
	*Metodo que modifica el código <br>
	*<b>pre</b>: El atributo codigo debe ser diferente a null<br>
	*<b>post</b>: Se modifica el atributo codigo<br>
	*@param elCodi: un String valido que modificará el valor anterior<br>
	*/
	public void modificarCodigo (String elCodi){
		codigo = elCodi;
	}
	
	/** Nombre: darNombre<br>
	*Metodo que retorna el nombre del objeto<br>
	*<b>pre</b>: El atributo nombre debe ser diferente a null<br>
	*@return un String nombre del objeto<br>
	*/	
	public String darNombre(){
		return nombre;
	}
	
	/** Nombre: ModificarNombre<br>
	*Metodo que modifica el nombre <br>
	*<b>pre</b>: El atributo nombre debe ser diferente a null<br>
	*<b>post</b>: Se modifica el atributo nombre<br>
	*@param elNom: un String valido que modificará el valor anterior<br>
	*/
	public void modificarNombre(String elNom) {
		nombre = elNom;
	}
	
	/** Nombre: darPre<br>
	*Metodo que retorna el precio del objeto<br>
	*<b>pre</b>: El atributo precio debe ser diferente a null<br>
	*@return un double precio del objeto<br>
	*/
	public double darPre(){
		return precio;
	}
	
	/** Nombre: ModificarPrecio<br>
	*Metodo que modifica el precio<br>
	*<b>pre</b>: El atributo precio debe ser diferente a null<br>
	*<b>post</b>: Se modifica el atributo precio<br>
	*@param elPre: un double valido que modificará el valor anterior<br>
	*/
	public void modificarPrecio(double elPre){
		precio = elPre;
	}
	
	/** Nombre: darCantidad<br>
	*Metodo que retorna la cantidad del objeto<br>
	*pre: El atributo cantidad debe ser diferente a null<br>
	*@return un int cantidad del objeto<br>
	*/
	public int darCant(){
		return cantidad;
	}
	
	/** Nombre: ModificarCantidad<br>
	*Metodo que modifica la cantidad<br>
	*<b>pre</b>: El atributo cantidad debe ser diferente a null<br>
	*<b>post</b>: Se modifica el atributo cantidad<br>
	*@param cant: un int valido que modificará el valor anterior<br>
	*/
	public void modificarCantidad (int cant){
		cantidad = cant;
	}
	
	
}