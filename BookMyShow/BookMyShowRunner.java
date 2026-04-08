class BookMyShowRunner {

    public static void main(String[] args) {

        BookMyShow bookMyShow = new BookMyShow();

        TicketBooking ticketOne = new TicketBooking();
        ticketOne.setTicketId(1);
        ticketOne.setMovieName("Avengers: Endgame");
        ticketOne.setSeats(3);
        ticketOne.setTheatre("PVR Cinemas");
        ticketOne.setPrice(450.0);
        ticketOne.setCity("Mumbai");
        ticketOne.setShows(2);

        boolean isTicketAdded = bookMyShow.addTicket(ticketOne);
        System.out.println(isTicketAdded);

        TicketBooking ticketTwo = new TicketBooking();
        ticketTwo.setTicketId(2);
        ticketTwo.setMovieName("Inception");
        ticketTwo.setSeats(2);
        ticketTwo.setTheatre("INOX");
        ticketTwo.setPrice(400.0);
        ticketTwo.setCity("Delhi");
        ticketTwo.setShows(1);

        isTicketAdded = bookMyShow.addTicket(ticketTwo);
        System.out.println(isTicketAdded);

        TicketBooking ticketThree = new TicketBooking();
        ticketThree.setTicketId(3);
        ticketThree.setMovieName("Titanic");
        ticketThree.setSeats(4);
        ticketThree.setTheatre("Carnival Cinemas");
        ticketThree.setPrice(350.0);
        ticketThree.setCity("Bangalore");
        ticketThree.setShows(1);

        isTicketAdded = bookMyShow.addTicket(ticketThree);
        System.out.println(isTicketAdded);

        TicketBooking ticketFour = new TicketBooking();
        ticketFour.setTicketId(4);
        ticketFour.setMovieName("The Dark Knight");
        ticketFour.setSeats(1);
        ticketFour.setTheatre("PVR Cinemas");
        ticketFour.setPrice(300.0);
        ticketFour.setCity("Chennai");
        ticketFour.setShows(2);

        isTicketAdded = bookMyShow.addTicket(ticketFour);
        System.out.println(isTicketAdded);

        TicketBooking ticketFive = new TicketBooking();
        ticketFive.setTicketId(5);
        ticketFive.setMovieName("Interstellar");
        ticketFive.setSeats(5);
        ticketFive.setTheatre("INOX");
        ticketFive.setPrice(500.0);
        ticketFive.setCity("Kolkata");
        ticketFive.setShows(1);

        isTicketAdded = bookMyShow.addTicket(ticketFive);
        System.out.println(isTicketAdded);

        bookMyShow.getTicketDetails();
    }
}