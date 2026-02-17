class FoodPandaExecutor {
	
	public static void main(String[] foodPanda) {
		
		String foodName = "Loaded Nachos";
		double cost = FoodPanda.search(foodName);
		
		System.out.println("The price of " + foodName + " is : " + cost);
	
	}
}