package personnages;

import personnages.Humain;

public class Commerçant extends Humain {

	public Commerçant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		int somme = getArgent();
		perdreArgent(somme);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return somme;
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}

}
