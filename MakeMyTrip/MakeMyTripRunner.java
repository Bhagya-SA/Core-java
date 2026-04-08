class MakeMyTripRunner {

    public static void main(String[] trip) {

        MakeMyTrip makeMyTrip = new MakeMyTrip();

        FlightRunner flightOne = new FlightRunner();
        flightOne.setFlightId(1);
        flightOne.setAirLine("IndiGo");
        flightOne.setPrice(5000.0);
        flightOne.setSource("Delhi");
        flightOne.setDuration(2.5);
        flightOne.setDestination("Mumbai");
        flightOne.setSeats(150);

        boolean isFlightAdded = makeMyTrip.addFlight(flightOne);
        System.out.println(isFlightAdded);

        FlightRunner flightTwo = new FlightRunner();
        flightTwo.setFlightId(2);
        flightTwo.setAirLine("Air India");
        flightTwo.setPrice(5500.0);
        flightTwo.setSource("Mumbai");
        flightTwo.setDuration(3.0);
        flightTwo.setDestination("Bangalore");
        flightTwo.setSeats(120);

        isFlightAdded = makeMyTrip.addFlight(flightTwo);
        System.out.println(isFlightAdded);

        FlightRunner flightThree = new FlightRunner();
        flightThree.setFlightId(3);
        flightThree.setAirLine("SpiceJet");
        flightThree.setPrice(4800.0);
        flightThree.setSource("Bangalore");
        flightThree.setDuration(2.0);
        flightThree.setDestination("Chennai");
        flightThree.setSeats(100);

        isFlightAdded = makeMyTrip.addFlight(flightThree);
        System.out.println(isFlightAdded);

        FlightRunner flightFour = new FlightRunner();
        flightFour.setFlightId(4);
        flightFour.setAirLine("Vistara");
        flightFour.setPrice(6000.0);
        flightFour.setSource("Delhi");
        flightFour.setDuration(3.5);
        flightFour.setDestination("Kolkata");
        flightFour.setSeats(130);

        isFlightAdded = makeMyTrip.addFlight(flightFour);
        System.out.println(isFlightAdded);

        FlightRunner flightFive = new FlightRunner();
        flightFive.setFlightId(5);
        flightFive.setAirLine("GoAir");
        flightFive.setPrice(4500.0);
        flightFive.setSource("Chennai");
        flightFive.setDuration(2.5);
        flightFive.setDestination("Hyderabad");
        flightFive.setSeats(110);

        isFlightAdded = makeMyTrip.addFlight(flightFive);
        System.out.println(isFlightAdded);

        makeMyTrip.getFlightDetails();
    }
}