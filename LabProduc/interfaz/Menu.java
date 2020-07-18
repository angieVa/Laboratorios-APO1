package interfaz;
import Modelo.ProductoraTV;
import Modelo.Serie;
import Modelo.Actor;


	public class Menu {
	
	
	
	public static void main(String[] args) {
		ProductoraTV laProductora;
		
		System.out.println("Bienvenidos al programa de informacion sobre la productora");
		
		laProductora = new ProductoraTV("The CW Network", "RDJ261544");
	
		laProductora.calcularPresupuestoTotal();
		
		System.out.println("Productora: " + laProductora.darNombre() + "   Codigo: " + laProductora.darCodigo());
	
		System.out.println("El presupuesto total es: " + laProductora.calcularPresupuestoTotal() + " USD");
		
		//SERIE1
			System.out.println("La serie 1 es: " +laProductora.darSerie1().darNombre());
			System.out.println("Capitulos: " +laProductora.darSerie1().darCantidadCapitulo());
			System.out.println("Duracion por capitulo: " +laProductora.darSerie1().darDuracionCapitulo());
			System.out.println("Genero: " +laProductora.darSerie1().darGenero());
			System.out.println("Clasificacion para la audiencia: " +laProductora.darSerie1().darClasAudiencia());
			System.out.println("Temporadas: " +laProductora.darSerie1().darTemporada());
			System.out.println("El presupuesto de la serie es: " +laProductora.darSerie1().calcularPresupuestoSerie());

			System.out.println("Actor Principal: " +laProductora.darSerie1().darActorPrin().darNombre());
			System.out.println("Edad: " +laProductora.darSerie1().darActorPrin().darEdad());
			System.out.println("Cedula: " +laProductora.darSerie1().darActorPrin().darCedula());
			System.out.println("Cuenta Bancaria: " +laProductora.darSerie1().darActorPrin().darCuentaBancaria());
			
			System.out.println("Actor de Reparto 1: " +laProductora.darSerie1().darActorR1().darNombre());
			System.out.println("Edad: " +laProductora.darSerie1().darActorR1().darEdad());
			System.out.println("Cedula: " +laProductora.darSerie1().darActorR1().darCedula());
			System.out.println("Cuenta Bancaria: " +laProductora.darSerie1().darActorR1().darCuentaBancaria());
			
			System.out.println("Actor de Reparto 2: " +laProductora.darSerie1().darActorR2().darNombre());
			System.out.println("Edad: " +laProductora.darSerie1().darActorR2().darEdad());
			System.out.println("Cedula: " +laProductora.darSerie1().darActorR2().darCedula());
			System.out.println("Cuenta Bancaria: " +laProductora.darSerie1().darActorR2().darCuentaBancaria());
			
		//SERIE2	
			System.out.println("La serie 2 es: " +laProductora.darSerie2().darNombre());
			System.out.println("Capitulos: " +laProductora.darSerie2().darCantidadCapitulo());
			System.out.println("Duracion por capitulo: " +laProductora.darSerie2().darDuracionCapitulo());
			System.out.println("Genero: " +laProductora.darSerie2().darGenero());
			System.out.println("Clasificacion para la audiencia: " +laProductora.darSerie2().darClasAudiencia());
			System.out.println("Temporadas: " +laProductora.darSerie2().darTemporada());
			System.out.println("El presupuesto de la serie es: " +laProductora.darSerie2().calcularPresupuestoSerie());

			System.out.println("Actor Principal: " +laProductora.darSerie2().darActorPrin().darNombre());
			System.out.println("Edad: " +laProductora.darSerie2().darActorPrin().darEdad());
			System.out.println("Cedula: " +laProductora.darSerie2().darActorPrin().darCedula());
			System.out.println("Cuenta Bancaria: " +laProductora.darSerie2().darActorPrin().darCuentaBancaria());
			
			System.out.println("Actor de Reparto 1: " +laProductora.darSerie2().darActorR1().darNombre());
			System.out.println("Edad: " +laProductora.darSerie2().darActorR1().darEdad());
			System.out.println("Cedula: " +laProductora.darSerie2().darActorR1().darCedula());
			System.out.println("Cuenta Bancaria: " +laProductora.darSerie2().darActorR1().darCuentaBancaria());
			
			System.out.println("Actor de Reparto 2: " +laProductora.darSerie2().darActorR2().darNombre());
			System.out.println("Edad: " +laProductora.darSerie2().darActorR2().darEdad());
			System.out.println("Cedula: " +laProductora.darSerie2().darActorR2().darCedula());
			System.out.println("Cuenta Bancaria: " +laProductora.darSerie2().darActorR2().darCuentaBancaria());
			
		//SERIE3
			System.out.println("La serie 3 es: " +laProductora.darSerie3().darNombre());
			System.out.println("Capitulos: " +laProductora.darSerie3().darCantidadCapitulo());
			System.out.println("Duracion por capitulo: " +laProductora.darSerie3().darDuracionCapitulo());
			System.out.println("Genero: " +laProductora.darSerie3().darGenero());
			System.out.println("Clasificacion para la audiencia: " +laProductora.darSerie3().darClasAudiencia());
			System.out.println("Temporadas: " +laProductora.darSerie3().darTemporada());
			System.out.println("El presupuesto de la serie es: " +laProductora.darSerie3().calcularPresupuestoSerie());

			System.out.println("Actor Principal: " +laProductora.darSerie3().darActorPrin().darNombre());
			System.out.println("Edad: " +laProductora.darSerie3().darActorPrin().darEdad());
			System.out.println("Cedula: " +laProductora.darSerie3().darActorPrin().darCedula());
			System.out.println("Cuenta Bancaria: " +laProductora.darSerie3().darActorPrin().darCuentaBancaria());
			
			System.out.println("Actor de Reparto 1: " +laProductora.darSerie3().darActorR1().darNombre());
			System.out.println("Edad: " +laProductora.darSerie3().darActorR1().darEdad());
			System.out.println("Cedula: " +laProductora.darSerie3().darActorR1().darCedula());
			System.out.println("Cuenta Bancaria: " +laProductora.darSerie3().darActorR1().darCuentaBancaria());
			
			System.out.println("Actor de Reparto 2: " +laProductora.darSerie3().darActorR2().darNombre());
			System.out.println("Edad: " +laProductora.darSerie3().darActorR2().darEdad());
			System.out.println("Cedula: " +laProductora.darSerie3().darActorR2().darCedula());
			System.out.println("Cuenta Bancaria: " +laProductora.darSerie3().darActorR2().darCuentaBancaria());
			
			
		
}
}