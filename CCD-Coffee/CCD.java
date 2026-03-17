class CCD {

    int cafeId;
    String customerName;
    String location;
    Coffee coffee;

    public CCD(int cafeId, String customerName, String location, Coffee coffee) {
        this.cafeId = cafeId;
        this.customerName = customerName;
        this.location = location;
        this.coffee = coffee;
    }

    public void displayCafeInfo() {
        System.out.println("Cafe Id : " + this.cafeId);
        System.out.println("Customer Name : " + this.customerName);
        System.out.println("Location : " + this.location);
        this.coffee.displayCoffeeInfo();
        System.out.println("--------------------------------------------------");
    }
}



