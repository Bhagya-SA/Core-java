class Wonderla {
    int parkId;
    String parkName;
    String location;
    int totalRides;
    LazyPoolRide lazyPoolRide;

    public Wonderla(int parkId, String parkName, String location, int totalRides, LazyPoolRide lazyPoolRide) {
        this.parkId = parkId;
        this.parkName = parkName;
        this.location = location;
        this.totalRides = totalRides;
        this.lazyPoolRide = lazyPoolRide;
    }

    public void displayParkInfo() {
        System.out.println("Park Id : " + this.parkId);
        System.out.println("Park Name : " + this.parkName);
        System.out.println("Park Location : " + this.location);
        System.out.println("Total Rides : " + this.totalRides);
        this.lazyPoolRide.displayRideInfo();
        System.out.println("----------------------------------------");
    }
}
