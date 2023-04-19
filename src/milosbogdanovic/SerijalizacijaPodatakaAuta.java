package milosbogdanovic;

/*- Због чега се ради серијализација?  */
/*
 * U Javi se serijalizacija koristi za prenos ili skladištenje objekata koji su kompleksni i sadrže više podataka. Kada se objekat serijalizuje, njegovo trenutno stanje se pretvara u tok bajta koji se može prenositi preko mreže ili sačuvati na disk. Ovaj tok bajta sadrži informacije o tipu i vrednostima svih atributa objekta.
 * 
 * */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerijalizacijaPodatakaAuta {

	public static void main(String[] args) throws IOException {

		Auto automobil = new Auto();

		automobil.godiste = 2018;
		automobil.marka = "Tojota";
		automobil.snaga = 1900;

		try {
			/* Креирање фајла коришћењем серијализације објекта. */
			/*
			 * Da bismo kreirali fajl korišćenjem serijalizacije objekata, potrebno je
			 * koristiti klase ObjectOutputStream i FileOutputStream.
			 */
			FileOutputStream fos = new FileOutputStream("auto.ser");
			/*- Које класе омогућују серијализацију објекта? */
			/* Klasa ObjectOutputStream se koristi za serijalizaciju objekata u tok bajta */
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(automobil);
			fos.close();
			System.out.println("Serijalizovani podaci su sačuvani u auto.ser");

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
