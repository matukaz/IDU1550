package main;

public class Main {
	
 
	/**
	 * @author Matu
	 * 
	 * Klass Point on geomeetriline punkt. See klass annab m�ned meetodid selle punkti liigutamiseks ja v�rdluseks teiste punktidega. 
	 * Lisaks on klassile Point defineeritud klass Route (marsuut). Marsuut on j�rjestatud punktide hulk, mille pikkus on defineeritud,
	 * kui jadas j�rgnevate punktide vahemaade summa. Ehk marsruudi pikkus s�ltub peale punktide koordinaatide ka punktide j�rjekorrast marsruudis.
	 * Marsruuti peab olema v�imalik punkte lisada ja neid eemaldada, peab olema v�imalik leida marsruudi kogupikkust.
	 * 
	 */

	public static void main(String[] args) {

		NormalPoint two = new NormalPoint(-4, 4);
		NormalPoint three = new NormalPoint(0, 4);

		System.out.println(two.distance(three));

	}

}
