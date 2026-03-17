class Franchisie {

	int franchisieId;
	String franchisieName;
	String country;

	 public Franchisie(int franchisieId, String franchisieName, String country) {
        this.franchisieId = franchisieId;
        this.franchisieName = franchisieName;
        this.country = country;
    }
	
	public void displayInfo() {
		System.out.println("Franchisie Id : " + this.franchisieId);
		System.out.println("Franchisie Name : " + this.franchisieName);
		System.out.println("Country : " + this.country);
		
	
	}
	


}
