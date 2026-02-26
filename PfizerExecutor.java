class PfizerExecutor {


	public static void main(String[] pharmaCompany) {
	
		boolean isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo("", "", "", "", "", "", "", "");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo(null, null, null, null, null, null, null, null);
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo("", "Albert Bourla", "1849", "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "", "1849", "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "", "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "", "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "New York, USA", "", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "New York, USA", "$81.3B", "", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "New York, USA", "$81.3B", "79,000", "", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", "");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( null, "Albert Bourla", "1849", "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", null, "1849", "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", null, "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", null, "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "New York, USA", null, "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "New York, USA", "$81.3B", null, "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "New York, USA", "$81.3B", "79,000", null, "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", null);
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "", "Albert Bourla", "", "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "", "1849", "", "$81.3B", "79,000", "Vaccines, Medicines", "");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "", "Albert Bourla", null, "New York, USA", "$81.3B", null, "Vaccines, Medicines", null);
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", null, "New York, USA",null, "79,000", null, "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", null, null, "New York, USA", null, "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", null, "$81.3B", null, "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( null, "Albert Bourla", "1849", null, "$81.3B", null, "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", null, "1849", "New York, USA", "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", null, "1849", "New York, USA", "$81.3B", null, "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", null, "1849", null, "$81.3B", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", null, "1849", "New York, USA", null, null, "", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "", "Albert Bourla", "1849", "New York, USA", "$81.3B", "", "", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "", "Albert Bourla", "", "New York, USA", "", "79,000", "Vaccines, Medicines", "");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "", "", "", "79,000", "", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "", "1849", "New York, USA", "", "79,000", "", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "", "1849", "", "", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "", "Albert Bourla", "1849", "", "$81.3B", "79,000", "Vaccines, Medicines", "");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "Pfizer", "Albert Bourla", "1849", "", "$81.3B", "79,000", "", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");
		
		isPropertiesValidate = Pfizer.getPropertiesInfo( "", "Albert Bourla", "1849", "", "", "79,000", "Vaccines, Medicines", "PFF");
		if(isPropertiesValidate)
			Pfizer.displayInfo();
		else 
			System.out.println("Validations failed, Cannot display properties");
		System.out.println("*************************************************************");

	}

}