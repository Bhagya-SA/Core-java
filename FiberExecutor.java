class FiberExecutor {

	public static void main(String[] fibers) {
	
		Fiber fiber = new Fiber();
		
		fiber.name = "Single Mode Fiber";
		String name = fiber.name;
	
		fiber.length = 100;
		double length = fiber.length;
		
		String[] vendors = {"Vendor A" , "Vendor B", "Vendor C"};
		fiber.vendors = vendors;
		
		System.out.println("The name of the fiber is : " + name);
		System.out.println("The length of the fiber is :  " + length);
		
		System.out.println("vendors are as follows:");
		for(String vendor : vendors) {
			System.out.println(vendor);
		}
		
		
	
	}

}