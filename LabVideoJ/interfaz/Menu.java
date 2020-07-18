package interfaz;
import modelo.*;
import java.util.Scanner;

public class Menu{
	
	public static void main(String []args) {
		
		 Almacen usuarioUno;
		 usuarioUno = new Almacen();
		 
		 
		System.out.println("-------------------------------------------------");
		System.out.println("Bienvenido al programa de la tienda de videojuegos");
		System.out.println("-------------------------------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		for (int indice = 0; indice <100; indice++) {
			
			
				System.out.println("Estos son nuestros productos");
				System.out.println("---------------------------------------------------------");
			
			for(int i = 0; i < usuarioUno.darVidJuego().size(); i++){
				
			System.out.println("Nombre: " + usuarioUno.darVidJuego().get(i).darNombre());
			
			System.out.println("Codigo: " + usuarioUno.darVidJuego().get(i).darCodigo());
			
			System.out.println("Precio: " + usuarioUno.darVidJuego().get(i).darPrecio());
			
			System.out.println("---------------------------------------------------------");
			}
		
		
		System.out.println("Presione 1 si desea adicionar un nuevo videojuego");
		System.out.println("Presione 2 si desea realizar una compra");
		System.out.println("Presione 3 si desea salir del programa");
		int tipo = entrada.nextInt();
	
			
		if (tipo == 3){
			
			System.out.println("Gracias por usar el programa");
			
			indice = 100;
		}
		
		
		for(int i = 0; i <100; i++){
		if (tipo == 1) {
		
			System.out.println("Ingrese el codigo del videojuego");
				String elCodigo = entrada.next();
			System.out.println("Ingrese el nombre del videojuego");
				String elNombre = entrada.next();
			System.out.println("Ingrese el precio del videojuego");
				double elPrecio = entrada.nextDouble();
				
			usuarioUno.agregarVidJuego(elCodigo,elNombre,elPrecio);
			
			System.out.println("Presione 1 si desa agregar otro juego");
			System.out.println("Presione 2 si no quiere agragar otro juego");
				int adicionar = entrada.nextInt();
				
				if(adicionar ==2){
					i = 100;
				}
			}
		}
			

	
		if(tipo ==2) {
			
					
					for( int i = 0; i < 100; i++){
					
					System.out.println("Ingrese el codigo del juego que desea comprar");
					String elCodi = entrada.next();
					System.out.println("Ingrese la cantidad de juegos que desea comprar");
					int cant = entrada.nextInt();
					
					if (cant < 5) {
					
					System.out.println("No se ha realizado este pedido. Debe pedir mas unidades");
					
					}else{
					
					for(i = 0;i<usuarioUno.darPedido().size();i++){
					if(elCodi.equals(usuarioUno.darPedido().get(i).darCodigo())){
						
						cant += usuarioUno.darPedido().get(i).darCant();
						
						usuarioUno.suprimirProducto(elCodi);
						
					}
					}
					
					String elNom = " ";
					for( i = 0; i < usuarioUno.darVidJuego().size(); i++){
						
						if(elCodi.equals(usuarioUno.darVidJuego().get(i).darCodigo())){
							
							elNom = usuarioUno.darVidJuego().get(i).darNombre();
						}
					}
					
					double elPre = 0;
					for( i = 0; i < usuarioUno.darVidJuego().size(); i++){
						
						if(elCodi.equals(usuarioUno.darVidJuego().get(i).darCodigo())){
							
							elPre = usuarioUno.darVidJuego().get(i).darPrecio();
						}
					}
						
						
					
					
					usuarioUno.agregarPedido(elCodi, elNom, elPre, cant);
					
					System.out.println("Presione 1 para agregar otro producto a la lista de compra");
					System.out.println("Presione 2 para finalizar su compra");
					int condicion = entrada.nextInt();
						
						if(condicion == 2){
							
							System.out.println("El resumen de su pedido es: ");
							
							for(i = 0; i< usuarioUno.darPedido().size();i++){
								
							System.out.println("Nombre del videojuego: " + usuarioUno.darPedido().get(i).darNombre());
							
							System.out.println("Codigo del videojuego: " + usuarioUno.darPedido().get(i).darCodigo());
			
							System.out.println("Precio del videojuego: " + usuarioUno.darPedido().get(i).darPre());
							
							System.out.println("Cantidad de videojuegos: " + usuarioUno.darPedido().get(i).darCant());
							
								elPre = usuarioUno.darPedido().get(i).darPre();
								cant = usuarioUno.darPedido().get(i).darCant();
							
							System.out.println("El subtotal es: " + usuarioUno.calcularSubtotal(elPre, cant));
			
							System.out.println("---------------------------------------------------------");
						
							
							}
							
							
							
							System.out.println("Presione 1 para terminar su compra");
							System.out.println("Presione 2 para eliminar algun producto de su lista de compra");
								int decision = entrada.nextInt();
								
								if(decision == 1){
									
									System.out.println("El total de su compra es: " + usuarioUno.calcularTotal());	
									
								}
								
								if(decision == 2){
									
									for(i = 0; i < usuarioUno.darPedido().size();i++){
									
									System.out.println("Escriba el codigo del producto que desea eliminar de su lista de compra");
									String codi = entrada.next();
									
									usuarioUno.eliminarProducto(codi);
									
									System.out.println("Presione 1 si desea eliminar otro producto");
									System.out.println("Presione 3 si desea terminar su compra");
									 decision = entrada.nextInt();
									
									if(decision == 3){
										
										System.out.println("El resumen de su pedido es: ");
							
										for(i = 0; i< usuarioUno.darPedido().size();i++){
								
										System.out.println("Nombre del videojuego: " + usuarioUno.darPedido().get(i).darNombre());
							
										System.out.println("Codigo del videojuego: " + usuarioUno.darPedido().get(i).darCodigo());
			
										System.out.println("Precio del videojuego: " + usuarioUno.darPedido().get(i).darPre());
							
										System.out.println("Cantidad de videojuegos: " + usuarioUno.darPedido().get(i).darCant());
							
												elPre = usuarioUno.darPedido().get(i).darPre();
												cant = usuarioUno.darPedido().get(i).darCant();
							
												System.out.println("El subtotal es: " + usuarioUno.calcularSubtotal(elPre, cant));
			
												System.out.println("---------------------------------------------------------");
										
										}
										
										System.out.println("El total de su compra es: " + usuarioUno.calcularTotal());	
										
									}
									}
									
								}
							
						
							i = 100;
						}
					
						}
					}
						

					}
					
					indice = 100;
				}
				
			}
}