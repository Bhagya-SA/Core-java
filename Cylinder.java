class Cylinder {

	private String cylinderNames[] = new String[10];
	int index;
	
	public add addCylinderName(String cylinderName) {
		boolean isCylinerNameAdded = false;
		if(cylinderName != null && !cylinerName.isEmpty()) {
			cylinderNames[index++] = cylinderName;
			isCylinerNameAdded = true;
			
		}
		return isCylinderNameAdded;
	}
	
	public void getCylinderNames() {
		for(String cylinderName : cylinderNames) System.out.println(cylinderName);
		
	}
	
	public boolean String getNameByIndex(int index) {
		
		String cylinderName = null;
		if(index < cylinderNames.length) cylinderNames[index] = cylinderName;
		return cylinderName;
	}
	
	public boolean int getIndexByName(String cylinderName) {
		int index = 0;
		for(String name : cylinderNames) {
			if(name != null && !name.isEmpty()) {
				if(name != cylinderName) {
				index++;
			}
			else{
				break;
			}
		  }
		}	
		return index;
		
	}
	
	public boolean updateCylinderName(String existingCylinderName , String updatedCylinderName) {
		boolean isNameUpdated = false;
		for(int index = 0; index < cylinderNames.length; index++) {
			if(cylinderNames[index] == existingCylinderName) {
				cylinderNames[index] = updatedCylinderName;
				isNameUpdated = true;
			}
		}
		return isNameUpdated;
	}
	
	
}