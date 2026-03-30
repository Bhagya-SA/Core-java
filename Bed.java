class Bed {

	private String bedNames[] = new String[10];
	int index;
	
	public boolean addBedName(String bedName) {
		
		boolean isBedNameAdded = false;
		if(bedName != null && !bedName.isEmpty()) {
			bedNames[index++] = bedName;
			isBedNameAdded = true;
		}
		else{
			System.out.println("Invalid name , PLease try again later........");
		}
		return isBedNameAdded;
	}
	
	public void getBedNames() {
		for(String bedName : bedNames) System.out.println(bedName);
	}
	
	public String getBedNameByIndex(int index) {
		String bedName = null;
		if(index < bedNames.length) bedName = bedNames[index];
		return bedName;
	
	}
	
	public int getIndexByBedName(String bedName) {
		
		int index = 0;
		for(String name : bedNames) {
			if(name != null && !name.isEmpty()) {
				if(name != bedName) {
					index++;
				}
				else {
					break;
				}
			}
		}
		return index;
	
	}
	
	public boolean updateBedName(String existingBedName , String updatedBedName) {
		
		boolean isBedNameUpdated = false;
		for(int index = 0; index < bedNames.length; index++) {
			if(bedNames[index] == existingBedName) {
				bedNames[index] = updatedBedName;
				isBedNameUpdated = true;
			}
		}
		return isBedNameUpdated;
	
	}
	

}