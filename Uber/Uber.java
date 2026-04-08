class Uber {

    UberRide rides[] = new UberRide[5];
    int index;

    public boolean addRide(UberRide ride) {

        boolean isRideAdded = false;

        boolean isRideIdValid = false;
        boolean isDriverValid = false;
        boolean isCarValid = false;
        boolean isFareValid = false;
        boolean isDistanceValid = false;
        boolean isCityValid = false;
        boolean isRatingValid = false;

        int rideId = ride.getRideId();
        if (rideId > 0) {
            isRideIdValid = true;
        }

        String driver = ride.getDriver();
        if (driver != null && !driver.isEmpty()) {
            isDriverValid = true;
        }

        String car = ride.getCar();
        if (car != null && !car.isEmpty()) {
            isCarValid = true;
        }

        double fare = ride.getFare();
        if (fare > 0) {
            isFareValid = true;
        }

        int distance = ride.getDistance();
        if (distance > 0) {
            isDistanceValid = true;
        }

        String city = ride.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        }

        int rating = ride.getRating();
        if (rating >= 0) {
            isRatingValid = true;
        }

        if (isRideIdValid && isDriverValid && isCarValid &&
            isFareValid && isDistanceValid && isCityValid &&
            isRatingValid) {

            isRideAdded = true;
            rides[index++] = ride;
        }

        return isRideAdded;
    }

    public void getRideDetails() {

        System.out.println("The Uber ride details are as follows :");

        for (UberRide ride : rides) {

            if (ride != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Ride Id is : " + ride.getRideId());
                System.out.println("Driver is : " + ride.getDriver());
                System.out.println("Car is : " + ride.getCar());
                System.out.println("Fare is : " + ride.getFare());
                System.out.println("Distance is : " + ride.getDistance());
                System.out.println("City is : " + ride.getCity());
                System.out.println("Rating is : " + ride.getRating());
                System.out.println("--------------------------------------------");
            }
        }
    }
}