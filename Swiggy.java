class Swiggy {
    static double price = 0.0; 
	
	public static double search(String foodName) {
	
		if(foodName == "Paneer Butter Masala") {
			price = 180.0;
			return price;
		}
		else if(foodName == "Kadhai Chicken") {
			price = 285.0;
			return price;
		}
		else if(foodName == "Chicken Kolhapuri") {
			price = 389.0;
			return price;
		}
		else if(foodName == "Dal Tadka") {
			price = 95.0;
			return price;
		}
		else if(foodName == "Dal Makhani") {
			price = 199.0;
			return price;
		}
		else if(foodName == "Palak Chicken") {
			price = 250.0;
			return price;
		}
		else if(foodName == "French Fries") {
			price = 367.0;
			return price;
		}
		else if(foodName == "Methi Chicken") {
			price = 190.0;
			return price;
		}
		else if(foodName == "Roti/Naan") {
			price = 240.0;
			return price;
		}
		else if(foodName == "Veg Platter") {
			price = 275.0;
			return price;
		}
		else if(foodName == "Chicken Kebabs") {
			price = 176.0;
			return price;
		}
		else if(foodName == "Murgh Koobideh") {
			price = 204.0;
			return price;
		}
		else if(foodName == "Idli") {
			price = 209.0;
			return price;
		}
		else if(foodName == "Medhu Vada") {
			price = 147.0;
			return price;
		}
		else if(foodName == "Pongal") {
			price = 130.0;
			return price;
		}
		else if(foodName == "Veg Puri") {
			price = 65.0;
			return price;
		}
		else if(foodName == "Aloo Parantha") {
			price = 228.0;
			return price;
		}
		else if(foodName == "Onion Dosa") {
			price = 171.0;
			return price;
		}
		else if(foodName == "Rava Dosa") {
			price = 272.0;
			return price;
		}
		else if(foodName == "Set Dosa") {
			price = 76.0;
			return price;
		}
		else if(foodName == "Uttapam") {
			price = 123.0;
			return price;
		}
		else if(foodName == "Uttapam") {
			price = 156.0;
			return price;
		}
		else if(foodName == "Chicken Momos") {
			price = 159.0;
			return price;
		}
		else if(foodName == "Veg Momos") {
			price = 163.0;
			return price;
		}
		else if(foodName == "Samosa") {
			price = 143.0;
			return price;
		}
		else if(foodName == "Adrak Chai") {
			price = 176.0;
			return price;
		}
		else if(foodName == "Paneer Rolls") {
			price = 212.0;
			return price;
		}
		else if(foodName == "Chicken Tikka Roll") {
			price = 234.0;
			return price;
		}
		else if(foodName == "Falafel") {
			price = 235.0;
			return price;
		}
		else if(foodName == "Peri Peri Fries") {
			price = 321.0;
			return price;
		}
		else if(foodName == "White Chocolate Cake") {
			price = 265.0;
			return price;
		}
		else if(foodName == "Chocolate Cake") {
			price = 276.0;
			return price;
		}
		else if(foodName == "Gulab Jamun") {
			price = 278.0;
			return price;
		}
		else if(foodName == "Kaju Barfi") {
			price = 228.0;
			return price;
		}
		else if(foodName == "Besan Ladoo") {
			price = 256.0;
			return price;
		}
		else if(foodName == "Chocolate Pastry") {
			price = 255.0;
			return price;
		}
		else if(foodName == "Dark Chocolate Ice Cream") {
			price = 127.0;
			return price;
		}
		else if(foodName == "Chocolate Sundae") {
			price = 198.0;
			return price;
		}
		else if(foodName == "Rasgulla") {
			price = 164.0;
			return price;
		}
		else if(foodName == "Kunafa") {
			price = 146.0;
			return price;
		}
		else if(foodName == "Mexican Tacos") {
			price = 126.0;
			return price;
		}
		else if(foodName == "Korean Fried Chicken") {
			price = 125.0;
			return price;
		}
		else if(foodName == "Thai Green Curry") {
			price = 122.0;
			return price;
		}
		else if(foodName == "Chilli Chicken") {
			price = 121.0;
			return price;
		}
		else if(foodName == "Chicken Tikki Burger") {
			price = 192.0;
			return price;
		}
		else if(foodName == "Veg Maharaja Burger") {
			price = 291.0;
			return price;
		}
		else if(foodName == "Cheese Garlic Bread") {
			price = 90.0;
			return price;
		}
		else if(foodName == "Paneer Pizza") {
			price = 189.0;
			return price;
		}
		else if(foodName == "Chicken Pepperoni Pizza") {
			price = 188.0;
			return price;
		}
		else if(foodName == "Thin Crust Pizza") {
			price = 187.0;
			return price;
		}
		else if(foodName == "Double Cheese Burger") {
			price = 186.0;
			return price;
		}
		else if(foodName == "Chicken Nuggets") {
			price = 185.0;
			return price;
		}
		else if(foodName == "Schezwan Fried Rice") {
			price = 184.0;
			return price;
		}
		else if(foodName == "Fries (Potato)") {
			price = 183.0;
			return price;
		}
		else if(foodName == "Onion Rings") {
			price = 182.0;
			return price;
		}
		
		else {
			System.out.println("Couldn't find food item");
		}
		return price;
	
	}
	
	public static double search(String foodName , int quantity) {
	
		if(foodName == "Paneer Butter Masala") {
			price = 180.0;
			return price * quantity;
		}
		else if(foodName == "Kadhai Chicken") {
			price = 285.0;
			return price  * quantity;
		}
		else if(foodName == "Chicken Kolhapuri") {
			price = 389.0;
			return price * quantity;
		}
		else if(foodName == "Dal Tadka") {
			price = 95.0;
			return price  * quantity;
		}
		else if(foodName == "Dal Makhani") {
			price = 199.0;
			return price  * quantity;
		}
		else if(foodName == "Palak Chicken") {
			price = 250.0;
			return price  * quantity;
		}
		else if(foodName == "French Fries") {
			price = 367.0;
			return price  * quantity;
		}
		else if(foodName == "Methi Chicken") {
			price = 190.0;
			return price  * quantity;
		}
		else if(foodName == "Roti/Naan") {
			price = 240.0;
			return price  * quantity;
		}
		else if(foodName == "Veg Platter") {
			price = 275.0;
			return price  * quantity;
		}
		else if(foodName == "Chicken Kebabs") {
			price = 176.0;
			return price  * quantity;
		}
		else if(foodName == "Murgh Koobideh") {
			price = 204.0;
			return price  * quantity;
		}
		else if(foodName == "Idli") {
			price = 209.0;
			return price  * quantity;
		}
		else if(foodName == "Medhu Vada") {
			price = 147.0;
			return price  * quantity;
		}
		else if(foodName == "Pongal") {
			price = 130.0;
			return price  * quantity;
		}
		else if(foodName == "Veg Puri") {
			price = 65.0;
			return price  * quantity;
		}
		else if(foodName == "Aloo Parantha") {
			price = 228.0;
			return price  * quantity;
		}
		else if(foodName == "Onion Dosa") {
			price = 171.0;
			return price  * quantity;
		}
		else if(foodName == "Rava Dosa") {
			price = 272.0;
			return price  * quantity;
		}
		else if(foodName == "Set Dosa") {
			price = 76.0;
			return price  * quantity;
		}
		else if(foodName == "Uttapam") {
			price = 123.0;
			return price  * quantity;
		}
		else if(foodName == "Uttapam") {
			price = 156.0;
			return price  * quantity;
		}
		else if(foodName == "Chicken Momos") {
			price = 159.0;
			return price  * quantity;
		}
		else if(foodName == "Veg Momos") {
			price = 163.0;
			return price  * quantity;
		}
		else if(foodName == "Samosa") {
			price = 143.0;
			return price  * quantity;
		}
		else if(foodName == "Adrak Chai") {
			price = 176.0;
			return price  * quantity;
		}
		else if(foodName == "Paneer Rolls") {
			price = 212.0;
			return price  * quantity;
		}
		else if(foodName == "Chicken Tikka Roll") {
			price = 234.0;
			return price  * quantity;
		}
		else if(foodName == "Falafel") {
			price = 235.0;
			return price  * quantity;
		}
		else if(foodName == "Peri Peri Fries") {
			price = 321.0;
			return price  * quantity;
		}
		else if(foodName == "White Chocolate Cake") {
			price = 265.0;
			return price  * quantity;
		}
		else if(foodName == "Chocolate Cake") {
			price = 276.0;
			return price  * quantity;
		}
		else if(foodName == "Gulab Jamun") {
			price = 278.0;
			return price  * quantity;
		}
		else if(foodName == "Kaju Barfi") {
			price = 228.0;
			return price  * quantity;
		}
		else if(foodName == "Besan Ladoo") {
			price = 256.0;
			return price  * quantity;
		}
		else if(foodName == "Chocolate Pastry") {
			price = 255.0;
			return price  * quantity;
		}
		else if(foodName == "Dark Chocolate Ice Cream") {
			price = 127.0;
			return price  * quantity;
		}
		else if(foodName == "Chocolate Sundae") {
			price = 198.0;
			return price  * quantity;
		}
		else if(foodName == "Rasgulla") {
			price = 164.0;
			return price  * quantity;
		}
		else if(foodName == "Kunafa") {
			price = 146.0;
			return price  * quantity;
		}
		else if(foodName == "Mexican Tacos") {
			price = 126.0;
			return price  * quantity;
		}
		else if(foodName == "Korean Fried Chicken") {
			price = 125.0;
			return price  * quantity;
		}
		else if(foodName == "Thai Green Curry") {
			price = 122.0;
			return price  * quantity;
		}
		else if(foodName == "Chilli Chicken") {
			price = 121.0;
			return price  * quantity;
		}
		else if(foodName == "Chicken Tikki Burger") {
			price = 192.0;
			return price  * quantity;
		}
		else if(foodName == "Veg Maharaja Burger") {
			price = 291.0;
			return price  * quantity;
		}
		else if(foodName == "Cheese Garlic Bread") {
			price = 90.0;
			return price  * quantity;
		}
		else if(foodName == "Paneer Pizza") {
			price = 189.0;
			return price  * quantity;
		}
		else if(foodName == "Chicken Pepperoni Pizza") {
			price = 188.0;
			return price  * quantity;
		}
		else if(foodName == "Thin Crust Pizza") {
			price = 187.0;
			return price  * quantity;
		}
		else if(foodName == "Double Cheese Burger") {
			price = 186.0;
			return price  * quantity;
		}
		else if(foodName == "Chicken Nuggets") {
			price = 185.0;
			return price  * quantity;
		}
		else if(foodName == "Schezwan Fried Rice") {
			price = 184.0;
			return price  * quantity;
		}
		else if(foodName == "Fries (Potato)") {
			price = 183.0;
			return price  * quantity;
		}
		else if(foodName == "Onion Rings") {
			price = 182.0;
			return price  * quantity;
		}
		
		else {
			System.out.println("Couldn't find food item");
		}
		return price;
	
	}

}
