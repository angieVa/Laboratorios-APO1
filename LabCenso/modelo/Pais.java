package modelo;

public class Pais {


	
	//RELACIONES
	
	public Departamento[] Departamentos;
	
	//CONSTRUCTOR
	
	public Pais(){
		
		
		Departamentos = new Departamento[32];
		
		
		Departamentos[0] = new Departamento("Amazonas");
		Departamentos[1] = new Departamento("Antioquia");
		Departamentos[2] = new Departamento("Arauca");
		Departamentos[3] = new Departamento("Atlantica");
		Departamentos[4] = new Departamento("Bolivar");
		Departamentos[5] = new Departamento("Boyaca");
		Departamentos[6] = new Departamento("Caldas");
		Departamentos[7] = new Departamento("Caqueta");
		Departamentos[8] = new Departamento("Casanare");
		Departamentos[9] = new Departamento("Cauca");
		Departamentos[10] = new Departamento("Cesar");
		Departamentos[11] = new Departamento("Choco");
		Departamentos[12] = new Departamento("Cordoba");
		Departamentos[13] = new Departamento("Cundinamarca");
		Departamentos[14] = new Departamento("Guainia");
		Departamentos[15] = new Departamento("Guajira");
		Departamentos[16] = new Departamento("Guaviare");
		Departamentos[17] = new Departamento("Huila");
		Departamentos[18] = new Departamento("Magdalena");
		Departamentos[19] = new Departamento("Meta");
		Departamentos[20] = new Departamento("Nariño");
		Departamentos[21] = new Departamento("Norte de Santander");
		Departamentos[22] = new Departamento("Putumayo");
		Departamentos[23] = new Departamento("Quindio");
		Departamentos[24] = new Departamento("Risaralda");
		Departamentos[25] = new Departamento("San Andres y Providencia");
		Departamentos[26] = new Departamento("Santander");
		Departamentos[27] = new Departamento("Sucre");
		Departamentos[28] = new Departamento("Tolima");
		Departamentos[29] = new Departamento("Valle del Cauca");
		Departamentos[30] = new Departamento("Vaupes");
		Departamentos[31] = new Departamento("Vichada");
		
	}
	
	
	
	
	//REQUERIMIENTOS
	
	public Departamento[] darDepartamentos() {
		return Departamentos;
	}
	
	
	public boolean calcularPoblacionIgual(int valorPoblacion) {
		
	boolean pobIgual = false;
	
		for (int indice = 0; indice < 32; indice++){
		
		if (Departamentos[indice].calcularPoblacionDeptos() == valorPoblacion) {
			pobIgual = true;
			
		}
		}
		return pobIgual;
	
	}
	

	public boolean calcularIngresosSuperior(int valorIng) {
		
	boolean ingTotal = false;
		
		for (int indice = 0; indice < 32; indice++){
			
		if (Departamentos[indice].calcularIngresoDepto() > valorIng ) {
			
			ingTotal = true;
		}
		}
		return ingTotal;
	}
	
	//CANTIDAD POBLACION TOTAL PAIS
	public int calcularPoblacionTotal() {
		
		int poblaTotal = 0;
		
		for(int indice = 0; indice < 32; indice++){
			
			poblaTotal += Departamentos[indice].calcularPoblacionDeptos();
		}
		
		return poblaTotal;
		
	}
	
	//CANTIDAD HOMBRE TOTAL PAIS
	public int calcularHombresTotal() {
		
		int HombresTotal = 0;
		
		for(int indice = 0; indice < 32; indice++) {
				HombresTotal += Departamentos[indice].calcularCantidadHomb();
		}
		return HombresTotal;
	}
	
	//CANTIDAD MUJERES TOTAL PAIS
	public int calcularMujeresTotal() {
		
		int MujeresTotal = 0;
		
		for(int indice = 0; indice < 32; indice++) {
			
			MujeresTotal += Departamentos[indice].calcularCantidadMujer();
		}
		return MujeresTotal;
	}
	
