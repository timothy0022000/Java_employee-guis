/*
 * name : Timothy Johnson
 * id : 900725577
 * */
import java.util.Scanner;//import scanner

public class lab4 {

	static Scanner input = new Scanner(System.in);

	/* compute total amount of rainfall */
	public static double totalRainfall(double list[]) {
		double total = 0;
		for (int i = 0; i < list.length; i++) {
			total += list[i];
		}
		return total;
	}

	/* compute average amount of rainfall */
	public static double averageRainfall(double list[]) {
		// Declare total
		double total = 0;
		for (int i = 0; i < list.length; i++) {
			total += list[i];
		}

		double avg = total / list.length;// compute average
		return avg;// return
	}

	// convert inches into centimeters
	public static double[] converter(double[] list) {
		// declare the converter
		double converter = 2.54;

		for (int i = 0; i < list.length; i++) {
			list[i] *= converter;
		}
		return list;

	}

	/* Printing method */
	public static void printMe(double list[]) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	/* Main Method */
	public static void main(String[] agrs) {

		double list[] = new double[5];
		// Prompt user
		System.out.println("Enter five numbers here: ");
		for (int t = 0; t < list.length; t++) {
			list[t] = input.nextDouble();
		}
		double total = totalRainfall(list);
		double avg = averageRainfall(list);
		System.out.println("Inches of rainfall" );
		printMe(list);
		System.out.println("The total amount of rainfall is: " + total + "in");
		System.out.println("The average amount of rainfall is: " + avg + "in");
		
		// call methods
		double new_list[] = converter(list);
		

		// display
		System.out.println();
		System.out.println("________________________________________");
		
		
		System.out.println( "Centermeters of rainfall ");
		printMe(new_list);
		System.out.println();

		System.exit(0);// exit program
	}
}