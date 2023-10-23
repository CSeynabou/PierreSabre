package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 1;
	
	public Yakuza(String name, String favDrink, int money, String clan) {
		super(name, favDrink, money);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
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
	
	public void perdre() {
		this.reputation -= 1;
		this.parler("Argh, j'ai perdu mes " + this.getMoney() + " sous et déshonoré le clan " + this.clan );
		this.money = 0;
	}
	
	public void gagner(int gain) {
		this.money += gain;
		this.reputation += 1;
		this.parler("VICTOIRE HAHAH! Comme si cet imbécile pouvait me battre moi " + this.getName() + " du clan de " + this.clan);
	}
	

}
