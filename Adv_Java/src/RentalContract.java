/*
 * Name : Timothy Johnson
 * Eagle ID: 900725577
 * 
 * */
public class RentalContract extends Contract {
	// data fields
	private int dayRented;
	private double rentalCost;
	private boolean isMaidService;

	// empty constructor
	public RentalContract() {
		super();
	}

	// full constructor
	public RentalContract(int dayRented, double rentalCost,
			boolean isMaidService, String date, Cottage cottage, Agent agent) {
		super(date, agent, cottage);
		this.dayRented = dayRented;
		this.rentalCost = rentalCost;
		this.isMaidService = isMaidService;
	}

	// getters and setters
	public int getDayRented() {
		return dayRented;
	}

	public void setDayRented(int dayRented) {
		this.dayRented = dayRented;
	}

	public double getRentalCost() {

		return rentalCost;
	}

	public void setRentalCost(double rentalCost) {
		this.rentalCost = rentalCost;
	}

	public boolean isMaidService() {
		return isMaidService;
	}

	public void setMaidService(boolean isMaidService) {
		this.isMaidService = isMaidService;
	}

	// tostring methods
	@Override
	public String toString() {
		return "RentalContract [dayRented=" + dayRented + ", rentalCost="
				+ rentalCost + ", isMaidService=" + isMaidService + "]";
	}

	// abstract methods

	/* Compute agent commission rate */
	public double agentCommissionPay() {
		double pay = dayRented * super.getCottage().getCottageRentalPerDay()
				* super.getAgent().getAgentCommissionRate();
		return pay;
	}

	/* compute rental cost */
	public double computeTotalDue() {

		double rentalCost0 = (dayRented * super.getCottage().getCottageRentalPerDay() + 200);
		double rentalCost_maidService = ((dayRented * 20) * super.getCottage().getCottageRentalPerDay() + 200);

		rentalCost = (isMaidService == true) ? rentalCost_maidService
				: rentalCost0;

		return rentalCost;
	}

}
