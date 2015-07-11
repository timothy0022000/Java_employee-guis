public abstract class Employee {

	private String employeeID;
	private String employeeName;

	public Employee() {

	}

	public Employee(String employeeID, String employeeName) {

		this.employeeID = employeeID;
		this.employeeName = employeeName;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName="
				+ employeeName + "]";
	}

	public abstract double computePay();

}
