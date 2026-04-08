class Facebook {

	UserAccount userAccounts[] = new UserAccount[3];
	int index = 0;
	
	public boolean createUserAccount(UserAccount userAccount) {
		boolean isUserAccountCreated = false;
		
		boolean isUserIdValid = false;
		boolean isUserNameValid = false;
		boolean isUserEmailValid = false;
		boolean isUserPasswordValid = false;
		boolean isConfirmPasswordValid = false;
		boolean isDOBValid = false;
		boolean isCountryValid = false;
		
		int userId = userAccount.getUserId();
		if(userId > 0) {
			isUserIdValid = true;
		}
		
		String userName = userAccount.getUserName();
		if(userName != null && !userName.isEmpty()) {
			isUserNameValid = true;
		}
		
		String userEmail = userAccount.getUserEmail();
		if(userEmail != null && !userEmail.isEmpty()) {
			isUserEmailValid = true;
		}
		
		String userPassword = userAccount.getUserPassword();
		if(userPassword != null && !userPassword.isEmpty()) {
			isUserPasswordValid = true;
		}
		
		String userConfirmPassword = userAccount.getConfirmPassword();
		if(userConfirmPassword != null && !userConfirmPassword.isEmpty()) {
			isConfirmPasswordValid = true;
		}
		
		String userDOB = userAccount.getDOB();
		if(userDOB != null && !userDOB.isEmpty()) {
			isDOBValid = true;
		}
		
		String userCountry = userAccount.getCountry();
		if(userCountry != null && !userCountry.isEmpty()) {
			isCountryValid = true;
		}
		
		if(isUserIdValid && isUserNameValid && isUserEmailValid && isUserPasswordValid && isConfirmPasswordValid && isDOBValid && isCountryValid) {
			isUserAccountCreated = true;
			userAccounts[index++] = userAccount;
		}
		
		
		return isUserAccountCreated;
	
	}
	
	public void getUserAccountDetails() {
		
		System.out.println("The details of userAccount is as follows: ");
		
		for(UserAccount userAccount : userAccounts) {
		
		System.out.println("__________________________________________________________________________");
		System.out.println("User Id : " + userAccount.getUserId());
		System.out.println("User name : " + userAccount.getUserName());
		System.out.println("User Email : " + userAccount.getUserEmail());
		System.out.println("User Password : " + userAccount.getUserPassword());
		System.out.println("Confirm password : " + userAccount.getConfirmPassword());
		System.out.println("User DOB : " + userAccount.getDOB());
		System.out.println("User Country  : " + userAccount.getCountry());
		System.out.println("______________________________________________________________________________");
		}
		
	
	}


}