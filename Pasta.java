class Pasta {

	private String pastaNames[] = new String[10];
	int index;
	
	public boolean addPastaName(String pastaName) {
		boolean isPastaAdded = false;
		if(pastaName != null && !pastaName.isEmpty()) {
			pastaNames[index++] = pastaName;
			isPastaAdded = true;
		}
		else{
			System.out.println("Invalid name , PLease try again later........");
		}
		return isPastaAdded;
	
	}
	
	public void getPastaNames() {
	
		for(String pastaName : pastaNames) System.out.println(pastaName);
	
	}
	
	public String getPastaNameByIndex(int index) {
	
		String pastaName = null;
		if(index < pastaNames.length) pastaName = pastaNames[index];
		return pastaName;
	}
	
	public int getIndexByPastaName(String pastaName) {
		
		int index = 0;
		for(String name : pastaNames) {
			if(name != null && !name.isEmpty()) {
				if(name != pastaName) {
					index++;
				}
				else {
					break;
				}
			}
		}
		return index;
	
	}
	
	public boolean updatePastaName(String existingPastaName , String updatedPastaName) {
	
		boolean isPastaNameUpdated = false;
		for(int index = 0; index < pastaNames.length; index++) {
			if(pastaNames[index] == existingPastaName) {
				pastaNames[index] = updatedPastaName;
				isPastaNameUpdated = true;
			}
		}
		return isPastaNameUpdated;
	}
}