class MuseumRunner {

    public static void main(String[] monuments) {
    
        Museum museum = new Museum();
        
        museum.addHistoricalMonument("Taj Mahal");
        museum.addHistoricalMonument("Qutub Minar");
        museum.addHistoricalMonument("Red Fort");
        museum.addHistoricalMonument("India Gate");
        museum.addHistoricalMonument("Hawa Mahal");
        museum.addHistoricalMonument("Mysore Palace");
        museum.addHistoricalMonument("Gateway of India");
        museum.addHistoricalMonument("Charminar");
        museum.addHistoricalMonument("Konark Sun Temple");
        museum.addHistoricalMonument("Meenakshi Temple");
        museum.addHistoricalMonument("Golden Temple");
        museum.addHistoricalMonument("Ajanta Caves");
        museum.addHistoricalMonument("Ellora Caves");
        museum.addHistoricalMonument("Victoria Memorial");
        museum.addHistoricalMonument("Lotus Temple");
        museum.addHistoricalMonument("Sanchi Stupa");
        
		museum.getHistoricalMonuments();
		System.out.println("------------------------------------------------------------");
		
		System.out.println(museum.getNameByIndex(8));
		System.out.println("------------------------------------------------------------");
		
		System.out.println(museum.getIndexByName("India Gate"));
		System.out.println("------------------------------------------------------------");
		
		museum.updateMonumentName("Ellora Caves" , "Ellora");
		System.out.println("The updated Monuments is as follows : ");
		museum.getHistoricalMonuments();
		System.out.println("------------------------------------------------------------");
		
		
        
    }
}