package milosbogdanovic;

/*- Због чега се ради десеријализација објекта?  */

/*
 * Deserijalizacija se koristi za pretvaranje objekata koji su bili serijalizovani u tok bajta nazad u objekat u memoriji sa originalnim vrednostima atributa. Ovo se koristi u slučajevima kada treba da se obnovi stanje aplikacije koje je bilo sačuvano serijalizacijom, ili kada se dobija tok bajta od drugog procesa ili sistema koji sadrži serijalizovan objekat.
 * */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserijalizacijaPodatakaAuta {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Auto automobil = null;

		try {

			FileInputStream fis = new FileInputStream("auto.ser");
			/*- Које класе омогућују десеријализацију објеката? */
			/*
			 * Klasa ObjectInputStream koristi za deserijalizaciju objekata iz tokova bajta
			 */
			ObjectInputStream ois = new ObjectInputStream(fis);
			automobil = (Auto) ois.readObject();
			ois.close();
			fis.close();

		} finally {

			System.out.println("Deserijalizacija Auta...");
			System.out.println("Godište: " + automobil.godiste);
			System.out.println("Marka vozila: " + automobil.marka);
			System.out.println("Snaga: " + automobil.snaga);

		}

	}

}
