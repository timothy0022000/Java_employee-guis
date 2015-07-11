/*
 * Name : Timothy Johnson
 * Eagle ID: 900725577
 * 
 * */
public class Cottage {
	// data feilds
	private String cottageAdderss;
	private int cottageBedRooms;
	private int cottageBathRooms;
	private int cottageSize;
	private double cottageAskingPrice;
	

	// empty constructor
	public Cottage() {
		super();
	}

	// full constructor
	public Cottage(String cottageAdderss, int cottageBedRooms,
			int cottageBathRooms, int cottageSize,
			double cottageAskingPrice) {
		super();
		this.cottageAdderss = cottageAdderss;
		this.cottageBedRooms = cottageBedRooms;
		this.cottageBathRooms = cottageBathRooms;
		this.cottageSize = cottageSize;
		this.cottageAskingPrice = cottageAskingPrice;
		
	}

	// getters and setters
	public String getCottageAdderss() {
		return cottageAdderss;
	}

	public void setCottageAdderss(String cottageAdderss) {
		this.cottageAdderss = cottageAdderss;
	}

	public int getCottageBedRooms() {
		
		return cottageBedRooms;
	}

	public void setCottageBedRooms(int cottageBedRooms) {
		if ((cottageBedRooms > 1) && (cottageBedRooms < 3)){
			this.cottageBedRooms = cottageBedRooms;
		}else
		System.out.println("Error");
	}

	public int getCottageBathRooms() {
		return cottageBathRooms;
	}

	public void setCottageBathRooms(int cottageBathRooms) {
		if ((cottageBathRooms > 1) && (cottageBathRooms < 4)){
			this.cottageBathRooms = cottageBathRooms;
		}else
		System.out.println("Error");
		
	}

	public int getCottageSize() {
		return cottageSize;
	}

	public void setCottageSize(int cottageSize) {
		if ((cottageSize > 600) && (cottageSize < 2800)){
		this.cottageSize = cottageSize;
		}else
			System.out.println("Error");
	}

	public double getCottageAskingPrice() {
		return cottageAskingPrice;
	}

	public void setCottageAskingPrice(double cottageAskingPrice) {
		this.cottageAskingPrice = cottageAskingPrice;
	}

	

	// tostring methods
	@Override
	public String toString() {
		return "#######################################\n  " +
				"Cottage Information \n [cottageAdderss=" + cottageAdderss + "\n"
				+ " cottageBedRooms=" + cottageBedRooms + "\n"
				+ " cottageBathRooms=" + cottageBathRooms + "\n" +  " cottageSize="
				+ cottageSize + "\n" + " cottageAskingPrice=" + cottageAskingPrice + "\n"
				+ "###########################################" + "]";
	}

}
