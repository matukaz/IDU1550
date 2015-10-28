package main;

public class Main {
	
 
	/**
	 * @author Matu
	 * 
	 * Klass Point on geomeetriline punkt. See klass annab mõned meetodid selle punkti liigutamiseks ja võrdluseks teiste punktidega. 
	 * Lisaks on klassile Point defineeritud klass Route (marsuut). Marsuut on järjestatud punktide hulk, mille pikkus on defineeritud,
	 * kui jadas järgnevate punktide vahemaade summa. Ehk marsruudi pikkus sõltub peale punktide koordinaatide ka punktide järjekorrast marsruudis.
	 * Marsruuti peab olema võimalik punkte lisada ja neid eemaldada, peab olema võimalik leida marsruudi kogupikkust.
	 * 
	 */

	public static void main(String[] args) {

		NormalPoint two = new NormalPoint(-4, 4);
		NormalPoint three = new NormalPoint(0, 4);

		System.out.println(two.distance(three));

	}

}
