import java.io.ObjectInputStream.GetField;

public class TestEmployess {

	public static void main(String[] args) {

		// call no - agrs constructor for salary worker
		SalaryWorker sw1 = new SalaryWorker();

		// call subclass method
		sw1.setSalaryAmount(2000);

		// call supercall method
		sw1.setEmployeeID("137031");
		sw1.setEmployeeName("Timothy Johnson");

		SalaryWorker sw2 = new SalaryWorker(2500, "000125", "John Doe");

		System.out.println(sw1.toString());
		System.out.println(sw2.toString());

		// hourly worker object
		HourlyWorker hw = new HourlyWorker(30.5, 40.25, "137031",
				"Timothy Johnson");
		// hourly worker display
		System.out.println(hw.toString());

		System.out.println(hw.computePay());
		System.out.println(sw1.computePay());

		// make employee reference variable
		Employee emp1;
		// assign emp1 to control the object referred to by hw1
		emp1 = hw;

		// use employee reference variable to call method
		emp1.setEmployeeName("Danny");
		// printout
		System.out.println(emp1.toString());

		// call set hourly rate method - NO GO, MUST USE HOURLY WORKER VAR.
		// emp1.setHourlyRate(50.00);

		hw.setHourlyRate(50.00);
		System.out.println(hw.computePay());

		// make employ array of employees reference
		Employee[] emp_array = new Employee[4];

		// assign existing employee reference to the array
		emp_array[0] = sw1;
		emp_array[1] = sw2;
		emp_array[2] = hw;

		// make a new object using emy_array[3]
		emp_array[3] = new HourlyWorker(40, 18, "457812", "Tom");

		// display tostring for all employees
		for (int i = 0; i < emp_array.length; i++) {

			System.out.println(emp_array[i].toString());

		}
		// display name and total pay
		//polymorphic method call emp_array[i].computepay()
		for (int i = 0; i < emp_array.length; i++) {

			System.out.println(emp_array[i].getEmployeeName() + " earned $ "
					+ emp_array[i].computePay());

		}
	}

}
