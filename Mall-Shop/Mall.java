class Mall {

	int mallId;
	String mallName;
	String location;
	int totalFloors;
	Shop shop;

	public Mall(int mallId, String mallName, String location, int totalFloors, Shop shop) {
        this.mallId = mallId;
        this.mallName = mallName;
        this.location = location;
        this.totalFloors = totalFloors;
        this.shop = shop;
    }
	
	public void displayMallInfo() {
	
		System.out.println("Mall Id is : " + this.mallId);
		System.out.println("Mall Name : " + this.mallName);
		System.out.println("Mall Location is : " + this.location);
		System.out.println("Total Floors in Mall : " + this.totalFloors);
		this.shop.displayShopInfo();
		System.out.println("----------------------------------------");
	}


}
