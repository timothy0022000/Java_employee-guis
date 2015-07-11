public class HourlyWorker extends Employee {
	// data fields
	private double hoursWorked;
	private double hourlyRate;

	// constructor
	public HourlyWorker() {
		super();
	}

	// full constructor
	public HourlyWorker(double hoursWorked, double hourlyRate,
			String employeeID, String employeeName) {
		super(employeeID, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	// getters and setters
	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HourlyWorker [hoursWorked=" + hoursWorked + ", hourlyRate="
				+ hourlyRate + ", toString()=" + super.toString() + "]";
	}

	// compute pay method
	public double computePay() {
		return hoursWorked * hourlyRate;
	}

}
