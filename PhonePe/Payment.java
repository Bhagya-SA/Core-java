public class Payment {

	private int paymentId;
	private String userName;
	private double amount;
	private String merchant;
	private int status;
	private String mode;
	private int cashback;
	
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getPaymentId() {
		return paymentId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	
	public void setMerchant(String maerchant) {
		this.merchant = merchant;
	}
	public String getMerchant() {
		return merchant;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	public int getStatus() {
		return status;
	}
	
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getMode() {
		return mode;
	}
	
	public void setCashBack(int cashback) {
		this.cashback = cashback;
	}
	public int getCashBack() {
		return cashback;
	}
	
	
	

}