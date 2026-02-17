class SwiggyExecutor {

	public static void main(String[] swiggy) {
	String foodName = "Schezwan Fried Rice";
	double cost = Swiggy.search(foodName);
		
	System.out.println("The price of " + foodName + " is : " + cost);
	
	}

}