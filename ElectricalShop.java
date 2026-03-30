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
	
	public String getApplianceNameByIndex(int index) {
		String appliance = null;
		if(index < appliances.length) appliance = appliances[index];
		return appliance;
	}
	
	public int getIndexByApplianceName(String appliance) {
		int i = 0;
		for(String name : appliances) {
			if(name == appliance) return i;
			i++;
		}
		return -1;
	}
	
	public boolean updateApplianceName(String existingApplianceName , String updatedApplianceName) {
		boolean isApplianceNameUpdated = false;
		for(int index = 0; index < appliances.length; index++) {
			if(appliances[index] == existingApplianceName) {
				appliances[index] = updatedApplianceName;
				isApplianceNameUpdated = true;
			}
		}
		return isApplianceNameUpdated;
	}

}