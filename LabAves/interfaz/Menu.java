package interfaz;
import java.util.Scanner;
import modelo.*;
import java.util.ArrayList;
public class Menu{
	
	public static void main (String [] args ){
		CentroDeInvestigacion centro;
		Scanner sc = new Scanner (System.in);
		centro = new CentroDeInvestigacion();
		
		System.out.println ("Bienvenido al software de recolección de datos de aves de la Icesi");
		
		for ( int j = 0 ; j < 1000 ; j++) {
			
		System.out.print("Presione 1 si desea registrar los datos de un ave. ");
		System.out.print(" Presione 2 si desea consultar los datos de aves almacenados hasta ahora");
		int eleccion = sc.nextInt();
		if ( eleccion == 1 ){
			int tipo = 0;
			System.out.print("Presione 1 si el ave es Neognata o 2 si es Paleognata");
			tipo = sc.nextInt();
			
			if ( tipo == 1 ){
				int tipoUno = 0;
				System.out.print("Presione 1 si el Neognato es un Galloanserae o 2 si es un Neoave");
				tipoUno = sc.nextInt();
				
				if ( tipoUno == 1 ){
					
					System.out.print("Inserte el color del ave");
					String col = sc.next();
					System.out.print("Inserte la altura del ave");
					double alt = sc.nextDouble();
					System.out.print("Inserte la longitud de la cola del ave");
					double longC = sc.nextDouble();;
					System.out.print("Inserte la densidad Ósea del ave");
					double densO = sc.nextDouble();
					System.out.print("Inserte A si el ave tiene rango metabólico alto, M si tiene rango metabólico medio y B si tiene rango metabólico bajo");
					char ranM = sc.next().charAt(0);
					System.out.print("Inserte el número de huesos en las patas del ave");
					int numHep = sc.nextInt();
					System.out.print("Inserte la longitud del tercer dedo del ave");
					double longTD = sc.nextDouble();
					System.out.print("Ingrese D si el ave es doméstica o C si es de caza");
					char tA = sc.next().charAt(0);
					System.out.print("Inserte el peso del ave. Si lo desconoce, inserte 0, el programa puede calcularlo con la altura del ave");
					double pes = sc.nextDouble();
							if ( pes == 0 ){
								
								pes = centro.calcularPesoPorAlturaGalloanserae(alt, tA);
							
							}
					System.out.print("Ingrese O si el ave es Monógama o P si es Polígama");
					char mP = sc.next().charAt(0);
					Galloanserae galloA = new Galloanserae ( col , alt , pes , longC , densO , ranM , numHep , longTD , tA , mP );
					centro.darAves().add(galloA);
					
				} else if ( tipoUno == 2 ){
					int tipoDos = 0 ;
					System.out.print("Presione 1 si la Neoave es un Passeriforme o 2 si no lo es");
					tipoDos = sc.nextInt();
					
					if ( tipoDos == 1 ){
						
						System.out.print("Inserte el color del ave");
						String col = sc.next();
						System.out.print("Inserte la altura del ave");
						double alt = sc.nextDouble();
						System.out.print("Inserte el peso del ave. Si lo desconoce, inserte 0, el programa puede calcularlo con la altura del ave");
						double pes = sc.nextDouble();
							if ( pes == 0 ){
								
								pes = centro.calcularPesoPorAltura(alt);
								
							}
						System.out.print("Inserte la longitud de la cola del ave");
						double longC = sc.nextDouble();;
						System.out.print("Inserte la densidad Ósea del ave");
						double densO = sc.nextDouble();
						System.out.print("Inserte A si el ave tiene rango metabólico alto, M si tiene rango metabólico medio y B si tiene rango metabólico bajo");
						char ranM = sc.next().charAt(0);
						System.out.print("Inserte el número de huesos en las patas del ave");
						int numHep = sc.nextInt();
						System.out.print("Inserte la longitud del tercer dedo del ave");
						double longTD = sc.nextDouble();
						System.out.print("Inserte la longitud de las patas");
						double longP = sc.nextDouble();
						System.out.print("Ingrese el número de dedos por pata del ave");
						int numD = sc.nextInt();
						System.out.print("Ingrese los acordes de canto del ave(Separados por , Sin espacios)");
						String aC = sc.next();
						System.out.print("Ingrese los acordes de reclamo del ave(Separados por , Sin espacios)");
						String aR = sc.next();
						
						Passeriforme passer = new Passeriforme ( col,  alt,  pes, longC,  densO,  ranM,  numHep,  longTD,  longP,  numD,  aC,  aR);
						centro.darAves().add(passer);
						
					} else if ( tipoDos == 2 ){
						
						System.out.print("Inserte el color del ave");
						String col = sc.next();
						System.out.print("Inserte la altura del ave");
						double alt = sc.nextDouble();
						System.out.print("Inserte el peso del ave. Si lo desconoce, inserte 0, el programa puede calcularlo con la altura del ave");
						double pes = sc.nextDouble();
							if ( pes == 0 ){
								
								pes = centro.calcularPesoPorAltura(alt);
								
							}
						System.out.print("Inserte la longitud de la cola del ave");
						double longC = sc.nextDouble();;
						System.out.print("Inserte la densidad Ósea del ave");
						double densO = sc.nextDouble();
						System.out.print("Inserte A si el ave tiene rango metabólico alto, M si tiene rango metabólico medio y B si tiene rango metabólico bajo");
						char ranM = sc.next().charAt(0);
						System.out.print("Inserte el número de huesos en las patas del ave");
						int numHep = sc.nextInt();
						System.out.print("Inserte la longitud del tercer dedo del ave");
						double longTD = sc.nextDouble();
						System.out.print("Inserte la longitud de las patas");
						double longP = sc.nextDouble();
						System.out.print("Ingrese el número de dedos por pata del ave");
						int numD = sc.nextInt();
						
						Neoave neoA = new Neoave ( col,  alt,  pes,  longC,  densO,  ranM,  numHep,  longTD,  longP,  numD);
						centro.darAves().add(neoA);
					}
					
					
				}
				
			} else if ( tipo == 2 ){
				int tipoTres = 0;
				System.out.print("Ingrese 1 si el Paleognato es un Ratite o 2 si es un Tiramu");
				tipoTres = sc.nextInt();
				
				if ( tipoTres == 1 ){
					
					System.out.print("Inserte el color del ave");
					String col = sc.next();
					System.out.print("Inserte la altura del ave");
					double alt = sc.nextDouble();
					System.out.print("Inserte el peso del ave. Si lo desconoce, inserte 0, el programa puede calcularlo con la altura del ave");
					double pes = sc.nextDouble();
						if ( pes == 0 ){								
								pes = centro.calcularPesoPorAltura(alt);
							}
					System.out.print("Inserte la longitud de la cola del ave");
					double longC = sc.nextDouble();;
					System.out.print("Inserte la densidad Ósea del ave");
					double densO = sc.nextDouble();
					System.out.print("Inserte A si el ave tiene rango metabólico alto, M si tiene rango metabólico medio y B si tiene rango metabólico bajo");
					char ranMR = sc.next().charAt(0);
					System.out.print("Inserte el número de huesos en el paladar del ave");
					int numH = sc.nextInt();
					System.out.print("¿El ave posee una Quilla?Diga SI o NO");
					String tQS = sc.next();
					boolean tQ = false;
					 if ( tQS.equals("SI") ){
						 tQ = true;
					 }

						 
					Ratite rati = new Ratite ( col,  alt,  pes,  longC,  densO,  ranMR,  numH,  tQ ); 
					centro.darAves().add(rati);
				
				} else if ( tipoTres == 2 ){
					
					System.out.print("Inserte el color del ave");
					String col = sc.next();
					System.out.print("Inserte la altura del ave");
					double alt = sc.nextDouble();
					System.out.print("Inserte el peso del ave. Si lo desconoce, inserte 0, el programa puede calcularlo con la altura del ave");
					double pes = sc.nextDouble();
						if ( pes == 0 ){								
								pes = centro.calcularPesoPorAltura(alt);
							}
					System.out.print("Inserte la longitud de la cola del ave");
					double longC = sc.nextDouble();;
					System.out.print("Inserte la densidad Ósea del ave");
					double densO = sc.nextDouble();
					System.out.print("Inserte A si el ave tiene rango metabólico alto, M si tiene rango metabólico medio y B si tiene rango metabolico bajo");
					char ranMT = sc.next().charAt(0);
					System.out.print("Inserte el número de huesos en el paladar del ave");
					int numH = sc.nextInt();
					System.out.print("Inserte la velocidad en tierra del ave");
					double velET = sc.nextDouble();
					
					Tiramue tira = new Tiramue( col,  alt,  pes,  longC,  densO,  ranMT,  numH,  velET );
					centro.darAves().add(tira);
				}
				
				
			}
			
		} else if ( eleccion == 2 ){
			
			int eleccionDos = 0;
			System.out.print("Ingrese 1 si quiere consultar todos los datos almacenados de las aves. ");
			System.out.print(" Ingrese 2 si quiere la informacion estadistica (Promedio del peso, Suma de las alturas y distribucion del rango metabolico");
			eleccionDos = sc.nextInt();
				if ( eleccionDos == 1 ){
					
				for ( int i = 0 ; i < centro.darAves().size() ; i++ ){
					
					if ( centro.darAves().get(i) instanceof Galloanserae ){
						
						System.out.println("Este ave es de la clase Galloanserae, que se deriva se la clase Neognato. Y esta, a su vez, se deriva de la clase Neornithe");
						System.out.println("El color del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darGalloanserae().darColor());
						System.out.println("La altura del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darGalloanserae().darAltura());
						System.out.println("El peso del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darGalloanserae().darPeso());
						System.out.println("El rango metabólico del ave es(A es alto, M es medio y B es bajo): "+ centro.darAves().get(i).darNeornithe().darNeognato().darGalloanserae().darRangoMetabolico());
						System.out.println("La longitud de la cola del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darGalloanserae().darLongitudCola());
						System.out.println("La densidad ósea del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darGalloanserae().darDensidadOsea());
						System.out.println("El ave es de tipo(D es doméstica y C es de caza) : "+ centro.darAves().get(i).darNeornithe().darNeognato().darGalloanserae().darTipoAve());
						System.out.println("La reproducción del ave es(O es monógama y P es polígama) : "+ centro.darAves().get(i).darNeornithe().darNeognato().darGalloanserae().darTipoReproduccion());
												
					} else if ( centro.darAves().get(i) instanceof Passeriforme ){
						System.out.println("Este ave es de la clase Passeriforme, que se deriva se la clase Neoave, que se deriva de la clase Neognato. Y esta, a su vez, se deriva de la clase Neornithe");
						System.out.println("El color del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().darColor());
						System.out.println("La altura del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().darAltura());
						System.out.println("El peso del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().darPeso());
						System.out.println("El rango metabólico del ave es(A es alto, M es medio y B es bajo): "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().darRangoMetabolico());
						System.out.println("La longitud de la cola del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().darLongitudCola());
						System.out.println("La densidad ósea del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().darDensidadOsea());
						System.out.println("La longitud de las patas del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().darLongitudPatas());
						System.out.println("La altura máxima de vuelo del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().calcularAlturaMaxVuelo());
						System.out.println("La velocidad promedio de vuelo del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().calcularVelPromedio());
						System.out.println("Los acordes de canto del ave son: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().darAcordesCanto());
						System.out.println("Los acordes de reclamo del ave son: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().darAcordesReclamo());
						System.out.println("¿El ave es migratoria?: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPasseriforme().esMigratoria());
						
					} else if ( centro.darAves().get(i) instanceof Neoave ){
						System.out.println("Este ave es de la clase Neoave, que se deriva se la clase Neognato. Y esta, a su vez, se deriva de la clase Neornithe");
						System.out.println("El color del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darColor());
						System.out.println("La altura del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darAltura());
						System.out.println("El peso del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darPeso());
						System.out.println("El rango metabólico del ave es(A es alto, M es medio y B es bajo): "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darRangoMetabolico());
						System.out.println("La longitud de la cola del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darLongitudCola());
						System.out.println("La densidad ósea del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darDensidadOsea());
						System.out.println("La longitud de las patas del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().darLongitudPatas());
						System.out.println("La altura máxima de vuelo del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().calcularAlturaMaxVuelo());
						System.out.println("La velocidad promedio de vuelo del ave es: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().calcularVelPromedio());
						System.out.println("¿El ave es migratoria?: "+ centro.darAves().get(i).darNeornithe().darNeognato().darNeoave().esMigratoria());
						
					} else if ( centro.darAves().get(i) instanceof Ratite ){
						System.out.println("Este ave es de la clase Ratite, que se deriva se la clase Paleognato. Y esta, a su vez, se deriva de la clase Neornithe");
						System.out.println("El color del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darRatite().darColor());
						System.out.println("La altura del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darRatite().darAltura());
						System.out.println("El peso del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darRatite().darPeso());
						System.out.println("El rango metabólico del ave es(A es alto, M es medio y B es bajo): "+ centro.darAves().get(i).darNeornithe().darPaleognato().darRatite().darRangoMetabolico());
						System.out.println("La longitud de la cola del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darRatite().darLongitudCola());
						System.out.println("La densidad ósea del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darRatite().darDensidadOsea());
						System.out.println("El número de huesos en el paladar del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darRatite().darNumHuesosEnPaladar());
						System.out.println("¿El ave posee una quilla?: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darRatite().darTieneQuilla());
						
					} else if ( centro.darAves().get(i) instanceof Tiramue ){
						System.out.println("Este ave es de la clase Tiramue, que se deriva se la clase Paleognato. Y esta, a su vez, se deriva de la clase Neornithe");
						System.out.println("El color del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darTiramue().darColor());
						System.out.println("La altura del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darTiramue().darAltura());
						System.out.println("El peso del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darTiramue().darPeso());
						System.out.println("El rango metabólico del ave es(A es alto, M es medio y B es bajo): "+ centro.darAves().get(i).darNeornithe().darPaleognato().darTiramue().darRangoMetabolico());
						System.out.println("La longitud de la cola del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darTiramue().darLongitudCola());
						System.out.println("La densidad ósea del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darTiramue().darDensidadOsea());
						System.out.println("El número de huesos en el paladar del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darTiramue().darNumHuesosEnPaladar());
						System.out.println("La altura máxima de vuelo del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darTiramue().calcularAlturaMaxVuelo());
						System.out.println("La velocidad promedio de vuelo del ave es: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darTiramue().calcularVelPromedio());
						System.out.println("¿El ave es migratoria?: "+ centro.darAves().get(i).darNeornithe().darPaleognato().darTiramue().esMigratoria());
						
					}
					
				}
				
					
				} else if ( eleccionDos == 2 ){
					
					System.out.println("Información estadística de las aves:");
					System.out.println("El promedio de peso de las aves es: "+ centro.calcularTotalPromedioPesoAves());
					System.out.println("La suma de las alturas de las aves es: "+ centro.calcularTotalAltura());
					System.out.println("La distribución del metabolismo de las aves es: " + centro.calcularPorcentajeRangos());
				}
			
		}
		
	}}


}