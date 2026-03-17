class Shop {

	int shopId;
	String shopName;
	String shoapType;

	public Shop(int shopId, String shopName, String shopType) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopType = shopType;
    }
	
	public void displayShopInfo() {
	
		System.out.println("Shop Id is : " + this.shopId);
		System.out.println("Shop name : " + this.shopName);
		System.out.println("Shop type : " + this.shopType);
		
		
	
	}

}
