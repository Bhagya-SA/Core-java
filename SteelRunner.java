class SteelRunner {

	public static void main(String[] material) {
	
		Steel steel = new Steel();
		
		steel.addSteelName("Carbon Steel");
		steel.addSteelName("Stainless Steel");
		steel.addSteelName("Alloy Steel");
		steel.addSteelName("Tool Steel");
		steel.addSteelName("Mild Steel");
		steel.addSteelName("High-Speed Steel");
		steel.addSteelName("Spring Steel");
		steel.addSteelName("Structural Steel");
		steel.addSteelName("Galvanized Steel");
		steel.addSteelName("Cast Steel");
		
		steel.getSteelNames();
		System.out.println("--------------------------------------------------------");
		
		System.out.println(steel.getNameByIndex(2));
		System.out.println("--------------------------------------------------------");
		
		System.out.println(steel.getIndexByName("Mild Steel"));
		System.out.println("--------------------------------------------------------");
		
		steel.updateSteelName("High-Speed Steel" , "High Steel");
		System.out.println("The updated steel names is as follows :");
		steel.getSteelNames();
		System.out.println("--------------------------------------------------------");
	
	}


}