/*
 * Name : Timothy Johnson
 * Eagle ID: 900725577
 * 
 * */
public class SalesContract extends Contract {
	// data fields
	private double negotiatePrice;
	private double purchasePrice;
	private double totalAmountDue;

	// empty constructor
	public SalesContract() {
		super();
	}

	// full constructor
	public SalesContract(double negotiatePrice, double purchasePrice,
			double totalAmountDue, String date, Cottage cottage, Agent agent) {
		super(date, agent, cottage);
		this.negotiatePrice = negotiatePrice;
		this.purchasePrice = purchasePrice;
		this.totalAmountDue = totalAmountDue;
	}

	// getters and setters
	public double getNegotiatePrice() {
		return negotiatePrice;
	}

	public void setNegotiatePrice(double negotiatePrice) {
		this.negotiatePrice = negotiatePrice;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double gettotalAmountDue() {
		
		return totalAmountDue;
	}

	public void settotalAmountDue(double totalAmountDue) {
		this.totalAmountDue = totalAmountDue;
	}

	// tostring methods
	@Override
	public String toString() {
		return "SalesContract [negotiatePrice=" + negotiatePrice
				+ ", purchasePrice=" + purchasePrice + ", totalAmountDue="
				+ totalAmountDue + "]";
	}

	// abstract methods
	public double agentCommissionPay() {

		return purchasePrice * super.getAgent().getAgentCommissionRate();
	}

	public double computeTotalDue() {
		totalAmountDue = (purchasePrice * .04);
		return totalAmountDue;
	}
}
