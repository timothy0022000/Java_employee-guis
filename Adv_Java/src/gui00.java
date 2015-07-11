import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class gui00 extends JFrame {

	private JButton reg;
	private JButton custom;

	public gui00() {
		super("This is my title");
		setLayout(new FlowLayout());

		reg = new JButton("Click Me");
		add(reg);

		Icon x = new ImageIcon(getClass().getResource("x.png"));
		Icon y = new ImageIcon(getClass().getResource("y.png"));

		custom = new JButton("Custom", x);
		custom.setRolloverSelectedIcon(y);
		add(custom);

		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);

	}

	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event) {

			JOptionPane.showMessageDialog(null,
					String.format("s%", event.getActionCommand()));

		}

	}

	public static void main(String[] agrs) {

		gui00 timmy = new gui00();
		timmy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		timmy.setSize(300, 150);
		timmy.setVisible(true);
		timmy.setLocation(200, 200);
	}
}
