class PhonePay {

	private String insuranceNames[] = new String[27];
	int index;
	
	public boolean addInsuranceName(String insuranceName) {
	
		boolean isInsuranceNameAdded = false;
		
		if(insuranceName != null && !insuranceName.isEmpty()) {
			insuranceNames[index] = insuranceName;
			index++;
			isInsuranceNameAdded = true;
		
		}
		else {
			System.out.println("Please add valid Insurance name");
		}
		return isInsuranceNameAdded;
	}
	
	public void getInsuranceNames() {
	
		for(String insuranceName : insuranceNames) {
			System.out.println(insuranceName);
		}
	}
	public String getNamebyIndex(int index) {
		String insuranceName = null;
		if(index < insuranceNames.length) insuranceName = insuranceNames[index];
		return insuranceName;
	}
	
	public int getIndexByName(String insuranceName) {
		int index = 0;
		for(String name : insuranceNames) {
		if(name != null && !name.isEmpty()) {
			if(name != insuranceName) index ++;
			else break;
		}
		else {
			System.out.println("No index found");
		}
		}
		return index;
	}
	
	public boolean updateinsuranceName(String existingInsuranceName , String updatedInsuranceName) {
		boolean isInsuranceNameUpdated = false;
		for(int index = 0; index < insuranceNames.length; index++) {
			if(insuranceNames[index] == existingInsuranceName) {
				insuranceNames[index] = updatedInsuranceName;
				isInsuranceNameUpdated = true;
			}
		}
		return isInsuranceNameUpdated ;
	}

}