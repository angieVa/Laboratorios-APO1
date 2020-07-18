package Modelo;

public class Serie {

	//CONSTANTE
	
	public static final int CantActores = 1000; 

	//ATRIBUTOS
	private String nombre;
	private int CantidadCapitulo;
	private int DuracionCapitulo;
	private String genero;
	private String ClasAudiencia;
	private int temporada;
	
	//RELACIONES
	private Actor Actores;
	
	Actor[] = new Actores[CantActores];
	
	
	//METODOS 

	
	public Serie(String elNombre, int cantCaps, int duraCaps, String gen, String clasificaAud, int temp) {
		
		nombre = elNombre;
		CantidadCapitulo = cantCaps;
		DuracionCapitulo = duraCaps;
		genero = gen;
		ClasAudiencia = clasificaAud;
		temporada = temp;
		
	}
		
	public String darNombre() {
		return nombre;
	}
	
	public void modificarNombre(String elNombre) {
		nombre = elNombre;
	}
	
	public int darCantidadCapitulo() {
		return CantidadCapitulo;
	}
	
	public void modificarCantidadCapitulo(int cantCaps) {
		CantidadCapitulo = cantCaps;
	}
	
	public int darDuracionCapitulo() {
		return DuracionCapitulo;
	}
	
	public void modificarDuracionCapitulo(int duraCaps) {
		DuracionCapitulo = duraCaps;
	}
	public String darGenero() {
		return genero;
	}
	
	public void modificarGenero(String gen) {
		genero = gen;
	}
	
	public String darClasAudiencia() {
		return ClasAudiencia;
	}
	
	public void modificarClasAudiencia(String clasificaAud) {
		ClasAudiencia = clasificaAud;
	}
	
	public int darTemporada() {
		return temporada;
	}
	
	public void modificarTemporada(int temp) {
		temporada = temp;
	}
	
	
	//RELACIONES METODOS

	
	//PRESUPUESTO
	
	public double calcularPresupuestoSerie(){
		int duracionTotal = CantidadCapitulo * DuracionCapitulo;
		
		double presupuesto = (duracionTotal * (25+11+11));
		
		presupuesto = presupuesto +10000;
		
		return presupuesto;
}

}