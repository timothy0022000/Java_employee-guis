import javax.swing.*;
import java.awt.*;

public class CalculateorGUI extends JFrame {
	//declare Gui components
	private JPanel buttonPanel;
	private JPanel entryPanel;
	private JLabel jlblFirstNumber;
	private JLabel jlblSecondNumber;
	private JLabel jlblResult;
	private JTextField jtfFirstNumber;
	private JTextField jtfSecondNumber;
	private JTextField jtfResult;
	private JButton jbtAdd;
	private JButton jbtM;
	private JButton jbtS;
	private JButton jbtD;
	
	//main method
	public static void main(String[] args) {
		CalculateorGUI frame = new CalculateorGUI();

	}
	
	//gui constructor 
	
	
	public CalculateorGUI(){
		
		//custom frame
		setSize(400,220);
		setLocation(300,300);
		setTitle("Four Function Cal");
		
		//call build panel methods and add panels to frame
		buildEntryPanel();
		//adding into center region of panel
		add(entryPanel);
		
		buildButtonPanel();
		add(buttonPanel, BorderLayout.SOUTH);
		
		//custom frame's behavior
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//method to build panels
	public void buildEntryPanel(){
		//instantiate panel
		entryPanel = new JPanel();
		
		//grid layout
		GridLayout g1 = new GridLayout(3,2);
		
		//assign layout to manager to entry panel
		entryPanel.setLayout(g1);
		
		//
		/*//new flow layout and custom.
		FlowLayout f1 = new FlowLayout();
		f1.setAlignment(FlowLayout.LEFT);
		
		//assign layout to entry panel
		entryPanel.setLayout(f1);*/
		
		//instantiate components
		jlblFirstNumber = new JLabel("Enter First Number: ");
		jlblSecondNumber = new JLabel("Enter Second Number: ");
		jlblResult = new JLabel("Result: ");
		
		jtfFirstNumber = new JTextField(10);
		jtfSecondNumber = new JTextField(10);
		jtfResult = new JTextField(10);
		
		//add components to panel
		entryPanel.add(jlblFirstNumber);
		entryPanel.add(jtfFirstNumber);
		entryPanel.add(jlblSecondNumber);
		entryPanel.add(jtfSecondNumber);
		entryPanel.add(jlblResult);
		entryPanel.add(jtfResult);
		
	}
	
	public void buildButtonPanel(){
		//instantiate panel
		buttonPanel = new JPanel();
		
		//instantiate components
		jbtAdd = new JButton("Add");
		jbtS = new JButton("Subtract");
		jbtM = new JButton("Multiply");
		jbtD = new JButton("Divide");
		
		//add components to panel
		buttonPanel.add(jbtAdd);
		buttonPanel.add(jbtS);
		buttonPanel.add(jbtM);
		buttonPanel.add(jbtD);
		
		
	}

}
