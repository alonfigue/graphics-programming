// Estudiante: Alonso Figueroa C.I.: 28.536.894

package graphics;

import java.awt.Graphics;

import javax.swing.*;

public class WritingOnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameWithText myFrame = new FrameWithText();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameWithText extends JFrame {
	
	public FrameWithText() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("First text");
		
		Sheet mySheet = new Sheet();
		add(mySheet);
	}
}

class Sheet extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Graphics Programming Class", 100, 100);
	}
}