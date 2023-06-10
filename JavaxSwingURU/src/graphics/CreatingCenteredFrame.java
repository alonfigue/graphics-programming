// Estudiante: Alonso Figueroa, C.I.: 28.536.894

package graphics;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Image;

import javax.swing.JFrame;

public class CreatingCenteredFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CenteredFrame myFrame = new CenteredFrame();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setVisible(true);
		
		myFrame.setTitle("Computación Grafica");
	}

	}



class CenteredFrame extends JFrame {
	
	public CenteredFrame() {
		
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		
		Dimension screenSize = myScreen.getScreenSize();
		
		int heightScreen = screenSize.height;
		
		int widthScreen = screenSize.width;
		
		setSize(widthScreen/2, heightScreen/2);
		
		setLocation(widthScreen/4, heightScreen/4);
		
		Image myIcon = myScreen.getImage("E:\\eclipse-workspace\\JavaxSwingURU\\src\\graphics\\icon.jpeg");
		
		setIconImage(myIcon);
		
		
	}
}