class RCB {

	private String playerNames[] = new String[15];
	int index;
	
	public boolean addPlayerName(String playerName) {
	
		boolean isplayerNameAdded = false;
		
		if(playerName!= null && !playerName.isEmpty()) {
			playerNames[index++] = playerName;
			isplayerNameAdded = true;
		}
		else {
		
		}
		return isplayerNameAdded;
	}
	
	public void getPlayerNames() {
	
	for(String playerName : playerNames) System.out.println(playerName);
	}
	
	public String getNameByIndex(int index) {
		String playerName = null;
		if(index < playerNames.length) playerName = playerNames[index];
		return playerName;
	}
	
	public int getIndexByName(String playerName) {
		int i = 0;
		for(String name : playerNames) {
			if(name == playerName) return i;
			i++;
		}
		
		return -1;
	}
	
	public boolean updatePlayerName(String existingPlayerName , String updatedPlayerName) {
		boolean isPlayerNameUpdated = false;
		for(int index = 0; index < playerNames.length; index++) {
			if(playerNames[index] == existingPlayerName) {
				playerNames[index] = updatedPlayerName;
				isPlayerNameUpdated = true;
			}
		}
		return isPlayerNameUpdated;
	}
	


}

