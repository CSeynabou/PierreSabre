package personnages;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;
	
	public Traitre(String name, String favDrink, int money, String seigneur) {
		super(name, favDrink, money, seigneur);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traitre et mon niveau de traitrise est de " + niveauTraitrise + " Chut!");
	}

	public void ranconner(Commercant commercant) {
		if (niveauTraitrise == 3)
			this.parler("Raah je ne peux plus ranconner ou je vais me faire démasquer.");
		else {
			int argentRanconne, argentCommercant;
			argentCommercant = commercant.getMoney();
			argentRanconne = 2/10 * commercant.getMoney();
			commercant.perdreArgent(argentRanconne);
			this.gagnerArgent(argentRanconne);
			this.parler("Si tu veux ma protection contre les Yakuzas, paye ! Donne moi " + argentRanconne + " ou gare à toi !");
			commercant.parler("Tout de suite grand " + this.getName());
			niveauTraitrise ++;
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissances < 1)
			this.parler("J'ai pas d'ami ! Snif");
		else {
			Humain ami = this.connaissances[nbConnaissances-1];
			int don = this.getMoney()*1/20;
			String nomAmi = ami.getName();
			this.parler("Faut que je remonte ma cote de confiance. Go faire ami-ami avec " + nomAmi + ".");
			this.parler("Bonjour l'ami! Laisse moi t'aider en te donnant "+ don + "sous.");
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			ami.parler("Merci " + this.getName() + "Vous êtes quelqu'un de bien.");
			if (niveauTraitrise > 1) 
				niveauTraitrise --;
	
		}
	}
}
