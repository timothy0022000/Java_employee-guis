/*
 * Name : Timothy Johnson
 * Eagle ID: 900725577
 * 
 * */

public class Agent {

	
	//data field
	private String agentEmployeeID;
	private String agentFirstName;
	private String agentLastName;
	private String agentCellNumber;
	private String agentEmail;
	private double agentCommissionRate;

	// empty constructor
	public Agent() {
		super();
	}

	//full constructor
	public Agent(String agentEmployeeID, String agentFirstName,
			String agentLastName, String agentCellNumber, String agentEmail,
			double agentCommissionRate) {
		super();
		this.agentEmployeeID = agentEmployeeID;
		this.agentFirstName = agentFirstName;
		this.agentLastName = agentLastName;
		this.agentCellNumber = agentCellNumber;
		this.agentEmail = agentEmail;
		this.agentCommissionRate = agentCommissionRate;
	}

	//getters and setters
	public String getAgentEmployeeID() {
		return agentEmployeeID;
	}

	public void setAgentEmployeeID(String agentEmployeeID) {
		this.agentEmployeeID = agentEmployeeID;
	}

	public String getAgentFirstName() {
		return agentFirstName;
	}

	public void setAgentFirstName(String agentFirstName) {
		this.agentFirstName = agentFirstName;
	}

	public String getAgentLastName() {
		return agentLastName;
	}

	public void setAgentLastName(String agentLastName) {
		this.agentLastName = agentLastName;
	}

	public String getAgentCellNumber() {
		return agentCellNumber;
	}

	public void setAgentCellNumber(String agentCellNumber) {
		this.agentCellNumber = agentCellNumber;
	}

	public String getAgentEmail() {
		return agentEmail;
	}

	public void setAgentEmail(String agentEmail) {
		this.agentEmail = agentEmail;
	}

	public double getAgentCommissionRate() {
		return agentCommissionRate;
	}

	public void setAgentCommissionRate(double agentCommissionRate) {
		if ((agentCommissionRate >= .04) && (agentCommissionRate <=.08)){
		this.agentCommissionRate = agentCommissionRate;
		}else 
			System.out.println("Error");
	}

	//tostring method
	@Override
	public String toString() {
		return "Agent [agentEmployeeID=" + agentEmployeeID
				+ ", agentFirstName=" + agentFirstName + ", agentLastName="
				+ agentLastName + ", agentCellNumber=" + agentCellNumber
				+ ", agentEmail=" + agentEmail + ", agentCommissionRate="
				+ agentCommissionRate + "]";
	}

}
