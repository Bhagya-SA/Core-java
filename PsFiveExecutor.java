class PsFiveExecutor {

	public static void main(String[] psgame) {
		
		boolean isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("" ,"" , "" , "" ,"" , "" , "" ,  "");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo(null ,null , null , null ,null , null , null ,  null);
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo(null ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,null , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , null , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , null ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , null , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , null ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  null);
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("" ,"Nintendo EPD" , "Nintendo" , "" ,"Nintendo Switch, Wii U" , "" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("" ,"Nintendo EPD" , "" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,null , "Nintendo" , null ,"Nintendo Switch, Wii U" , null , "Single-player" ,  null);
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,null , null , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "" , null,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"" , "" , "" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("" ,"Nintendo EPD" , "Nintendo" , "" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"" , "Nintendo" , "Action-adventure" ,"" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"" , "Nintendo" , "" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"" , "Nintendo" , "" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "" , "" ,"Nintendo Switch, Wii U" , null , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("" ,"" , "Nintendo" , "" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"" , null , null ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,null , "Nintendo" , null ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("" ,"Nintendo EPD" , "Nintendo" , "Action-adventure" ,"" , "March 3, 2017" , "Single-player" ,  "");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"Nintendo EPD" , "" , "Action-adventure" ,"Nintendo Switch, Wii U" , "" , "" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,"" , "" , null ,"Nintendo Switch, Wii U" , null , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		isPropertiesValidate = PsFive.getPropertiesInfo("The Legend of Zelda: Breath of the Wild" ,null , null , "Action-adventure" ,"Nintendo Switch, Wii U" , "March 3, 2017" , "Single-player" ,  "E10+ (Everyone 10+)");
		if(isPropertiesValidate)
			PsFive.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties");
		System.out.println("****************************************************************");
		
		
		
	}


}