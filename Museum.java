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
	
	public String getNameByIndex(int index){
	
		String historicalMonument = null;
		if(index < historicalMonuments.length) historicalMonument = historicalMonuments[index];
		return historicalMonument;
	}
	
	public int getIndexByName(String historicalMonument){
		int i = 0;
		for(String name : historicalMonuments) {
			if(name == historicalMonument) return i;
			i++;
		}
		return -1;
	}
	
	public boolean updateMonumentName(String existingMonumentName , String updatedMonumentName) {
		boolean isMonumentUpdated = false;
		for(int index = 0; index < historicalMonuments.length; index++) {
			if(historicalMonuments[index] == existingMonumentName) {
				historicalMonuments[index] = updatedMonumentName;
				isMonumentUpdated = true;
			}
		}
		return isMonumentUpdated;
	}

}