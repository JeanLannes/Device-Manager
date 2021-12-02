import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class graphism extends JFrame {
	private JLabel jlName;
	private JLabel jlPix;
	private JLabel jlQuote;
	private Container container;
	 
	public graphism(String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT);
	}
}
