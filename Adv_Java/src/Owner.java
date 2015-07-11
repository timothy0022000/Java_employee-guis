public class Owner {

	private String OwnerName;
	private String OwnerID;

	Owner() {

	}

	public Owner(String OwnerName, String OwnerID) {
		this.OwnerName = OwnerName;
		this.OwnerID = OwnerID;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public String getOwnerID() {
		return OwnerID;
	}

	public void setOwnerID(String ownerID) {
		OwnerID = ownerID;
	}

	@Override
	public String toString() {
		return "Owner [OwnerName=" + OwnerName + ", OwnerID=" + OwnerID + "]";
	}

}

class Pet {

	private String petName;
	private String species;
	private Owner owner;

	Pet() {
	}

	public Pet(String petName, String species) {
		this.petName = petName;
		this.species = species;
	}

	public Pet(String petName, String species, Owner owner) {
		this.petName = petName;
		this.species = species;
		this.owner = owner;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Pet [petName=" + petName + ", species=" + species + ", owner="
				+ owner + "]";
	}
}

class Tester {

	public static void main (String args[]){
		Owner owner1 = new Owner ("Tim", "0000");
		Owner owner2 = new Owner ("Naruto", "0009");
		
		Pet p1 = new Pet ("Kima", "Fox", owner2);
		System.out.println(owner1.toString());
		System.out.println(owner2.toString());
		
		
	}
}
