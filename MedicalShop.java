class MedicalShop {

    String shopName;
    String ownerName;
    String location;
    String registrationNumber;
    String licenseNumber;
    boolean isOpen24Hours;
    boolean hasOnlineDelivery;
    int numberOfEmployees;
    String contactNumber;
    String email;
    String establishedDate;
    String medicinesAvailable; 
    boolean hasPharmacist;
    int stockCapacity;
    String country;
    boolean isFranchise;
    String openingTime;
    String closingTime;
    double rating;
    double discount;

    MedicalShop() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    MedicalShop(String shopName, String ownerName, String location, String registrationNumber, String licenseNumber, boolean isOpen24Hours, boolean hasOnlineDelivery, int numberOfEmployees, String contactNumber, String email, String establishedDate, String medicinesAvailable, boolean hasPharmacist, int stockCapacity, String country, boolean isFranchise, String openingTime, String closingTime, double rating, double discount) {
        this();
		this.shopName = shopName;
        this.ownerName = ownerName;
        this.location = location;
        this.registrationNumber = registrationNumber;
        this.licenseNumber = licenseNumber;
        this.isOpen24Hours = isOpen24Hours;
        this.hasOnlineDelivery = hasOnlineDelivery;
        this.numberOfEmployees = numberOfEmployees;
        this.contactNumber = contactNumber;
        this.email = email;
        this.establishedDate = establishedDate;
        this.medicinesAvailable = medicinesAvailable;
        this.hasPharmacist = hasPharmacist;
        this.stockCapacity = stockCapacity;
        this.country = country;
        this.isFranchise = isFranchise;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.rating = rating;
        this.discount = discount;
    }

    public void getMedicalShopDetails() {
        System.out.println("Shop Name : " + this.shopName);
        System.out.println("Owner Name : " + this.ownerName);
        System.out.println("Location : " + this.location);
        System.out.println("Registration Number : " + this.registrationNumber);
        System.out.println("License Number : " + this.licenseNumber);
        System.out.println("Is Open 24 Hours : " + this.isOpen24Hours);
        System.out.println("Has Online Delivery : " + this.hasOnlineDelivery);
        System.out.println("Number Of Employees : " + this.numberOfEmployees);
        System.out.println("Contact Number : " + this.contactNumber);
        System.out.println("Email : " + this.email);
        System.out.println("Established Date : " + this.establishedDate);
        System.out.println("Medicines Available : " + this.medicinesAvailable);
        System.out.println("Has Pharmacist : " + this.hasPharmacist);
        System.out.println("Stock Capacity : " + this.stockCapacity);
        System.out.println("Country : " + this.country);
        System.out.println("Is Franchise : " + this.isFranchise);
        System.out.println("Opening Time : " + this.openingTime);
        System.out.println("Closing Time : " + this.closingTime);
        System.out.println("Rating : " + this.rating);
        System.out.println("Discount : " + this.discount);
    }
}

