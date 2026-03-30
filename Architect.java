class Architect {

	private String interiorDesignNames[] = new String[11];
	int index;
	
	public boolean addInteriorDesignName(String interiorDesignName) {
	
		boolean isinteriorDesignNameAdded = false;
		
		if(interiorDesignName!=null && !interiorDesignName.isEmpty()) {
			interiorDesignNames[index++] = interiorDesignName;
			isinteriorDesignNameAdded = true;
		}
		else {
			System.out.println("Please enter valid name");
		}
		return isinteriorDesignNameAdded;
	}
	
	public void getInteriorDesignNames() {
	
	for(String interiorDesignName : interiorDesignNames) System.out.println(interiorDesignName);
	}
	
	public String getinteriorDesignNameByIndex(int index) {
		String interiorDesignName = null;
		if(index < interiorDesignNames.length) interiorDesignName = interiorDesignNames[index];
		return interiorDesignName;
	}
	
	public int getIndexByinteriorDesignName(String interiorDesignName) {
		int i = 0;
		for(String interiorName : interiorDesignNames) {
			if(interiorName == interiorDesignName) return i;
			i++;
		}
		return -1;
	}
	
	public boolean updateInteriorDesignName(String existingInteriorDesign , String updatedInteriorDesign) {
		boolean isInteriorDesignNameUpdated = false;
		for(int index = 0; index < interiorDesignNames.length; index++) {
			if(interiorDesignNames[index] == existingInteriorDesign) {
				interiorDesignNames[index] = updatedInteriorDesign;
				isInteriorDesignNameUpdated = true;
			}
		}
		return isInteriorDesignNameUpdated;
		
	}

}