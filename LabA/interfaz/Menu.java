package interfaz;
import java.util.Scanner;
import modelo.*;
import java.util.ArrayList;
public class Menu{
	
	public static void main (String [] args ){
		
		CentroDeInvestigacion centro;
		centro = new CentroDeInvestigacion();
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println ("Bienvenido al software de recolección de datos de aves de la Icesi");
		System.out.println("--------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner (System.in);
		
		Ave tiram = new Tiramue("Tao" , "gris", 30, 50, 'A', 23, 30, 12, 100);
		Ave ratit = new Ratite("Cas", "azul", 25, 40, 'B', 12, 21, 14, false);
		Ave galloa = new Galloanserae("Ray", "verde", 34, 29, 'M', 15, 25, 12, 10, 'D', 'O');
		Ave neo = new Neoave("Rain", "verde", 29, 19, 'A', 13, 23, 10, 7, 15, 3);
		Ave pase = new Passeriforme("Azu", "negro", 27, 19, 'B', 10, 21, 9,	8, 12, 3, "Do,Re,Mi", "Fa,Sol,La");
	
		centro.darAves().add(tiram);
		centro.darAves().add(ratit);
		centro.darAves().add(galloa);
		centro.darAves().add(neo);
		centro.darAves().add(pase);
		
		ArrayList<Ave> aves = centro.darAves();
		
		
		for ( int j = 0 ; j < 1000 ; j++) {
			
		System.out.println("Presione 1 si desea registrar los datos de un ave");
		System.out.println("Presione 2 si desea consultar los datos de aves almacenados hasta ahora");
		int eleccion = sc.nextInt();
		
		if ( eleccion == 1 ){
			
			System.out.println("Presione 1 si el ave es Neognata"); 
			System.out.println("Presione 2 si el ave es Paleognata"); 
			int tipo = sc.nextInt();
			
			if ( tipo == 1 ){
				
				System.out.println("Presione 1 si el Neognato es un Galloanserae");
				System.out.println("Presione 2 si el Neognato es un Neoave");
				int tipoUno = sc.nextInt();
				
				if ( tipoUno == 1 ){
					
					System.out.println("Inserte el nombre del ave");
					String nom = sc.next();
					
					System.out.println("Inserte el color del ave");
					String col = sc.next();
					
					System.out.println("Inserte la altura del ave");
					double alt = sc.nextDouble();
					
					System.out.println("Inserte la longitud de la cola del ave");
					double longC = sc.nextDouble();
					
					System.out.println("Inserte la densidad osea del ave");
					double densO = sc.nextDouble();
					
					System.out.println("Inserte A si el ave tiene rango metabolico alto, M si tiene rango metabolico medio y B si tiene rango metabolico bajo");
					char ranM = sc.next().charAt(0);
					
					System.out.println("Inserte el numero de huesos en las patas del ave");
					int numHep = sc.nextInt();
					
					System.out.println("Inserte la longitud del tercer dedo del ave");
					double longTD = sc.nextDouble();
					
					System.out.println("Ingrese D si el ave es domestica o C si es de caza");
					char tA = sc.next().charAt(0);
					
					System.out.println("Inserte el peso del ave. Si lo desconoce, inserte 0, el programa puede calcularlo con la altura del ave");
					double pes = sc.nextDouble();
							if ( pes == 0 ){
								
								pes = centro.calcularPesoPorAlturaGalloanserae(alt, tA);
							
							}
							
					System.out.println("Ingrese O si el ave es Monógama o P si es Polígama");
					char mP = sc.next().charAt(0);
					
					Ave galloA = new Galloanserae (nom, col , alt , pes , ranM , longC , densO , numHep , longTD , tA , mP );
					centro.darAves().add(galloA);
					
				} else if ( tipoUno == 2 ){
					
					System.out.println("Presione 1 si la Neoave es un Passeriforme");
					System.out.println("Presione 2 si no lo es");
					int tipoDos = sc.nextInt();
					
					if (tipoDos == 1){
						
						System.out.println("Inserte el nombre del ave");
						String nom = sc.next();
						
						System.out.println("Inserte el color del ave");
						String col = sc.next();
						
						System.out.println("Inserte la altura del ave");
						double alt = sc.nextDouble();
						
						System.out.println("Inserte el peso del ave. Si lo desconoce, inserte 0, el programa puede calcularlo con la altura del ave");
						double pes = sc.nextDouble();
							if ( pes == 0 ){
								
								pes = centro.calcularPesoPorAltura(alt);
								
							}
							
						System.out.println("Inserte la longitud de la cola del ave");
						double longC = sc.nextDouble();
						
						System.out.println("Inserte la densidad osea del ave");
						double densO = sc.nextDouble();
						
						System.out.println("Inserte A si el ave tiene rango metabolico alto, M si tiene rango metabolico medio y B si tiene rango metabolico bajo");
						char ranM = sc.next().charAt(0);
						
						System.out.println("Inserte el numero de huesos en las patas del ave");
						int numHep = sc.nextInt();
						
						System.out.println("Inserte la longitud del tercer dedo del ave");
						double longTD = sc.nextDouble();
						
						System.out.println("Inserte la longitud de las patas");
						double longP = sc.nextDouble();
						
						System.out.println("Ingrese el numero de dedos por pata del ave");
						int numD = sc.nextInt();
						
						System.out.println("Ingrese los acordes de canto del ave(Separados por , Sin espacios)");
						String aC = sc.next();
						
						System.out.println("Ingrese los acordes de reclamo del ave(Separados por , Sin espacios)");
						String aR = sc.next();
						
						Ave passer = new Passeriforme (nom, col,  alt,  pes, ranM, longC, densO,  numHep,  longTD,  longP,  numD,  aC,  aR);
						centro.darAves().add(passer);
						
					} else if ( tipoDos == 2 ){
						
						System.out.println("Inserte el nombre del ave");
						String nom = sc.next();
						
						System.out.println("Inserte el color del ave");
						String col = sc.next();
						
						System.out.println("Inserte la altura del ave");
						double alt = sc.nextDouble();
						
						System.out.println("Inserte el peso del ave. Si lo desconoce, inserte 0, el programa puede calcularlo con la altura del ave");
						double pes = sc.nextDouble();
							if ( pes == 0 ){
								
								pes = centro.calcularPesoPorAltura(alt);
								
							}
							
						System.out.println("Inserte la longitud de la cola del ave");
						double longC = sc.nextDouble();
						
						System.out.println("Inserte la densidad osea del ave");
						double densO = sc.nextDouble();
						
						System.out.println("Inserte A si el ave tiene rango metabolico alto, M si tiene rango metabolico medio y B si tiene rango metabolico bajo");
						char ranM = sc.next().charAt(0);
						
						System.out.println("Inserte el numero de huesos en las patas del ave");
						int numHep = sc.nextInt();
						
						System.out.println("Inserte la longitud del tercer dedo del ave");
						double longTD = sc.nextDouble();
						
						System.out.println("Inserte la longitud de las patas");
						double longP = sc.nextDouble();
						
						System.out.println("Ingrese el número de dedos por pata del ave");
						int numD = sc.nextInt();
						
						Ave neoA = new Neoave (nom, col,  alt,  pes, ranM,  longC,  densO, numHep, longTD,  longP,  numD);
						centro.darAves().add(neoA);
					}
					
					
				}
				
			} else if ( tipo == 2 ){
				
				System.out.println("Ingrese 1 si el Paleognato es un Ratite");
				System.out.println("Ingrese 2 si el Paleognato es un Tiramu");
				int tipoTres = sc.nextInt();
				
				if ( tipoTres == 1 ){
					
					System.out.println("Inserte el nombre del ave");
					String nom = sc.next();
						
					System.out.println("Inserte el color del ave");
					String col = sc.next();
					
					System.out.println("Inserte la altura del ave");
					double alt = sc.nextDouble();
					
					System.out.println("Inserte el peso del ave. Si lo desconoce, inserte 0, el programa puede calcularlo con la altura del ave");
					double pes = sc.nextDouble();
						if ( pes == 0 ){								
								pes = centro.calcularPesoPorAltura(alt);
							}
							
					System.out.println("Inserte la longitud de la cola del ave");
					double longC = sc.nextDouble();
					
					System.out.println("Inserte la densidad osea del ave");
					double densO = sc.nextDouble();
					
					System.out.println("Inserte A si el ave tiene rango metabolico alto, M si tiene rango metabolico medio y B si tiene rango metabolico bajo");
					char ranM = sc.next().charAt(0);
					
					System.out.println("Inserte el numero de huesos en el paladar del ave");
					int numH = sc.nextInt();
					
					System.out.println("¿El ave posee una Quilla?Diga SI o NO");
					String tQS = sc.next();
					boolean tQ = false;
					 if ( tQS.equals("SI") ){
						 tQ = true;
					 }
 
					Ave rati = new Ratite (nom, col,  alt,  pes, ranM,  longC,  densO, numH,  tQ ); 
					centro.darAves().add(rati);
				
				} else if ( tipoTres == 2 ){
					
					System.out.println("Inserte el nombre del ave");
					String nom = sc.next();
						
					System.out.println("Inserte el color del ave");
					String col = sc.next();
					
					System.out.println("Inserte la altura del ave");
					double alt = sc.nextDouble();
					
					System.out.println("Inserte el peso del ave. Si lo desconoce, inserte 0, el programa puede calcularlo con la altura del ave");
					double pes = sc.nextDouble();
						if ( pes == 0 ){								
								pes = centro.calcularPesoPorAltura(alt);
							}
							
					System.out.println("Inserte la longitud de la cola del ave");
					double longC = sc.nextDouble();
					
					System.out.println("Inserte la densidad osea del ave");
					double densO = sc.nextDouble();
				
					System.out.println("Inserte A si el ave tiene rango metabolico alto, M si tiene rango metabolico medio y B si tiene rango metabolico bajo");
					char ranM = sc.next().charAt(0);
					
					System.out.println("Inserte el numero de huesos en el paladar del ave");
					int numH = sc.nextInt();
					
					System.out.println("Inserte la velocidad en tierra del ave");
					double velET = sc.nextDouble();
					
					Ave tira = new Tiramue(nom, col,  alt,  pes, ranM, longC,  densO, numH,  velET );
					centro.darAves().add(tira);
				}
				
				
			}
			
		} else if ( eleccion == 2 ){
			
			int eleccionDos = 0;
			System.out.println("Ingrese 1 si quiere consultar todos los datos almacenados de las aves. ");
			System.out.println("Ingrese 2 si quiere la informacion estadistica (Promedio del peso, Suma de las alturas y distribucion del rango metabolico");
			eleccionDos = sc.nextInt();
				if ( eleccionDos == 1 ){
					
				for (int i = 0 ; i < aves.size() ; i++ ){
					
					if (aves.get(i) instanceof Galloanserae ){
						System.out.println("**********************Galloanserae*********************");
						Galloanserae gall = (Galloanserae)aves.get(i);
						System.out.println(gall.toString());
						System.out.println("--------------------------------------------------------------------------------");
						
					} else if (aves.get(i) instanceof Passeriforme ){
						System.out.println("**********************Passeriforme*********************");
						Passeriforme pas = (Passeriforme)aves.get(i);
						System.out.println(pas.toString());
						System.out.println("--------------------------------------------------------------------------------");
						
					} else if (aves.get(i) instanceof Neoave ){
						System.out.println("**********************Neoave*********************");
						Neoave neoa = (Neoave)aves.get(i);
						System.out.println(neoa.toString());
						System.out.println("--------------------------------------------------------------------------------");
						
					} else if (aves.get(i) instanceof Ratite ){
						System.out.println("**********************Ratite*********************");
						Ratite rat = (Ratite)aves.get(i);
						System.out.println(rat.toString());
						System.out.println("--------------------------------------------------------------------------------");
						
					} else if (aves.get(i) instanceof Tiramue ){
						System.out.println("**********************Tiramue*********************");
						Tiramue tir = (Tiramue)aves.get(i);
						System.out.println(tir.toString());
						System.out.println("--------------------------------------------------------------------------------");
					}
					
				}
				
					
				} else if ( eleccionDos == 2 ){
					
					System.out.println("Información estadística de las aves:");
					System.out.println("El promedio de peso de las aves es: "+ centro.calcularTotalPromedioPesoAves());
					System.out.println("La suma de las alturas de las aves es: "+ centro.calcularTotalAltura());
					System.out.println("--------------------------------------------------------------------------------");
					
				}
			
		}
		
	}}


}