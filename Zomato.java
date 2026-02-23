class Zomato {
	
	static double price = 0.0; 
	
	public static double search(String foodName) {
		
		if(foodName == "Sandwich") {
			price = 80.0;
			return price;
		}
		else if(foodName == "Burger") {
			price = 85.0;
			return price;
		}
		else if(foodName == "Pizza") {
			price = 89.0;
			return price;
		}
		else if(foodName == "Gobi Manchurian") {
			price = 95.0;
			return price;
		}
		else if(foodName == "Panner tikka") {
			price = 99.0;
			return price;
		}
		else if(foodName == "Noodles") {
			price = 50.0;
			return price;
		}
		else if(foodName == "French Fries") {
			price = 67.0;
			return price;
		}
		else if(foodName == "Pasta") {
			price = 90.0;
			return price;
		}
		else if(foodName == "Masal puri") {
			price = 40.0;
			return price;
		}
		else if(foodName == "Vada sambhar") {
			price = 75.0;
			return price;
		}
		else if(foodName == "Mix Uttapam") {
			price = 76.0;
			return price;
		}
		else if(foodName == "Sev Barfi") {
			price = 104.0;
			return price;
		}
		else if(foodName == "Pista Halwa") {
			price = 109.0;
			return price;
		}
		else if(foodName == "Cold Coffee") {
			price = 147.0;
			return price;
		}
		else if(foodName == "Chai") {
			price = 30.0;
			return price;
		}
		else if(foodName == "Chicken Biryani") {
			price = 320.0;
			return price;
		}
		else if(foodName == "Chole Bhature") {
			price = 128.0;
			return price;
		}
		else if(foodName == "Idli Sambhar") {
			price = 71.0;
			return price;
		}
		else if(foodName == "Dal Pakwaan") {
			price = 172.0;
			return price;
		}
		else if(foodName == "Sindhi curry") {
			price = 176.0;
			return price;
		}
		else if(foodName == "Butter Chicken") {
			price = 123.0;
			return price;
		}
		else if(foodName == "Matar Paneer") {
			price = 286.0;
			return price;
		}
		else if(foodName == "Chicken rice bowl") {
			price = 289.0;
			return price;
		}
		else if(foodName == "Chicken curry") {
			price = 287.0;
			return price;
		}
		else if(foodName == "Tandori Chicken") {
			price = 256.0;
			return price;
		}
		else if(foodName == "Biryani") {
			price = 300.0;
			return price;
		}
		else if(foodName == "Ice cream") {
			price = 120.0;
			return price;
		}
		else if(foodName == "Crunchy Chicken") {
			price = 234.0;
			return price;
		}
		else if(foodName == "Classic Chicken") {
			price = 235.0;
			return price;
		}
		else if(foodName == "Double Classic Chicken burgers") {
			price = 321.0;
			return price;
		}
		else if(foodName == "Farm Fresh Veggies") {
			price = 165.0;
			return price;
		}
		else if(foodName == "Paneer Wrap") {
			price = 276.0;
			return price;
		}
		else if(foodName == "Chicken Pops") {
			price = 178.0;
			return price;
		}
		else if(foodName == "Paneer") {
			price = 128.0;
			return price;
		}
		else if(foodName == "Double Classic Veg") {
			price = 156.0;
			return price;
		}
		else if(foodName == "Classic Veg") {
			price = 155.0;
			return price;
		}
		else if(foodName == "Hot Chicken Wings") {
			price = 127.0;
			return price;
		}
		else if(foodName == "BBQ Chicken Wings") {
			price = 198.0;
			return price;
		}
		else if(foodName == "Chicken Strips") {
			price = 164.0;
			return price;
		}
		else if(foodName == "Jumbo Chicken") {
			price = 146.0;
			return price;
		}
		else if(foodName == "Chicken wings") {
			price = 126.0;
			return price;
		}
		else if(foodName == "Chicken Popcorn") {
			price = 125.0;
			return price;
		}
		else if(foodName == "Chicken fries") {
			price = 122.0;
			return price;
		}
		else if(foodName == "Mangalorean Ghee Roasts") {
			price = 121.0;
			return price;
		}
		else if(foodName == "Chilli Broccoli") {
			price = 192.0;
			return price;
		}
		else if(foodName == "Kesari Paneer Tikka") {
			price = 191.0;
			return price;
		}
		else if(foodName == "Coal grilled Mushroom") {
			price = 190.0;
			return price;
		}
		else if(foodName == "Paneer Lahori Tikka") {
			price = 189.0;
			return price;
		}
		else if(foodName == "Bakarwadi") {
			price = 88.0;
			return price;
		}
		else if(foodName == "Rice Flakes Chivda") {
			price = 87.0;
			return price;
		}
		else if(foodName == "Bhajani Chakali") {
			price = 86.0;
			return price;
		}
		else if(foodName == "Pan Mukhwas") {
			price = 85.0;
			return price;
		}
		else if(foodName == "Pachak Plus") {
			price = 84.0;
			return price;
		}
		else if(foodName == "Mukhwas") {
			price = 83.0;
			return price;
		}
		else if(foodName == "Digestive Mix") {
			price = 82.0;
			return price;
		}
		
		else {
			System.out.println("Couldn't find food item");
		}
		return price;
   }
   
   public static double search(String foodName , int quantity) {
		
		if(foodName == "Sandwich") {
			price = 80.0;
			return price * quantity;
		}
		else if(foodName == "Burger") {
			price = 85.0;
			return price * quantity;
		}
		else if(foodName == "Pizza") {
			price = 89.0;
			return price * quantity;
		}
		else if(foodName == "Gobi Manchurian") {
			price = 95.0;
			return price * quantity;
		}
		else if(foodName == "Panner tikka") {
			price = 99.0;
			return price * quantity;
		}
		else if(foodName == "Noodles") {
			price = 50.0;
			return price * quantity;
		}
		else if(foodName == "French Fries") {
			price = 67.0;
			return price * quantity;
		}
		else if(foodName == "Pasta") {
			price = 90.0;
			return price * quantity;
		}
		else if(foodName == "Masal puri") {
			price = 40.0;
			return price * quantity;
		}
		else if(foodName == "Vada sambhar") {
			price = 75.0;
			return price * quantity;
		}
		else if(foodName == "Mix Uttapam") {
			price = 76.0;
			return price * quantity;
		}
		else if(foodName == "Sev Barfi") {
			price = 104.0;
			return price * quantity;
		}
		else if(foodName == "Pista Halwa") {
			price = 109.0;
			return price * quantity;
		}
		else if(foodName == "Cold Coffee") {
			price = 147.0;
			return price * quantity;
		}
		else if(foodName == "Chai") {
			price = 30.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Biryani") {
			price = 320.0;
			return price * quantity;
		}
		else if(foodName == "Chole Bhature") {
			price = 128.0;
			return price * quantity;
		}
		else if(foodName == "Idli Sambhar") {
			price = 71.0;
			return price * quantity;
		}
		else if(foodName == "Dal Pakwaan") {
			price = 172.0;
			return price * quantity;
		}
		else if(foodName == "Sindhi curry") {
			price = 176.0;
			return price * quantity;
		}
		else if(foodName == "Butter Chicken") {
			price = 123.0;
			return price * quantity;
		}
		else if(foodName == "Matar Paneer") {
			price = 286.0;
			return price * quantity;
		}
		else if(foodName == "Chicken rice bowl") {
			price = 289.0;
			return price * quantity;
		}
		else if(foodName == "Chicken curry") {
			price = 287.0;
			return price * quantity;
		}
		else if(foodName == "Tandori Chicken") {
			price = 256.0;
			return price * quantity;
		}
		else if(foodName == "Biryani") {
			price = 300.0;
			return price * quantity;
		}
		else if(foodName == "Ice cream") {
			price = 120.0;
			return price * quantity;
		}
		else if(foodName == "Crunchy Chicken") {
			price = 234.0;
			return price * quantity;
		}
		else if(foodName == "Classic Chicken") {
			price = 235.0;
			return price * quantity;
		}
		else if(foodName == "Double Classic Chicken burgers") {
			price = 321.0;
			return price * quantity;
		}
		else if(foodName == "Farm Fresh Veggies") {
			price = 165.0;
			return price * quantity;
		}
		else if(foodName == "Paneer Wrap") {
			price = 276.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Pops") {
			price = 178.0;
			return price * quantity;
		}
		else if(foodName == "Paneer") {
			price = 128.0;
			return price * quantity;
		}
		else if(foodName == "Double Classic Veg") {
			price = 156.0;
			return price * quantity;
		}
		else if(foodName == "Classic Veg") {
			price = 155.0;
			return price * quantity;
		}
		else if(foodName == "Hot Chicken Wings") {
			price = 127.0;
			return price * quantity;
		}
		else if(foodName == "BBQ Chicken Wings") {
			price = 198.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Strips") {
			price = 164.0;
			return price * quantity;
		}
		else if(foodName == "Jumbo Chicken") {
			price = 146.0;
			return price * quantity;
		}
		else if(foodName == "Chicken wings") {
			price = 126.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Popcorn") {
			price = 125.0;
			return price * quantity;
		}
		else if(foodName == "Chicken fries") {
			price = 122.0;
			return price * quantity;
		}
		else if(foodName == "Mangalorean Ghee Roasts") {
			price = 121.0;
			return price * quantity;
		}
		else if(foodName == "Chilli Broccoli") {
			price = 192.0;
			return price * quantity;
		}
		else if(foodName == "Kesari Paneer Tikka") {
			price = 191.0;
			return price * quantity;
		}
		else if(foodName == "Coal grilled Mushroom") {
			price = 190.0;
			return price * quantity;
		}
		else if(foodName == "Paneer Lahori Tikka") {
			price = 189.0;
			return price * quantity;
		}
		else if(foodName == "Bakarwadi") {
			price = 88.0;
			return price * quantity;
		}
		else if(foodName == "Rice Flakes Chivda") {
			price = 87.0;
			return price * quantity;
		}
		else if(foodName == "Bhajani Chakali") {
			price = 86.0;
			return price * quantity;
		}
		else if(foodName == "Pan Mukhwas") {
			price = 85.0;
			return price * quantity;
		}
		else if(foodName == "Pachak Plus") {
			price = 84.0;
			return price * quantity;
		}
		else if(foodName == "Mukhwas") {
			price = 83.0;
			return price * quantity;
		}
		else if(foodName == "Digestive Mix") {
			price = 82.0;
			return price * quantity;
		}
		
		else {
			System.out.println("Couldn't find food item");
		}
		return price;
   }
		
}
