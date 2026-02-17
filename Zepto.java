class Zepto {

	public static double search(String foodName) {
	
	double price = 0.0; 
		if(foodName == "Vada Pav") {
			price = 48.0;
			return price;
		}
		else if(foodName == "Samosa Pav") {
			price = 54.0;
			return price;
		}
		else if(foodName == "Cheese Maggi") {
			price = 55.0;
			return price;
		}
		else if(foodName == "Plain Maggi") {
			price = 34.0;
			return price;
		}
		else if(foodName == "Veg Puff") {
			price = 56.0;
			return price;
		}
		else if(foodName == "Chicken Puff") {
			price = 78.0;
			return price;
		}
		else if(foodName == "Bombay Aloo Tikki Sandwich") {
			price = 54.0;
			return price;
		}
		else if(foodName == "Chilli Cheese Toast") {
			price = 74.0;
			return price;
		}
		else if(foodName == "Garlic Bread with Cheese Dip") {
			price = 45.0;
			return price;
		}
		else if(foodName == "Garlic Bread Party Pack") {
			price = 75.0;
			return price;
		}
		else if(foodName == "Butter Chicken Steamed Bao") {
			price = 76.0;
			return price;
		}
		else if(foodName == "Veg Steamed Pizza Bao") {
			price = 104.0;
			return price;
		}
		else if(foodName == "Mini Butter Croissants") {
			price = 109.0;
			return price;
		}
		else if(foodName == "Almond Croissant") {
			price = 147.0;
			return price;
		}
		else if(foodName == "Butter Croissant") {
			price = 30.0;
			return price;
		}
		else if(foodName == "Chole Kulche") {
			price = 320.0;
			return price;
		}
		else if(foodName == "Paneer Makhani & Rice") {
			price = 128.0;
			return price;
		}
		else if(foodName == "Butter Chicken & Rice") {
			price = 371.0;
			return price;
		}
		else if(foodName == "Dal Makhani & Rice") {
			price = 272.0;
			return price;
		}
		else if(foodName == "Rajma Masala & Rice") {
			price = 276.0;
			return price;
		}
		else if(foodName == "Medu Vada Sambar Dip") {
			price = 123.0;
			return price;
		}
		else if(foodName == "Rawa Upma") {
			price = 286.0;
			return price;
		}
		else if(foodName == "Poha") {
			price = 289.0;
			return price;
		}
		else if(foodName == "Masala Omelette Pav") {
			price = 287.0;
			return price;
		}
		else if(foodName == "Vietnamese Cold Coffee") {
			price = 256.0;
			return price;
		}
		else if(foodName == "Adrak Chai") {
			price = 300.0;
			return price;
		}
		else if(foodName == "Hot Chocolate") {
			price = 120.0;
			return price;
		}
		else if(foodName == "French Vanilla Hot Chocolate") {
			price = 234.0;
			return price;
		}
		else if(foodName == "Strawberry Shake") {
			price = 235.0;
			return price;
		}
		else if(foodName == "Mixed Berry Shake") {
			price = 321.0;
			return price;
		}
		else if(foodName == "Strawberry Lemonade") {
			price = 165.0;
			return price;
		}
		else if(foodName == "Masala Chaas") {
			price = 276.0;
			return price;
		}
		else if(foodName == "Triple Chocolate Mousse") {
			price = 178.0;
			return price;
		}
		else if(foodName == "Kesari Rasmalai") {
			price = 128.0;
			return price;
		}
		else if(foodName == "Tiramisu") {
			price = 156.0;
			return price;
		}
		else if(foodName == "Angoori Gulab Jamun") {
			price = 155.0;
			return price;
		}
		else if(foodName == "Choco Lava Cake") {
			price = 127.0;
			return price;
		}
		else if(foodName == "Hot Americano") {
			price = 198.0;
			return price;
		}
		else if(foodName == "Hot Milk") {
			price = 64.0;
			return price;
		}
		else if(foodName == "McCain French Fries") {
			price = 146.0;
			return price;
		}
		else if(foodName == "McCain Masala Fries") {
			price = 126.0;
			return price;
		}
		else if(foodName == "McCain Veggie Nuggets") {
			price = 125.0;
			return price;
		}
		else if(foodName == "McCain Chilli Chicken Sausages") {
			price = 122.0;
			return price;
		}
		else if(foodName == "Prasuma Momos (Veg/Chicken") {
			price = 121.0;
			return price;
		}
		else if(foodName == "ITC Master Chef Chicken Seekh Kebab") {
			price = 192.0;
			return price;
		}
		else if(foodName == "Venky's Chicken Nuggets") {
			price = 191.0;
			return price;
		}
		else if(foodName == "Switz Paratha Puff") {
			price = 190.0;
			return price;
		}
		else if(foodName == "") {
			price = 189.0;
			return price;
		}
		else if(foodName == "Wow! Chicken Tikka Biryani") {
			price = 88.0;
			return price;
		}
		else if(foodName == "Meatzza Chicken Jumbo Hotdog") {
			price = 187.0;
			return price;
		}
		else if(foodName == "Frozen Green Peas") {
			price = 186.0;
			return price;
		}
		else if(foodName == "Frozen Sweet Corn") {
			price = 185.0;
			return price;
		}
		else if(foodName == "Frozen Edamame") {
			price = 184.0;
			return price;
		}
		else if(foodName == "Frozen Diced Mango") {
			price = 183.0;
			return price;
		}
		else if(foodName == "Smoked Paneer") {
			price = 182.0;
			return price;
		}
		
		else {
			System.out.println("Couldn't find food item");
		}
		return price;
	}

}