class Wonderla {

	private String games[] = new String[21];
	int index;
	
	public boolean addGame(String game) {
	
		boolean isGameAdded = false;
		
		if(game != null && !game.isEmpty()) {
			games[index] = game;
			index++;
			isGameAdded = true;
			
		}
		else {
			System.out.println("Please enter valid game name");
		}
		return isGameAdded;
	}
	
	public void getGames() {
	
		for(String game : games) {
			System.out.println(game);
		}
	}



}