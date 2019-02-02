import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorld extends JPanel{

	public static void main(String[] args) {

<<<<<<< HEAD
		System.out.print("Richard");
		JFrame frame = new JFrame("Hello World");
=======
		JFrame frame = new JFrame("Hello World!!!");
>>>>>>> ec0798d5fff2a484770c3fc9a443210ee90e06a1
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
