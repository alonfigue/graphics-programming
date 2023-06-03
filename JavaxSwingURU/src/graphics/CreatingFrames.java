// Estudiante: Alonso Figueroa, C.I.: 28.536.894

package graphics;
import javax.swing.*;

public class CreatingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		myFrame frame1 = new myFrame();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class myFrame extends JFrame {
	
	public myFrame () {
		//setSize(500,300);
		
		//setLocation(500,300);
		
		setBounds(500, 300, 550, 250);
		
		//setResizable(false);
		
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setTitle("Alonso's Application");
	}
}
