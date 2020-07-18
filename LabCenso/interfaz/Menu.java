package interfaz;
import modelo.*;
import java.util.Scanner;

	public class Menu {
	

	public static void main(String[] args) {
		
		Pais Censo;
		Departamento CensoDepto = new Departamento("Departamento");
		Municipio[] CensoMuni = new Municipio[5];
 
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("BIENVENIDO AL PROGRAMA SOBRE EL CENSO DEL PAIS ");
		System.out.println("--------------------------------------------------------------------------------");
		Scanner entrada = new Scanner(System.in);
		
		Censo = new Pais();
		
		System.out.println("El departamento #1 es: " + Censo.darNombreDepto0());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #2 es: " + Censo.darNombreDepto1());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #3 es: " + Censo.darNombreDepto2());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #4 es: " + Censo.darNombreDepto3());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #5 es: " + Censo.darNombreDepto4());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #6 es: " + Censo.darNombreDepto5());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #6 es: " + Censo.darNombreDepto5());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #7 es: " + Censo.darNombreDepto6());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
	
		System.out.println("El departamento #8 es: " + Censo.darNombreDepto7());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #9 es: " + Censo.darNombreDepto8());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #10 es: " + Censo.darNombreDepto9());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #11 es: " + Censo.darNombreDepto10());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #12 es: " + Censo.darNombreDepto11());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #13 es: " + Censo.darNombreDepto12());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #14 es: " + Censo.darNombreDepto13());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #15 es: " + Censo.darNombreDepto14());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #16 es: " + Censo.darNombreDepto15());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #17 es: " + Censo.darNombreDepto16());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #18 es: " + Censo.darNombreDepto17());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #19 es: " + Censo.darNombreDepto18());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #20 es: " + Censo.darNombreDepto19());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #21 es: " + Censo.darNombreDepto20());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #22 es: " + Censo.darNombreDepto21());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #23 es: " + Censo.darNombreDepto22());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #24 es: " + Censo.darNombreDepto23());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #25 es: " + Censo.darNombreDepto24());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #26 es: " + Censo.darNombreDepto25());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #27 es: " + Censo.darNombreDepto26());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #28 es: " + Censo.darNombreDepto27());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #29 es: " + Censo.darNombreDepto28());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #30 es: " + Censo.darNombreDepto29());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #31 es: " + Censo.darNombreDepto30());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		System.out.println("El departamento #32 es: " + Censo.darNombreDepto31());
		
		for(int i = 0; i < 5; i++){
			
			CensoMuni = new Municipio[i];
		
		System.out.println("Ingrese la informacion de los municipios");
		
		System.out.println("Ingrese el nombre del municipio: ");
		String elNombre = entrada.next(); 
		System.out.println("Ingrese la poblacion: ");
		int laPoblacion = entrada.nextInt();
		System.out.println("Ingrese la cantidad de hombres: ");
		int cHombres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		int cMujeres = entrada.nextInt();
		System.out.println("Ingrese la cantidad de adultos Mayores: ");
		int cAdultosM = entrada.nextInt();
		System.out.println("Ingrese la edad promedio: ");
		double Epromedio = entrada.nextDouble();
		System.out.println("Digite el ingreso promedio: ");
		double Ipromedio = entrada.nextDouble();
		CensoDepto.MunicipiosPertenecientes[i] = new Municipio(elNombre, laPoblacion, cHombres, cMujeres, cAdultosM, Epromedio, Ipromedio);
		}
		
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("DIGITE 1 PARA CONSULTAR EL CENSO TOTAL DE UN DEPARTAMENTO");
		System.out.println("DIGITE 2 PARA CONSULTAR EL CENSO TOTAL DEL PAIS");
		System.out.println("DIGITE 3 PARA CONSULTAR SI EXISTEN DEPARTAMENTOS CON UN INGRESO SUPERIOR A UN VALOR DADO");
		System.out.println("DIGITE 4 PARA CONSULTAR SI EXISTEN DEPARTAMENTOS CON UNA POBLACION IGUAL A UN VALOR DADO");
		System.out.println("DIGITE 5 PARA BUSCAR UN MUNICIPIO");
		System.out.println("----------------------------------------------------------------------------------------------");
		
		if (entrada.nextInt() == 1) {
			
		System.out.println("Ingrese el nombre del departamento");
		String nDepto = entrada.next();
		
		int totalCenso = 0;
		
			if(nDepto.equals("Amazonas")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[0].calcularPoblacionDeptos());
			}
			
			else if(nDepto.equals("Antioquia")) {
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[1].calcularPoblacionDeptos());
			}
			
			else if(nDepto.equals("Arauca")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[2].calcularPoblacionDeptos());
			}
			
			else if (nDepto.equals("Atlantico")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[3].calcularPoblacionDeptos());
			}
			
			else if (nDepto.equals("Bolivar")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[4].calcularPoblacionDeptos());
			}
			
			else if (nDepto.equals("Boyaca")){
			
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[5].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Caldas")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[6].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Caqueta")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[7].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Casanare")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[8].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Cauca")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[9].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Cesar")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[10].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Choco")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[11].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Cordoba")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[12].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Cundinamarca")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[13].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Guainia")){
					
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[14].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Guajira")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[15].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Guaviare")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[16].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Huila")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[17].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Magdalena")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[18].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Meta")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[19].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Nariño")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[20].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Norte de Santander")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[21].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Putumayo")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[22].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Quindio")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[23].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Risaralda")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[24].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("San Andres y Providencia")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[25].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Santander")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[26].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Sucre")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[27].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Tolima")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[28].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Valle del Cauca")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[29].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Vaupes")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[29].calcularPoblacionDeptos());
			
			}
			
			else if (nDepto.equals("Vichada")){
				
				System.out.println("La poblacion total del departamento es " + Censo.Departamentos[30].calcularPoblacionDeptos());
			
			}
			
		}
			
		if (entrada.nextInt() == 2){
				
			System.out.println("La poblacion total del pais es: " + Censo.calcularPoblacionTotal());
		}
	
		if (entrada.nextInt() == 3){
			
			int valorIng = 0; 
			
			System.out.println("Ingrese un valor para comparar ingresos");
			
			valorIng = entrada.nextInt();
			
			System.out.println(Censo.calcularIngresosSuperior(valorIng));
		}
		
		if (entrada.nextInt() == 4){
			
			int valorPoblacion = 0;
			
			System.out.println("Ingrese un valor para comparar poblacion");
			
			valorPoblacion = entrada.nextInt();
			
			System.out.println(Censo.calcularPoblacionIgual(valorPoblacion));
		}
		
	}
}