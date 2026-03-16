class PVR {

    int id;
    String name;
    String location;
    int screens;
    int capacity;
    boolean parkingAvailable;
    String screenType;
    double ticketPrice;
    String city;
    String state;
    String country;
    String managerName;
    String contactNumber;
    String facilities;
    boolean foodCourt;
    boolean onlineBooking;
    String website;
    double rating;
    String openingTime;
    String closingTime;

    
    public PVR(int id, String name, String location, int screens, int capacity,boolean parkingAvailable, String screenType, double ticketPrice,String city, String state, String country, String managerName,String contactNumber, String facilities, boolean foodCourt,boolean onlineBooking, String website, double rating,String openingTime, String closingTime) {

        this.id = id;
        this.name = name;
        this.location = location;
        this.screens = screens;
        this.capacity = capacity;
        this.parkingAvailable = parkingAvailable;
        this.screenType = screenType;
        this.ticketPrice = ticketPrice;
        this.city = city;
        this.state = state;
        this.country = country;
        this.managerName = managerName;
        this.contactNumber = contactNumber;
        this.facilities = facilities;
        this.foodCourt = foodCourt;
        this.onlineBooking = onlineBooking;
        this.website = website;
        this.rating = rating;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Screens: " + screens);
        System.out.println("Capacity: " + capacity);
        System.out.println("Parking Available: " + parkingAvailable);
        System.out.println("Screen Type: " + screenType);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Facilities: " + facilities);
        System.out.println("Food Court: " + foodCourt);
        System.out.println("Online Booking: " + onlineBooking);
        System.out.println("Website: " + website);
        System.out.println("Rating: " + rating);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("-----------------------------------");
    }
}