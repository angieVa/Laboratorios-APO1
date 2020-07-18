package modelo;
//Angie Valentina Córdoba A00347829
public class Fecha{


	//ATRIBUTOS
	
	private	int diaActu;
	private int mesActu;
	private int anioActu;
	private	int diaExpedi;
	private int mesExpedi;
	private int anioExpedi;
	private int diaVencimiento;
	private int mesVencimiento;
	private int anioVencimiento;
	private String vencimiento;
	
	//METODOS
	
	public Fecha(int elDiaAct, int elMesAct, int elAnioAct, int elDiaExped, int elMesExped, int elAnioExped) {
	
	diaActu = elDiaAct;
	mesActu = elMesAct;
	anioActu = elAnioAct;
	diaExpedi = elDiaExped;
	mesExpedi = elMesExped;
	anioExpedi = elAnioExped;
	diaVencimiento = 0;
	mesVencimiento = 0;
	anioVencimiento = 0;
	
	}
	
	public int darDiaActual() {
		return diaActu;
	}
	
	public void modificarDiaActual(int elDiaAct) {
		diaActu = elDiaAct;
	}
	
	public int darMesActual() {
		return mesActu;
	}
	
	public void modificarMesActual(int elMesAct) {
		mesActu = elMesAct;
	}
	
	public int darAnioActual() {
		return anioActu;
	}
	
	public void modificarAnioActual(int elAnioAct) {
		anioActu = elAnioAct;
	}
	
	public int darDiaExpedicion() {
		return diaExpedi;
	}
	
	public void modificarDiaExpedicion(int elDiaExped) {
		diaExpedi = elDiaExped;
	}
	
	public int darMesExpedicion() {
		return mesExpedi;
	}
	
	public void modificarMesExpedicion(int elMesExped) {
		mesExpedi = elMesExped;
	}
	
	public int darAnioExpedicion() {
		return anioExpedi;
	}
	
	public void modificarAnioExpedicion(int elAnioExped) {
		anioExpedi = elAnioExped;
	}
	
	public int darDiaVencim(){
			return diaVencimiento;
	}
	
	public void modificarDiaVencim(int diaVen) {
		diaVencimiento = diaVen;
	}
	
	public int darMesVencim(){
			return mesVencimiento;
	}
	
	public void modificarMesVencim(int mesVen){
		mesVencimiento = mesVen;
	}
	
	public int darAnioVencim(){
			return anioVencimiento;
	}
	
	public void modificarAnioVencim(int anioVen){
		anioVencimiento = anioVen;
	}
	
	//REQUERIMEINTOS
	
	public String vencimiento() {
	
		if ((anioExpedi + 5) > anioActu) {
		vencimiento = "La licencia esta vencida";
		}
	
		else if (((anioExpedi + 5)) < anioActu) {
		vencimiento = "La licencia aun no esta vencida";
		}
	
		else if (((anioExpedi + 5) == anioActu) & (mesActu > mesExpedi)) {
		vencimiento = "La licencia esta vencida";
		}
	
		else if (((anioExpedi + 5) == anioActu) & (mesActu < mesExpedi)) {
		vencimiento = "La licencia aun no esta vencida";
		}
	
		else if (((anioExpedi + 5) == anioActu) & (mesActu == mesExpedi) & (diaActu > diaExpedi)) {
		vencimiento = "La licencia esta vencida" ;
		}
	
		else if (((anioExpedi + 5) == anioActu) & (mesActu == mesExpedi) & (diaActu < diaExpedi)) {
		vencimiento = "La licencia aun no esta vencida";
		}
	
		else if (((anioExpedi + 5) == anioActu) & (mesActu == mesExpedi) & (diaActu == diaExpedi)) {
		vencimiento = "La licencia aun no esta vencida";
		}
	
		return vencimiento;
		}
		
}