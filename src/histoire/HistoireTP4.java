package histoire;

public class HistoireTP4 {

	public static void main(String[] args) {
		//Humain prof = new Humain("Louis", "kombucha", 54);
		//prof.direBonjour();
		//prof.acheter("une boisson", 12);
		//prof.boire();
		//prof.acheter("un jeu", 2);
		//prof.acheter("un kimono", 50);
		
		Commercant marco = new Commercant("Marco", 20);
		Yakuza noir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		noir.direBonjour();
		noir.extorquer(marco);
		
		//marco.direBonjour();
		//marco.seFaireExtorquer();
		//marco.recevoir(15);
		//marco.boire();
		

	}

}
