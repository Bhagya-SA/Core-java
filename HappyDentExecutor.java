class HappyDentExecutor {

    public static void main(String[] args) {

        HappyDent gum = new HappyDent();

        gum.flavor = "Mint";
		String flavor = gum.flavor;
        gum.price = 10.0;
		double price = gum.price;
        gum.quantity = 5;
		int quantity = gum.quantity;
        gum.isSugarFree = true;
		boolean isSugarFree = gum.isSugarFree;

        String[] packTypes = {"Small Pack", "Medium Pack", "Large Pack"};
		gum.packTypes = packTypes;
        String[] vendors = {"Reliance Store", "More Supermarket", "Local Shop"};
		gum.vendors = vendors;

        System.out.println("Flavor: " + flavor);
        System.out.println("Price: " + price);
		System.out.println("Quantity : "  + quantity);
		System.out.println("Is sugar free : " + isSugarFree);
		
		System.out.println("Pack types are as follows : ");
		for(String packType : packTypes) System.out.println(packType);
		
		System.out.println("Vendors are as follows : ");
		for(String vendor : vendors) System.out.println(vendor);
		
		
		
		
		
    }
}