package personnages;

public class Ronin extends Humain{
	
	private int honneur = 1;

	public Ronin(String name, String favDrink, int money) {
		super(name, favDrink, money);
	}
	
	public void donner(Commercant beneficiaire) {
		int don =  this.getMoney()/10;
		this.parler(beneficiaire.getName() + ", je vais te donner " + don + " sous.");
		beneficiaire.recevoir(don);
		this.money -= don;
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = 2*honneur;
		this.parler("Je t'ai retrouvéé, tu vas payer vermine !!");
		if (force >= adversaire.getReputation()) {		
			this.honneur += 1;
			this.money += adversaire.getMoney();
			adversaire.perdre();
			this.parler("Victoire!!! Justice est accomplie.");
		}else {
			this.honneur -= 1;
			adversaire.gagner(this.getMoney());
			this.money = 0;
			this.parler("J'ai perdu, contre " + adversaire.getName() + " quelle honte");
		}
	}
}
