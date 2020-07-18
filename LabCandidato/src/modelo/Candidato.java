package modelo;

/**
 * Entidad que representa a una persona que aspira a ser contratada por una empresa a través de un proceso de selección
 *@author : Angie Valentina Córdoba Pinzón<br>
 */
public class Candidato {
	
	//cambio -estaban en zona reclutamiento
	
	/**Esta variable se utiliza para identificar el sexo de los candidatos */
	public final static char FEMENINO = 'F';
	/**Esta variable se utiliza para identificar el sexo de los candidatos */
	public final static char MASCULINO = 'M';
	
	
	/**Este atributo identifica el documento de identidad de un candidato */
	private String id;
	/**Este atributo identifica el nombre de un candidato */
	private String nombres;
	/**Este atributo identifica el apellido de un candidato */
	private String apellidos;
	/**Este atributo identifica el género de un candidato*/
	private char sexo;
	/**Este atributo es la calificación numérica en el área de comunicación de un candidato */
	private double habilidadesComunicacion;
	/**Este atributo es la calificación numérica en el área de historia laboral de un candidato */
	private double historiaLaboral;
	/**Este atributo es la calificación numérica en el área de competencia técnica en un candidato */
	private double competenciaTecnica;
	/**Este atributo es la calificación numérica en el área de actitud en un candidato */
	private double actitud;
	
	/** <b>Nombre:</b> Candidato <br>
	*Método constructor de la clase Candidato <br>
	*@param ident : es el numero de identidad del candidato <br>
	*@param nom : es el nombre del candidato <br>
	*@param ape : es el apellido del candidato <br>
	*@param sx : es el sexo del candidato <br>
	*@param habilidadc : es el valor de la habilidad de comunicación del candidato <br>
	*@param historial : es el valor del historial de trabajo del candidato <br>
	*@param competenciat :es el valor de las competencias técnicas del candidato<br>
	*@param acti : es el valor de la actitud del candidato<br>
	*<b>post:</b> Crea un objeto de la clase Candidato <br>
	*/
	public Candidato(String ident, String nom, String ape, char sx, double habilidadc, double historial, double competenciat, double acti){
		id = ident;
		nombres = nom;
		apellidos = ape;
		sexo = sx;
		habilidadesComunicacion = habilidadc;
		historiaLaboral = historial;
		competenciaTecnica = competenciat;
		actitud = acti;
	}
	
	/** <b>Nombre:</b> darId<br>
	*Metodo que retorna el atributo id<br>
	*<b>pre:</b> El atributo id debe ser diferente a null<br>
	*@return un String con el atributo id<br>
	*/	
	public String darId() {
		return id;
	}
	
	/** <b>Nombre:</b> darNombres<br>
	*Metodo que retorna un String con el atributo nombres<br>
	*<b>pre:</b> El atributo nombres debe ser diferente a null<br>
	*@return un String con el atributo nombres<br>
	*/	
	public String darNombres() {
		return nombres;
	}
	
	/**<b>Nombre:</b> darApellidos<br>
	*Metodo que retorna el atributo apellidos<br>
	*<b>pre:</b> El atributo apellidos debe ser diferente a null<br>
	*@return un String con el atributo apellidos<br>
	*/	
	public String darApellidos() {
		return apellidos;
	}
	
	/**<b>Nombre:</b> darSexo<br>
	*Metodo que retorna el atributo sexo<br>
	*<b>pre:</b> El atributo sexo debe ser diferente a null<br>
	*@return un char con el atributo sexo<br>
	*/
	public char darSexo(){
		return sexo;
	}
	
	/**<b>Nombre:</b> darHabilidadesComunicacion<br>
	*Metodo que retorna el atributo darHabilidadesComunicacion<br>
	*<b>pre:</b> El atributo habilidadesComunicacion debe ser diferente a null<br>
	*@return un double con el atributo habilidadesComunicacion<br>
	*/	
	public double darHabilidadesComunicacion() {
		return habilidadesComunicacion;
	}
	
