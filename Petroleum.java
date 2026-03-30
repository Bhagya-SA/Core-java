class Petroleum {
	
	private String petroleumNames[] = new String[10];
	int index;
	
	public boolean addPetroleumName(String petroleumName) {
	
		boolean isPetroleumAdded = false;
		if(petroleumName != null && !petroleumName.isEmpty()) {
			petroleumNames[index++] = petroleumName;
			isPetroleumAdded = true;
		}
		else{
			System.out.println("Invalid name , PLease try again later........");
		}
		return isPetroleumAdded;
	
	}
	
	public void getPetroleumNames() {
		for(String petroleumName : petroleumNames) System.out.println(petroleumName);
	
	}
	
	public String getNameByIndex(int index) {
	
		String petroleumName = null;
		if(index < petroleumNames.length) petroleumName = petroleumNames[index];
		return petroleumName;
	
	}
	
	public int getIndexByName(String petroleumName) {
		
		int index = 0;
		for(String name : petroleumNames) {
			if(name != null && !name.isEmpty()) {
				if(name != petroleumName) {
					index++;
				}
				else {
					break;
				}
			}
		}
		return index;
	
	}
	
	public boolean updatePetroleumName(String existingPetroleumName , String updatedPetroleumName) {
	
		boolean isPetroleumNameUpdated = false;
		for(int index = 0; index < petroleumNames.length; index++) {
			if(petroleumNames[index] == existingPetroleumName) {
				petroleumNames[index] = updatedPetroleumName;
				isPetroleumNameUpdated = true;
			}
		}
		return isPetroleumNameUpdated;
	}
}