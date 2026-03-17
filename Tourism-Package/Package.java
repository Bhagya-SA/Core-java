class Package {

    int packageId;
    String destination;
    double price;

     public Package(int packageId, String destination, double price) {
        this.packageId = packageId;
        this.destination = destination;
        this.price = price;
    }

    public void displayPackageInfo() {
        System.out.println("Package Id : " + this.packageId);
        System.out.println("Destination : " + this.destination);
        System.out.println("Price : " + this.price);
    }
}
