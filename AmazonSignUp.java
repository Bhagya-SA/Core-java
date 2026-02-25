class AmazonSignUp {

    public static void createAccount(String email, String password) {
	    System.out.println("Email : " + email);
		System.out.println("Password : " + password);
        System.out.println("Customer Account Created");
    }

    public static void createAccount(String email, String password, String businessName, String taxId) {
	    System.out.println("Emanil : " + email);
		System.out.println("Password : " + password);
		System.out.println("Business Name : " + businessName);
		System.out.println("Tax Id : " + taxId);
        System.out.println("Seller Account Created");
    }
}