package modelo;
import java.util.ArrayList;

/**
*@Author: Angie Valentina Cordoba Pinzon
*Fecha: 20/11/2017
*Clase que contiene los valores del centro de investigacion
*/


public  class CentroDeInvestigacion{
	
	
	public static final double FACTOR_PESO = 32.7;

	private ArrayList<Ave> aves;
	
	public CentroDeInvestigacion(){
		aves = new ArrayList <Ave>();
	}
	
	public ArrayList<Ave> darAves(){
		return aves;
	}
	
	public double calcularPesoPorAltura(double alt){
		
		double peso = alt*FACTOR_PESO;
		return peso;
	}
	
	public double calcularPesoPorAlturaGalloanserae(double alt, char tA){
		double peso = 0;
		if ( tA == 'D'){
			peso = calcularPesoPorAltura(alt) +( calcularPesoPorAltura(alt)* 0.529 );
		} else if ( tA == 'C' ){
			peso = calcularPesoPorAltura(alt) +( calcularPesoPorAltura(alt)* 0.183 );
		}
		
		return peso;
	}
	
	public double calcularTotalPromedioPesoAves(){
		double promedio = 0;

		for(int i = 0; i< aves.size(); i++){
			promedio += aves.get(i).darPeso();
		}
		promedio = promedio/aves.size();
		return promedio;
		
	}
	
	public double calcularTotalAltura(){
		double total = 0;
		
		for(int i = 0; i < aves.size(); i++){
			total += aves.get(i).darAltura();
		}
		return total;
	}
	
	public String calcularPorcentajeRangos(){
		
		int totalBajo = 0;
		int totalMedio = 0;
		int totalAlto = 0;
		
		for(int i = 0; i < aves.size(); i++){
		
			if(aves.get(i).darRangoMetabolico() == 'A'){
				totalAlto++;
			}
			if(aves.get(i).darRangoMetabolico() == 'M'){
				totalMedio++;
			}
			if(aves.get(i).darRangoMetabolico() == 'B'){
				totalBajo++;
			}
		}
		
		double porcentajeBajo = (totalBajo * aves.size()) / 100;
		double porcentajeMedio = (totalMedio * aves.size()) / 100;
		double porcentajeAlto = (totalAlto * aves.size()) / 100;
	
		
		return "El porcentaje de aves con metabolismo bajo es " + porcentajeBajo + "% - " + "Con metabolismo medio es " + porcentajeMedio + "% - " + "Con metabolismo alto es " + porcentajeAlto + "%";
			
	}	
}