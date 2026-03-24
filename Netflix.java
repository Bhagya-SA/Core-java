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
}