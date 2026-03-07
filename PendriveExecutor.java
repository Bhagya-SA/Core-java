class PendriveExecutor{
    public static void main(String[] args) {

        Pendrive pen = new Pendrive();

        pen.brand = "SanDisk";
		String brand = pen.brand;
        pen.storage = 64;   
		int storage = pen.storage;
        pen.price = 799.50;
		double price = pen.price;
		

        String[] colors = {"Black", "Red", "Blue"};
        String[] vendors = {"Amazon", "Flipkart", "Reliance Digital"};

        System.out.println("Brand: " + brand);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
		
		System.out.println("Colors are as follows");
		for(String color : colors) System.out.println(color);
		
		System.out.println("Vendors are as follows");
		for(String vendor : vendors) System.out.println(vendor);
		
    }
}