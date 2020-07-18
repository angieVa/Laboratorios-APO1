package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Entidad que representa la sección de recursos humanos encargado de hacer la selección de personal
 *@author : Angie Valentina Córdoba Pinzón<br>
 */
public class SeleccionDePersonal {
	public final static int MAX_ZONAS = 6; 
	
	//constantes

	
	private ZonaReclutamiento[] zonasRecluta;
	
	public SeleccionDePersonal(){
		zonasRecluta = new ZonaReclutamiento[MAX_ZONAS]; 
	}
	
	public ZonaReclutamiento[] darZonaReclutamientos(){
		return zonasRecluta;
		
	}
	
	public void agregarNuevaZona(int k, String nombrePais){
		zonasRecluta[k] = new ZonaReclutamiento(nombrePais);
	}
	
	public void agregarCandidato(int k, String ident, String nom, String ape, char sx, double hc, double hl, double ct, double a){
		zonasRecluta[k].agregarCandidato(ident, nom, ape, sx, hc, hl, ct, a);
	}
	
	//calcularCalificacionCandidato

	
	public int calcularTotalCandidatos(){  //no cambiamos nada 
		int totalCand = 0;
		for (int i = 0; i < zonasRecluta.length; i++) {
			totalCand += zonasRecluta[i].darCandidatos().size();
		}
		return totalCand;
	}
	
	public int contarCandidatosSuperanUmbral(int i){
		int cantidad = 0;

		cantidad = zonasRecluta[i].contarCandidatosUmbral();
		
		return cantidad;
	}
	
	public String ZonaMasSuperanUmbral(){
		
		int candidatos = 0;
		String nomZona = "";
		for (int i = 0; i < zonasRecluta.length; i++) {
			
			if(contarCandidatosSuperanUmbral(i) > candidatos){
				candidatos = contarCandidatosSuperanUmbral(i);
				nomZona = zonasRecluta[i].darPais();
			}
		}
		
		return nomZona + " con: " + candidatos + " candidatos";
	}

	
	public double calcularPromedioTotalCandidatos(){ // creo esta bien no cambiamos nada
		double prom = 0;
		for (int i = 0; i < zonasRecluta.length; i++) {
			prom += zonasRecluta[i].calcularPromedioCandidatos();
		}
		prom = prom / zonasRecluta.length;
		return prom;
	}
	
	public String hacerFiltradoEspecial(){
		
		String reporte = "";
		reporte += "["+calcularTotalCandidatos()+"]";
		
		for (int i = 0; i < zonasRecluta.length; i++) {
			zonasRecluta[i].filtrarPorActitud();
		}
		
		reporte += " [" + calcularTotalCandidatos()+"]";
		
		for (int i = 0; i < zonasRecluta.length; i++) {
			zonasRecluta[i].aplicarBonificacion();
		}
		
		double valor = calcularPromedioTotalCandidatos();
		
		for (int i = 0; i < zonasRecluta.length; i++) {
			zonasRecluta[i].filtrarMenoresAValor(valor);
		}
		
		reporte += " [" + calcularTotalCandidatos()+"]";
		
		DecimalFormat df = new DecimalFormat("0.0#");
		reporte += " ("+df.format(valor)+")";
		
		return reporte;
	}
	
	
	// cambio
	public double calcularPorcentajeToMujeres(){
		
		double porcen = 0;
		
		for(int i = 0; i < zonasRecluta.length; i++){
			
			porcen += zonasRecluta[i].mujeresTotal();
		}
		
		porcen = (porcen * 100) / calcularTotalCandidatos();
		
		return porcen;
	}
		

		
}