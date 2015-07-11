import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/* To respond to a button click, we need to create an instance of an ActionListener.
   This program does that by using an inner class that implements the ActionListener interface.
*/

public class TwoButtonEventDemo extends JFrame {
  /* Declare GUI components */
  JButton jbtOK;
  JButton jbtClear;
  JTextField jtfDisplay;
  JPanel panel;

  /* Main method */
  public static void main(String[] args) {
    JFrame frame = new TwoButtonEventDemo();
  } // end main method

  /* GUI constructor */
  public TwoButtonEventDemo() {
    setTitle("TwoButtonEventDemo");
    setLocationRelativeTo(null); // Center the frame
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);

    buildPanel();
    add( panel );

    setVisible(true);


  }// end GUI constructor

  private void buildPanel() {

    panel = new JPanel();
    panel.setLayout(new GridLayout( 3, 1 ));

    jbtOK = new JButton( "OK" );
    panel.add( jbtOK );

    jbtClear = new JButton( "Clear" );
    panel.add( jbtClear );

    jtfDisplay = new JTextField(30);
    panel.add( jtfDisplay );

    // We have to create an instance of our event handler class and register the OK button with it.
    ActionListener ok = new OKListener();
    jbtOK.addActionListener( ok );

    // We also have to register the clear button with a listener.  In this case, we're creating an anonymous instance of the listener.
    jbtClear.addActionListener( new ClearListener() );

  }


  /* This is a private inner class.  It implements the ActionListener interface
     so it must contain the actionPerformed method.
  */
  private class OKListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      jtfDisplay.setText("Clickety-click-click");
    } // end actionPerformed

  }// end OKListener class

  /* This is ANOTHER private inner class.  It contains the code the responds when the Clear button is clicked.
  */
  private class ClearListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      jtfDisplay.setText("");
    } // end actionPerformed

  }// end ClearListener class



}// end GUI class
