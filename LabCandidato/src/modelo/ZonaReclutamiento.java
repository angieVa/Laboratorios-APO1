package modelo;

import java.util.ArrayList;

/**
 * Entidad que representa una zona geográfica de reclutamiento de personal
 *@author : Angie Valentina Córdoba Pinzón<br>
 */
 
public class ZonaReclutamiento {
	
	/** Array en forma de constante que contiene los paises en los que viven los candidatos */
	public final static String[] PAISES = {"COLOMBIA","VENEZUELA","ARGENTINA","BRASIL","MÉXICO","CHILE"};
	/** Constante que define el peso que tienen las habilidades de comunicación en la evaluación del candidato */
	public final static double PESO_COMUNICACION=0.30;
	/**  Constante que define el peso que tiene la experiencia laboral en la evaluación del candidato */
	public final static double PESO_LABORAL=0.15;
	/** Constante que define el peso de la técnica en la evaluación del candidato   */
	public final static double PESO_TECNICA=0.35;
	/** Constante que define el peso de la actitud en la evaluación del candidatos */
	public final static double PESO_ACTITUD=0.2;
	/** Constante que define la bonificacion que se les da a los candidatos*/
	public final static double BONIFICACION=0.5;
	/** Constante que define el umbral para la evaluación de los candidatos */
	public final static double UMBRAL = 3.5;
	
	
	
	/** Atributo de tipo String que define el nombre del país */
	private String pais;
	
	/** Relacion con la clase candidatos que contiene los datos de todos los candidatos */
	private ArrayList<Candidato> candidatos;
	
	/**<b>Nombre:</b> ZonaReclutamiento <br>
	* Metodo constructor de la clase ZonaReclutamiento <br>
	*@param p : un String que es el nombre del país <br>
	*<b>post:</b> Genera un objeto de la clase ZonaReclutamiento <br>
	*/
	public ZonaReclutamiento(String p) {
		pais = p;
		candidatos = new ArrayList<>();
	}
	
	/**<b>Nombre:</b> darCandidatos<br>
	*Metodo que retorna la relacion de candidatos<br>
	*<b>pre:</b> Debe haber al menos un candidato en el ArrayList de candidatos<br>
	*@return un ArrayList con la lista de candidatos<br>
	*/	
	public ArrayList<Candidato> darCandidatos(){
		return candidatos;
	}
	
	/**<b>Nombre:</b> darPais<br>
	*Metodo que retorna el atributo pais<br>
	*<b>pre:</b> El atributo pais debe ser diferente a null<br>
	*@return un String con el atributo pais<br>
	*/
	public String darPais(){
		return pais;
	}
	
	/**<b>Nombre:</b> agregarCandidato<br>
	*Metodo que permite agregar un candidato a la lista<br>
	*<b>post:</b> Agrega un candidato a la lista<br>
	*@param ident : parametro que es el numero de identidad del candidato <br>
	*@param nom : nombre o nombres del candidato <br>
	*@param ape : apellidos del candidato <br>
	*@param sx : sexo del candidato <br>
	*@param hc : habilidad de comunicación del candidato, debe ser especificada en valor numerico <br>
	*@param hl : historial de trabajo del candidato, debe ser especificada en valor numerico <br>
	*@param ct : competencias técnicas del candidato, debe ser especificada en valor numerico <br>
	*@param a : actitud del candidato, debe ser especificada en valor numerico <br>
	*/	
	public void agregarCandidato(String ident, String nom, String ape, char sx, double hc, double hl, double ct, double a){
		Candidato nuevo = new Candidato(ident, nom, ape, sx, hc, hl, ct, a);
		candidatos.add(nuevo);
	}
	
	public double calcularPromedioCandidatos(){ //tambien se cambio
		double prom = 0;
		
		for (int i = 0; i < candidatos.size(); i++) {
			prom += calcularCalificacionCandidato(i);
		}
		if(candidatos.size()>0){
			prom = prom / candidatos.size(); 
		}
		return prom;
	}
	
	public double calcularCalificacionCandidato(int i){  //viene de selecciondepersonal
		double caliCandi = 0;
		caliCandi = PESO_COMUNICACION*candidatos.get(i).darHabilidadesComunicacion()
				  + PESO_LABORAL*candidatos.get(i).darHabilidadesComunicacion()
				  + PESO_TECNICA*candidatos.get(i).darCompetenciaTecnica()
				  + PESO_ACTITUD*candidatos.get(i).darActitud();
		return caliCandi;
	}
	
	public int contarCandidatosUmbral(){ //Nuevo
		int candi = 0;
		for(int i = 0; i < candidatos.size(); i++){
			if(calcularCalificacionCandidato(i) >= UMBRAL){
				candi++;
			}
		}
		return candi;
	}

	public void filtrarMenoresAValor(double valor) {
		int i=0;

		while(i < candidatos.size()){
	
			double promCandidatoActual = calcularCalificacionCandidato(i);
			if(promCandidatoActual< valor){
				candidatos.remove(i);
			}else{
				i++;
			}
		}		
	}
	
	public void filtrarPorActitud(){
		int i=0;
		while(i < candidatos.size()){
			if(candidatos.get(i).darActitud() < UMBRAL){
				candidatos.remove(i);
			}else{
				i++;
			}
		}
	}
	
	
	public void aplicarBonificacion(){
		for (int i = 0; i < candidatos.size(); i++) {

			double habilidadc = candidatos.get(i).darHabilidadesComunicacion()+BONIFICACION;
			candidatos.get(i).modificarHabilidadesComunicacion(habilidadc);
		
			double historial = candidatos.get(i).darHistoriaLaboral()+BONIFICACION;
			candidatos.get(i).modificarHistoriaLaboral(historial);
			
			double competenciat = candidatos.get(i).darCompetenciaTecnica()+BONIFICACION;
			candidatos.get(i).modificarCompetenciaTecnica(competenciat);
			
			double acti = candidatos.get(i).darActitud()+BONIFICACION;
			candidatos.get(i).modificarActitud(acti);
		}
	}
	
	public int mujeresTotal(){
		int total = 0;
		for(int i = 0; i < candidatos.size(); i++){
			if(candidatos.get(i).esFemenino() == true){
				total++;
			}
		}
		return total;
	}
}