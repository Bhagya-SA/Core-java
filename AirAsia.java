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
	
	public String getPassengerByIndex(int index) {
		String passenger = null;
		if(index < passengers.length) passenger = passengers[index];
		return passenger;
	}
	
	public int getIndexByPassenger(String passenger) {
		int i = 0;
		for(String name : passengers) {
			if(name == passenger) return i;
			i++;
		}
		return -1;
	}
	
	public boolean updatePassengerName(String existingPassengerName , String updatedPassengerName) {
		boolean isPassengerNameUpdated = false;
		for(int index = 0 ; index < passengers.length ; index++) {
			if(passengers[index] == existingPassengerName) {
				passengers[index] = updatedPassengerName;
				isPassengerNameUpdated = true;
			}
		}
		return isPassengerNameUpdated;
	}

}