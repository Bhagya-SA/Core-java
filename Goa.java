class Goa {

	private String beachNames[] = new String[19];
	int index;
	
	public boolean addBeachName(String beachName) {
	
		boolean isBeachNameAdded = false;
		
		if(beachName!=null && !beachName.isEmpty()) {
			beachNames[index] = beachName;
			index++;
			isBeachNameAdded = true;
			
		}
		else {
			System.out.println("Please enter valid beach name");
		}
		return isBeachNameAdded;
	}
	
	public void getBeachNames() {
	
	for(String beachName : beachNames) System.out.println(beachName);
	}

}