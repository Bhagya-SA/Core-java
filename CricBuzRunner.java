class CricBuzRunner {

    public static void main(String[] teamNames) {
    
        CricBuz cricBuz = new CricBuz(); 
        
        cricBuz.addTeamName("India");
        cricBuz.addTeamName("Australia");
        cricBuz.addTeamName("England");
        cricBuz.addTeamName("South Africa");
        cricBuz.addTeamName("New Zealand");
        cricBuz.addTeamName("Pakistan");
        cricBuz.addTeamName("Sri Lanka");
        cricBuz.addTeamName("West Indies");
        
        cricBuz.getTeamNames();
		System.out.println("---------------------------------------------------------");
		
		System.out.println(cricBuz.getTeamNameByIndex(3));
		System.out.println("---------------------------------------------------------");
		
		System.out.println(cricBuz.getIndexByTeamName("Sri Lanka"));
		System.out.println("---------------------------------------------------------");
		
		cricBuz.updateTeamName("India" , "Bharatha");
		System.out.println("The updated team names is as follows : ");
		cricBuz.getTeamNames();
		System.out.println("---------------------------------------------------------");
        
    }
}