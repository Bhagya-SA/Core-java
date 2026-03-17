class FoodStreet {

    int foodId;
    String foodName;
    double price;

    public FoodStreet(int foodId, String foodName, double price) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
    }

    public void displayFoodInfo() {
        System.out.println("Food Id : " + this.foodId);
        System.out.println("Food Name : " + this.foodName);
        System.out.println("Price : " + this.price);
    }
}
