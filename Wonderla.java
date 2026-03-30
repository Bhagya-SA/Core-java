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
	
	public String getGameByIndex(int index) {
		
		String game = null;
		if(index < games.length) game = games[index];
		return game;
		
	}
	public int getIndexByGame(String gameName) {
		int i = 0;
		for(String name : games) {
			if(name == gameName) return i;
			i++;
		}
		return -1;
	}
	
	public boolean updateGameName(String existingGameName , String updatedGameName) {
		boolean isGameNameUpdated = false;
		for(int index = 0; index < games.length; index++) {
			if(games[index] == existingGameName) {
				games[index] = updatedGameName;
			}
		}
		return isGameNameUpdated;
	}



}