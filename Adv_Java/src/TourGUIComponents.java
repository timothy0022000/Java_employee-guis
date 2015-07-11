import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import java.awt.event.*;

public class TourGUIComponents extends JFrame {

    // declare components
    private JPanel bigPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel buttonPanel;
    private JLabel jlblName;
    private JTextField jtfName;
    private JComboBox jcbAnimals;
    private String[] animals = {"Dog", "Cat", "Fish", "Bird", "Snake", "Hamster", "Turtle"};
    private JCheckBox jchkCheck;
    private JList jlstVegetables;
    private String[] vegetables = {"Beans", "Broccoli", "Carrots", "Lettuce" };
    private JRadioButton jrbOption1;
    private JRadioButton jrbOption2;
    private JRadioButton jrbOption3;
    private ButtonGroup bg;
    private JSlider jsldSlider;
    private JButton jbtClose;
    private JButton jbtShow;

    // main method to instantiate the GUI
    public static void main( String args[] ) {
      TourGUIComponents myGUI = new TourGUIComponents();
    }

    // GUI constructor
    public TourGUIComponents() {
      // customize the frame
      setTitle( "A tour of various components" );
      setSize( 700, 300 );
      setLocation( 100, 150 );

      // build panels and add to frame
      buildBigPanel();
      add( bigPanel, BorderLayout.CENTER );
      buildButtonPanel();
      add( buttonPanel, BorderLayout.SOUTH );


      // customize frame behavior
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      setVisible( true );

    }

    // this method creates and customizes the main entry panel
    private void buildBigPanel() {
      bigPanel = new JPanel( new GridLayout( 2, 3 ));

      // create panel 1
      panel1 = new JPanel();
      panel1.setBorder( BorderFactory.createTitledBorder( "Label and Text Field" ));
      jlblName = new JLabel( "Name:" );
      jtfName = new JTextField( 8 );
      panel1.add( jlblName );
      panel1.add( jtfName );
      bigPanel.add( panel1 );

      // create panel 2
      panel2 = new JPanel();
      panel2.setBorder( BorderFactory.createTitledBorder( "Combo Box" ));
      jcbAnimals = new JComboBox( animals );
      panel2.add( jcbAnimals );
      bigPanel.add( panel2 );

      // create panel 3
      panel3 = new JPanel();
      panel3.setBorder( BorderFactory.createTitledBorder( "Check Box" ));
      jchkCheck = new JCheckBox("This is a check box.");
      panel3.add( jchkCheck );
      bigPanel.add( panel3 );

      // create panel 4
      panel4 = new JPanel();
      panel4.setBorder( BorderFactory.createTitledBorder( "List" ));
      jlstVegetables = new JList( vegetables );
      panel4.add( jlstVegetables );
      bigPanel.add( panel4 );

      // create panel 5
      panel5 = new JPanel( new GridLayout( 3,1 ));
      panel5.setBorder( BorderFactory.createTitledBorder( "Radio Buttons" ));
      jrbOption1 = new JRadioButton( "Option 1" );
      jrbOption2 = new JRadioButton( "Option 2" );
      jrbOption3 = new JRadioButton( "Option 3" );

      // add buttons to a logical group so only one may be selected at a time
      bg = new ButtonGroup();
      bg.add( jrbOption1 );
      bg.add( jrbOption2 );
      bg.add( jrbOption3 );

      // add radio buttons to panel
      panel5.add( jrbOption1 );
      panel5.add( jrbOption2 );
      panel5.add( jrbOption3 );
      bigPanel.add( panel5 );

      // create panel 6
      panel6 = new JPanel();
      panel6.setBorder( BorderFactory.createTitledBorder( "Slider" ));
      jsldSlider = new JSlider( 0, 30, 15 );
      jsldSlider.setMajorTickSpacing( 10 );
      jsldSlider.setMinorTickSpacing( 1 );
      jsldSlider.setPaintTicks( true );
      jsldSlider.setPaintLabels( true );
      panel6.add( jsldSlider );
      bigPanel.add( panel6 );

    }

    // this method creates and customizes the button panel
    private void buildButtonPanel() {
      // create button and button panel
      buttonPanel = new JPanel();
      jbtShow = new JButton( "Show" );
      jbtShow.addActionListener( new ShowButtonListener() );
      jbtClose = new JButton( "Close" );
      buttonPanel.add( jbtShow );
      buttonPanel.add( jbtClose );
    }

    // event handler to be executed when the Show button is clicked
    private class ShowButtonListener implements ActionListener {
      public void actionPerformed( ActionEvent e ) {
        // collect data from the frame
        // retrieve text from text field
        // the returned text is stored in the variable name
        String name = jtfName.getText();

        // the getSelectedIndex method returns the index number from the array
        // the index is used to determine which animal from array has been selected
        // that value is then stored in the variable animal
        String animal = animals[jcbAnimals.getSelectedIndex()];

        // isSelected returns true if the checkbox is selected and false if it is not
        // the value is then stored in the variable checked
        boolean checked = jchkCheck.isSelected();

        // use getSelectedIndices when users are allowed to select multiple items from a list
        // the method returns an array that contains the index numbers of the user selections
        // this array is used when output is generated below
        int[] selectedVeggies = jlstVegetables.getSelectedIndices();

        // the following if/else block is used to determine which of the radio buttons is selected
        // the value of the variable option depends on the selection
        int option = 0;
        if( jrbOption1.isSelected() ) {
          option = 1;
        }else if(jrbOption2.isSelected() ) {
          option = 2;
        } else if(jrbOption3.isSelected() ){
          option = 3;
        }

        // get value returns the slider position
        // this value is stored in the variable slideNumber
        int slideNumber = jsldSlider.getValue();

        // create output - this block of code creates an output string which will be displayed to the user
        // the variables whose values were determined above are used to create the output string

        // we start with the value from the text field
        String output = "Your name is " + name + "\n";

        // then we add the animal type
        output += "Your pet is a " + animal + "\n";

        // then we add one of two text strings depending on whether the check box was selected
        if( checked ) {
          output += "You checked the check box"  + "\n";
        }
        else {
          output += "You did NOT check the check box"  + "\n";
        }

        // then, we use the array of selected index numbers to determine which vegetables to include in the output string
        output += "You like these veggies . . . " + "\n";
        for( int i = 0; i < selectedVeggies.length; i++ ){
          output += vegetables[selectedVeggies[i]] + "\n";
        }

        // the next line adds the value of the variable option to the output string
        output += "You chose Option " + option  + "\n";

        // the next line adds the value of the variable slideNumber to the output string
        output += "You set the slider at " + slideNumber;

        // now we will display the output to the user
        JOptionPane.showMessageDialog( null, output );

      } // end actionPerformed method
    }// end ShowButtonListener

}// end TourGUIComponents class