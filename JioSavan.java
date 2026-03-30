class JioSavan {

	private String songNames[] = new String[15];
	int index;
	
	public boolean addSongName(String songName) {
	
		boolean isSongAdded = false;
		
		if(songName != null && !songName.isEmpty()) {
			songNames[index] = songName;
			index++;
			isSongAdded = true;
		}
		else {
			System.out.println("Please enter song name");
		}
		return isSongAdded;
		
	}
	
	public void getSongNames() {
	
	for(String songName : songNames) {
		System.out.println(songName);
		}
	}
	public String getSongNameByIndex(int index){
		String songName = null;
		if(index < songNames.length) songName = songNames[index];
		return songName;
	}
	
	public int getIndexBySongName(String songName){
		int i = 0;
		for(String name : songNames) {
			if(name == songName) return i;
			
			i++;
		}
		return -1;
	}
	
	public boolean updateSongName(String existingSongName , String updatedSongName) {
		boolean isSongUpdated = false;
		for(int index = 0; index < songNames.length; index++) {
			if(songNames[index] == existingSongName) {
				songNames[index] = updatedSongName;
				isSongUpdated = true;
			}
		}
		return isSongUpdated;
	}

}