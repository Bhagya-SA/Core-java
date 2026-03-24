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

}