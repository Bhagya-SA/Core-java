class ECommerceWebsiteRunner {

    public static void main(String[] products) {
    
        ECommerceWebsite ew = new ECommerceWebsite();
        
        ew.addProductName("Laptop");
        ew.addProductName("Smartphone");
        ew.addProductName("Headphones");
        ew.addProductName("Smartwatch");
        ew.addProductName("Tablet");
        ew.addProductName("Gaming Console");
        ew.addProductName("Camera");
        ew.addProductName("Bluetooth Speaker");
        ew.addProductName("Keyboard");
        ew.addProductName("Mouse");
        ew.addProductName("Monitor");
        ew.addProductName("Printer");
        ew.addProductName("External Hard Drive");
        ew.addProductName("Power Bank");
        ew.addProductName("Router");
        ew.addProductName("Smart TV");
        ew.addProductName("Microwave Oven");
        ew.addProductName("Refrigerator");
        ew.addProductName("Washing Machine");
        ew.addProductName("Air Conditioner");
        ew.addProductName("Vacuum Cleaner");
        ew.addProductName("Fitness Band");
        ew.addProductName("Drone");
        ew.addProductName("Smart Bulb");
        ew.addProductName("Electric Scooter");
        ew.addProductName("Gaming Chair");
        
        ew.getProductNames();
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println(ew.getNameByIndex(25));
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println(ew.getIndexByName("Printer"));
		System.out.println("-------------------------------------------------------------------");
        
		ew.updateProductName("Air Conditioner" , "AC");
		System.out.println("The updated productNames is as follows : ");
		ew.getProductNames();
		System.out.println("-------------------------------------------------------------------");
    }
}