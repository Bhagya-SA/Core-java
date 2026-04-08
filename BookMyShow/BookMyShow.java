class BookMyShow {

    TicketBooking tickets[] = new TicketBooking[5];
    int index;

    public boolean addTicket(TicketBooking ticket) {

        boolean isTicketAdded = false;

        boolean isTicketIdValid = false;
        boolean isMovieNameValid = false;
        boolean isSeatsValid = false;
        boolean isTheatreValid = false;
        boolean isPriceValid = false;
        boolean isCityValid = false;
        boolean isShowsValid = false;

        int ticketId = ticket.getTicketId();
        if (ticketId > 0) {
            isTicketIdValid = true;
        }

        String movieName = ticket.getMovieName();
        if (movieName != null && !movieName.isEmpty()) {
            isMovieNameValid = true;
        }

        int seats = ticket.getSeats();
        if (seats > 0) {
            isSeatsValid = true;
        }

        String theatre = ticket.getTheatre();
        if (theatre != null && !theatre.isEmpty()) {
            isTheatreValid = true;
        }

        double price = ticket.getPrice();
        if (price > 0) {
            isPriceValid = true;
        }

        String city = ticket.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        }

        int shows = ticket.getShows();
        if (shows > 0) {
            isShowsValid = true;
        }

        if (isTicketIdValid && isMovieNameValid && isSeatsValid &&
            isTheatreValid && isPriceValid && isCityValid &&
            isShowsValid) {

            isTicketAdded = true;
            tickets[index++] = ticket;
        }

        return isTicketAdded;
    }

    public void getTicketDetails() {

        System.out.println("The ticket booking details are as follows :");

        for (TicketBooking ticket : tickets) {

            if (ticket != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Ticket Id is : " + ticket.getTicketId());
                System.out.println("Movie Name is : " + ticket.getMovieName());
                System.out.println("Seats booked : " + ticket.getSeats());
                System.out.println("Theatre is : " + ticket.getTheatre());
                System.out.println("Price is : " + ticket.getPrice());
                System.out.println("City is : " + ticket.getCity());
                System.out.println("Number of shows : " + ticket.getShows());
                System.out.println("--------------------------------------------");
            }
        }
    }
}