class PsFive {

	
	static String gameTitle;
	static String developer;
	static String publisher;
	static String genre;
	static String platform;
	static String releaseDate;
	static String gameMode;
	static String esrbRating;
	
	public static boolean getPropertiesInfo(String title , String dName , String pName , String gName , String platName , String relDate , String gMode , String rating) {
	
	boolean isPropertiesValidate = false;
	
	boolean isTitleValidate = false;
	boolean isDeveloperValidate = false;
	boolean isPublisherValidate = false;
	boolean isGenreValidate = false;
	boolean isPlatformValidate = false;
	boolean isReleaseDateValidate = false;
	boolean isGameModeValidate = false;
	boolean isEsrbratingValidate = false;
	
	if(title != null && !title.isEmpty()) {
	
		System.out.println("Game title is validated");
		gameTitle = title;
		isTitleValidate = true;
	
	}
	else {
		System.out.println("Game title is not validated");
	}
	
	if(dName != null && !dName.isEmpty()) {
		
		System.out.println("Developer name is Validated");
		developer = dName;
		isDeveloperValidate = true;
		
	}
	else {
		System.out.println("Developer name is not Validated");
	}
	
	if(pName != null && !pName.isEmpty()) {
	
		System.out.println("Publisher name is validated");
		publisher = pName;
		isPublisherValidate = true;
		
	}
	else {
		System.out.println("Publisher name is not validated");
	}
	
	if(gName!= null && !gName.isEmpty()) {
		System.out.println("Genre is Validated");
		genre = gName;
		isGenreValidate = true;
			
	}
	else {
		System.out.println("Genre is not Validated");
	}
	if(platName!= null && !platName.isEmpty()) {
		System.out.println("Platform is Validated");
		platform = platName;
		isPlatformValidate = true;
		
		
	}
	else {
		System.out.println("Platform is not Validated");
	}
	
	if(relDate!= null && !relDate.isEmpty()) {
		System.out.println("Release date is validated");
		releaseDate = relDate;
		isReleaseDateValidate = true;
		
		
	}
	else {
		System.out.println("Release date is not validated");
	}
	
	if(gMode!= null && !gMode.isEmpty()) {
		System.out.println("Game mode is validated");
		gameMode = gMode;
		isGameModeValidate = true;
		
		
	}
	else {
		System.out.println("Game mode is not validated");
	}
	
	if(rating!= null && !rating.isEmpty()) {
		System.out.println("ESRB rating is Validated");
		esrbRating = rating;
		isEsrbratingValidate = true;
		
		
	}
	else {
		System.out.println("ESRB rating is not Validated");
	}
	
	if(isTitleValidate == true && isDeveloperValidate == true && isPublisherValidate == true && isGenreValidate == true && isPlatformValidate == true && isReleaseDateValidate == true && isGameModeValidate == true && isEsrbratingValidate == true) {
	
		isPropertiesValidate = true;
	}
	return isPropertiesValidate;
	
	
	}
	
	public static void displayInfo() {
	
		System.out.println("Game title : " + gameTitle);
		System.out.println("Developer : " + developer);
		System.out.println("Publisher : " + publisher);
		System.out.println("Genre : " + genre);
		System.out.println("Platform : " + platform);
		System.out.println("Release Date : " + releaseDate);
		System.out.println("Game Mode : " + gameMode);
		System.out.println("ESRB Rating : " + esrbRating);
		
	
	}

}