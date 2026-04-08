class FacebookExecutor {

	public static void main(String[] media) {
	
		Facebook facebook = new Facebook();
		
		UserAccount userAccountOne = new UserAccount();
		
		userAccountOne.setUserId(1);
		userAccountOne.setUserName("Aadhya");
		userAccountOne.setUserEmail("aadhya@gmail.com");
		userAccountOne.setUserPassword("yui$%^#@!");
		userAccountOne.setConfirmPassword("yui$%^#@!");
		userAccountOne.setDOB("01-02-2000");
		userAccountOne.setCountry("India");
		
		boolean isAccountCreated = facebook.createUserAccount(userAccountOne);
		System.out.println(isAccountCreated);
		
		
		UserAccount userAccountTwo = new UserAccount();
		
		userAccountTwo.setUserId(2);
		userAccountTwo.setUserName("Nidhi");
		userAccountTwo.setUserEmail("nidhi@gmail.com");
		userAccountTwo.setUserPassword("yui$%^#@!");
		userAccountTwo.setConfirmPassword("yui$%^#@!");
		userAccountTwo.setDOB("03-04-2001");
		userAccountTwo.setCountry("India");
		
		isAccountCreated = facebook.createUserAccount(userAccountTwo);
		System.out.println(isAccountCreated);
		
		
		UserAccount userAccountThree = new UserAccount();
		
		userAccountThree.setUserId(3);
		userAccountThree.setUserName("Tejeshwini");
		userAccountThree.setUserEmail("teju@gmail.com");
		userAccountThree.setUserPassword("yui$%^#@!");
		userAccountThree.setConfirmPassword("yui$%^#@!");
		userAccountThree.setDOB("05-04-2002");
		userAccountThree.setCountry("India");
		
		isAccountCreated = facebook.createUserAccount(userAccountThree);
		System.out.println(isAccountCreated);
	
		facebook.getUserAccountDetails();
		
		
		
	
	}

}