
public abstract class Piece{
	//private String Joueur;
	private char couleur;
	
	public Piece() {
		
	}
	
	public boolean estValidé(Plateau plateau) {
		
		return false;
	}
	
	abstract public char getLettre ();
}
