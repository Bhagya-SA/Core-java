class BigDaddy {

	int id;
	String name;
	String reputation;
	Cassino cassino;

	public BigDaddy(int id , String name , String reputation , cassino) {
		this.id = id;
		this.name = name;
		this.reputation;
		this.cassino = cassino;
	}
	
	public void displayBigDaddyInfo() {
	
		System.out.println("ID is : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Reputation is : " + this.reputation);
		this.cassino.displayCassinoInfo();
		System.out.println("-------------------------------------------");
	
	
	}
}
