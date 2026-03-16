class Cassino {

	int id;
	String location;
	String gamesAvailable;
	int revenue;
	
	public void displayCassinoInfo() {
		System.out.println("Id is : " + this.id);
		System.out.println("Location is : " + this.location);
		System.out.println("Games available : " + this.gamesAvailable);
		System.out.println("Revenue : " + this.revenue);
	}
}