import java.util.Scanner;//import scanner

public class Lab01 {
		static Scanner input = new Scanner (System.in);
	public static double computeAverage(double n1, double n2, double n3) {

		double total = n1 + n2 + n3;// compute total
		double avg = total / 3;// compute avg
		/* return avg */
		return avg;

	}
/*compute a letter grade depending on number grade*/
	public static char letterGrade(double avg) {

		if (avg >= 90) {

			return 'A';
		} else if (avg >= 80) {
			return 'B';

		} else if (avg >= 70) {
			return 'C';

		} else if (avg >= 60) {
			return 'D';
		} else
			return 'F';
	}
	
	public static void main (String []agrs){
		//prompt user
		System.out.print("Enter frist grade:");
		double g1 = input.nextDouble();
		
		System.out.print("Enter second grade:");
		double g2 = input.nextDouble();
		
		System.out.print("Enter third grade:");
		double g3 = input.nextDouble();
		//invoke methods 
		double average= computeAverage(g1, g2, g3);
		char grade = letterGrade(average);
		//display
		System.out.println(average + " " + grade);
		
		System.exit(0);//exit 
		
		
	}
}
