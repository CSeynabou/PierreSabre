package histoire;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String name, String favDrink, int money, String clan) {
		super(name, favDrink, money);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int argentVole = victime.getMoney();
		this.money += argentVole;
		this.parler("Mais ça serait y pas un faible petit marchand");
		this.parler(victime.getName() + " si tu tiens à la vie, ta bourse.");
		victime.seFaireExtorquer();
		this.reputation += 1;
		this.parler("Hehehe j'ai extorqué " + argentVole + " sous à un commerçant. Ma réputation va en grandissant." );
	}
	

}
