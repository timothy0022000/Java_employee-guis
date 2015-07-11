import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// this class creates an entry screen for a new hourly worker
public class HourlyWorkerGUI extends JFrame {
	
	// declare GUI components
	private JPanel headerPanel;
	private JPanel entryPanel;
	private JPanel buttonPanel;
	private JPanel displayButtonPanel;
	private JPanel clearButtonPanel;
	private JPanel displayPanel;
	private JLabel jlblHeader;
	private JLabel jlblEmployeeID;
	private JLabel jlblEmployeeName;
	private JLabel jlblHoursWorked;
	private JLabel jlblHourlyRate;
	private JTextField jtfEmployeeID;
	private JTextField jtfEmployeeName;
	private JTextField jtfHoursWorked;
	private JTextField jtfHourlyRate;
	private JButton jbtDisplay;
	private JButton jbtClear;
	private JTextArea jtaDisplay;
	private Color navajoWhite = new Color(255,222,173);
	private Color dodgerBlue = new Color(30,144,255);
	
	// main method
	public static void main(String[] args) {
		HourlyWorkerGUI frame = new HourlyWorkerGUI();
	}
	
	// GUI constructor
	public HourlyWorkerGUI() {
		// customize appearance
		setSize(500, 400);
		setTitle("Enter new Hourly Workers");
		setLocation(400,400);
		
		// call build panel methods and add panels to frame
		buildHeaderPanel();
		add(headerPanel, BorderLayout.NORTH);
		
		buildEntryPanel();
		add(entryPanel, BorderLayout.CENTER);
		
		buildButtonPanel();
		add(buttonPanel, BorderLayout.EAST);
		
		buildDisplayPanel();
		add(displayPanel, BorderLayout.SOUTH);
		
		
		// customize behavior
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	} // end constructor
	
	// build header panel
	private void buildHeaderPanel() {
		headerPanel = new JPanel();
		headerPanel.setBackground(navajoWhite);
		
		jlblHeader = new JLabel( "Acme Rocket Company" );
		jlblHeader.setFont( new Font( "SansSerif", Font.ITALIC + Font.BOLD, 24) );
		jlblHeader.setIcon( new ImageIcon( "skates.gif" ) );
		
		headerPanel.add(jlblHeader);

	}
	
	// build entry panel
	private void buildEntryPanel(){
		// instantiate panel and components
		entryPanel = new JPanel();
		entryPanel.setLayout( new GridLayout(4,2));
		entryPanel.setBackground( dodgerBlue );
		
		jlblEmployeeID = new JLabel("Employee ID: ");
		jlblEmployeeName = new JLabel("Employee Name: ");
		jlblHoursWorked = new JLabel("Hours Worked: ");
		jlblHourlyRate = new JLabel("Hourly Rate: ");
		
		jtfEmployeeID = new JTextField(6);
		jtfEmployeeName = new JTextField(6);
		jtfHoursWorked = new JTextField(6);
		jtfHourlyRate = new JTextField(6);
		
		jtfEmployeeID.setBorder(BorderFactory.createLineBorder(dodgerBlue));
		jtfEmployeeName.setBorder(BorderFactory.createLineBorder(dodgerBlue));
		jtfHourlyRate.setBorder(BorderFactory.createLineBorder(dodgerBlue));
		jtfHoursWorked.setBorder(BorderFactory.createLineBorder(dodgerBlue));
		
		entryPanel.add(jlblEmployeeID);
		entryPanel.add(jtfEmployeeID);
		entryPanel.add(jlblEmployeeName);
		entryPanel.add(jtfEmployeeName);
		entryPanel.add(jlblHoursWorked);
		entryPanel.add(jtfHoursWorked);
		entryPanel.add(jlblHourlyRate);
		entryPanel.add(jtfHourlyRate);
		
	} // end buildEntryPanel method
	
	// build button panel
	private void buildButtonPanel() {
		buttonPanel = new JPanel();
		buttonPanel.setBackground(dodgerBlue);
		buttonPanel.setLayout( new GridLayout(2,1));
		
		displayButtonPanel = new JPanel();
		displayButtonPanel.setBackground(dodgerBlue);
		
		jbtDisplay = new JButton("Display");
		jbtDisplay.setBackground(navajoWhite);
		jbtDisplay.addActionListener(new DisplayButtonListener());
		
		displayButtonPanel.add(jbtDisplay);
		
		clearButtonPanel = new JPanel();
		clearButtonPanel.setBackground( dodgerBlue);
		
		jbtClear = new JButton("  Clear  ");
		jbtClear.setBackground(navajoWhite);
		jbtClear.addActionListener(new ClearButtonListener());
		clearButtonPanel.add(jbtClear);
		
		buttonPanel.add(displayButtonPanel);
		buttonPanel.add(clearButtonPanel);
	} // end buildButtonPanel method
	
	// build display panel
	private void buildDisplayPanel() {
		displayPanel = new JPanel();
		displayPanel.setBorder(BorderFactory.createLineBorder(dodgerBlue));
		displayPanel.setBackground(dodgerBlue);
		
		jtaDisplay = new JTextArea( 8, 40);
		jtaDisplay.setBackground(navajoWhite);
		jtaDisplay.setBorder(BorderFactory.createTitledBorder("Hourly Worker Data"));
		jtaDisplay.setEditable(false);

		displayPanel.add(jtaDisplay);
	} // end buildDisplayPanel method
	
	private class DisplayButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			
			// retrieve user entered data from GUI
			String employeeID = jtfEmployeeID.getText();
			String employeeName = jtfEmployeeName.getText();
			double hoursWorked = Double.parseDouble(jtfHoursWorked.getText());
			double hourlyRate = Double.parseDouble(jtfHourlyRate.getText());
			
			// create instance of hourly worker with user data
			HourlyWorker hw1 = new HourlyWorker(employeeID, employeeName, hoursWorked, hourlyRate);
			
			// call hourly worker method to produce output and show in display area
			String output = hw1.producePayStub();
			jtaDisplay.setText(output);
			
		}
	} // end DisplayButtonListener class
	
	private class ClearButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			jtfEmployeeID.setText("");
			jtfEmployeeName.setText("");
			jtfHoursWorked.setText("");
			jtfHourlyRate.setText("");
			jtaDisplay.setText("");
		}
	} // end ClearButtonListener class

}
