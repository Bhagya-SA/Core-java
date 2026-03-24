class Museum {

	private String historicalMonuments[] = new String[16];
	int index;
	
	public boolean addHistoricalMonument(String historicalMonument) {
	
		boolean ishistoricalMonumentAdded = false;
		
		if(historicalMonument !=null && !historicalMonument.isEmpty()) {
			historicalMonuments[index++] = historicalMonument;
			ishistoricalMonumentAdded = true;
		}
		else {
			System.out.println("Please enter valid monuments name");
		}
		return ishistoricalMonumentAdded;
	}
	
	public void getHistoricalMonuments() {
	
	for(String historicalMonument : historicalMonuments) System.out.println(historicalMonument);
	}

}