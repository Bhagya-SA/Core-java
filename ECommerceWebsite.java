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
	
	public String getNameByIndex(int index) {
		String productName = null;
		if(index < productNames.length) productName = productNames[index];
		return productName;
	}
	public int getIndexByName(String productName) {
		int i = 0;
		for(String name : productNames) {
			if(name == productName) return i;
			i++;
		}
		return -1;
	}
	
	public boolean updateProductName(String existingProductName , String updatedProductName) {
		boolean isProductNameUpdated = false;
		for(int index = 0; index < productNames.length ; index++) {
			if(productNames[index] == existingProductName) {
				productNames[index] = updatedProductName;
				isProductNameUpdated = true;
			}
		}
		return isProductNameUpdated;
	}
}