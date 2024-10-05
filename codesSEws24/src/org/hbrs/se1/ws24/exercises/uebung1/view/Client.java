package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.Factory;
import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;
public class Client {
	private Translator translator;
		/**
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */

	public Client() {
		// Die Factory wird verwendet, um das GermanTranslator-Objekt zu erzeugen
		this.translator = Factory.createTranslator();
	}
		 void display( int aNumber ){
			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung (nur) gegen das Interface Translator gewuenscht!
			 String ausgabenummer = translator.translateNumber(aNumber);
			 System.out.println("Das Ergebnis der Berechnung: " + ausgabenummer);

		 }
}



