class Netflix {

	private String webSeriesNames[] = new String[18];
	int index;
	
	public boolean addWebSeries(String webSeriesName) {
	
		boolean isWebSeriesAdded = false;
		
		if(webSeriesName != null && !webSeriesName.isEmpty()) {
			webSeriesNames[index] = webSeriesName;
			index++;
			isWebSeriesAdded = true;
		}
		else {
			System.out.println("Please add valid WebSeries name");
		}
		return isWebSeriesAdded;
	}
	
	public void getWebSeriesNames() {
		for(String webSeriesName : webSeriesNames) {
			System.out.println(webSeriesName);
		}
	}
	
	public String getSeriesByIndex(int index){
		String webSeriesName = null;
		if(index < webSeriesNames.length) webSeriesName = webSeriesNames[index];
		return webSeriesName;
	}
	
	public int getIndexBySeries(String webSeriesName){
		int i = 0;
		for(String name : webSeriesNames) {
			
			if(name == webSeriesName) return i;
			
			i++;
		}
		return -1;
	}
	public boolean updateWebSeriesName(String existingSeriesName , String updateSeriesName) {
		boolean isSeriesUpdated = false;
		for(int index = 0; index < webSeriesNames.length; index++) {
			if(webSeriesNames[index] == existingSeriesName) {
				webSeriesNames[index] = updateSeriesName;
				isSeriesUpdated = true;
			}
		}
		return isSeriesUpdated;
	}
}