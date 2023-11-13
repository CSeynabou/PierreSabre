package personnages;

public class Samourai extends Ronin{
	private String seigneur;
	
	public Samourai(String name, String favDrink, int money, String seigneur) {
		super(name, favDrink, money);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneir Miyamoto");
	}

	public void boire(String boisson) {
		this.parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
		
	}

}
