/*
  This class defines Student objects.  Note that the setSatScore() method
  incorporates error checking based on the allowable range of the variable
*/

import javax.swing.JOptionPane;
import java.util.*;
public class Student {

  //**** Data fields ****
  private String firstName;
  private String lastName;
  private String idNumber;
  private int satScore;

  //**** Constructors ****
  public Student() {
  }

  public Student(String newFirstName, String newLastName, String newIdNumber,
      int newSatScore) {
    firstName = newFirstName;
    lastName = newLastName;
    idNumber = newIdNumber;
    setSatScore( newSatScore ); // Call the setSatScore() method because it contains error checking code
  }

  //**** Get methods ****
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public String getIdNumber() {
    return idNumber;
  }
  public int getSatScore() {
    return satScore;
  }

  //**** Set methods ****
  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }
  public void setLastName(String newLastName) {
    lastName = newLastName;
  }
  public void setIdNumber(String newIdNumber) {
    idNumber = newIdNumber;
  }
  public void setSatScore(int newScore) {
    while( newScore < 600 || newScore > 2400 ) {
      newScore = Integer.parseInt(JOptionPane.showInputDialog("SAT score is invalid. Allowable range is 600 to 2400"));
    }
    satScore = newScore;
  }

  public String toString() {
    return firstName + " " + lastName + "\n" + "ID Number: " + idNumber + "\n" + "SAT score: " + satScore;
  }

}
class TestStudent{
	
	public static void main (String []agrs){
		
		Student s = new Student ("Tim","Johnson","900457888",1200);
		ArrayList<Student> list = new ArrayList<Student>();
		
	
		
		System.out.print(s.toString());
	}
}
