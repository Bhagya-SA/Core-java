class Office {

    int id;
    String name;
    String location;
    int floor;
    int rooms;
    int employees;
    double area; 
    String manager;
    String department;
    boolean cafeteria;
    boolean parking;
    String wifiProvider;
    boolean security;
    String country;
    String city;
    String openingTime;
    String closingTime;
    String contactNumber;
    double rating;
    String status;

    
    public Office(int id, String name, String location, int floor, int rooms, int employees,double area, String manager, String department, boolean cafeteria, boolean parking,String wifiProvider, boolean security, String country, String city, String openingTime,String closingTime, String contactNumber, double rating, String status) {

        this.id = id;
        this.name = name;
        this.location = location;
        this.floor = floor;
        this.rooms = rooms;
        this.employees = employees;
        this.area = area;
        this.manager = manager;
        this.department = department;
        this.cafeteria = cafeteria;
        this.parking = parking;
        this.wifiProvider = wifiProvider;
        this.security = security;
        this.country = country;
        this.city = city;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.contactNumber = contactNumber;
        this.rating = rating;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Floor: " + floor);
        System.out.println("Rooms: " + rooms);
        System.out.println("Employees: " + employees);
        System.out.println("Area: " + area + " sqm");
        System.out.println("Manager: " + manager);
        System.out.println("Department: " + department);
        System.out.println("Cafeteria: " + cafeteria);
        System.out.println("Parking: " + parking);
        System.out.println("WiFi Provider: " + wifiProvider);
        System.out.println("Security: " + security);
        System.out.println("Country: " + country);
        System.out.println("City: " + city);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Rating: " + rating);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}