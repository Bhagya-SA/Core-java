class FoodPanda {
	
	static double price = 0.0;  
	
	public static double search(String foodName) {
	
		if(foodName == "Tender Coconut Water") {
			price = 20.0;
			return price;
		}
		else if(foodName == "Coke") {
			price = 25.0;
			return price;
		}
		else if(foodName == "Bottled Water") {
			price = 12.0;
			return price;
		}
		else if(foodName == "Masala Chai") {
			price = 10.0;
			return price;
		}
		else if(foodName == "Mango Smoothie") {
			price = 14.0;
			return price;
		}
		else if(foodName == "Fresh Lime Soda") {
			price = 18.0;
			return price;
		}
		else if(foodName == "Oreo Milkshake") {
			price = 28.0;
			return price;
		}
		else if(foodName == "Cold Coffee") {
			price = 55.0;
			return price;
		}
		else if(foodName == "Kulfi Faluda") {
			price = 49.0;
			return price;
		}
		else if(foodName == "Vanilla Ice Cream") {
			price = 35.0;
			return price;
		}
		else if(foodName == "Gulab Jamun") {
			price = 38.0;
			return price;
		}
		else if(foodName == "Cheesecake") {
			price = 22.0;
			return price;
		}
		else if(foodName == "Chocolate Brownie") {
			price = 123.0;
			return price;
		}
		else if(foodName == "Quinoa Salad") {
			price = 189.0;
			return price;
		}
		else if(foodName == "Grilled Chicken Salad") {
			price = 343.0;
			return price;
		}
		else if(foodName == "Protein Power Bowl") {
			price = 89.0;
			return price;
		}
		else if(foodName == "Greek Salad") {
			price = 58.0;
			return price;
		}
		else if(foodName == "Caesar Salad") {
			price = 76.0;
			return price;
		}
		else if(foodName == "Pakoras") {
			price = 64.0;
			return price;
		}
		else if(foodName == "Aloo Tikki") {
			price = 90.0;
			return price;
		}
		else if(foodName == "Dahi Papdi Chaat") {
			price = 234.0;
			return price;
		}
		else if(foodName == "Bhel Puri") {
			price = 69.0;
			return price;
		}
		else if(foodName == "Gol Gappa") {
			price = 46.0;
			return price;
		}
		else if(foodName == "Kachor") {
			price = 72.0;
			return price;
		}
		else if(foodName == "Shawarma Wrap") {
			price = 61.0;
			return price;
		}
		else if(foodName == "Mutton Seekh Roll") {
			price = 456.0;
			return price;
		}
		else if(foodName == "Chicken Kathi Roll") {
			price = 654.0;
			return price;
		}
		else if(foodName == "Rava Kesari") {
			price = 433.0;
			return price;
		}
		else if(foodName == "Ghee Roast Dosa") {
			price = 389.0;
			return price;
		}
		else if(foodName == "Dimsums") {
			price = 377.0;
			return price;
		}
		else if(foodName == "Manchow Soup") {
			price = 199.0;
			return price;
		}
		else if(foodName == " Hot and Sour Soup") {
			price = 399.0;
			return price;
		}
		else if(foodName == " Chilli Garlic Fish") {
			price = 399.0;
			return price;
		}
		else if(foodName == "Schezwan Noodles") {
			price = 133.0;
			return price;
		}
		else if(foodName == "Spring Rolls") {
			price = 166.0;
			return price;
		}
		else if(foodName == "Chicken Lollipop") {
			price = 144.0;
			return price;
		}
		else if(foodName == "Chilli Paneer") {
			price = 342.0;
			return price;
		}
		else if(foodName == "Hakka Noodles") {
			price = 344.0;
			return price;
		}
		else if(foodName == "Chicken Nuggets") {
			price = 129.0;
			return price;
		}
		else if(foodName == "Veggie Supreme Pizza") {
			price = 444.0;
			return price;
		}
		else if(foodName == "Loaded Nachos") {
			price = 111.0;
			return price;
		}
		else if(foodName == "Veg Whopper") {
			price = 222.0;
			return price;
		}
		else if(foodName == "Club Sandwich") {
			price = 333.0;
			return price;
		}
		else if(foodName == "Paneer Do Pyaza") {
			price = 431.0;
			return price;
		}
		else if(foodName == "Lachha Paratha") {
			price = 411.0;
			return price;
		}
		else if(foodName == "Garlic Naan") {
			price = 260.0;
			return price;
		}
		else if(foodName == "Mix Veg Curry") {
			price = 194.0;
			return price;
		}
		else if(foodName == "Shahi Paneer") {
			price = 389.0;
			return price;
		}
		else if(foodName == "Steamed Basmati Rice ") {
			price = 288.0;
			return price;
		}
		else if(foodName == "Curd Rice") {
			price = 86.0;
			return price;
		}
		else if(foodName == "Donne Biryani") {
			price = 586.0;
			return price;
		}
		else if(foodName == "Hyderabadi Chicken Dum Biryan") {
			price = 185.0;
			return price;
		}
		else if(foodName == "Dal Tadk") {
			price = 188.0;
			return price;
		}
		else if(foodName == "Quinoa Salad") {
			price = 283.0;
			return price;
		}
		else if(foodName == "Strawberry Ice cream") {
			price = 482.0;
			return price;
		}
		
		else {
			System.out.println("Couldn't find food item");
		}
		return price;
	}
	
	public static double search(String foodName , int quantity) {
	
		if(foodName == "Tender Coconut Water") {
			price = 20.0;
			return price * quantity;
		}
		else if(foodName == "Coke") {
			price = 25.0;
			return price * quantity;
		}
		else if(foodName == "Bottled Water") {
			price = 12.0;
			return price * quantity;
		}
		else if(foodName == "Masala Chai") {
			price = 10.0;
			return price * quantity;
		}
		else if(foodName == "Mango Smoothie") {
			price = 14.0;
			return price * quantity;
		}
		else if(foodName == "Fresh Lime Soda") {
			price = 18.0;
			return price* quantity;
		}
		else if(foodName == "Oreo Milkshake") {
			price = 28.0;
			return price * quantity;
		}
		else if(foodName == "Cold Coffee") {
			price = 55.0;
			return price * quantity;
		}
		else if(foodName == "Kulfi Faluda") {
			price = 49.0;
			return price* quantity;
		}
		else if(foodName == "Vanilla Ice Cream") {
			price = 35.0;
			return price * quantity;
		}
		else if(foodName == "Gulab Jamun") {
			price = 38.0;
			return price * quantity;
		}
		else if(foodName == "Cheesecake") {
			price = 22.0;
			return price * quantity;
		}
		else if(foodName == "Chocolate Brownie") {
			price = 123.0;
			return price * quantity;
		}
		else if(foodName == "Quinoa Salad") {
			price = 189.0;
			return price * quantity;
		}
		else if(foodName == "Grilled Chicken Salad") {
			price = 343.0;
			return price * quantity; 
		}
		else if(foodName == "Protein Power Bowl") {
			price = 89.0;
			return price * quantity;
		}
		else if(foodName == "Greek Salad") {
			price = 58.0;
			return price * quantity;
		}
		else if(foodName == "Caesar Salad") {
			price = 76.0;
			return price * quantity;
		}
		else if(foodName == "Pakoras") {
			price = 64.0;
			return price * quantity;
		}
		else if(foodName == "Aloo Tikki") {
			price = 90.0;
			return price * quantity;
		}
		else if(foodName == "Dahi Papdi Chaat") {
			price = 234.0;
			return price * quantity;
		}
		else if(foodName == "Bhel Puri") {
			price = 69.0;
			return price* quantity;
		}
		else if(foodName == "Gol Gappa") {
			price = 46.0;
			return price * quantity;
		}
		else if(foodName == "Kachor") {
			price = 72.0;
			return price * quantity;
		}
		else if(foodName == "Shawarma Wrap") {
			price = 61.0;
			return price * quantity;
		}
		else if(foodName == "Mutton Seekh Roll") {
			price = 456.0;
			return price* quantity;
		}
		else if(foodName == "Chicken Kathi Roll") {
			price = 654.0;
			return price* quantity;
		}
		else if(foodName == "Rava Kesari") {
			price = 433.0;
			return price * quantity;
		}
		else if(foodName == "Ghee Roast Dosa") {
			price = 389.0;
			return price * quantity;
		}
		else if(foodName == "Dimsums") {
			price = 377.0;
			return price * quantity;
		}
		else if(foodName == "Manchow Soup") {
			price = 199.0;
			return price * quantity;
		}
		else if(foodName == " Hot and Sour Soup") {
			price = 399.0;
			return price * quantity;
		}
		else if(foodName == " Chilli Garlic Fish") {
			price = 399.0;
			return price * quantity;
		}
		else if(foodName == "Schezwan Noodles") {
			price = 133.0;
			return price * quantity;
		}
		else if(foodName == "Spring Rolls") {
			price = 166.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Lollipop") {
			price = 144.0;
			return price * quantity;
		}
		else if(foodName == "Chilli Paneer") {
			price = 342.0;
			return price * quantity;
		}
		else if(foodName == "Hakka Noodles") {
			price = 344.0;
			return price * quantity;
		}
		else if(foodName == "Chicken Nuggets") {
			price = 129.0;
			return price * quantity;
		}
		else if(foodName == "Veggie Supreme Pizza") {
			price = 444.0;
			return price* quantity;
		}
		else if(foodName == "Loaded Nachos") {
			price = 111.0;
			return price* quantity;
		}
		else if(foodName == "Veg Whopper") {
			price = 222.0;
			return price * quantity;
		}
		else if(foodName == "Club Sandwich") {
			price = 333.0;
			return price * quantity;
		}
		else if(foodName == "Paneer Do Pyaza") {
			price = 431.0;
			return price * quantity;
		}
		else if(foodName == "Lachha Paratha") {
			price = 411.0;
			return price * quantity;
		}
		else if(foodName == "Garlic Naan") {
			price = 260.0;
			return price * quantity;
		}
		else if(foodName == "Mix Veg Curry") {
			price = 194.0;
			return price* quantity;
		}
		else if(foodName == "Shahi Paneer") {
			price = 389.0;
			return price * quantity;
		}
		else if(foodName == "Steamed Basmati Rice ") {
			price = 288.0;
			return price * quantity;
		}
		else if(foodName == "Curd Rice") {
			price = 86.0;
			return price * quantity;
		}
		else if(foodName == "Donne Biryani") {
			price = 586.0;
			return price * quantity;
		}
		else if(foodName == "Hyderabadi Chicken Dum Biryan") {
			price = 185.0;
			return price * quantity;
		}
		else if(foodName == "Dal Tadk") {
			price = 188.0;
			return price * quantity;
		}
		else if(foodName == "Quinoa Salad") {
			price = 283.0;
			return price * quantity;
		}
		else if(foodName == "Strawberry Ice cream") {
			price = 482.0;
			return price * quantity;
		}
		
		else {
			System.out.println("Couldn't find food item");
		}
		return price;
	}
}
