class AirbnbRunner {

    public static void main(String[] args) {

        Airbnb airbnb = new Airbnb();

        AirbnbBooking bookingOne = new AirbnbBooking();
        bookingOne.setBookingId(1);
        bookingOne.setHost("Alice");
        bookingOne.setNights(3);
        bookingOne.setLocation("Paris");
        bookingOne.setPrice(300.0);
        bookingOne.setRoomType("Entire Apartment");
        bookingOne.setGuestsNumber(2);

        boolean isBookingAdded = airbnb.addBooking(bookingOne);
        System.out.println(isBookingAdded);

        AirbnbBooking bookingTwo = new AirbnbBooking();
        bookingTwo.setBookingId(2);
        bookingTwo.setHost("Bob");
        bookingTwo.setNights(5);
        bookingTwo.setLocation("New York");
        bookingTwo.setPrice(500.0);
        bookingTwo.setRoomType("Private Room");
        bookingTwo.setGuestsNumber(1);

        isBookingAdded = airbnb.addBooking(bookingTwo);
        System.out.println(isBookingAdded);

        AirbnbBooking bookingThree = new AirbnbBooking();
        bookingThree.setBookingId(3);
        bookingThree.setHost("Charlie");
        bookingThree.setNights(2);
        bookingThree.setLocation("Tokyo");
        bookingThree.setPrice(250.0);
        bookingThree.setRoomType("Entire Apartment");
        bookingThree.setGuestsNumber(3);

        isBookingAdded = airbnb.addBooking(bookingThree);
        System.out.println(isBookingAdded);

        AirbnbBooking bookingFour = new AirbnbBooking();
        bookingFour.setBookingId(4);
        bookingFour.setHost("Diana");
        bookingFour.setNights(4);
        bookingFour.setLocation("London");
        bookingFour.setPrice(400.0);
        bookingFour.setRoomType("Shared Room");
        bookingFour.setGuestsNumber(2);

        isBookingAdded = airbnb.addBooking(bookingFour);
        System.out.println(isBookingAdded);

        AirbnbBooking bookingFive = new AirbnbBooking();
        bookingFive.setBookingId(5);
        bookingFive.setHost("Eve");
        bookingFive.setNights(6);
        bookingFive.setLocation("Sydney");
        bookingFive.setPrice(600.0);
        bookingFive.setRoomType("Entire Apartment");
        bookingFive.setGuestsNumber(4);

        isBookingAdded = airbnb.addBooking(bookingFive);
        System.out.println(isBookingAdded);

        airbnb.getBookingDetails();
    }
}