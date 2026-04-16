package personnages;

public class Yakuza extends Humain {

    private String clan;
    private int reputation;

    public Yakuza(String nom, String boisson, int argent, String clan) {
        super(nom, boisson, argent);
        this.setClan(clan);
        this.setReputation(0);
    }

    public void extorquer(Commerçant victime) {
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler("" + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
        int somme = victime.seFaireExtorquer();
        gagnerArgent(somme);
        setReputation(getReputation() + 1);
        parler("J'ai piqué les " + somme + " sous de " + victime.getNom()
            + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }
    
    public int perdre() {
        int somme = getArgent();
        perdreArgent(somme);
        reputation--;
        parler("J'ai perdu mon duel et mes " + somme + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        return somme;
    }

    public void gagner(int gain) {
        gagnerArgent(gain);
        reputation++;
        parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
    }
    
    @Override
    public void direBonjour() {
        super.direBonjour();
        parler("Mon clan est celui de " + clan);
    }

	public String getClan() {
		return clan;
	}

	public void setClan(String clan) {
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
}
