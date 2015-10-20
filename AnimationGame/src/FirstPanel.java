
import javax.swing.*;

public class FirstPanel extends JPanel {
	@Override public void paintComponent(java.awt.Graphics g) {
		g.fillRect(30,50,45,80);
		g.fillOval(6, 7, 125, 364);
	}
	
	public static void main(String [] args) {

		 JFrame f=new JFrame();

		 f.add(new FirstPanel());

		 f. setVisible (true) ;
	}
		
}
