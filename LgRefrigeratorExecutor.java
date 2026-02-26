class LgRefrigeratorExecutor {

	public static void main(String[] refi) {
	
		boolean isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("", "", "", "", "", "", "", "", "", "");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo(null, null, null, null,null, null, null, null, null, null);
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "", "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "", "260L", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", "", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", "", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", "", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo(null, "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", null, "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", null, "260L", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", null, "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", null, "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", null, "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", null, "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", null, "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", null, "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", null);
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("", "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("", "GR-B247SLUV", "Double Door", "", "Silver", "4 Star", null, "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "", "260L", "Silver", "4 Star", "$600", null, "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "260L", "Silver", null, "$600", "2 Years", null, "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo(null, "GR-B247SLUV", "Double Door", "260L", "Silver",null, "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", "Double Door", "", "Silver", "4 Star", null, "", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo(null, "GR-B247SLUV", "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", null, "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", null, "Double Door", "260L", "Silver", null, "$600", null, "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "GR-B247SLUV", null, null, "Silver", "4 Star", "$600", "2 Years", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", null, "Double Door", "", "Silver", "4 Star", "$600", "", "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "", "Double Door", "260L", "Silver", "4 Star", "$600", null, "68x58x170 cm", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("", "GR-B247SLUV", "Double Door", "260L", "Silver", null, "$600", "2 Years", null, "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("LG", "", "Double Door", "260L", "", "4 Star", "$600", "2 Years", "", "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
		isPropertiesValidate = LgRefrigerator.getPropertiesInfo("", null, "Double Door", "260L", "Silver", "4 Star", "$600", "2 Years", null, "Smart Inverter, Frost Free");
		if(isPropertiesValidate)
			LgRefrigerator.displayInfo();
		else
			System.out.println("Validation falied , cannot display properties");
		System.out.println("*****************************************************************************************************************************************************************************");
		
			
	
	}

}