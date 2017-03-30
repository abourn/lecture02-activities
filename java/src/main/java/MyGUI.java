import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {

	public MyGUI() {
		super("The Skywalker Family");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton theButton = new JButton("Click me!");

		theButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click click!");
			}
		});


		JButton theButton2 = new JButton("Second!");

		theButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click!");
			}
		});

		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
		container.add(theButton);
		container.add(theButton2);

		this.add(container);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
    new MyGUI(); //create the frame
  }
}

/*
A few ways to register a listener. You can either:
	1) Have MyGui implement ActionListener
	2) Setup a new inner class that implements ActionListener
	3) Register ActionListener anonymously on the button itself. (Like an anonymous
		callback function).
*/
