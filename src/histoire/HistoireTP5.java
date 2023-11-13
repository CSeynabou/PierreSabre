package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whiskey", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		roro.faireConnaissanceAvec(marco);
		yaku.faireConnaissanceAvec(marco);
		chonin.faireConnaissanceAvec(marco);
		kumi.faireConnaissanceAvec(marco);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
	}

}