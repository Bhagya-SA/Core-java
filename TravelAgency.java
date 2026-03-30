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
	
	public String getPlacesByIndex(int index) {
		
		String placeName = null;
		if(index < places.length) {
			placeName = places[index];
		}
		return placeName;
	}
	
	public int getIndexByPlace(String placeName) {
		int i = 0;
		for(String name : places) {
			if(name == placeName) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public boolean updatePlace(String existingPlaceName , String updatedPlaceName) {
		boolean isPlaceUpdated = false;
		for(int index = 0; index < places.length; index++) {
			if(places[index] == existingPlaceName) {
			places[index] = updatedPlaceName;
			isPlaceUpdated = true;
			}
		}
		return isPlaceUpdated;
	}

}