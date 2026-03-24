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
        
    }
}