package modelo;

public class Libreria {


	//ATRIBUTOS
	
	private String nombre;
	private String nit;
	private String direccion;

	
	//RELACION
	
	private Libro[] librosDispo;
	
	
	
	
	//CONSTRUCTOR
	
	public Libreria(String elNombre, String elNit, String laDireccion){
		
		nombre = elNombre;
		nit = elNit;
		direccion = laDireccion;
		librosDispo = new Libro[500];
	
		
	}
	
	//METODOS
	
	public String darNombre() {
		return nombre;
	}
	public void modificarNombre(String elNombre) {
		nombre = elNombre;
	}
	
	public String darNit() {
		return nit;
	}
	public void modificarNit(String elNit) {
		nit = elNit;
	}
	
	public String darDireccion() {
		return direccion;
	}
	public void modificarDireccion(String laDireccion) {
		direccion = laDireccion;
	}

	//4
	
	public String darLibro (int pos){
		if(librosDispo[pos] != null)
		return librosDispo[pos].darNombre();
		else return null;
	}
	
	
		//5
		
	public boolean estaLibro (String nombre){
	boolean esta=false;
	for (int i = 0 ; i < librosDispo.length ; i++){
		if  ( nombre.equals(librosDispo[i].darNombre())){
			 esta = true;
	}}
	return esta;
	}	
	
	//6
		
	public int contarNacionales() {
		
		int nacional = 0;
		
	
		for(int indice = 0; indice < librosDispo.length ; indice++) {
			
			if( librosDispo[indice].darPais().equals("nacional"))
				
				 nacional += 1;
			
		}
		return nacional;
	}
	
	
	//NO COMPILA ESTE METODO
	public boolean agregarLibro (todos los parametros){
		
		boolean seAgrego = false;
		
		Libro nuevoLibro = new Libro(dia ........)
		
		for (int i = 0; ilibrosDispo.length && !seAgrego; i++){
			
			if(libros[i] == null) {
				libros[1] = nuevoLibro;
				seAgrego = true;
			}
		}
	}
	
	public int contarPaginas() {
		
		int suma = 0;
		
		for (int indice = 0; indice < librosDispo.length; indice++) {
			
			suma += librosDispo[indice].darCantidadPag();
		}
		return suma;
	}
	
	public Libro masViejo() {
		Libro viejo = null;
		
		int i = 0;
		
		for(; i < librosDispo.length && viejo == null; i++) {
			viejo = librosDispo[i];
		}
		
		for(; i < librosDispo.length; ++i)
		
		
}