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

}