package histoire;

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
	
}
