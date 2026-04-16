package personnages;

public class Ronin extends Humain {

    private int honneur;

    public Ronin(String nom, String boisson, int argent) {
        super(nom, boisson, argent);
        this.honneur = 1;
    }

    public void donner(Commerçant beneficiaire) {
        int don = getArgent() / 10;
        perdreArgent(don);
        beneficiaire.recevoir(don);
        parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
    }
    
    public void provoquer(Yakuza adversaire) {
        int force = honneur * 2;
        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        if (force >= adversaire.getReputation()) {
            int gain = adversaire.perdre();
            gagnerArgent(gain);
            honneur++;
            parler("Je t'ai eu petit yakusa!");
        } else {
            int somme = getArgent();
            perdreArgent(somme);
            honneur--;
            adversaire.gagner(somme);
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
        }
    }
}