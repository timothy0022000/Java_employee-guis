
// Timothy Johnson ID:900725577

import java.awt.*; // need to import the AWT package because we are using values from the Color class
import javax.swing.*; // the Swing package contains the GUI classes we will need

public class ShowGUIComponentsBeginning extends JFrame {

  // Declare GUI Components
  private JLabel jlblName;
  private JTextField jtfName;
  private JTextArea jtaDisplay;
  private JButton jbtPushMe;
  private JCheckBox jchkGradStudent;
  private JRadioButton jrbFreshman;
  private JRadioButton jrbSophomore;
  private JRadioButton jrbJunior;
  private JRadioButton jrbSenior;
  private ButtonGroup bg;
  private JComboBox jcbDepartment;
  String[] departments = {"ACCT", "BUSA", "CISM", "ECON", "FINC", "MGMT", "MKTG", "LOGT"};
  private JPanel panel;

  // Instantiate and customize JFrame
  public static void main(String[] args) {
    JFrame frame = new ShowGUIComponentsBeginning();
  }

  // GUI Constructor
  public ShowGUIComponentsBeginning(){

    // customize frame's appearance
    setTitle( "GUI Scavenger Hunt");
    setSize( 400, 200);
    setLocation( 500, 300 );

    // call buildPanel() method and add panel to frame
    buildPanel();
    add( panel );

    // customize frame's behavior
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible( true );

  }

  // the buildPanel() method adds several GUI components to the panel
  private void buildPanel() {

    // Instantiate panel and GUI Components
    panel = new JPanel();
    jlblName = new JLabel( "Name goes here: ");
    jtfName = new JTextField(18);
    jtaDisplay = new JTextArea( 4, 20 );
    jbtPushMe = new JButton( "Push Me");
    jchkGradStudent = new JCheckBox( "Grad Student", true );
    jrbFreshman = new JRadioButton( "Freshman" );
    jrbSophomore = new JRadioButton( "Sophomore" );
    jrbJunior = new JRadioButton( "Junior" );
    jrbSenior = new JRadioButton( "Senior" );
    jcbDepartment = new JComboBox( departments );

    // Add radio buttons to a logical group so only one can be selected at a time
    bg = new ButtonGroup();
    bg.add( jrbFreshman );
    bg.add( jrbSophomore );
    bg.add( jrbJunior );
    bg.add( jrbSenior );

    // A tool tip is a brief message that displays when the mouse is positioned over a GUI component
    // 1. Write a method call that will set the tool tip text for the jtfName to "Type name here"

    	jtfName.setToolTipText("Type name here:");

    // The background of a component refers to the color of the component.
    // 2. Write a method call that will set the background of jbtPushMe to Color.YELLOW.
    // Note that Color.YELLOW is a constant declared in the COLOR class.  There are others - go check them out!

    	jbtPushMe.setBackground(Color.YELLOW);
    // The foreground of a component refers to the color of text that appears on it.
    // 3. Write a method call that will set the foreground of jbtPushMe to Color.BLUE.

    	jbtPushMe.setForeground(Color.BLUE);
    // 4. Write a method call that will set the jbtPushMe's mnemonic to P.
    // A mnemonic tells the user which keyboard key to press to activate a button.
    // If the text appearing on the button contains the mnemonic character, it will be underlined.
    // Once you've set the mnemonic for this button to P, you should be able to use a keyboard shortcut (Alt-P) to click the button
    // HINT: You have a choice of methods to set a button's mnemonic.  If you use the method which takes an
    // int parameter, then you will use a KeyEvent constant as the argument in your method call.
    // The constant KeyEvent.VK_P corresponds to P on the keyboard.
    //if using KeyEvent.VK_P as the argument, need to import java.awt.event.#;

    	jbtPushMe.setMnemonic('P');
    // 5. Write a method call to set the border around jtaDisplay to a "line border".
    // The line border should be orange and 4 pixels wide.
    // You will need to look in the BorderFactory class to find the method to create a line border.
    // The following method call shows how to create an "etched border" using a BorderFactory method.
       jtfName.setBorder( BorderFactory.createEtchedBorder( Color.GREEN, Color.BLUE) );
       jtaDisplay.setBorder(BorderFactory.createLineBorder(Color.ORANGE,4));


    // JCheckBox and JRadioButton components have have a "selected" attribute.
    // The value of this attribute is true if the component is selected and false if it is not.
    // 6. Write a method call to set the selected attribute for jrbFreshman to true.
    // Use a set method to make this modification.  Do NOT modify the constructor call that is already in this program.
       jrbFreshman.setSelected(true);


    // 7. Write a method call to set the selected attribute for jchkGradStudent to false.
    // Use a set method to make this modification.  Do NOT modify the constructor call that is already in this program.
       jchkGradStudent.setSelected(false);


    // The combo box jcbDepartment uses an array of Strings to display the items that can be selected.
    // The "selected index" attribute corresponds to the array index of the item that has been selected.
    // 8. Write a method call using the setSelectedIndex method so that CISM is selected when the GUI is started.
    // Use a set method to make this modification.  Do NOT modify the constructor call that is already in this program.
       jcbDepartment.setSelectedIndex(2);



    // add GUI components to frame
    panel.add( jlblName );
    panel.add( jtfName );
    panel.add( jbtPushMe );
    panel.add( jtaDisplay );
    panel.add( jrbFreshman );
    panel.add( jrbSophomore );
    panel.add( jrbJunior );
    panel.add( jrbSenior );
    panel.add( jchkGradStudent );
    panel.add( jcbDepartment );

  } // end buildPanel() method

} // end class

