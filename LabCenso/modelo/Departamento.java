package modelo;

public class Departamento {

	//ATRIBUTOS
	
	private String nombre;
	
	//RELACIONES
	
	public Municipio[] MunicipiosPertenecientes;

	
	
	//CONSTRUCTOR
	
	public Departamento(String elNombre){
		
		nombre = elNombre;
		
		MunicipiosPertenecientes = new Municipio [5];
		
	}
	
	
	public String darNombre() {
		return nombre;
	}
	public void modificarNombre(String elNombre){
		nombre = elNombre;
	}
	
	public Municipio[] darMunicipiosPertenecientes(){
		return MunicipiosPertenecientes;
	}
	
	public void ModificarMunicipiosPertenecientes(Municipio[] mun) {
		MunicipiosPertenecientes = mun;
	}
	
	
	//METODOS
	
	//CANTIDAD POBLACION DEPARTAMENTO
	
	public int calcularPoblacionDeptos() {
		
		int poblaDepartamento = 0;
		
		for(int indice = 0; indice < 5; indice++){
			
			poblaDepartamento += MunicipiosPertenecientes[indice].darPoblacion();
		}
		
		return poblaDepartamento;
		
	}
	
	//CANTIDAD HOMBRES DEPARTAMENTO
	public int calcularCantidadHomb() {
		
		int HombresDepto = 0;
		
		for(int indice = 0; indice < 5; indice++){
			
			HombresDepto += MunicipiosPertenecientes[indice].darCantidadHombres();
		}
		
		return HombresDepto;
	}
	
	//CANTIDAD MUJERES DEPARTAMENTO
	public int calcularCantidadMujer() {
		
		int MujeresDepto = 0;
		
		for(int indice = 0; indice < 5; indice++){
			
			MujeresDepto += MunicipiosPertenecientes[indice].darCantidadMujeres();
		}
		return MujeresDepto;
	}
	
	//CANTIDAD ADULTOS MAYORES DEPARTAMENTO
	public int calcularCantidadAdultosM() {
		int AdultoM = 0;
		
		for(int indice = 0; indice < 5; indice++){
			
			AdultoM += MunicipiosPertenecientes[indice].darCantidadAdulMayores();
		}
		return AdultoM;
	}
	
	
	//INGRESOS DEPARTAMENTO
	public double calcularIngresoDepto() {
		
		double ingresoDepto = 0;
		double poblaMuni = 0;
		double poblaMuniT = 0;
		
		for (int indice = 0; indice < 5; indice++) {
			
			poblaMuni = MunicipiosPertenecientes[indice].darPoblacion();
			poblaMuniT += poblaMuni;
			
			ingresoDepto += (MunicipiosPertenecientes[indice].darIngresoPromedio() * poblaMuni);
		}
		
		ingresoDepto = ingresoDepto / poblaMuniT;
		
		return ingresoDepto;
	}
	
	//EDAD DEPARTAMENTO
	
	public double calcularEdadDepto() {
		
		double edadDepto = 0;
		double poblaMuni = 0;
		double poblaMuniT = 0;
		
		for (int indice = 0; indice < 5; indice++) {
			
			poblaMuni = MunicipiosPertenecientes[indice].darPoblacion();
			poblaMuniT += poblaMuni;
			
			edadDepto += (MunicipiosPertenecientes[indice].darEdadPromedio() * poblaMuni);
		}
		
		edadDepto = edadDepto / poblaMuniT;
		
		return edadDepto;
	}

}