class PetAccessories {

	private String petAccessoriesNames[] = new String[20];
	int index;
	
	public boolean addpetAccessoriesName(String petAccessoriesName) {
	
		boolean ispetAccessoriesNameAdded = false;
		
		if(petAccessoriesName != null  && !petAccessoriesName.isEmpty()) {
			petAccessoriesNames[index] = petAccessoriesName;
			index++;
			ispetAccessoriesNameAdded = true;
		}
		else {
			System.out.println("Please enter valid name");
		}
		return ispetAccessoriesNameAdded;
	}
	
	public void getpetAccessoriesNames() {
	
	for(String petAccessoriesName : petAccessoriesNames) System.out.println(petAccessoriesName);
	}
	
	public String getAccessoryByIndex(int index){
		String accessoryName = null;
		if(index < petAccessoriesNames.length) accessoryName = petAccessoriesNames[index];
		return accessoryName;
	}
	
	public int getIndexByAccessory(String accessoryName){
		int i = 0;
		for(String name : petAccessoriesNames) {
			if(name == accessoryName) return i;
			i++;
		}
		return -1;
	}
	
	public boolean updatePetAccessory(String existingPetAccessory , String updatedPetAccessory) {
		boolean isPetAccessoryUpdated = false;
		for(int index = 0; index < petAccessoriesNames.length; index++) {
			if(petAccessoriesNames[index] == existingPetAccessory) {
				petAccessoriesNames[index] = updatedPetAccessory;
				isPetAccessoryUpdated = true;
			}
		}
		return isPetAccessoryUpdated;
	}

}