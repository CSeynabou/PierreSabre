package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Louis", "kombucha", 54);
		Yakuza noir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "schochu", 60);
		Commercant marco = new Commercant("Marco", 20);
		
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		System.out.println("");
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println("");
		
		noir.direBonjour();
		noir.extorquer(marco);
		
		System.out.println("");
		
		roro.direBonjour();
		roro.donner(marco);
		
		System.out.println("");

		roro.provoquer(noir);

	}

}
