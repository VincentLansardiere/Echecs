
public class Plateau{
	private Piece[][] grille = new Piece[8][8];
	
	public Plateau() {
		//On met les pièces dans la 1ère ligne de la grille pour le 1er joueur
//		for(int x = 0; x < 8; x++)
//			grille[x][0] = new Pion();
		
		//On met à null les case vides de la grille
		for(int y = 0; y < 8; y++) {
			for(int x = 0; x < 8; x++) {
				this.grille[y][x] = null;
			}
		}
		
		//On met les pièces dans la dernière ligne de la grille pour le 2ème joueur
		
//		for(int x = 7; x < 8; x++)
//			grille[x][0] = new Pion();
	}
	
	public void afficherPlateau() {
		for(int y = 0; y < 8; y++) {
			for(int x = 0; x < 8; x++) {
				if(grille[y][x] == null)
					System.out.print("0 ");
				//if(grille[y][x] == null)
			}
			System.out.println();
		}
	}
}
