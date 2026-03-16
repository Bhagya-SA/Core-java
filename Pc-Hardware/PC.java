class PC {

	int pcId;
	String pcName;
	String os;
	String ramSize;
	String storageSize;
	Hardware hardware;
	
	public void displayPCInfo() {
	
		System.out.println("PC Id is : " + this.pcId);
		System.out.println("PC Name : " + this.pcName);
		System.out.println("PC Operating system : " + this.os);
		System.out.println("RAM size :  " + this.ramSize);
		System.out.println("Storage size : " + this.storageSize);
		this.hardware.displayHardwareInfo();
		System.out.println("------------------------------------------------------");
	
	}

}