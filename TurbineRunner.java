class TurbineRunner {

	public static void main(String[] turn) {
	
		Turbine turbine = new Turbine();
		
		turbine.addTurbineName("Steam Turbine");
		turbine.addTurbineName("Gas Turbine");
		turbine.addTurbineName("Hydraulic Turbine");
		turbine.addTurbineName("Wind Turbine");
		turbine.addTurbineName("Impulse Turbine");
		turbine.addTurbineName("Reaction Turbine");
		turbine.addTurbineName("Pelton Turbine");
		turbine.addTurbineName("Francis Turbine");
		turbine.addTurbineName("Kaplan Turbine");
		turbine.addTurbineName("Combined Cycle Turbine");
		
		turbine.getTurbineNames();
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(turbine.getTurbineNameByIndex(9));
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(turbine.getIndexByTurbineName("Francis Turbine"));
		System.out.println("-------------------------------------------------------------");
		
		turbine.updateTurbineName("Wind Turbine" , "Wind Tub");
		System.out.println("The updated turbine names is as follows :");
		turbine.getTurbineNames();
		System.out.println("-------------------------------------------------------------");
		
	}

}