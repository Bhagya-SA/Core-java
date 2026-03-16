class BigDaddy {

	int id;
	String name;
	String reputation;
	Cassino cassino;
	
	public void displayBigDaddyInfo() {
	
		System.out.println("ID is : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Reputation is : " + this.reputation);
		this.cassino.displayCassinoInfo();
		System.out.println("-------------------------------------------");
	
	
	}
}