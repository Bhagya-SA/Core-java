class Compartment {

	int compartmentId;
	String compartmentType;
	int seatCapacity;

	 public Compartment(int compartmentId, String compartmentType, int seatCapacity) {
        this.compartmentId = compartmentId;
        this.compartmentType = compartmentType;
        this.seatCapacity = seatCapacity;
    }
	
	public void displayCompartmentInfo() {
		System.out.println("Compartment Id is : " + this.compartmentId);
		System.out.println("Compartment type : " + this.compartmentType);
		System.out.println("Seat capacity is : " + this.seatCapacity);
	}

}
