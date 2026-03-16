class CCD {

    int cafeId;
    String customerName;
    String location;
    Coffee coffee;

    public void displayCafeInfo() {
        System.out.println("Cafe Id : " + this.cafeId);
        System.out.println("Customer Name : " + this.customerName);
        System.out.println("Location : " + this.location);
        this.coffee.displayCoffeeInfo();
        System.out.println("--------------------------------------------------");
    }
}



