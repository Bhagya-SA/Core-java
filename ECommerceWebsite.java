class ECommerceWebsite {

	private String productNames[] = new String[26];
	int index;
	
	public boolean addProductName(String productName) {
	
		boolean isproductAdded = false;
		
		if(productName != null && !productName.isEmpty()) {
			productNames[index] = productName;
			index++;
			isproductAdded = true;
			
		}
		else {
			System.out.println("Please enter valid product name");
		}
		return isproductAdded;
	
	}
	
	public void getProductNames() {
		for(String productName : productNames) {
			System.out.println(productName);
		}
	}
}