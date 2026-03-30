class Steel {

	private String steelNames[] = new String[10];
	int index;
	
	public boolean addSteelName(String steelName) {
	
		boolean isSteelNameAdded = false;
		if(steelName != null && !steelName.isEmpty()) {
			steelNames[index++] = steelName;
			isSteelNameAdded = true;
		}
		else{
			System.out.println("Invalid name , PLease try again later........");
		}
		return isSteelNameAdded;
	
	}
	
	public void getSteelNames() {
		for(String steelName : steelNames) System.out.println(steelName);
	}
	
	public String getNameByIndex(int index) {
		
		String steelName = null;
		if(index < steelNames.length) steelName = steelNames[index];
		return steelName;
	
	}
	
	public int getIndexByName(String steelName) {
	
		int index = 0;
		for(String name : steelNames) {
			if(name != null && !name.isEmpty()) {
				if(name != steelName) {
					index++;
				}
				else {
					break;
				}
			}
		}
		return index;

	}
	
	public boolean updateSteelName(String existingSteelName , String updatedSteelName) {
	
		boolean isSteelNameUpdated = false;
		for(int index = 0; index < steelNames.length; index++) {
			if(steelNames[index] == existingSteelName) {
				steelNames[index] = updatedSteelName;
				isSteelNameUpdated = true;
			}
		}
		return isSteelNameUpdated;
	}
	
}