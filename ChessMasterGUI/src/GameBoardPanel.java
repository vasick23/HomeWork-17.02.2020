import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class GameBoardPanel extends JPanel{
	private static final long serialVersionUID = 3;
	private final int TILE_SIDE = 50;
	public void paint(Graphics g) {
		for(int row = 0; row < 10; row++) {
			for(int col = 0; col < 10; col++) {
				render(g, row, col);
			}
		}
		addMouseListener(new MouseActionChange());
	}
	private void render(Graphics g, int row, int col) {
		
		boolean isRowEven 	= (row % 2 == 0);
		boolean isColEvent 	= (col % 2 == 0);
		boolean isWhite 	= (isRowEven && isColEvent) ||
							  (!isRowEven && !isColEvent);
		Color tileColor = isWhite ? Color.WHITE 
								  : Color.BLACK;
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
		
	}
	class MouseActionChange implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("{Mouse}");
			repaint();
		}
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}
		@Override
		public void mousePressed(MouseEvent e) {
		}
		@Override
		public void mouseReleased(MouseEvent e) {
		}
	}
}