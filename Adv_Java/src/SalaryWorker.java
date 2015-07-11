public class SalaryWorker extends Employee {

	// make data field
	private double salaryAmount;

	public SalaryWorker() {
		// call super class
		super();
	}

	public SalaryWorker(double salaryAmount, String employeeID,
			String employeeName) {
		super(employeeID, employeeName);
		this.salaryAmount = salaryAmount;

	}

	public double getSalaryAmount() {
		return salaryAmount;
	}

	public void setSalaryAmount(double salaryAmount) {
		this.salaryAmount = salaryAmount;
	}

	// tostring method
	public String toString() {

		return super.toString() + "Salary amount: " + salaryAmount;
	}
	
	public double computePay(){
		return salaryAmount;
	}

}
