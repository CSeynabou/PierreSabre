package personnages;

import java.util.Iterator;

public class Humain {
	private String name;
	private String favDrink;
	protected int money;
	protected int nbConnaissances = 0;
	protected Humain[] connaissances;

	public Humain(String name, String favDrink, int money) {
		this.name = name;
		this.favDrink = favDrink;
		this.money = money;
		this.connaissances = new Humain[30];
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	protected void parler(String texte) {
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
	
	protected void gagnerArgent(int gain) {
		this.money += gain;
		this.parler("Lezgongue j'ai gagné " + gain + " sous.");
	}
	
	protected void perdreArgent(int perte) {
		this.money -= perte;
		this.parler("Oh noooon j'ai perdu " + perte + " sous.");
	}
	
	private void memoriser(Humain autreHumain) {
		this.connaissances[nbConnaissances%30] = autreHumain;	
		this.nbConnaissances ++;
	}
	
	private void repondre(Humain humain) {
		humain.direBonjour();
	}
	
	public void listerConnaissance() {
		String listeConnaissance = "Je connais beaucoup de monde dont: ";
		for (int i = 0; i < nbConnaissances%30; i++) {
			listeConnaissance = listeConnaissance + this.connaissances[i].getName() + ",";
		}	
		this.parler(listeConnaissance);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain){
		this.direBonjour();
		repondre(autreHumain);
		autreHumain.memoriser(this);
		this.memoriser(autreHumain);
	}		
	
}
