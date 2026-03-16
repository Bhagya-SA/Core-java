class Wonderla {
    int parkId;
    String parkName;
    String location;
    int totalRides;
    LazyPoolRide lazyPoolRide;

    public void displayParkInfo() {
        System.out.println("Park Id : " + this.parkId);
        System.out.println("Park Name : " + this.parkName);
        System.out.println("Park Location : " + this.location);
        System.out.println("Total Rides : " + this.totalRides);
        this.lazyPoolRide.displayRideInfo();
        System.out.println("----------------------------------------");
    }
}