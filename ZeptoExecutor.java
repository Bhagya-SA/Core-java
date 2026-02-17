class ZeptoExecutor {

	public static void main(String[] zepto) {
		
		String foodName = "Strawberry Lemonade";
		double cost = Zepto.search(foodName);
		
		System.out.println("The price of " + foodName + " is : " + cost);
	
	}

}