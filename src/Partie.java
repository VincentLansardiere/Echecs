
public class Partie {
	
	private String joueur1;
	private String joueur2; 
	private Plateau echiquier;
	
	public Partie(String j1 , String j2 ) {
		this.joueur1=j1;
		this.joueur2=j2;
		this.echiquier= new Plateau();
		
	}

	public void LancePartie() {
		echiquier.initialiserPièces();
		echiquier.afficherPlateau();
	}
	
	
	
}
