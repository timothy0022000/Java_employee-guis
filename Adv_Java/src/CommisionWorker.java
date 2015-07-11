public class CommisionWorker extends Employee {

	private double flatRate;
	private double unitsSold;
	private double commissionRate;

	public CommisionWorker() {
		// TODO Auto-generated constructor stub
	}

	public CommisionWorker(String employeeID, String employeeName) {
		super(employeeID, employeeName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the flatRate
	 */
	public double getFlatRate() {
		return flatRate;
	}

	/**
	 * @param flatRate
	 *            the flatRate to set
	 */
	public void setFlatRate(double flatRate) {
		this.flatRate = flatRate;
	}

	/**
	 * @return the unitsSold
	 */
	public double getUnitsSold() {
		return unitsSold;
	}

	/**
	 * @param unitsSold
	 *            the unitsSold to set
	 */
	public void setUnitsSold(double unitsSold) {
		this.unitsSold = unitsSold;
	}

	/**
	 * @return the commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * @param commissionRate
	 *            the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommisionWorker [flatRate=" + flatRate + ", unitsSold="
				+ unitsSold + ", commissionRate=" + commissionRate
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public double computePay() {
		// TODO Auto-generated method stub
		return flatRate + (unitsSold * commissionRate);
	}

}
