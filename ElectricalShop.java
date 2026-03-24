class ElectricalShop {

	private String appliances[] = new String[20];
	int index;
	
	public boolean addAppliance(String appliance) {
	
		boolean isapplianceAdded = false;
		
		if(appliance != null && !appliance.isEmpty()) {
			appliances[index++] = appliance;
			isapplianceAdded = true;
		}
		else {
			System.out.println("Please enter valid appliance name");
		}
		return isapplianceAdded;
	}
	
	public void getAppliances() {
	
	for(String appliance : appliances) System.out.println(appliance);
	}

}