package Icons;

import javax.swing.ImageIcon;

public interface Icons {
	String iconsRep="/icons/";
	String whiteRep=iconsRep+"white/";
	String blackRep=iconsRep+"black/";

	ImageIcon pawnWhite=new ImageIcon(Icons.class.getResource(whiteRep+"pawn.png"));
	ImageIcon bishopWhite=new ImageIcon(Icons.class.getResource(whiteRep+"bishop.png"));
	ImageIcon knightWhite=new ImageIcon(Icons.class.getResource(whiteRep+"knight.png"));
	ImageIcon towerWhite=new ImageIcon(Icons.class.getResource(whiteRep+"tower.png"));
	ImageIcon queenWhite=new ImageIcon(Icons.class.getResource(whiteRep+"queen.png"));
	ImageIcon kingWhite=new ImageIcon(Icons.class.getResource(whiteRep+"king.png"));
	
	ImageIcon pawnBlack=new ImageIcon(Icons.class.getResource(blackRep+"blackPawn.png"));
	ImageIcon bishopBlack=new ImageIcon(Icons.class.getResource(blackRep+"blackBishop.png"));
	ImageIcon knightBlack=new ImageIcon(Icons.class.getResource(blackRep+"blackKnight.png"));
	ImageIcon towerBlack=new ImageIcon(Icons.class.getResource(blackRep+"blackTower.png"));
	ImageIcon queenBlack=new ImageIcon(Icons.class.getResource(blackRep+"blackQueen.png"));
	ImageIcon kingBlack=new ImageIcon(Icons.class.getResource(blackRep+"blackKing.png"));

}