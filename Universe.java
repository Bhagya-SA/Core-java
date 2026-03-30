class Universe {

	private String galaxies[] = new String[17];
	int index;
	
	public boolean addGalaxy(String galaxy) {
	
		boolean isGalaxyAdded = false;
		
		if(galaxy != null && !galaxy.isEmpty()) {
			galaxies[index] = galaxy;
			index++;
			isGalaxyAdded = true;
		}
		else {
			System.out.println("Please enter valid galaxy name");
		}
		return isGalaxyAdded;
	}
	
	public void getGalaxies() {
	
	for(String galaxy : galaxies) System.out.println(galaxy);
	}
	
	public String getGalaxyByIndex(int index) {
		String galaxy = null;
		if(index < galaxies.length) 
			galaxy = galaxies[index];
		return galaxy;
	}
	
	public int getIndexByGalaxy(String galaxyName) {
		int i = 0;
		for(String name : galaxies) {
			if(name == galaxyName) {
				return i;
			}
			i++;
		}
		return -1;
		
	}
	
	public boolean updateGalaxyName(String existingGalaxyName , String updatedGalaxyName) {
		boolean isGalaxyNameUpdated = false;
		for(int index = 0; index < galaxies.length; index++) {
			if(galaxies[index] == existingGalaxyName) {
				galaxies[index] = updatedGalaxyName;
				 isGalaxyNameUpdated = true;	
			}
		}
		return isGalaxyNameUpdated;
	}

}