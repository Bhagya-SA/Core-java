class State {

	private String highwayNames[] = new String[9];
	int index;
	
	public boolean addHighwayName(String highwayName) {
	
		boolean ishighwayNameAdded = false;
		
		if(highwayName!= null && !highwayName.isEmpty()) {
			highwayNames[index++] = highwayName;
			ishighwayNameAdded = true;
		}
		else {
			System.out.println("Please enter valid highway name");
		}
		return ishighwayNameAdded;
	}
	
	public void getHighwayNames() {
	
	for(String highwayName : highwayNames) System.out.println(highwayName);
	}
	
	public String gethighwayNameByIndex(int index) {
		String highwayName = null;
		if(index < highwayNames.length) highwayName = highwayNames[index];
		return highwayName;
	}
	
	public int getIndexByhighwayName(String highwayName) {
		int index = 0;
		for(String name : highwayNames) {
			if(name != null && !name.isEmpty()) {
				if(name != highwayName) {
					index++;
				}
				else {
					break;
				}
			}
			
		}
		return index;
	}
	
	public boolean updateHighwayName(String existingHighwayName , String updatedHighwayName) {
		boolean isHighwayNameUpdated = false;
		for(int index = 0 ; index < highwayNames.length; index++) {
			if(highwayNames[index] == existingHighwayName) {
				highwayNames[index] = updatedHighwayName;
				isHighwayNameUpdated = true;
			}
		}
		return isHighwayNameUpdated;
	}

}