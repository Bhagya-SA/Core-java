class Airbnb {

    AirbnbBooking bookings[] = new AirbnbBooking[5];
    int index;

    public boolean addBooking(AirbnbBooking booking) {

        boolean isBookingAdded = false;

        boolean isBookingIdValid = false;
        boolean isHostValid = false;
        boolean isNightsValid = false;
        boolean isLocationValid = false;
        boolean isPriceValid = false;
        boolean isRoomTypeValid = false;
        boolean isGuestsNumberValid = false;

        int bookingId = booking.getBookingId();
        if (bookingId > 0) {
            isBookingIdValid = true;
        }

        String host = booking.getHost();
        if (host != null && !host.isEmpty()) {
            isHostValid = true;
        }

        int nights = booking.getNights();
        if (nights > 0) {
            isNightsValid = true;
        }

        String location = booking.getLocation();
        if (location != null && !location.isEmpty()) {
            isLocationValid = true;
        }

        double price = booking.getPrice();
        if (price > 0) {
            isPriceValid = true;
        }

        String roomType = booking.getRoomType();
        if (roomType != null && !roomType.isEmpty()) {
            isRoomTypeValid = true;
        }

        int guestsNumber = booking.getGuestsNumber();
        if (guestsNumber > 0) {
            isGuestsNumberValid = true;
        }

        if (isBookingIdValid && isHostValid && isNightsValid &&
            isLocationValid && isPriceValid && isRoomTypeValid &&
            isGuestsNumberValid) {

            isBookingAdded = true;
            bookings[index++] = booking;
        }

        return isBookingAdded;
    }

    public void getBookingDetails() {

        System.out.println("The Airbnb booking details are as follows :");

        for (AirbnbBooking booking : bookings) {

            if (booking != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Booking Id is : " + booking.getBookingId());
                System.out.println("Host is : " + booking.getHost());
                System.out.println("Number of nights : " + booking.getNights());
                System.out.println("Location is : " + booking.getLocation());
                System.out.println("Price is : " + booking.getPrice());
                System.out.println("Room type is : " + booking.getRoomType());
                System.out.println("Number of guests : " + booking.getGuestsNumber());
                System.out.println("--------------------------------------------");
            }
        }
    }
}