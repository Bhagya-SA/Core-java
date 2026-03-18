class ComedyShow {

    String showName;
    String comedian;
    String language;
    double ticketPrice;
    String showDate;
    String showTime;
    String venue;
    int durationMinutes;
    boolean isFamilyFriendly;
    boolean hasVIPSeating;
    String productionHouse;
    String country;
    int availableSeats;
    String batchNumber;
    boolean isAvailable;
    String seatingType;
    double discount;
    double rating;
    String genre;

    ComedyShow() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    ComedyShow(String showName, String comedian, String language, double ticketPrice, String showDate, String showTime, String venue, int durationMinutes, boolean isFamilyFriendly, boolean hasVIPSeating, String productionHouse, String country, int availableSeats, String batchNumber, boolean isAvailable, String seatingType, double discount, double rating, String genre) {
        this.showName = showName;
        this.comedian = comedian;
        this.language = language;
        this.ticketPrice = ticketPrice;
        this.showDate = showDate;
        this.showTime = showTime;
        this.venue = venue;
        this.durationMinutes = durationMinutes;
        this.isFamilyFriendly = isFamilyFriendly;
        this.hasVIPSeating = hasVIPSeating;
        this.productionHouse = productionHouse;
        this.country = country;
        this.availableSeats = availableSeats;
        this.batchNumber = batchNumber;
        this.isAvailable = isAvailable;
        this.seatingType = seatingType;
        this.discount = discount;
        this.rating = rating;
        this.genre = genre;
    }

    public void getComedyShowDetails() {
        System.out.println("Show Name : " + this.showName);
        System.out.println("Comedian : " + this.comedian);
        System.out.println("Language : " + this.language);
        System.out.println("Ticket Price : " + this.ticketPrice);
        System.out.println("Show Date : " + this.showDate);
        System.out.println("Show Time : " + this.showTime);
        System.out.println("Venue : " + this.venue);
        System.out.println("Duration (Minutes) : " + this.durationMinutes);
        System.out.println("Is Family Friendly : " + this.isFamilyFriendly);
        System.out.println("Has VIP Seating : " + this.hasVIPSeating);
        System.out.println("Production House : " + this.productionHouse);
        System.out.println("Country : " + this.country);
        System.out.println("Available Seats : " + this.availableSeats);
        System.out.println("Batch Number : " + this.batchNumber);
        System.out.println("Is Available : " + this.isAvailable);
        System.out.println("Seating Type : " + this.seatingType);
        System.out.println("Discount : " + this.discount);
        System.out.println("Rating : " + this.rating);
        System.out.println("Genre : " + this.genre);
    }
}

