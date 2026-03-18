class ComedyShowExecutor {
	
    public static void main(String[] comedies) {
		
        ComedyShow comedyShow = new ComedyShow("Laugh Riot", "John Doe", "English", 1500.0, "25-03-2026", "19:00", "Grand Theater", 120, true, true, "FunTime Productions", "India", 500, "LR20260325", true, "Stadium Seating", 10.0, 4.9, "Stand-Up Comedy");

        comedyShow.getComedyShowDetails();
    }
}