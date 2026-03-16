class Package {

    int packageId;
    String destination;
    double price;

    public void displayPackageInfo() {
        System.out.println("Package Id : " + this.packageId);
        System.out.println("Destination : " + this.destination);
        System.out.println("Price : " + this.price);
    }
}