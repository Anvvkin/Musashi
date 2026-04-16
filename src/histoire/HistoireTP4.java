package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Commerçant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {

		Humain prof = new Humain("Prof", "kombucha", 54);

		prof.direBonjour();

		System.out.println(
				"(Prof) - J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");

		prof.acheter("boisson", 12);
		prof.boire();

		System.out.println(
				"(Prof) - J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");

		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		
		Commerçant marco = new Commerçant("Marco", 20);
        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");

		marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
        
        System.out.println();
        
        yaku.direBonjour();
        yaku.extorquer(marco);
        
        
        Ronin roro = new Ronin("Roro", "shochu", 60);

        roro.direBonjour();
        roro.donner(marco);
        
        roro.provoquer(yaku);
        
        
		
	}
}
