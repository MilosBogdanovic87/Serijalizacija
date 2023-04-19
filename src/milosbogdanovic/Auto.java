package milosbogdanovic;

import java.io.Serializable;

/*Интерфејс Serializable – објаснити и имплементирати*/
/*Interfejs Serializable je interfejs koji služi za označavanje klasa u Javi koje mogu biti serijalizovane, odnosno konvertovane u tok bajta kako bi se sačuvale u datoteci ili poslale preko mreže. Kada klasa implementira ovaj interfejs, ona signalizira da može biti serijalizovana korišćenjem ObjectOutputStream klase.

Serializable interfejs ne sadrži nikakve metode koje je potrebno implementirati, već služi kao oznaka za JVM da klasu može da serijalizuje. Međutim, postoji jedan uslov koji klasa mora da ispuni da bi mogla biti serijalizovana - svi atributi klase koje se serijalizuju takođe moraju da budu serializable ili transient. Atributi koji nisu serializable mogu se označiti kao transient i oni neće biti serijalizovani, već će biti preskočeni prilikom serijalizacije.*/

public class Auto implements Serializable {

	/* Податак serialVersionID објаснити и имплементирати. */
	/*
	 * serialVersionUID je jedinstveni identifikator za klasu koji se koristi
	 * prilikom serijalizacije objekata kako bi se osigurala kompatibilnost između
	 * verzija klase prilikom deserijalizacije. Ovo znači da će svaka instanca klase
	 * imati isti serialVersionUID, što omogućava Java VM-u da utvrdi da li je
	 * deserijalizacija uspešna.
	 */

	private static final long serialVersionUID = -5099036852905961286L;
	public int godiste;
	public int snaga;
	public String marka;

}
