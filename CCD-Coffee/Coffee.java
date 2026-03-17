class Coffee {

    int coffeeId;
    String coffeeName;
    double price;

    public Coffee(int coffeeId, String coffeeName, double price) {
        this.coffeeId = coffeeId;
        this.coffeeName = coffeeName;
        this.price = price;
    }

    public void displayCoffeeInfo() {
        System.out.println("Coffee Id : " + this.coffeeId);
        System.out.println("Coffee Name : " + this.coffeeName);
        System.out.println("Price : " + this.price);
    }
}
