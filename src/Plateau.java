
public class Plateau{
	
	private Piece[][] grille = new Piece[8][8];
	
	
	public Plateau() {
		//On met à null les case vides de la grille
		for(int y = 0; y < 8; y++) {
			for(int x = 0; x < 8; x++) {
				this.grille[y][x] = null;
			}
		}
	}
	
	public void afficherPlateau() {
		for(int y = 0; y < 8; y++) {
			for(int x = 0; x < 8; x++) {
				if(grille[y][x] == null)
					System.out.print("0 ");
				else
					System.out.print(grille[y][x].getLettre() + " ");
			}
			System.out.println();
		}
	}
	
	public void initialiserPièces() {
		
		// Positionnement des pions
		
		for(int x = 0; x < 8; x++) {
			grille[1][x] = new Pion();
		}
		
		for(int x = 0; x < 8; x++) {
			grille[6][x] = new Pion();
		}
		
		
		
		
	}
	
	public void déplacerPiece() {
		
	}
}
