class MovieExecutor {
	
	public static void main(String[] kgf) {
	
		boolean isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", "Vijay Kiragandur", "December 21, 2018", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "", "", "", "");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "Vijay Kiragandur", "December 21, 2018", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "", "Vijay Kiragandur", "December 21, 2018", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", "", "December 21, 2018", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", "Vijay Kiragandur", "", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", "Vijay Kiragandur", "December 21, 2018", "");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo(null, null, null, null, null);
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo(null, "Prashanth Neel", "Vijay Kiragandur", "December 21, 2018", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", null, "Vijay Kiragandur", "December 21, 2018", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", null, "December 21, 2018", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", "Vijay Kiragandur", null, "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", "Vijay Kiragandur", "December 21, 2018", null);
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "", "December 21, 2018", "");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "", "", "December 21, 2018", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "Vijay Kiragandur", "", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", "", "December 21, 2018", "");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "", "", "December 21, 2018", "");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "Vijay Kiragandur", "", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "Vijay Kiragandur", "", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", null, "December 21, 2018", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", null, "December 21, 2018", null);
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "", "December 21, 2018", "");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", null, null, "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", null, "Vijay Kiragandur", null, "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", null, "December 21, 2018", null);
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", null, "Vijay Kiragandur", null, "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "", "", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "", "December 21, 2018", null);
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "", "Vijay Kiragandur", "December 21 2018", null);
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "", "", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "Prashanth Neel", "", "December 21, 2018", "");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", null, "Vijay Kiragandur", null, "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", null, "Vijay Kiragandur", null, "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("KGF: Chapter 1", "", null ,"December 21, 2018", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "Vijay Kiragandur", "December 21, 2018", "");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
		isPropertiesValidate = Movie.getPropertiesInfo("", "Prashanth Neel", "", "", "Action");
		if(isPropertiesValidate)
			Movie.displayMovieInfo();
		else
			System.out.println("Validations failed , Cannot display properties");
		System.out.println("**********************************************************");
		
	
	}



}