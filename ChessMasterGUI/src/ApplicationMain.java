import javax.swing.*;
public class ApplicationMain{
	public static void main(String[] args){	
		JFrame windowFrame = new JFrame();
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(520, 545);
		windowFrame.setResizable(false);
		windowFrame.add(new GameBoardPanel());	
		new AbstractTest() {
			@Override
			public void initClassMethod() {
				
			}
		};
		windowFrame.setVisible(true);
		String[] collection = new String[] {
			"H", "B", "C"	
		};
	}
}