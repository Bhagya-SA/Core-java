class GoogleMaps {

	LocationInfo locations[] = new LocationInfo[5];
	int index;
	
	public boolean addLocation(LocationInfo location) {
		boolean isLocationAdded = false;
		
		boolean isPlaceIdValid = false;
		boolean isNameValid = false;
		boolean isRatingsValid = false;
		boolean isCityValid = false;
		boolean isReviewsValid = false;
		boolean isCategoryValid = false;
		boolean isDistanceValid = false;
		
		int placeId = location.getPlaceId();
		if(placeId > 0) {
			isPlaceIdValid = true;
		}
		
		String name = location.getName();
		if(name != null && !name.isEmpty()) {
			isNameValid = true;
		}
		
		int ratings = location.getRatings();
		if(ratings > 0) {
			isRatingsValid = true;
		}
		
		String city = location.getCity();
		if(city != null && !city.isEmpty()) {
			isCityValid = true;
		}
		
		int reviews = location.getReviews();
		if(reviews > 0) {
			isReviewsValid = true;
		}
		
		String category = location.getCategory();
		if(category != null && !category.isEmpty()) {
			isCategoryValid = true;
		}
		
		double distance = location.getDistance();
		if(distance > 0.0) {
			isDistanceValid = true;
		}
		
		if(isPlaceIdValid && isNameValid && isRatingsValid && isCityValid && isReviewsValid && isCategoryValid && isDistanceValid) {
			
			isLocationAdded = true;
			locations[index++] = location;
		
		}
		return isLocationAdded;
	}
	
	public void getLocationDetails() {
		
		System.out.println("The location details is as follows :");
		
		for(LocationInfo location  : locations)  {
			System.out.println("-------------------------------------------");
			System.out.println("Place Id is : " + location.getPlaceId());
			System.out.println("Place name is : " + location.getName());
			System.out.println("Place ratings is : " + location.getRatings());
			System.out.println("City is : " + location.getCity());
			System.out.println("Place reviews is : " + location.getReviews());
			System.out.println("Category is : " + location.getCategory());
			System.out.println("Distance is : " + location.getDistance());
			System.out.println("-------------------------------------------");
			
		}
	}

}