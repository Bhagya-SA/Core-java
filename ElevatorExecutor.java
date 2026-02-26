class ElevatorExecutor {

	public static void main(String[] elev) {
		boolean getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "1000kg", "Passenger", "1.5 m/s", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
	    getPropertiesInfo = Elevator.getPropertiesInfo("", "Gen2", "1000kg", "Passenger", "1.5 m/s", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "", "1000kg", "Passenger", "1.5 m/s", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "", "Passenger", "1.5 m/s", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "1000kg", "", "1.5 m/s", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "1000kg", "Passenger", "", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "1000kg", "Passenger", "1.5 m/s", "", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "1000kg", "Passenger", "1.5 m/s", "20", "");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("", "", "1000kg", "Passenger", "1.5 m/s", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "", "", "", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "1000kg", "", "1.5 m/s", "", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "1000kg", "Passenger", "", "20", "");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", null, "Passenger", null, "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "", "Passenger", "1.5 m/s", "20", null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "Gen2", "", "Passenger", "1.5 m/s", "@@@", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", null, "1000kg", "Passenger", "", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "", "Passenger", "", "", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("", "Gen2", "1000kg", "", "1.5 m/s", null, "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "1000kg", "Passenger", "1.5 m/s", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "", null, "", null, "", null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("", "", null, "Passenger", "1.5 m/s", null, "");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "Gen2", "1000kg", null, "", "20", "");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "", "1000kg", null, "1.5 m/s", "20", null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "Gen2", "", null, "1.5 m/s", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", null, "1000kg", "Passenger", "1.5 m/s", null, "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("Otis", "", "1000kg", "Passenger", "", "20", "Emergency Brake, Alarm");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("", "Gen2", "1000kg", "Passenger", "1.5 m/s", "20", "");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, null, null, null, null, null, null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo("", "", "", "", "", "", "");
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "", null, "Passenger", null, "20",null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "", null, "Passenger", null, "20",null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "Gen2", , "Passenger", null, "20",null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "", null, "", null, "20",null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "Gen2", null, "Passenger", null, "20",null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "Gen2", null, "Passenger", null, "",null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "Gen2", null, "Passenger", null, "20",null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "Gen2", null, "", null, "20",null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
		getPropertiesInfo = Elevator.getPropertiesInfo(null, "", null, "Passenger", null, "20",null);
		if(getPropertiesInfo)
			Elevator.displayInfo();
		else
			System.out.println("Validation failed. Cannot display elevator details.");
		System.out.println("*******************************************************************************");
		
			
	}

}