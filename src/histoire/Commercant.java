package histoire;

public class Commercant extends Humain{
	public Commercant(String name, int money) {
		super(name, "thé" , money);
		
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent(this.money);
		System.out.println("Diou que le monde est injuste, j'ai tout perdu");
		return this.money;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);	
		System.out.println("Ohohoho merci bien c'est qu'il fallait pas m'sieur");
	}

	

}
