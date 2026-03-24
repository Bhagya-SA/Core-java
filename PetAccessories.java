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

}