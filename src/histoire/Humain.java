package histoire;

public class Humain {
	private String name;
	private String favDrink;
	private int money;

	public Humain(String name, String favDrink, int money) {
		this.name = name;
		this.favDrink = favDrink;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}
	
	private void parler(String texte) {
		System.out.println(this.getName() + ": " + texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour! Je m'appelle " + getName() + " et j'aime boire du " + this.favDrink);
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de " + this.favDrink + " ! GLOUPS!");
	}
	
	public void acheter(String bien, int prix) {
		if (getMoney() < prix) {
			this.parler("Je n'ai plus que " + getMoney( )+ " sous en poche. Je ne peux même pas m'offrir "  + bien + " à " + prix + " sous.");
		}else {
			this.parler("J'ai " + getMoney() + " sous en poche. Je vais pouvoir m'offir " + bien + " à " + prix + " sous. ");
		}
	}
	
	public void gagnerArgent(int gain) {
		this.money += gain;
		System.out.println("Lezgongue j'ai gagné " + gain + " sous.");
	}
	
	public void perdreArgent(int perte) {
		this.money -= perte;
		System.out.println("Oh noooon j'ai perdu " + perte + " sous.");
	}
}
