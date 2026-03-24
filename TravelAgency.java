class TravelAgency {

	private String places[] = new String[19];
	int index;
	
	public boolean addPlace(String place) {
	
		boolean isPlaceAdded = false;
		
		if(place!= null  && !place.isEmpty()) {
			places[index] = place;
			index++;
			isPlaceAdded = true;
			
		}
		else {
			System.out.println("Please enter valid name");
		}
		return isPlaceAdded;
	}
	
	public void getPlaces() {
	
	for(String place : places) System.out.println(place);
	}

}