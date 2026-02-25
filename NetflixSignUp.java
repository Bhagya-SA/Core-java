class NetflixSignUp {

    public static void subscribe(String email, String password) {
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);
        System.out.println("Basic Plan Activated");
    }

    public static void subscribe(String email, String password, int numberOfProfiles) {
	    System.out.println("Email : " + email);
		System.out.println("Password : " + password);
		System.out.println("Number of Profiles : " + numberOfProfiles);
	
        System.out.println("Family Plan Activated");
    }
}