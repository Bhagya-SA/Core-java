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

}