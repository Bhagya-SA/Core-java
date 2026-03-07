class BreadExecutor {

	public static void main(String[] breads) {
	
		Bread bread = new Bread();
		
		bread.type = "Whole Wheat";
		String type = bread.type;
		
		bread.price = 45.50;
		double price = bread.price;
		
		bread.brand = "Britannia";
		String brand = bread.brand;
		
		bread.weight = 500;
		double weight = bread.weight;
		
		bread.isFresh = true;
		boolean isFresh = bread.isFresh;
		
		bread.calories = 620;
		int calories = bread.calories;
		
		bread.flavor = "Honey";
		String flavor = bread.flavor;
		
		String outlets[] = {"Reliance Smart" , "SuperMarket" , "Local Bakery"};
		bread.outlets = outlets;
		
		String ingredients[] = {"Sugar" , "Salt" , "Yeast" , "Wheat Flour"};
		bread.ingredients = ingredients;
		
		double discounts[] = {5.0 , 10.0 , 15.0};
		bread.discounts = discounts;
		
		System.out.println("Type : " + type);
		System.out.println("Price : " + price);
		System.out.println("Brand : " + brand);
		System.out.println("Weight : " + weight);
		System.out.println("Is bread fresh : " + isFresh);
		System.out.println("Calories : " + calories);
		System.out.println("Flavor : " + flavor);
		
		
		System.out.println("Outlets list as follows :");
		for(String outlet : outlets) {
			System.out.println(outlet);
		}
		
		System.out.println("Ingredients list as follows :");
		for(String ingredient : ingredients) {
			System.out.println(ingredient);
		}
		
		System.out.println("Discounts list as follows :");
		for(double discount : discounts) {
			System.out.println(discount);
		}
	}

}