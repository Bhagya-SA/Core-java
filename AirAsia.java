class AirAsia {

	private String passengers[] = new String[30];
	int index;
	
	public boolean addPassenger(String passenger) {
	
		boolean ispassengerAdded = false;
		
		if(passenger!= null  && !passenger.isEmpty()) {
			passengers[index++] = passenger;
			ispassengerAdded = true;
		}
		else {
			System.out.println("Please enter valid passenger name");
		}
		return ispassengerAdded;
	}
	
	public void getPassengers() {
	
	for(String passenger : passengers) System.out.println(passenger);
	}

}