class Ola {

    OlaBooking bookings[] = new OlaBooking[5];
    int index;

    public boolean addBooking(OlaBooking booking) {

        boolean isBookingAdded = false;

        boolean isBookingIdValid = false;
        boolean isDriverValid = false;
        boolean isFareValid = false;
        boolean isCarTypeValid = false;
        boolean isDistanceValid = false;
        boolean isCityValid = false;
        boolean isTimeValid = false;

        int bookingId = booking.getBookingId();
        if (bookingId > 0) {
            isBookingIdValid = true;
        }

        String driver = booking.getDriver();
        if (driver != null && !driver.isEmpty()) {
            isDriverValid = true;
        }

        double fare = booking.getFare();
        if (fare > 0) {
            isFareValid = true;
        }

        String carType = booking.getCarType();
        if (carType != null && !carType.isEmpty()) {
            isCarTypeValid = true;
        }

        double distance = booking.getDistance();
        if (distance > 0) {
            isDistanceValid = true;
        }

        String city = booking.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        }

        int time = booking.getTime();
        if (time > 0) {
            isTimeValid = true;
        }

        if (isBookingIdValid && isDriverValid && isFareValid &&
            isCarTypeValid && isDistanceValid && isCityValid &&
            isTimeValid) {

            isBookingAdded = true;
            bookings[index++] = booking;
        }

        return isBookingAdded;
    }

    public void getBookingDetails() {

        System.out.println("The Ola booking details are as follows :");

        for (OlaBooking booking : bookings) {

            if (booking != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Booking Id is : " + booking.getBookingId());
                System.out.println("Driver is : " + booking.getDriver());
                System.out.println("Fare is : " + booking.getFare());
                System.out.println("Car Type is : " + booking.getCarType());
                System.out.println("Distance is : " + booking.getDistance());
                System.out.println("City is : " + booking.getCity());
                System.out.println("Time (minutes) : " + booking.getTime());
                System.out.println("--------------------------------------------");
            }
        }
    }
}