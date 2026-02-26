class FoodExecutor {

	public static void main(String[] foodProperties) {
	
		boolean isPropertiesValidate = Food.getPropertiesInfo("Pizza", "Italian", "Medium", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("", "", "", "", "");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo(null, null, null, null, null);
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("", "Italian", "Medium", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "", "Medium", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "Italian", "", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "Italian", "Medium", "", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "Italian", "Medium", "$12", "");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo(null, "Italian", "Medium", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", null, "Medium", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "Italian", null, "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "Italian", "Medium", null, "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "Italian", "Medium", "$12", null);
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("", "", "Medium", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "", "", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("", "Italian", "", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("", "Italian", "Medium", "$12", "");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("", null, "Medium", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("", "Italian", null, "", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", null, "Medium", "", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", null, "Medium", "", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", null, "Medium", "", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "", "Medium", "$12", null);
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo(null, "Italian", "Medium", null, "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("", "Italian", "Medium", "$12", "");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo(null, "Italian", null, "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "Italian", "", null, "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo(null, "Italian", "Medium", "", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", null, "Medium", null, "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo(null, "Italian", null, "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "", "Medium", null, "");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("", null, "Medium", "$12", null);
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", "", "", "$12", "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo(null, "Italian", "Medium", null, "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo(null, "Italian", null, "$12", null);
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("", "Italian", "", "$12", "");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		isPropertiesValidate = Food.getPropertiesInfo("Pizza", null, "Medium", null, "Yes");
		if(isPropertiesValidate)
			Food.displayInfo();
		else
			System.out.println("Validations falied , Cannot display properties of food");
		System.out.println("***********************************************************************************");
		
		
		
	}

}