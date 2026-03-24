class State {

	private String highwayNames[] = new String[9];
	int index;
	
	public boolean addHighwayName(String highwayName) {
	
		boolean ishighwayNameAdded = false;
		
		if(highwayName!= null && !highwayName.isEmpty()) {
			highwayNames[index++] = highwayName;
			ishighwayNameAdded = true;
		}
		else {
			System.out.println("Please enter valid highway name");
		}
		return ishighwayNameAdded;
	}
	
	public void getHighwayNames() {
	
	for(String highwayName : highwayNames) System.out.println(highwayName);
	}

}