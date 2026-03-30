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
	
	public String getTeamNameByIndex(int index) {
		String teamName = null;
		if(index < teamNames.length) teamName = teamNames[index];
		return teamName;
	}
	
	public int getIndexByTeamName(String teamName) {
		int i = 0; 
		for(String name : teamNames) {
			if(name == teamName) return i;
			 
			i++;
		}
		return -1;
	}
	
	public boolean updateTeamName(String existingTeamName , String updatedTeamName) {
		boolean isTeamNameUpdated = false;
		for(int index = 0; index < teamNames.length; index++) {
			if(teamNames[index] == existingTeamName) {
				teamNames[index] = updatedTeamName;
				isTeamNameUpdated = true;
			}
		}
		return isTeamNameUpdated;
	}
	


}