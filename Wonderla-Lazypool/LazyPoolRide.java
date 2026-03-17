class LazyPoolRide {
    int rideId;
    String rideName;
    String rideType;

    public LazyPoolRide(int rideId, String rideName, String rideType) {
        this.rideId = rideId;
        this.rideName = rideName;
        this.rideType = rideType;
    }

    public void displayRideInfo() {
        System.out.println("Ride Id : " + this.rideId);
        System.out.println("Ride Name : " + this.rideName);
        System.out.println("Ride Type : " + this.rideType);
    }
}
