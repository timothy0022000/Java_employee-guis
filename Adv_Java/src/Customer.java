/*
  This class illustates the general layout of a problem domain class.  It uses instance variables and methods.
*/

public class Customer {

    // Instance variables
    private String name;
    private double accountBalance;
    private String accountType;

    // Get methods
    public String getName() {
        return name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountType(){
    	return accountType;
    }
    // Set methods
    public void setName( String newName ) {
        name = newName;
    }

    public void setAccountBalance( double newBalance ) {
        accountBalance = newBalance;
    }

    public void setAccountType(String accountType){
    	this .accountType = accountType;
    	
    }
    // toString method to get String output of the instance variables
    public String toString() {
        String output = name + " has a balance of $" + accountBalance + " Account type : " + accountType;
        return output;
    }

    // Domain specific methods
    // makeCharge accepts a value for the amount charged by a customer and increases the customer's account balance by that amount
    public void makeCharge( double chargeAmount ) {
      accountBalance += chargeAmount;
    }

    // makePayment accepts a value for the amount paid by a customer and decreases the customer's account balance by that amount
    public void makePayment( double paymentAmount ) {
        accountBalance -= paymentAmount;
    }

}
