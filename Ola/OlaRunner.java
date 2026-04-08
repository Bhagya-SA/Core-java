class OlaRunner {

    public static void main(String[] args) {

        Ola ola = new Ola();

        OlaBooking bookingOne = new OlaBooking();
        bookingOne.setBookingId(1);
        bookingOne.setDriver("Ravi");
        bookingOne.setFare(350.0);
        bookingOne.setCarType("Sedan");
        bookingOne.setDistance(12.5);
        bookingOne.setCity("Mumbai");
        bookingOne.setTime(25);

        boolean isBookingAdded = ola.addBooking(bookingOne);
        System.out.println(isBookingAdded);

        OlaBooking bookingTwo = new OlaBooking();
        bookingTwo.setBookingId(2);
        bookingTwo.setDriver("Suresh");
        bookingTwo.setFare(500.0);
        bookingTwo.setCarType("SUV");
        bookingTwo.setDistance(20.0);
        bookingTwo.setCity("Delhi");
        bookingTwo.setTime(35);

        isBookingAdded = ola.addBooking(bookingTwo);
        System.out.println(isBookingAdded);

        OlaBooking bookingThree = new OlaBooking();
        bookingThree.setBookingId(3);
        bookingThree.setDriver("Anil");
        bookingThree.setFare(200.0);
        bookingThree.setCarType("Mini");
        bookingThree.setDistance(8.0);
        bookingThree.setCity("Bangalore");
        bookingThree.setTime(15);

        isBookingAdded = ola.addBooking(bookingThree);
        System.out.println(isBookingAdded);

        OlaBooking bookingFour = new OlaBooking();
        bookingFour.setBookingId(4);
        bookingFour.setDriver("Manoj");
        bookingFour.setFare(450.0);
        bookingFour.setCarType("Sedan");
        bookingFour.setDistance(18.0);
        bookingFour.setCity("Chennai");
        bookingFour.setTime(30);

        isBookingAdded = ola.addBooking(bookingFour);
        System.out.println(isBookingAdded);

        OlaBooking bookingFive = new OlaBooking();
        bookingFive.setBookingId(5);
        bookingFive.setDriver("Vikram");
        bookingFive.setFare(600.0);
        bookingFive.setCarType("SUV");
        bookingFive.setDistance(25.0);
        bookingFive.setCity("Hyderabad");
        bookingFive.setTime(40);

        isBookingAdded = ola.addBooking(bookingFive);
        System.out.println(isBookingAdded);

        ola.getBookingDetails();
    }
}