class Turbine {

	private String turbineNames[] = new String[10];
	int index;
	
	public boolean addTurbineName(String turbineName) {
		
		boolean isTurbineNameAdded = false;
		if(turbineName != null && !turbineName.isEmpty()) {
			turbineNames[index++] = turbineName;
			isTurbineNameAdded = true;
		}
		else{
			System.out.println("Invalid name , PLease try again later........");
		}
		return isTurbineNameAdded;
	}
	
	public void getTurbineNames() {
		for(String turbineName : turbineNames) System.out.println(turbineName);
	}
	
	public String getTurbineNameByIndex(int index) {
		
		String turbineName = null;
		if(index < turbineNames.length) turbineName = turbineNames[index];
		return turbineName;
	
	}
	
	public int getIndexByTurbineName(String turbineName) {
		
		int index = 0;
		for(String name : turbineNames) {
			if(name != null && !name.isEmpty()) {
				if(name != turbineName) {
					index++;
				}
				else {
					break;
				}
			}
		}
		return index;
	
	}
	
	public boolean updateTurbineName(String existingTurbineName , String updatedTurbineName) {
	
		boolean isTurbineNameUpdated = false;
		for(int index = 0; index < turbineNames.length; index++) {
			if(turbineNames[index] == existingTurbineName) {
				turbineNames[index] = updatedTurbineName;
				isTurbineNameUpdated = true;
			}
		}
		return isTurbineNameUpdated;
	}

}