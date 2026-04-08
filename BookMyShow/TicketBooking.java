public class TicketBooking {

    private int ticketId;
    private String movieName;
    private int seats;
    private String theatre;
    private double price;
    private String city;
    private int shows;

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setShows(int shows) {
        this.shows = shows;
    }

    public int getShows() {
        return shows;
    }
}