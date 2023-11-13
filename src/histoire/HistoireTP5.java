package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Samourai;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whiskey", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Akimoto", "saké", 80, "Miyamoto");
		
		roro.faireConnaissanceAvec(marco);
		yaku.faireConnaissanceAvec(marco);
		chonin.faireConnaissanceAvec(marco);
		kumi.faireConnaissanceAvec(marco);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("thé");
		
	}

}
