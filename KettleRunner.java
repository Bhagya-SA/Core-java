class KettleRunner {

	public static void main(String[] book) {
	
		Kettle kettle = new Kettle();
		
		kettle.addKettleName("Electric Kettle");
		kettle.addKettleName("Stovetop Kettle");
		kettle.addKettleName("Glass Kettle");
		kettle.addKettleName("Steel Kettle");
		kettle.addKettleName("Whistling Kettle");
		kettle.addKettleName("Travel Kettle");
		kettle.addKettleName("Cordless Kettle");
		kettle.addKettleName("Temperature Control Kettle");
		kettle.addKettleName("Gooseneck Kettle");
		kettle.addKettleName("Ceramic Kettle");
		
		kettle.getKettleNames();
		System.out.println("---------------------------------------------------------");
		
		System.out.println(kettle.getKettleByIndex(5));
		System.out.println("---------------------------------------------------------");
		
		System.out.println(kettle.getIndexByKettle("Glass Kettle"));
		System.out.println("---------------------------------------------------------");
		
		kettle.updateKettleName("Cordless Kettle" , "Cordless");
		System.out.println("The updated kettle names is as follows :");
		kettle.getKettleNames();
		System.out.println("---------------------------------------------------------");
		
	
	
	}


}