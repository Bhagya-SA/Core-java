class Hardware {

	int hardwareId;
	String hardwareName;
	String hardwareType;
	double price;

	public Hardware(int hardwareId, String hardwareName, String hardwareType, double price) {
        this.hardwareId = hardwareId;
        this.hardwareName = hardwareName;
        this.hardwareType = hardwareType;
        this.price = price;
    }
	
	public void displayHardwareInfo() {
	
		System.out.println("Hardware Id is : " + this.hardwareId);
		System.out.println("Hardware Name : " + this.hardwareName);
		System.out.println("Hardware Type : " + this.hardwareType);
		System.out.println("Hardware Price : " + this.price);
		
	
	}

}
