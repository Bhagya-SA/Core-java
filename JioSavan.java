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

}