class Television {

	private String channelNames[] = new String[17];
	int index;
	
	public boolean addChannelName(String channelName) {
	
		boolean isChannelNameAdded = false;
		
		if(channelName != null && !channelName.isEmpty()) {
			channelNames[index] = channelName;
			index++;
			isChannelNameAdded = true;
			
		}
		else {
			System.out.println("Please enter valid Channel name");
		}
		return isChannelNameAdded;
	
	}
	
	public void getChannelNames() {
	
		for(String channelName : channelNames) {
			System.out.println(channelName);
		}
	
	}


}