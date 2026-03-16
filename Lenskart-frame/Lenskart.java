class Lenskart {

	int id;
	double power;
	String material;
	String lensType;
	Frame frame;
	
	public void displayLenskartInfo() {
		System.out.println("Id is : " + this.id);
		System.out.println("Power is : " + this.power);
		System.out.println("Material is : " + this.material);
		System.out.println("Lens type is : " + this.lensType);
		this.frame.getFrameInfo();
		System.out.println("--------------------------------------------------");
	
	}

}