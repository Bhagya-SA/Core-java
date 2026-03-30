class Kettle {

	private String kettleNames[] = new String[10];
	int index;
	
	public boolean addKettleName(String kettleName) {
		
		boolean isKettleNameAdded = false;
		if(kettleName != null && !kettleName.isEmpty()) {
			kettleNames[index++] = kettleName;
			isKettleNameAdded = true;
		}
		else{
			System.out.println("Invalid name , PLease try again later........");
		}
		return isKettleNameAdded;
	}
	
	public void getKettleNames() {
		for(String kettleName : kettleNames) System.out.println(kettleName);
	}
	
	public String getKettleByIndex(int index) {
		
		String kettleName = null;
		if(index < kettleNames.length) kettleName = kettleNames[index];
		return kettleName;
	
	}
	
	public int getIndexByKettle(String kettleName) {
	
		int index = 0;
		for(String name : kettleNames) {
			if(name != null && !name.isEmpty()) {
				if(name != kettleName) {
					index++;
				}
				else {
					break;
				}
			}
		}
		return index;
	}
	
	public boolean updateKettleName(String existingKettleName , String updatedKettleName) {
	
		boolean isKettleNameUpdated = false;
		for(int index = 0; index < kettleNames.length; index++) {
			if(kettleNames[index] == existingKettleName) {
				kettleNames[index] = updatedKettleName;
				isKettleNameUpdated = true;
			}
		}
		return isKettleNameUpdated;
	}

}