package modelo;
//Angie Valentina Córdoba A00347829
public class Tecnomecanica {

	//CONSTANTES
	public final static double BASE_M = 35.000;
	public final static double BASE_C = 90.000;
	
	//VARIABLES
	private double alineacion;
	private double suspension;
	private double frenos;
	private double ruido;
	private double emisionGases;
	private double valorTec;
	private double co2;
	private double hidrocarburo;
	

	
	//CONSTRUCTOR
	
	public Tecnomecanica (double laAline, double laSuspen, double losFrenos, double elRui, double elCo2, double hidro) {
		
		alineacion = laAline;
		suspension = laSuspen;
		frenos = losFrenos;
		ruido = elRui;
		co2 = elCo2;
		hidrocarburo = hidro;
		
	}
	
	//METODOS
	
	public double darAlineacion() {
		return alineacion;
	}
	
	public void modificarAlineacion(double laAline){
		alineacion = laAline;
	}
	
	public double darSuspension() {
		return suspension;
	}
	
	public void modificarSuspension(double laSuspen) {
		suspension = laSuspen;
	}
	
	public double darFrenos() {
		return frenos;
	}
	
	public void modificarFrenos(double losFrenos) {
		frenos = losFrenos;
	}
	
	public double darRuido() {
		return ruido;
	}
	
	public void modificarRuido(double elRui) {
		ruido = elRui;
	}
	
	public double darCo2() {
		return co2;
	}
	
	public void modificarCo2(double elCo2) {
		co2 = elCo2;
	}
	
	public double darHidrocarburo() {
		return hidrocarburo;
	}
	
	public void modificarHidrocarb(double hidro) {
		hidrocarburo = hidro;
	}
	
	
	
	public double calcularValorTecnomecanica(String tipoVehiculo, int modelo) {
	
	int elementosBien;
	elementosBien = 0;
	int elementosMal;
	elementosMal = 0;
		
	if (alineacion <= 10){
		elementosBien = (elementosBien + 1);
	}
	else{
		elementosMal = (elementosMal + 1);
	}
			
	
	if (suspension > 40){
		elementosBien = (elementosBien + 1);
	}
	else{
		elementosMal = (elementosMal + 1);
	}
	
	
	
		if (tipoVehiculo.equals("carro")) {
			
			if (((frenos > 30) && (frenos < 50))){
				elementosBien = (elementosBien + 1);
			}
			else{
				elementosMal = (elementosMal + 1);
		}}
			else{
				
			if (frenos > 30){
				
				elementosBien = (elementosBien + 1);
			}else{
				elementosBien = (elementosBien + 1);
	}
	}
	
	
			
			if (ruido <=95){
				elementosBien = (elementosBien + 1);
			}
			else{
				elementosMal = (elementosMal + 1);
		}
	
			
			if (modelo <= 1970){
				if ( ((co2 <= 5.0) && (hidrocarburo <= 800))){
					elementosBien = (elementosBien + 1);
				}
				else{
					elementosMal = (elementosMal + 1);
			}
			}else if ((modelo >= 1971) && (modelo <=1984)){
				if ( ((co2 <= 4.0) && (hidrocarburo <= 650))){
					elementosBien = (elementosBien + 1);
				}
				else{
					elementosMal = (elementosBien + 1);
			}
			}else if ((modelo >= 1985) && (modelo <=1997)){
				if ( ((co2 <= 3.0) && (hidrocarburo <= 400))){
					elementosBien = (elementosBien + 1);
				}
				else{
					elementosMal = (elementosMal + 1);
			}}
			else{
				if ( ((co2 <= 1.0) && (hidrocarburo <= 200))){
					elementosBien = (elementosBien + 1);
				}
				else{
					elementosMal = (elementosBien + 1);
				
		}
		}
		
		if (elementosMal >= 2){
			valorTec = 0.00;
		}
		else{
			if (tipoVehiculo.equals("Carro")){
			valorTec = (BASE_C + ((double)elementosMal*25000.00));}
			else {
				valorTec = (BASE_M + ((double)elementosMal*25000.00));
	}}
		
		return valorTec;
	
}
	}

