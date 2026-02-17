class ZomatoExecutor {
	public static void main(String[] food) {
		String foodName = "Chai";
		double cost = Zomato.search(foodName);
		
		System.out.println("The price of " + foodName + " is : " + cost);
	}

}