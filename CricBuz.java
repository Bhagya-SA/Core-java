class CricBuz {

	private String teamNames[] = new String[8];
	int index;
	
	public boolean addTeamName(String teamName) {
	
		boolean isteamNameAdded = false;
		
		if(teamName!= null && !teamName.isEmpty()) {
			teamNames[index++] = teamName;
			isteamNameAdded = true;
		}
		else {
			System.out.println("Please enter valid team name");
		}
		return isteamNameAdded;
	}
	
	public void getTeamNames() {
	
	for(String teamName : teamNames) System.out.println(teamName);
	}

}