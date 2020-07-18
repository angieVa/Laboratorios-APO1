package Modelo;

public class ProductoraTV {

	//ATRIBUTOS
	private String nombre;
	private String codigo;
	private double presupuesto;
	
	//RELACIONES

	private Serie serie1;
	private Serie serie2;
	private Serie serie3;
	
	//METODOS
	
public ProductoraTV(String elNombre, String elCodigo) {
		
		nombre = elNombre;
		codigo = elCodigo;
		presupuesto = 0;
		
	
		
			//SERIES
	serie1 = new Serie("Supernatural", 264, 45, "Suspenso", "TV-14", 12);
	serie1.modificarActorPrin(new Actor("Jensen Ackles", 39, 10319780, 013546710));
	serie1.modificarActorR1(new Actor("Jared Padalecki", 35, 190719820, 926510487));
	serie1.modificarActorR2(new Actor("Misha Collins", 42, 76364739, 734673266));
	
	
	serie2 = new Serie("Arrow", 115, 43, "Ficcion de superheroes", "TV-PG", 5);
	serie2.modificarActorPrin(new Actor("Stephen Amell", 36, 72327498, 837735630));
	serie2.modificarActorR1(new Actor("Emily Riclards", 26, 47723888, 384638462));
	serie2.modificarActorR2(new Actor("Katie Cassidy", 30, 45343356, 794567657));
	
	
	serie3 = new Serie("Smallville", 218, 45, "Ficcion de superheroes", "TV-PG", 10);
	serie3.modificarActorPrin(new Actor("Tom Welling", 40, 36746998, 827565291));
	serie3.modificarActorR1(new Actor("Allison Mack", 35, 76393823, 387647365));
	serie3.modificarActorR2(new Actor("Michael Rosenbaum", 45, 92364632, 93472320));
	}
	
	public double calcularPresupuestoTotal() {
	
	presupuesto = serie1.calcularPresupuestoSerie() + serie2.calcularPresupuestoSerie() + serie3.calcularPresupuestoSerie();
		return presupuesto;
	
	}
	
	// METODOS
	public String darNombre() {
		return nombre;
	}
	public void modificarNombre(String elNombre) {
		elNombre = nombre;
	}
	
	public String darCodigo() {
		return codigo;
	}
	public void modificarCodigo(String elCodigo) {
		elCodigo = codigo;
	}
	
	//ACABO DE INICIALIZAR ATRIBUTOS
	public Serie darSerie1() {
		return serie1;
	}
	
	public void modificarSerie1(Serie serie1) {
		this.serie1 = serie1;
	}
		
	public Serie darSerie2() {
		return serie2;
	}
	
	public void modificarSerie2(Serie serie2) {
		this.serie2 = serie2;
	}
	public Serie darSerie3() {
		return serie3;
	}
	
	public void modificarSerie3(Serie serie3) {
		this.serie3 = serie3;
	}	
	
	
}