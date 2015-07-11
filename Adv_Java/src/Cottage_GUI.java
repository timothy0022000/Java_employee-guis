/*
 * Timothy Johnson
 * 900725577
 */

import javax.swing.*;

import com.sun.org.apache.bcel.internal.generic.DDIV;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cottage_GUI extends JFrame {

	private JPanel displayPanel;
	private JPanel sizePanel;
	private JPanel buttonPanel;
	private JPanel logoPanel;
	private JPanel entryPanel;
	private JPanel addressPanel;
	private JPanel askingPricePanel;
	private JPanel roomPanel;
	private JLabel lblLogo;
	private JLabel lblBedRooms;
	private JLabel lblBathRooms;
	private JSlider sbSize;
	private JTextField tfAskingPrice;
	private JComboBox cbBedRoom;
	String[] bedrooms = { "1", "2", "3" };
	private JComboBox cbBathRoom;
	String[] bathrooms = { "1", "2", "3", "4" };
	private JButton bClear;
	private JButton bDisplay;
	private JTextArea taAddress;
	private JTextArea taDisplay;
	private JLabel lblAskingPrice;
	private Color AntiqueWhite4 = new Color(139, 131, 120);
	private Color LightSlateGrey = new Color(119, 136, 153);

	public static void main(String[] agrs) {
		Cottage_GUI c1 = new Cottage_GUI();

	}

	public Cottage_GUI() {
		super("Gallifrey Beach Properties");
		setSize(400, 800);
		setLocation(400, 50);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/****************************************************** start jmenu *************************************************/
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);

		JMenu file = new JMenu("File");
		menubar.add(file);

		JMenu help = new JMenu("Help");
		menubar.add(help);

		JMenuItem ts = new JMenuItem("Technical Support");
		help.add(ts);

		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);

		JMenuItem clear = new JMenuItem("Clear");
		file.add(clear);
		class helpMe implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Toll-free Number : (1-800-HELPMEE) \n\n Web Address : (www.sdsd.com/techsupp) ",
								"Tech Support", JOptionPane.QUESTION_MESSAGE);

			}
		}
		class closeMe implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
		exit.addActionListener(new closeMe());
		clear.addActionListener(new ClearButtonListener());
		help.addActionListener(new helpMe());
		ts.addActionListener(new helpMe());
		// num.addActionListener(new helpMe());

		/********************************************* end of jmenu ********************************************/
		buildLogoPanel();
		add(logoPanel, BorderLayout.NORTH);

		buildEntryPanel();
		add(entryPanel, BorderLayout.CENTER);

		buildButtonPanel();
		add(buttonPanel,BorderLayout.EAST);
		
		buildDisplayPanel();
		add(displayPanel, BorderLayout.SOUTH);
	}

	public void buildLogoPanel() {
		logoPanel = new JPanel();
		logoPanel.setBackground(AntiqueWhite4);
		lblLogo = new JLabel("Gallifrey Beach Properties");
		lblLogo.setFont(new Font("Serif", Font.BOLD, 26));
		lblLogo.setIcon(new ImageIcon("image.gif"));
		lblLogo.setToolTipText("LOGO");
		logoPanel.add(lblLogo);

	}

	public void buildEntryPanel() {
		entryPanel = new JPanel(new GridLayout(3, 1));
		entryPanel.setBorder(BorderFactory
				.createTitledBorder("FILL OUT INFOMATION"));
		entryPanel.setBackground(AntiqueWhite4);
		// Address panel
		addressPanel = new JPanel();
		addressPanel.setBorder(BorderFactory.createTitledBorder("ADDRESS"));
		taAddress = new JTextArea(4, 14);
		taAddress.setLineWrap(true);
		taAddress.setToolTipText("Enter Address Here");
		taAddress.setBorder(BorderFactory.createEtchedBorder(Color.YELLOW,
				Color.YELLOW));
		addressPanel.add(taAddress);
		entryPanel.add(addressPanel);

		// Bedroom Panel and BathRoom Panel
		roomPanel = new JPanel();
		roomPanel
				.setBorder(BorderFactory.createTitledBorder("NUMBER OF ROOMS"));
		cbBathRoom = new JComboBox(bathrooms);
		cbBathRoom.setToolTipText("Pick how many bathrooms you want");
		cbBedRoom = new JComboBox(bedrooms);
		cbBedRoom.setToolTipText("How many bedrooms you want");
		lblBedRooms = new JLabel("Number of Bedrooms: ");
		lblBathRooms = new JLabel("Number of Bathrooms: ");
		roomPanel.add(lblBathRooms);
		roomPanel.add(cbBathRoom);
		roomPanel.add(lblBedRooms);
		roomPanel.add(cbBedRoom);
		entryPanel.add(roomPanel);

		// Asking Price
		askingPricePanel = new JPanel();
		askingPricePanel.setBorder(BorderFactory
				.createTitledBorder("ASKING PRICE"));
		lblAskingPrice = new JLabel("$: ");
		tfAskingPrice = new JTextField(12);
		tfAskingPrice.setBorder(BorderFactory.createEtchedBorder(Color.YELLOW,
				Color.YELLOW));
		askingPricePanel.add(lblAskingPrice);
		askingPricePanel.add(tfAskingPrice);
		entryPanel.add(askingPricePanel);

		// Size Panel
		sizePanel = new JPanel();
		sizePanel.setBorder(BorderFactory.createTitledBorder("COTTAGE SIZE"));
		sbSize = new JSlider(600, 2800);
		sbSize.setMajorTickSpacing(400);
		sbSize.setMinorTickSpacing(600);
		sbSize.setPaintTicks(true);
		sbSize.setPaintLabels(true);
		sbSize.setSize(2, 40);
		sbSize.setToolTipText("Pick size of cottage");
		sizePanel.add(sbSize);
		entryPanel.add(sizePanel);

	}

	public void buildDisplayPanel() {
		displayPanel = new JPanel();
		displayPanel.setBorder(BorderFactory.createTitledBorder("RESULTS"));
		displayPanel.setBackground(AntiqueWhite4);
		taDisplay = new JTextArea(10, 20);
		taDisplay.setLineWrap(true);
		taDisplay.setBackground(LightSlateGrey);
		taDisplay.setBorder(BorderFactory.createEtchedBorder(Color.YELLOW,
				Color.YELLOW));
		taDisplay.setEditable(false);
		displayPanel.add(taDisplay);

	}
	
	public void buildButtonPanel(){
		buttonPanel = new JPanel();
		buttonPanel.setLayout( new GridLayout(2,1));
		// buttons
		// clear
		bClear = new JButton("Clear");
		bClear.setToolTipText("Clear Forms");
		bClear.setMnemonic('C');
		bClear.addActionListener(new ClearButtonListener());
		bClear.setBackground(LightSlateGrey);
		// display
		bDisplay = new JButton("Display");
		bDisplay.setToolTipText("Display");
		bDisplay.setMnemonic('D');
		bDisplay.addActionListener(new DisplayButtonListener());
		bDisplay.setBackground(LightSlateGrey);

		entryPanel.add(bClear);
		entryPanel.add(bDisplay);
	}

	private class DisplayButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String address = taAddress.getText();
			int bedrooms = Integer.parseInt((String) cbBedRoom
					.getSelectedItem());
			int bathrooms = Integer.parseInt((String) cbBathRoom
					.getSelectedItem());
			int cottageSize = sbSize.getValue();
			double askingPrice = Double.parseDouble((String) tfAskingPrice
					.getText());

			Cottage co1 = new Cottage(address, bedrooms, bathrooms,
					cottageSize, askingPrice);

			// call hourly worker method to produce output and show in display
			// area
			String output = co1.toString();
			taDisplay.setText(output);

		}
	}

	private class ClearButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			cbBathRoom.setSelectedIndex(0);
			cbBedRoom.setSelectedIndex(0);
			taDisplay.setText("");
			tfAskingPrice.setText("");
			taDisplay.setText("");
			taAddress.setText("");
			sbSize.setValue(1750);
		}
	} // end ClearButtonListener class

}
