class PetroleumRunner {

	public static void main(String[] petrol) {
	
		Petroleum petroleum = new Petroleum();
		
		petroleum.addPetroleumName("Petrol");
		petroleum.addPetroleumName("Diesel");
		petroleum.addPetroleumName("Kerosene");
		petroleum.addPetroleumName("LPG");
		petroleum.addPetroleumName("CNG");
		petroleum.addPetroleumName("Bitumen");
		petroleum.addPetroleumName("Lubricating Oil");
		petroleum.addPetroleumName("Paraffin Wax");
		petroleum.addPetroleumName("Fuel Oil");
		petroleum.addPetroleumName("Naphtha");
		
		petroleum.getPetroleumNames();
		System.out.println("------------------------------------------------");
		
		System.out.println(petroleum.getNameByIndex(3));
		System.out.println("------------------------------------------------");
		
		System.out.println(petroleum.getIndexByName("LPG"));
		System.out.println("------------------------------------------------");
		
		petroleum.updatePetroleumName("Lubricating Oil" , "Oil");
		System.out.println("The updated petroleum names is as follows :");
		petroleum.getPetroleumNames();
		System.out.println("------------------------------------------------");
		
	
	}

}