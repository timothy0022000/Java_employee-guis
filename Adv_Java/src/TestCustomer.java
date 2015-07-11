/*
 * name : 		Timothy Johnson
 * eagle id : 	900725577
  This class demonstrates object instantiation and the use of instance methods.
 */

public class TestCustomer {

	public static void main(String[] args) {

		// Create a new customer object
		Customer customer1 = new Customer();

		// Assign values to the customer's name and current balance
		customer1.setName("Charlie");
		customer1.setAccountBalance(1239.41);

		// Show the customer's information to the console
		System.out.println(customer1.toString());

		// Create a new customer object
		Customer customer2 = new Customer();

		// Assign values to the customer's name and current balance
		customer2.setName("Alan");
		customer2.setAccountBalance(265.82);

		// Show the customer's information to the console
		System.out.println(customer2.toString());

		// Create a new customer object
		Customer customer3 = new Customer();

		// Assign values to the customer's name and current balance
		customer3.setName("Timothy");
		customer3.setAccountBalance(1841.00);
		customer3.makeCharge(25.00);
		customer3.makePayment(10.25);

		// Show the customer's information to the console
		System.out.println(customer3.toString());
		System.out.println("");
		System.out.println("Remainning balance : " + customer3.getAccountBalance());
		
		// Create a new customer object
		Customer customer4 = new Customer();
		
		// Assign values to the customer's name and current balance
		customer4.setName("Cindy");
		customer4.setAccountBalance(950.00);
		customer4.setAccountType("Gold");
		
		// Show the customer's information to the console
		System.out.println(customer4.toString());
	}

}
