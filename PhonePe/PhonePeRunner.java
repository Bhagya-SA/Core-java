class PhonePeRunner {

	public static void main(String[] pay) {
		
		PhonePe phonepe = new PhonePe();
		
		Payment paymentOne = new Payment();
		paymentOne.setPaymentId(1);
		paymentOne.setUserName("Bhoomija");
		paymentOne.setAmount(50000);
		paymentOne.setMerchant("Flipkart");
		paymentOne.setStatus(1);
		paymentOne.setMode("online");
		paymentOne.setCashBack(1000);
		
		boolean isPaymentAdded = phonepe.addPayment(paymentOne);
		System.out.println(isPaymentAdded);
		phonepe.getPaymentDetails();
		System.out.println("----------------------------------------------------");
		
	}
}