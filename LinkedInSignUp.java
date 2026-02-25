class LinkedInSignUp {

    public static void join(String email, String password) {
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);
        System.out.println("Personal Account Created");
    }

    public static void join(String email, String password, String company, String jobTitle) {
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);
		System.out.println("Company  : " + company);
		System.out.println("Job Title : " + jobTitle);
        System.out.println("Recruiter Account Created");
    }
}