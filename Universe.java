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

}