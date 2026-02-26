class Foreever24Executor {

    public static void main(String[] args) {

        boolean getPropertiesInfo;

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "Alice", "123-456-7890", "foreever24@gmail.com","10:00 AM", "9:00 PM", "Casual Wear", "10% Off", "Zara", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
			else 
				System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("", "Downtown", "Alice", "123-456-7890", "foreever24@gmail.com""10:00 AM", "9:00 PM", "Casual Wear", "10% Off", "Zara", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "", "Alice", "123-456-7890", "foreever24@gmail.com","10:00 AM", "9:00 PM", "Casual Wear", "10% Off", "Zara", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "", "123-456-7890", "foreever24@gmail.com","10:00 AM", "9:00 PM", "Casual Wear", "10% Off", "Zara", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "Alice", null, "foreever24@gmail.com","10:00 AM", "9:00 PM", "Casual Wear", "10% Off", "Zara", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "Alice", "123-456-7890", "","10:00 AM", "9:00 PM", "Casual Wear", "10% Off", "Zara", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "Alice", "123-456-7890", "foreever24@gmail.com",null, "9:00 PM", "Casual Wear", "10% Off", "Zara", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "Alice", "123-456-7890", "foreever24@gmail.com","10:00 AM", "", "Casual Wear", "10% Off", "Zara", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "Alice", "123-456-7890", "foreever24@gmail.com","10:00 AM", "9:00 PM", "", "10% Off", "Zara", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "Alice", "123-456-7890", "foreever24@gmail.com","10:00 AM", "9:00 PM", "Casual Wear", null, "Zara", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "Alice", "123-456-7890", "foreever24@gmail.com","10:00 AM", "9:00 PM", "Casual Wear", "10% Off", "", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "Alice", "123-456-7890", "foreever24@gmail.com","10:00 AM", "9:00 PM", "Casual Wear", "10% Off", "Zara", null, "Cash, Card, UPI");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "Downtown", "Alice", "123-456-7890", "foreever24@gmail.com","10:00 AM", "9:00 PM", "Casual Wear", "10% Off", "Zara", "Website & Instagram", "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "", "123-456-7890", null,"10:00 AM", "9:00 PM", "", "10% Off", "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", "", "Alice", null, "","", "9:00 PM", "Casual Wear", null, "", "Website & Instagram", "Cash, Card, UPI");
        if(getPropertiesInfo) Foreever24.displayInfo(); else System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("", "", "", "", "","", "", "", "", "", "", "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo(null, null, null, null, null,null, null, null, null, null, null, null);
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", null, "", "123-456-7890", "","10:00 AM", "", "", "Zara", null, "", "Cash, Card");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo("Foreever24", null, null, null, "alice@gmail.com","10:00 AM", "9:00 PM", "Casual Wear", "10% Off", null, "Website", null);
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");

        getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		 getPropertiesInfo = Foreever24.getPropertiesInfo(null, "Downtown", "Alice", "", null"10:00 AM", "", "Casual Wear", null, "Zara", null, "");
        if(getPropertiesInfo) 
			Foreever24.displayInfo(); 
		else 
			System.out.println("Validation failed. Cannot display shop details.");
        System.out.println("*******************************************************************************");
		
		

        
    }
}