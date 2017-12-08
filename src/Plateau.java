
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
//		for(int x = 0; x < 8; x++) {
//			grille[0][x] = new Pion();
//		}
//		
//		for(int x = 0; x < 8; x++) {
//			grille[7][x] = new Pion();
//		}
		
		grille[0][5] = new Pion();
		grille[0][7] = new Pion();
		grille[0][2] = new Pion();
		
	}
}
