class BedRunner {

	public static void main(String[] sheet) {
	
		Bed bed = new Bed();
		
		bed.addBedName("Single Bed");
		bed.addBedName("Double Bed");
		bed.addBedName("Queen Size Bed");
		bed.addBedName("King Size Bed");
		bed.addBedName("Bunk Bed");
		bed.addBedName("Sofa Bed");
		bed.addBedName("Murphy Bed");
		bed.addBedName("Platform Bed");
		bed.addBedName("Canopy Bed");
		bed.addBedName("Adjustable Bed");
		
		bed.getBedNames();
		System.out.println("-------------------------------------");
		
		System.out.println(bed.getBedNameByIndex(4));
		System.out.println("-------------------------------------");
		
		System.out.println(bed.getIndexByBedName("Queen Size Bed"));
		System.out.println("-------------------------------------");
		
		bed.updateBedName("Platform Bed" , "Plat Bed");
		System.out.println("The updated bed names is as follows :");
		bed.getBedNames();
		
		
	
	}

}