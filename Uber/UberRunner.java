class UberRunner {

    public static void main(String[] args) {

        Uber uber = new Uber();

        UberRide rideOne = new UberRide();
        rideOne.setRideId(1);
        rideOne.setDriver("Ramesh");
        rideOne.setCar("Sedan");
        rideOne.setFare(300.0);
        rideOne.setDistance(10);
        rideOne.setCity("Mumbai");
        rideOne.setRating(5);

        boolean isRideAdded = uber.addRide(rideOne);
        System.out.println(isRideAdded);

        UberRide rideTwo = new UberRide();
        rideTwo.setRideId(2);
        rideTwo.setDriver("Suresh");
        rideTwo.setCar("SUV");
        rideTwo.setFare(450.0);
        rideTwo.setDistance(15);
        rideTwo.setCity("Delhi");
        rideTwo.setRating(4);

        isRideAdded = uber.addRide(rideTwo);
        System.out.println(isRideAdded);

        UberRide rideThree = new UberRide();
        rideThree.setRideId(3);
        rideThree.setDriver("Anil");
        rideThree.setCar("Mini");
        rideThree.setFare(200.0);
        rideThree.setDistance(8);
        rideThree.setCity("Bangalore");
        rideThree.setRating(5);

        isRideAdded = uber.addRide(rideThree);
        System.out.println(isRideAdded);

        UberRide rideFour = new UberRide();
        rideFour.setRideId(4);
        rideFour.setDriver("Manoj");
        rideFour.setCar("Sedan");
        rideFour.setFare(350.0);
        rideFour.setDistance(12);
        rideFour.setCity("Chennai");
        rideFour.setRating(4);

        isRideAdded = uber.addRide(rideFour);
        System.out.println(isRideAdded);

        UberRide rideFive = new UberRide();
        rideFive.setRideId(5);
        rideFive.setDriver("Vikram");
        rideFive.setCar("SUV");
        rideFive.setFare(500.0);
        rideFive.setDistance(18);
        rideFive.setCity("Hyderabad");
        rideFive.setRating(5);

        isRideAdded = uber.addRide(rideFive);
        System.out.println(isRideAdded);

        uber.getRideDetails();
    }
}