class Singer {

	private String singerNames[] = new String[10];
	int index;
	
	public boolean addSingerName(String singerName) {
		
		boolean isSingerNameAdded = false;
		if(singerName != null && !singerName.isEmpty()) {
			singerNames[index++] = singerName;
			isSingerNameAdded = true;
		}
		else{
			System.out.println("Invalid name , PLease try again later........");
		}
		return isSingerNameAdded;
	}
	
	public void getSingerNames() {
		for(String singerName : singerNames) System.out.println(singerName);
	}
	
	public String getSingerNameByIndex(int index) {
	
		String singerName = null;
		if(index < singerNames.length)  singerName = singerNames[index];
		return singerName;
	
	}
	
	public int getIndexBySingerName(String singerName) {
		
		int index = 0;
		for(String name : singerNames) {
			if(name != null && !name.isEmpty()) {
				if(name != singerName) {
					index++;
				}
				else {
					break;
				}
			}
		}
		return index;
	
	
	}
	
	public boolean updateSingerName(String existingSingerName , String updatedSingerName) {
	
		boolean isSingerNameUpdated = false;
		for(int index = 0; index < singerNames.length; index++) {
			if(singerNames[index] == existingSingerName) {
				singerNames[index] = updatedSingerName;
				isSingerNameUpdated = true;
			}
		}
		return isSingerNameUpdated;
	}

}