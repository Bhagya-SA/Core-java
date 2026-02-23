class EatSure {
	
	static double price = 0.0; 

	public static double search(String foodName) {

		if(foodName == "Lazeez Bhuna Murgh Biryani") {
			price = 180.0;
			return price;
		}
		else if(foodName == "Dum Gosht Biryani") {
			price = 185.0;
			return price;
		}
		else if(foodName == "Zaikedaar Paneer Biryani") {
			price = 189.0;
			return price;
		}
		else if(foodName == "Murgh Koobideh Biryani") {
			price = 295.0;
			return price;
		}
		else if(foodName == "Subz-e-Biryani (Veg)") {
			price = 199.0;
			return price;
		}
		else if(foodName == "Chicken Tikka Biryani") {
			price = 50.0;
			return price;
		}
		else if(foodName == "Keema Biryani") {
			price = 167.0;
			return price;
		}
		else if(foodName == "Egg Biryani") {
			price = 190.0;
			return price;
		}
		else if(foodName == "Mutton Seekh Biryani") {
			price = 140.0;
			return price;
		}
		else if(foodName == "Paneer Tikka Biryani") {
			price = 275.0;
			return price;
		}
		else if(foodName == "Kathal (Jackfruit) Biryani") {
			price = 276.0;
			return price;
		}
		else if(foodName == "Chicken Makhani Biryani") {
			price = 204.0;
			return price;
		}
		else if(foodName == "Shahi Veg Biryani") {
			price = 109.0;
			return price;
		}
		else if(foodName == "Special 1kg Handi Biryan") {
			price = 447.0;
			return price;
		}
		else if(foodName == "Chicken Tikka Roll") {
			price = 130.0;
			return price;
		}
		else if(foodName == "Cheese Chicken Roll") {
			price = 320.0;
			return price;
		}
		else if(foodName == "Double Chicken Max Roll") {
			price = 128.0;
			return price;
		}
		else if(foodName == "Paneer Tikka Roll") {
			price = 371.0;
			return price;
		}
		else if(foodName == "Veggie Wrap") {
			price = 2172.0;
			return price;
		}
		else if(foodName == "Egg Roll") {
			price = 276.0;
			return price;
		}
		else if(foodName == "Double Paneer Roll") {
			price = 223.0;
			return price;
		}
		else if(foodName == "Soya Tikka Roll") {
			price = 386.0;
			return price;
		}
		else if(foodName == "Chicken Bhuna Roll") {
			price = 389.0;
			return price;
		}
		else if(foodName == "Mutton Special Rol") {
			price = 187.0;
			return price;
		}
		else if(foodName == "Peri Peri Chicken Roll") {
			price = 356.0;
			return price;
		}
		else if(foodName == "Masala Paneer Roll") {
			price = 300.0;
			return price;
		}
		else if(foodName == "Chicken Shawarma Roll") {
			price = 320.0;
			return price;
		}
		else if(foodName == "Cheese Potato Rol") {
			price = 334.0;
			return price;
		}
		else if(foodName == "Veggie Loaded Roll") {
			price = 235.0;
			return price;
		}
		else if(foodName == "Cheese Burst Margherita") {
			price = 221.0;
			return price;
		}
		else if(foodName == "Veggie Supreme Pizza") {
			price = 465.0;
			return price;
		}
		else if(foodName == "Chicken Pepperoni Pizza") {
			price = 276.0;
			return price;
		}
		else if(foodName == "Smoky BBQ Chicken Pizza") {
			price = 178.0;
			return price;
		}
		else if(foodName == "Double Cheese Margherita") {
			price = 228.0;
			return price;
		}
		else if(foodName == "Spicy Triple Chicken Pizza") {
			price = 256.0;
			return price;
		}
		else if(foodName == "Farmhouse Veggie Pizza") {
			price = 255.0;
			return price;
		}
		else if(foodName == "Thin Crust Pizza") {
			price = 227.0;
			return price;
		}
		else if(foodName == "Dragonfire Chicken Pizza") {
			price = 298.0;
			return price;
		}
		else if(foodName == "Cheese Burst Chicken Pizza") {
			price = 364.0;
			return price;
		}
		else if(foodName == "Paneer Makhani Pizza") {
			price = 346.0;
			return price;
		}
		else if(foodName == "North Indian Chicken Thal") {
			price = 226.0;
			return price;
		}
		else if(foodName == "North Indian Chicken Thali") {
			price = 125.0;
			return price;
		}
		else if(foodName == "Shahi Paneer Thali") {
			price = 122.0;
			return price;
		}
		else if(foodName == "Dal Makhani Rice Bowl") {
			price = 121.0;
			return price;
		}
		else if(foodName == "Chicken Curry Rice Bowl") {
			price = 192.0;
			return price;
		}
		else if(foodName == "Rajma Rice Bowl") {
			price = 191.0;
			return price;
		}
		else if(foodName == "Paneer Tikka Masala Meal") {
			price = 290.0;
			return price;
		}
		else if(foodName == "Chole Chawal") {
			price = 289.0;
			return price;
		}
		else if(foodName == "Butter Chicken Meal") {
			price = 188.0;
			return price;
		}
		else if(foodName == "Veg Fried Rice & Manchurian Bowl") {
			price = 187.0;
			return price;
		}
		else if(foodName == "Chicken Kheema Rice Bowl") {
			price = 186.0;
			return price;
		}
		else if(foodName == "Pindi Chole Meal") {
			price = 185.0;
			return price;
		}
		else if(foodName == "Executive Veg Meal") {
			price = 84.0;
			return price;
		}
		else if(foodName == "Egg Curry Rice Bowl") {
			price = 183.0;
			return price;
		}
		else if(foodName == "Matar Paneer Meal") {
			price = 182.0;
			return price;
		}
		
		else {
			System.out.println("Couldn't find food item");
		}
		return price;
	
	}
	
	public static double search(String foodName , int quantity) {
		

		if(foodName == "Lazeez Bhuna Murgh Biryani") {
			price = 180.0;
			return price * quantity;
		}
		else if(foodName == "Dum Gosht Biryani") {
			price = 185.0;
			return price * quantity;
		}
		else if(foodName == "Zaikedaar Paneer Biryani") {
			price = 189.0;
			return price * quantity;
		}
		else if(foodName == "Murgh Koobideh Biryani") {
			price = 295.0;
			return price * quantity;
		}
		else if(foodName == "Subz-e-Biryani (Veg)") {
			price = 199.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Tikka Biryani") {
			price = 50.0;
			return price * quantity;
		}
		else if(foodName == "Keema Biryani") {
			price = 167.0;
			return price * quantity;
		}
		else if(foodName == "Egg Biryani") {
			price = 190.0;
			return price * quantity;
		}
		else if(foodName == "Mutton Seekh Biryani") {
			price = 140.0;
			return price * quantity;
		}
		else if(foodName == "Paneer Tikka Biryani") {
			price = 275.0;
			return price * quantity;
		}
		else if(foodName == "Kathal (Jackfruit) Biryani") {
			price = 276.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Makhani Biryani") {
			price = 204.0;
			return price * quantity;
		}
		else if(foodName == "Shahi Veg Biryani") {
			price = 109.0;
			return price * quantity;
		}
		else if(foodName == "Special 1kg Handi Biryan") {
			price = 447.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Tikka Roll") {
			price = 130.0;
			return price * quantity;
		}
		else if(foodName == "Cheese Chicken Roll") {
			price = 320.0;
			return price * quantity;
		}
		else if(foodName == "Double Chicken Max Roll") {
			price = 128.0;
			return price * quantity;
		}
		else if(foodName == "Paneer Tikka Roll") {
			price = 371.0;
			return price * quantity;
		}
		else if(foodName == "Veggie Wrap") {
			price = 2172.0;
			return price * quantity;
		}
		else if(foodName == "Egg Roll") {
			price = 276.0;
			return price * quantity;
		}
		else if(foodName == "Double Paneer Roll") {
			price = 223.0;
			return price * quantity;
		}
		else if(foodName == "Soya Tikka Roll") {
			price = 386.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Bhuna Roll") {
			price = 389.0;
			return price * quantity;
		}
		else if(foodName == "Mutton Special Rol") {
			price = 187.0;
			return price * quantity;
		}
		else if(foodName == "Peri Peri Chicken Roll") {
			price = 356.0;
			return price * quantity;
		}
		else if(foodName == "Masala Paneer Roll") {
			price = 300.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Shawarma Roll") {
			price = 320.0;
			return price* quantity;
		}
		else if(foodName == "Cheese Potato Rol") {
			price = 334.0;
			return price * quantity;
		}
		else if(foodName == "Veggie Loaded Roll") {
			price = 235.0;
			return price * quantity;
		}
		else if(foodName == "Cheese Burst Margherita") {
			price = 221.0;
			return price* quantity;
		}
		else if(foodName == "Veggie Supreme Pizza") {
			price = 465.0;
			return price* quantity;
		}
		else if(foodName == "Chicken Pepperoni Pizza") {
			price = 276.0;
			return price* quantity;
		}
		else if(foodName == "Smoky BBQ Chicken Pizza") {
			price = 178.0;
			return price* quantity;
		}
		else if(foodName == "Double Cheese Margherita") {
			price = 228.0;
			return price * quantity;
		}
		else if(foodName == "Spicy Triple Chicken Pizza") {
			price = 256.0;
			return price * quantity;
		}
		else if(foodName == "Farmhouse Veggie Pizza") {
			price = 255.0;
			return price * quantity;
		}
		else if(foodName == "Thin Crust Pizza") {
			price = 227.0;
			return price * quantity;
		}
		else if(foodName == "Dragonfire Chicken Pizza") {
			price = 298.0;
			return price * quantity; 
		}
		else if(foodName == "Cheese Burst Chicken Pizza") {
			price = 364.0;
			return price * quantity;
		}
		else if(foodName == "Paneer Makhani Pizza") {
			price = 346.0;
			return price * quantity;
		}
		else if(foodName == "North Indian Chicken Thal") {
			price = 226.0;
			return price * quantity;
		}
		else if(foodName == "North Indian Chicken Thali") {
			price = 125.0;
			return price * quantity;
		}
		else if(foodName == "Shahi Paneer Thali") {
			price = 122.0;
			return price * quantity;
		}
		else if(foodName == "Dal Makhani Rice Bowl") {
			price = 121.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Curry Rice Bowl") {
			price = 192.0;
			return price * quantity;
		}
		else if(foodName == "Rajma Rice Bowl") {
			price = 191.0;
			return price * quantity;
		}
		else if(foodName == "Paneer Tikka Masala Meal") {
			price = 290.0;
			return price * quantity;
		}
		else if(foodName == "Chole Chawal") {
			price = 289.0;
			return price * quantity; 
		}
		else if(foodName == "Butter Chicken Meal") {
			price = 188.0;
			return price * quantity; 
		}
		else if(foodName == "Veg Fried Rice & Manchurian Bowl") {
			price = 187.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Kheema Rice Bowl") {
			price = 186.0;
			return price * quantity;
		}
		else if(foodName == "Pindi Chole Meal") {
			price = 185.0;
			return price * quantity;
		}
		else if(foodName == "Executive Veg Meal") {
			price = 84.0;
			return price * quantity;
		}
		else if(foodName == "Egg Curry Rice Bowl") {
			price = 183.0;
			return price * quantity;
		}
		else if(foodName == "Matar Paneer Meal") {
			price = 182.0;
			return price * quantity;
		}
		
		else {
			System.out.println("Couldn't find food item");
		}
		return price;
	
	}

}
