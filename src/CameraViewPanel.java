import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;


public class CameraViewPanel extends JPanel {

	public BufferedImage img;
	public CameraViewPanel() {
		super();
	}
	
	

	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
}
