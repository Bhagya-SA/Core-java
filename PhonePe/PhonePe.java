class PhonePe {

	Payment payment;
	
	public boolean addPayment(Payment payment) {
		
		boolean isPaymentAdded = false;
		
		boolean isPaymentIdValid = false;
		boolean isUserNameValid = false;
		boolean isAmountValid = false;
		boolean isMerchantValid = false;
		boolean isStatusValid = false;
		boolean isModeValid = false;
		boolean isCashbackValid = false;
		
		int paymentId = payment.getPaymentId();
		if(paymentId > 0) {
			isPaymentIdValid = true;
		}
		
		String userName = payment.getUserName();
		if(userName != null && !userName.isEmpty()) {
			isUserNameValid = true;
		}
		
		double amount = payment.getAmount();
		if(amount > 0.0) {
			isAmountValid = true;
		}
		
		String merchant = payment.getMerchant();
		if(merchant != null && !merchant.isEmpty()) {
			isMerchantValid = true;
		}
		
		int status = payment.getStatus();
		if(status > 0) {
			isStatusValid = true;
		}
		
		String mode = payment.getMode();
		if(mode != null && !mode.isEmpty()) {
			isModeValid = true;
		}
		
		int cashback = payment.getCashBack();
		if(cashback > 0) {
			isCashbackValid = true;
		}
		
		if(isPaymentIdValid && isUserNameValid && isAmountValid && isMerchantValid && isStatusValid && isModeValid && isCashbackValid) {
			isPaymentAdded = true;
			this.payment = payment;
		}
		return isPaymentAdded;
	}
	
	public void getPaymentDetails() {
		
		System.out.println("The payment details as follows :");
		
		if(payment != null) {
			
			System.out.println("Payment Id : " + payment.getPaymentId());
			System.out.println("User Name : " + payment.getUserName());
			System.out.println("Amount : " + payment.getAmount());
			System.out.println("Merchant : " + payment.getMerchant());
			System.out.println("Status : " + payment.getStatus());
			System.out.println("Mode : " + payment.getMode());
			System.out.println("Cashback : " + payment.getCashBack());
			
		}
			
		
	}

}