import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class radio extends JFrame{
	
	private JTextField text;
	private JCheckBox bold;
	private JCheckBox it;
	
	public radio (){
		
		super("Radio buttons");
		setLayout(new FlowLayout());
		
		text = new JTextField("text field", 20);
		text.setFont(new Font("Serif", Font.PLAIN, 14));
		add(text);
		
		bold = new JCheckBox ("Bold");
		it = new JCheckBox("Italit");
		
		add(it);
		add(bold);
		
		HandlerClass handle = new HandlerClass();
		bold.addItemListener(handle);
		it.addItemListener(handle);
	}
	
	private class HandlerClass implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			
			Font font = null;
			if (bold.isSelected() && it.isSelected())
				font = new Font ("Serif", Font.BOLD + Font.ITALIC, 14);
			else if (bold.isSelected())
				font = new Font ("Serif" , Font.BOLD, 14);
			else if (it.isSelected())
				font = new Font ("Serif" , Font.ITALIC, 14);
			
			else 
				
				font = new Font ("Serif" , Font.PLAIN, 14);
			
			text.setFont(font);
		}
		
	}
	
	public static void main(String[] agrs) {

		radio timmy = new radio();
		timmy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		timmy.setSize(300, 150);
		timmy.setVisible(true);
		timmy.setLocation(200, 200);
	

}
