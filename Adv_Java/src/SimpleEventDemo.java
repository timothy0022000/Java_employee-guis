import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**To respond to a button click, we need to create an instance of an ActionListener -
   in this program we'll do that by writing an inner class that implements the
   ActionListener interface
*/

public class SimpleEventDemo extends JFrame  {
  /** Declare GUI components
  */
  JButton jbtOK;
  JTextField jtfDisplay;
  JPanel panel;

  /** Main method */
  public static void main(String[] args) {
    SimpleEventDemo frame = new SimpleEventDemo();
  }

  /** GUI constructor */
  public SimpleEventDemo() {

    // customize the frame
    setTitle("SimpleEventDemo");
    setLocationRelativeTo(null); // Center the frame's left upper corner in the middle of the screen
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);

    buildPanel();
    add( panel );

    setVisible(true);

  } // end constructor

  private void buildPanel() {

      panel = new JPanel();

      // this line controls the way GUI components are arranged on the frame - we'll take a closer look at it later on
      panel.setLayout(new GridLayout( 2, 1 ));

      // Instantiate the GUI components and add them to the frame
      jbtOK = new JButton("OK");
      panel.add(jbtOK);

      jtfDisplay = new JTextField(25);
      panel.add(jtfDisplay);

      // need to add a line here to register the button with the event handler



  } // end buildPanel


  // here is where the event handler inner class will go




} // end GUI class
