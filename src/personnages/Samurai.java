package personnages;

public class Samurai extends Humain {
	
	private String clan;
	
    public Samurai(String nom, String clan, String boisson, int argent) {
		super(nom, boisson, argent);
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
}