	//CANTIDAD ADULTO MAYOR TOTAL PAIS 
	public int calcularAdultosMayoresTotal() {
		
		int AdultoMTotal = 0;
		
		for(int indice = 0; indice < 32; indice++) {
			AdultoMTotal += Departamentos[indice]. calcularCantidadAdultosM();
		}
		return AdultoMTotal;
	}
	
	
	//INGRESOS TOTAL PAIS
	public double calcularIngresoTotal() {
		
		double ingresoTotal = 0;
		double poblaDepto = 0;
		double poblaDeptoT = 0;
		
		for (int indice = 0; indice < 32; indice++) {
			
			poblaDepto = Departamentos[indice].calcularPoblacionDeptos();
			poblaDeptoT += poblaDepto;
			
			ingresoTotal += (Departamentos[indice].calcularIngresoDepto() * poblaDepto);
		}
		
		ingresoTotal = ingresoTotal / poblaDeptoT;
		return ingresoTotal;
	}
	
	//EDAD TOTAL PAIS
	
	public double calcularEdadTotal() {
		
		double EdadTotal = 0;
		double poblaDepto = 0;
		double poblaDeptoT = 0;
		
		for (int indice = 0; indice < 32; indice++) {
			
			poblaDepto = Departamentos[indice].calcularPoblacionDeptos();
			poblaDeptoT += poblaDepto;
			
			EdadTotal += (Departamentos[indice].calcularEdadDepto() * poblaDepto);
		}
		
		EdadTotal = EdadTotal / poblaDeptoT;
		return EdadTotal;
	}
	
	public String darNombreDepto0() {
		
		return Departamentos[0].darNombre();
	}
	
	public String darNombreDepto1() {
		
		return Departamentos[1].darNombre();
	}
	
	public String darNombreDepto2() {
		
		return Departamentos[2].darNombre();
	}
	
	public String darNombreDepto3() {
		
		return Departamentos[3].darNombre();
	}
	
	public String darNombreDepto4() {
		
		return Departamentos[4].darNombre();
	}
	
	public String darNombreDepto5() {
		
		return Departamentos[5].darNombre();
	}
	
	public String darNombreDepto6() {
		
		return Departamentos[6].darNombre();
	}
	
	public String darNombreDepto7() {
		
		return Departamentos[7].darNombre();
	}
	public String darNombreDepto8() {
		
		return Departamentos[8].darNombre();
	}
	
	public String darNombreDepto9() {
		
		return Departamentos[9].darNombre();
	}
	
	public String darNombreDepto10() {
		
		return Departamentos[10].darNombre();
	}
	
	public String darNombreDepto11() {
		
		return Departamentos[11].darNombre();
	}
	
	public String darNombreDepto12() {
		
		return Departamentos[12].darNombre();
	}
	
	public String darNombreDepto13() {
		
		return Departamentos[13].darNombre();
	}
	
	public String darNombreDepto14() {
		
		return Departamentos[14].darNombre();
	}
	
	public String darNombreDepto15() {
		
		return Departamentos[15].darNombre();
	}
	
	public String darNombreDepto16() {
		
		return Departamentos[16].darNombre();
	}
	
	public String darNombreDepto17() {
		
		return Departamentos[17].darNombre();
	}
	
	public String darNombreDepto18() {
		
		return Departamentos[18].darNombre();
	}
	
	public String darNombreDepto19() {
		
		return Departamentos[19].darNombre();
	}
	
	public String darNombreDepto20() {
		
		return Departamentos[20].darNombre();
	}
	
	public String darNombreDepto21() {
		
		return Departamentos[21].darNombre();
	}
	
	public String darNombreDepto22() {
		
		return Departamentos[22].darNombre();
	}
	
	public String darNombreDepto23() {
		
		return Departamentos[23].darNombre();
	}
	
	public String darNombreDepto24() {
		
		return Departamentos[24].darNombre();
	}
	
	public String darNombreDepto25() {
		
		return Departamentos[25].darNombre();
	}
	
	public String darNombreDepto26() {
		
		return Departamentos[26].darNombre();
	}
	
	public String darNombreDepto27() {
		
		return Departamentos[27].darNombre();
	}
	
	public String darNombreDepto28() {
		
		return Departamentos[28].darNombre();
	}
	
	public String darNombreDepto29() {
		
		return Departamentos[29].darNombre();
	}
	
	public String darNombreDepto30() {
		
		return Departamentos[30].darNombre();
	}
	
	public String darNombreDepto31() {
		
		return Departamentos[31].darNombre();
	}
	
}