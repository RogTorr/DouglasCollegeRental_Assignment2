import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorld extends JPanel{

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello World!!!");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
