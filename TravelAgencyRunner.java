class TravelAgencyRunner {

    public static void main(String[] agency) {
    
        TravelAgency ta = new TravelAgency();
        
        ta.addPlace("Paris");
        ta.addPlace("Rome");
        ta.addPlace("Dubai");
        ta.addPlace("New York City");
        ta.addPlace("London");
        ta.addPlace("Singapore");
        ta.addPlace("Bangkok");
        ta.addPlace("Tokyo");
        ta.addPlace("Bali");
        ta.addPlace("Sydney");
        ta.addPlace("Cape Town");
        ta.addPlace("Istanbul");
        ta.addPlace("Barcelona");
        ta.addPlace("Zurich");
        ta.addPlace("Maldives");
        ta.addPlace("Santorini");
        ta.addPlace("Las Vegas");
        ta.addPlace("Hong Kong");
        ta.addPlace("Rio de Janeiro");
        
        ta.getPlaces();
		System.out.println("--------------------------------------------------------");
		
		System.out.println("The place which is at index 14 is : " + ta.getPlacesByIndex(14));
		System.out.println("--------------------------------------------------------");
		System.out.println("The index is : "+ ta.getIndexByPlace("Zurich") + " of place Zurich");
		System.out.println("--------------------------------------------------------");
		
		
		ta.updatePlace("Cape Town" , "Town");
		System.out.println("The updated places is as folows:");
		ta.getPlaces();
		System.out.println("--------------------------------------------------------");
		
    
    }
}