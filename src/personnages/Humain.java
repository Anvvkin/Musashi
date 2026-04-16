package personnages;

public class Humain {
    private String nom;
    private String boisson;
    private int argent;
    private Humain[] memoire;        
    private int nbConnaissances; 
    private static final int TAILLE_MEMOIRE = 30;  

    public Humain(String nom, String boisson, int argent) {
        this.nom = nom;
        this.boisson = boisson;
        this.argent = argent;
        this.memoire = new Humain[TAILLE_MEMOIRE];  
        this.nbConnaissances = 0;
    }
    

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
        if (argent >= prix) {
            perdreArgent(prix);
            parler("Je n'ai plus que " + argent + " sous en poche.");
        } else {
            parler("Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous.");
        }
    }

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	protected void memoriser(Humain humain) {
	    if (nbConnaissances < TAILLE_MEMOIRE) {
	        memoire[nbConnaissances] = humain;
	        nbConnaissances++;
	    } else {
	        for (int i = 0; i < TAILLE_MEMOIRE - 1; i++) {
	            memoire[i] = memoire[i + 1];
	        }
	        memoire[TAILLE_MEMOIRE - 1] = humain;
	    }
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
	    this.direBonjour();
	    autreHumain.direBonjour();
	    this.memoriser(autreHumain);
	    autreHumain.memoriser(this);
	}
	
	public void listerConnaissances() {
	    String liste = "";
	    for (int i = 0; i < nbConnaissances; i++) {
	        if (i > 0) liste += ", ";
	        liste += memoire[i].getNom();
	    }
	    parler("Je connais beaucoup de monde dont : " + liste);
	}
	
	

}
