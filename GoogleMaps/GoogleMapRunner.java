class GoogleMapRunner {

	public static void main(String[] place) {
		
		GoogleMaps googleMap = new GoogleMaps();
		
		LocationInfo locationInfoOne = new LocationInfo();
		locationInfoOne.setPlaceId(1);
		locationInfoOne.setName("Iskon Temple");
		locationInfoOne.setRatings(5);
		locationInfoOne.setCity("Bangalore");
		locationInfoOne.setReviews(678);
		locationInfoOne.setCategory("Temple");
		locationInfoOne.setDistance(4.5);
		
		boolean isPlaceAdded = googleMap.addLocation(locationInfoOne);
		System.out.println(isPlaceAdded);
		
		
		LocationInfo locationInfoTwo = new LocationInfo();
		locationInfoTwo.setPlaceId(2);
		locationInfoTwo.setName("Sanky Tank");
		locationInfoTwo.setRatings(4);
		locationInfoTwo.setCity("Bangalore");
		locationInfoTwo.setReviews(500);
		locationInfoTwo.setCategory("Tank");
		locationInfoTwo.setDistance(6);
		
		isPlaceAdded = googleMap.addLocation(locationInfoTwo);
		System.out.println(isPlaceAdded);
		
		LocationInfo locationInfoThree = new LocationInfo();
		locationInfoThree.setPlaceId(3);
		locationInfoThree.setName("KaduMalleshwara Temple");
		locationInfoThree.setRatings(5);
		locationInfoThree.setCity("Bangalore");
		locationInfoThree.setReviews(600);
		locationInfoThree.setCategory("Temple");
		locationInfoThree.setDistance(2);
		
		isPlaceAdded = googleMap.addLocation(locationInfoThree);
		System.out.println(isPlaceAdded);
		
		LocationInfo locationInfoFour = new LocationInfo();
		locationInfoFour.setPlaceId(4);
		locationInfoFour.setName("Vidhan Soudha");
		locationInfoFour.setRatings(5);
		locationInfoFour.setCity("Bangalore");
		locationInfoFour.setReviews(600);
		locationInfoFour.setCategory("Building");
		locationInfoFour.setDistance(8);
		
		isPlaceAdded = googleMap.addLocation(locationInfoFour);
		System.out.println(isPlaceAdded);
		
		LocationInfo locationInfoFive = new LocationInfo();
		locationInfoFive.setPlaceId(5);
		locationInfoFive.setName("JayaNagar");
		locationInfoFive.setRatings(4);
		locationInfoFive.setCity("Bangalore");
		locationInfoFive.setReviews(300);
		locationInfoFive.setCategory("Shopping street");
		locationInfoFive.setDistance(10);
		
		isPlaceAdded = googleMap.addLocation(locationInfoFive);
		System.out.println(isPlaceAdded);
		
		googleMap.getLocationDetails();
		
	}

}