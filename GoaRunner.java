class GoaRunner {

    public static void main(String[] beach) {
    
        Goa beachName = new Goa();
        
        beachName.addBeachName("Baga Beach");
        beachName.addBeachName("Calangute Beach");
        beachName.addBeachName("Anjuna Beach");
        beachName.addBeachName("Vagator Beach");
        beachName.addBeachName("Colva Beach");
        beachName.addBeachName("Palolem Beach");
        beachName.addBeachName("Candolim Beach");
        beachName.addBeachName("Morjim Beach");
        beachName.addBeachName("Arambol Beach");
        beachName.addBeachName("Agonda Beach");
        beachName.addBeachName("Miramar Beach");
        beachName.addBeachName("Dona Paula Beach");
        beachName.addBeachName("Sinquerim Beach");
        beachName.addBeachName("Mandrem Beach");
        beachName.addBeachName("Betalbatim Beach");
        beachName.addBeachName("Majorda Beach");
        beachName.addBeachName("Butterfly Beach");
        beachName.addBeachName("Querim Beach");
        beachName.addBeachName("Ashwem Beach");
        
        beachName.getBeachNames();
		System.out.println("----------------------------------------------------");
		
		System.out.println(beachName.getBeachNameByIndex(7));
		System.out.println("----------------------------------------------------");
		
		
		System.out.println(beachName.getIndexByBeachName("Arambol Beach"));
		System.out.println("----------------------------------------------------");
		
		
		beachName.updateBeachName("Butterfly Beach" , "Butterfly");
		System.out.println("The updated beach names is as follows");
		beachName.getBeachNames();
		System.out.println("----------------------------------------------------");
		
        
    }
}