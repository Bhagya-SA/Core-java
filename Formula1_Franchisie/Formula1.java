class Formula1 {

	int id;
	String driverName;
	String carNumber;
	String teamName;
	Franchisie franchisie;

	public Formula1(int id, String driverName, String carNumber, String teamName, Franchisie franchisie) {
        this.id = id;
        this.driverName = driverName;
        this.carNumber = carNumber;
        this.teamName = teamName;
        this.franchisie = franchisie;
    }
	
	public void displayFomula1Info() {
		System.out.println("Id is : " + this.id);
		System.out.println("Driver Name : " + this.driverName);
		System.out.println("Car Number : " + this.carNumber);
		System.out.println("Team Name : " + this.teamName);
		this.franchisie.displayInfo();
		System.out.println("-------------------------------------------------------");
		
		
	
	}

}
