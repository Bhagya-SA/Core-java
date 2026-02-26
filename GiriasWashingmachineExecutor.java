class GiriasWashingmachineExecutor {

	public static void main(String[] washingMachine) {
	
	boolean isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
		
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("", "", "", "", "", "", "", "", "", "");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo(null, null, null, null, null, null, null, null, null, null);
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("", "GWX-1234", "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "", "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "", "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", "", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", "500W", "", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", "", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo(null, "GWX-1234", "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", null, "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", null, "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", null, "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", null, "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", null, "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", "500W", null, "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", null, "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", null, "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", null);
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("", "GWX-1234", null, "", "White", "500W", "", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("", "GWX-1234", "", "7kg", "", "500W", "", "1200 RPM", "", "");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo(null, "GWX-1234", null, "7kg", "White", null, "Quick Wash, Eco Wash", null, "$450", null);
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "", "7kg", "White", null, "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("", "GWX-1234", "Front Load", null, "White", null, "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "", "7kg", "White", "", "Quick Wash, Eco Wash", "", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", null, "7kg", "White", "", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "", "Front Load", "", "White", "500W", "", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "", "Front Load", "7kg", "White", "", "", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "", "7kg", null, "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "", "Front Load", null, "White", "500W", "Quick Wash, Eco Wash", "1200 RPM", "$450", "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("", "GWX-1234", "Front Load", "7kg", "White", "500W", "", "1200 RPM", "$450", "");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", "White", null, "Quick Wash, Eco Wash", "1200 RPM", null, "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");
	
	isPropertiesValidate = GiriasWashingMachine.getPropertiesInfo("Girias", "GWX-1234", "Front Load", "7kg", null, "500W", null, "1200 RPM", null, "2 Years");
	if(isPropertiesValidate)
		GiriasWashingMachine.displayInfo();
	else
		System.out.println("Validtions failed , Cannot display properties");
	System.out.println("**********************************************************************************************************************");

}

}