class Goa {

	private String beachNames[] = new String[19];
	int index;
	
	public boolean addBeachName(String beachName) {
	
		boolean isBeachNameAdded = false;
		
		if(beachName!=null && !beachName.isEmpty()) {
			beachNames[index] = beachName;
			index++;
			isBeachNameAdded = true;
			
		}
		else {
			System.out.println("Please enter valid beach name");
		}
		return isBeachNameAdded;
	}
	
	public void getBeachNames() {
	
	for(String beachName : beachNames) System.out.println(beachName);
	}
	public String getBeachNameByIndex(int index) {
		String beachName = null;
		if(index < beachNames.length) beachName = beachNames[index];
		return beachName;
	}
	public int getIndexByBeachName(String beachName) {
		int i = 0;
		for(String name : beachNames) {
			if(name == beachName) return i;
			
			i++;
		}
		return -1;
	}
	
	public boolean updateBeachName(String existingBeachName , String updatedBeachName) {
		boolean isBeachNameUpdated = false;
		for(int index = 0; index < beachNames.length; index++) {
			if(beachNames[index] == existingBeachName) {
				beachNames[index] = updatedBeachName;
				isBeachNameUpdated = true;
			}
		}
		return isBeachNameUpdated;
		
	}

}