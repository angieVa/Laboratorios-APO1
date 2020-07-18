package modelo;
import java.util.ArrayList;

	/** Nombre de la clase: Almacen<br>
	*Esta clase contiene los valores de la tienda de videojuegos<br>
	*@author : Angie Valentina Córdoba Pinzón<br>
	*/

public class Almacen {
	
	//RELACIONES
	
	private ArrayList <Videojuego> vidJuego;
	private ArrayList <Carrito> pedido;
	
	
	//CONSTRUCTOR
	
	/**
	*Nombre: Almacen<br>
	*Inicializa los objetos de las clases con las que Almacen tiene relacion<br>
	*<b>Pre</b>: Las clases de las que se inicializan los objetos deben contener los atributos correspondientes <br>
	*<b>Post</b>: Se crearon los objetos en las respectivas clases <br>
	*/
	public Almacen (){


	pedido = new ArrayList <Carrito>();
	vidJuego = new ArrayList <Videojuego> ();
	
	Videojuego nuevovidJuego = new Videojuego ("vjxb001","Battlefield 1 Standard Edition", 209000);
	vidJuego.add(nuevovidJuego);
	
	nuevovidJuego = new Videojuego ("vjxb002","Battlefield 1 Early Enliste Deluxe Edition", 274900);
	vidJuego.add(nuevovidJuego);
	
	nuevovidJuego = new Videojuego ("vjxb003","Call of Duty: Infinite Warfare", 199900);
	vidJuego.add(nuevovidJuego);
	
	nuevovidJuego = new Videojuego ("vjxb004","Call of Duty: Infinite Warfare Digital-Deluxe Edition", 300000);
	vidJuego.add(nuevovidJuego);
	
	nuevovidJuego = new Videojuego ("vjxb005","Call of Duty: Infinite Warfare Digital Legacy Edition", 250000);
	vidJuego.add(nuevovidJuego);
	
	nuevovidJuego = new Videojuego ("vjxb006","EA SPORTS FIFA 17", 210000);
	vidJuego.add(nuevovidJuego);
	
	
	
	}
	//METODOS
	
	
	/** 
	*Nombre: darVidJuego<br>
	*Muestra la relacion con la clase Videojuego<br>
	*<b>pre</b>: La clase videojuego debe ser diferente a null<br>
	*<b>post</b> Se ha mostrado la relacion con la clase videojuego <br>
	*@return la clase videojuego
	*/
	public ArrayList <Videojuego> darVidJuego(){
		return vidJuego;
	}
	
	/** 
	*Nombre: darPedido<br>
	*Muestrala relacion con la clase Carrito<br>
	*<b>pre</b>: La clase Carrito debe ser diferente de null <br>
	*<b>post</b>: Se ha mostradola relacion con la clase Carrito <br>
	*@return la clase Carrito
	*/
	public ArrayList <Carrito> darPedido(){
		return pedido;
	}
	
	/** 
	*Nombre: agregarVidJuego<br>
	*Agrega un nuevo videojuego al catalogo y la clase Videojuego<br>
	*<b>pre</b>: La clase Videojuego debe ser diferente de null<br>
	*<b>post</b>: Se agrego un nuevo viedojuego al catalogo y a la clase Videojuego<br>
	*@param cod es el codigo del videojuego que se desea agregar, cod es != null, cod != "" <br>
	*@param nom es el nombre del videojuego que se desea agregar, nom es != null, nom != "" <br>
	*@param precio es el precio del videojuego que se desea agregar, precio es != null, precio != 0 <br>
	*/
	public void agregarVidJuego(String cod, String nom, double precio){
		
		Videojuego nuevovidJuego = new Videojuego(cod, nom, precio);
		vidJuego.add(nuevovidJuego);
	
	}
	
	/**
	*Nombre: AgregarPedido<br>
	*Agrega un nuevo elemento al pedido y a la clase Carrito<br>
	*<b>pre</b>: La clase Carrito debe ser != null<br>
	*<b>post</b>: Se agrego un nuevo elemento al pedido y a la clase Carrito<br>
	*@param elCodi es el codigo del videojuego que se desea pedir, elCodi es != null, elCodi != "" <br>
	*@param elNom es el nombre del videojuego que se desea pedir, elNom es != null, elNom !=¨"" <br>
	*@param elPre es el precio del videojuego que se desea pedir, elPre es != null, elPre != 0 <br>
	*@param cant es la cantidad de videojuegos pedidos del mismo tipo, cant es != null, cant debe ser mayor o igual que 5 <br>
	*/
	public void agregarPedido(String elCodi,String  elNom, double elPre, int cant){
		
		Carrito nuevoPedido = new Carrito(elCodi, elNom, elPre, cant);
		pedido.add(nuevoPedido);
	}
	
	
	/** 
	*Nombre: calcularSubtotal<br>
	*calcula el subtotal que se debe pagar por cada videojuego pedido<br>
	*<b>pre</b>: la variable subtotal se inicializa en 0<br>
	*<b>pos</b>: Se calculo el subtotal a pagar por cada videojuego<br>
	*@param elPre:  es el precio del videojuego pedido, elPre != null, elPre != 0 <br>
	*@param cant es la cantidad de videojuegos pedidos del mismo tipo, cant es != null, cant debe ser mayor o igual que 5<br>
	*@return un double subtotal que es el valor a pagar por cada videojuego pedido<br>
	*/
	public double calcularSubtotal(double elPre, int cant){
		
		double subtotal = 0;
		
			subtotal = elPre * cant;
		
		return subtotal;
		}
		
		
	/**
	*Nombre: calcularTotal<br>
	*calcula el total a pagar de la lista de pedido<br>
	*<b>pre</b>:la variable total se inicializa en 0, la clase pedido es =! null <br>
	*<b>post</b>: Se mostró el total por pagar del pedido hecho<br>
	*@return un double total que es el valor a pagar de la lista de pedido<br>
	*/	
	public double calcularTotal(){
		
		double total = 0;
		
		for(int i = 0; i < darPedido().size(); i++){
			
			total = total + ( darPedido().get(i).darPre() * darPedido().get(i).darCant());
		}
		return total;
	}
	
	/**
	*Nombre: suprimirProducto<br>
	*Elimina algun videojuego que se repita en la lista de pedido<br>
	*<b>pre</b>: pedido =! null <br>
	*<b>post</b>: Se elimino el videojuego repetido<br>
	*@param elCodi es el codigo del videojuego que se va a eliminar, elCodi es != null, elCodi != "" <br>
	*/
	public void suprimirProducto(String elCodi){
		
		for(int i = 0; i < darPedido().size(); i++){
			
			if(elCodi.equals(darPedido().get(i).darCodigo())){
				
				darPedido().remove(i);
			}
		}
	}
	
	/**
	*Nombre: eliminarProducto<br>
	*Elimina el videojuego que el usuario quiera de la lista de pedido<br>
	*<b>pre</b> : pedido =! null <br>
	*<b>post</b> : Se elimino el elemento eligido<br>
	*@param codi es el codigo del videojuego que se va a eliminar, codi es != null, codi != "" <br>
	*/
	public void eliminarProducto(String codi){
		
		for(int i = 0; i < darPedido().size(); i++){
			
			if(codi.equals(darPedido().get(i).darCodigo())){
				
				darPedido().remove(i);
			}
		}
	}
		
}