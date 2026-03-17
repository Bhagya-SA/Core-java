class Train {

	int trainId;
	int trainNo;
	String trainName;
	String sourceStation;
	String destinationStation;
	Compartment compartment;

	 public Train(int trainId, int trainNo, String trainName, String sourceStation, String destinationStation, Compartment compartment) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.compartment = compartment;
    }
	
	public void displayTrainInfo() {
	
	System.out.println("Train Id is : " + this.trainId);
	System.out.println("Train No is : " + this.trainNo);
	System.out.println("Train Name is : " + this.trainName);
	System.out.println("Source station is : " + this.sourceStation);
	System.out.println("Destination station is : " + this.destinationStation);
	this.compartment.displayCompartmentInfo();
	System.out.println("---------------------------------------");
	}
}
