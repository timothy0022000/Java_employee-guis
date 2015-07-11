/*
 * Name : Timothy Johnson
 * Eagle ID: 900725577
 * 
 * */
public abstract class Contract {
	// data field
	private String date;
	private Agent agent;
	private Cottage cottage;

	// empty constructor
	public Contract() {
		super();
	}

	// full constructor
	public Contract(String date, Agent agent, Cottage cottage) {
		super();
		this.date = date;
		this.agent = agent;
		this.cottage = cottage;
	}

	// getters and setters
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Cottage getCottage() {
		return cottage;
	}

	public void setCottage(Cottage cottage) {
		this.cottage = cottage;
	}

	// tostring method
	@Override
	public String toString() {
		return "Contract [date=" + date + ", agent=" + agent + ", cottage="
				+ cottage + ", toString()=" + super.toString() + "]";
	}

	// abstract methods
	public abstract double agentCommissionPay();

	public abstract double computeTotalDue();
}