	/**<b>Nombre:</b> darHistoriaLaboral<br>
	*Metodo que retorna el atributo historiaLaboral<br>
	*<b>pre:</b> El atributo historiaLaboral debe ser diferente a null<br>
	*@return un double con el atributo historiaLaboral<br>
	*/	
	public double darHistoriaLaboral() {
		return historiaLaboral;
	}
	
	/**<b>Nombre:</b> darCompetenciaTecnica<br>
	*Metodo que retorna el atributo competenciaTecnica<br>
	*<b>pre:</b> El atributo competenciaTecnica debe ser diferente a null<br>
	*@return un double con el atributo competenciaTecnica<br>
	*/	
	public double darCompetenciaTecnica() {
		return competenciaTecnica;
	}
	
	/**<b>Nombre:</b> darActitud<br>
	*Metodo que retorna el atributo actitud<br>
	*<b>pre:</b> El atributo actitud debe ser diferente a null<br>
	*@return un String con el atributo apellidos<br>
	*/	
	public double darActitud() {
		return actitud;
	}
	
	/**<b>Nombre:</b> modificarHabilidadesComunicacion<br>
	*Metodo que modifica la valoración de las habilidades de comunicación <br>
	*<b>pre:</b> El atributo habilidadesComunicacion debe ser diferente a null<br>
	*<b>post:</b> modifica el atributo habilidadesComunicacion<br>
	*@param habilidadc: Debe ser un double válido que modificará el valor anterior<br>
	*/
	public void modificarHabilidadesComunicacion(double habilidadc){
		habilidadesComunicacion = habilidadc;
		if(habilidadesComunicacion>5){
			habilidadesComunicacion = 5;
		}
	}
	
	/**<b>Nombre:</b> modificarHistoriaLaboral<br>
	*Metodo que modifica la valoración de la historia laboral <br>
	*<b>pre:</b> El atributo historiaLaboral debe ser diferente a null<br>
	*<b>post:</b> modifica el atributo historiaLaboral<br>
	*@param historial: Debe ser un double válido que modificará el valor anterior<br>
	*/
	public void modificarHistoriaLaboral(double historial){
		historiaLaboral = historial;
		if(historiaLaboral>5){
			historiaLaboral = 5;
		}
	}
	
	/**<b>Nombre:</b> modificarCompetenciaTecnica<br>
	*Metodo que modifica la valoración de la competencia técnica <br>
	*<b>pre:</b> El atributo competenciaTecnica debe ser diferente a null<br>
	*<b>post:</b> modifica el atributo competenciaTecnica<br>
	*@param competenciat: Debe ser un double válido que modificará el valor anterior<br>
	*/
	public void modificarCompetenciaTecnica(double competenciat){
		competenciaTecnica = competenciat;
		if(competenciaTecnica>5){
			competenciaTecnica = 5;
		}
	}
	
	/**<b>Nombre:</b> modificarActitud<br>
	*Metodo que modifica la valoración de la actitud <br>
	*<b>pre:</b> El atributo actitud debe ser diferente a null<br>
	*<b>post:</b> modifica el atributo actitud<br>
	*@param acti: Debe ser un double válido que modificará el valor anterior<br>
	*/
	public void modificarActitud(double acti){
		actitud = acti;
		if(actitud>5){
			actitud = 5;
		}
	}
	
	/**<b>Nombre:</b>  esFemenino<br>
	*Metodo que se encarga de confirmar si un canditato es de sexo femenino <br>
	*<b>pre:</b> El atributo sexo del candidato debe ser diferente a null<br>
	*@return un boolean que confirma el sexo <br>
	*/
	public boolean esFemenino(){
		
		boolean fem = false;
		
		if(darSexo() == FEMENINO){
			fem = true;
		}
		return fem;
	}
			
}
