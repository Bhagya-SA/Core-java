class LionDates {

    String brandName;
    String type; 
    double pricePerKg;
    double weight; // in kg
    String manufacturingDate;
    String expiryDate;
    String ingredients;
    String manufacturer;
    String countryOfOrigin;
    boolean isOrganic;
    boolean isSeedless;
    String packagingType;
    String flavor; 
    int stockQuantity;
    String batchNumber;
    boolean isAvailable;
    double discount;
    double rating;
    String storageInstructions;

    LionDates() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    LionDates(String brandName, String type, double pricePerKg, double weight, String manufacturingDate, String expiryDate, String ingredients, String manufacturer, String countryOfOrigin, boolean isOrganic, boolean isSeedless, String packagingType, String flavor, int stockQuantity, String batchNumber, boolean isAvailable, double discount, double rating, String storageInstructions) {
        this();
		this.brandName = brandName;
        this.type = type;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.ingredients = ingredients;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.isOrganic = isOrganic;
        this.isSeedless = isSeedless;
        this.packagingType = packagingType;
        this.flavor = flavor;
        this.stockQuantity = stockQuantity;
        this.batchNumber = batchNumber;
        this.isAvailable = isAvailable;
        this.discount = discount;
        this.rating = rating;
        this.storageInstructions = storageInstructions;
    }

    public void getLionDatesDetails() {
        System.out.println("Brand Name : " + this.brandName);
        System.out.println("Type : " + this.type);
        System.out.println("Price Per Kg : " + this.pricePerKg);
        System.out.println("Weight : " + this.weight);
        System.out.println("Manufacturing Date : " + this.manufacturingDate);
        System.out.println("Expiry Date : " + this.expiryDate);
        System.out.println("Ingredients : " + this.ingredients);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country Of Origin : " + this.countryOfOrigin);
        System.out.println("Is Organic : " + this.isOrganic);
        System.out.println("Is Seedless : " + this.isSeedless);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Flavor : " + this.flavor);
        System.out.println("Stock Quantity : " + this.stockQuantity);
        System.out.println("Batch Number : " + this.batchNumber);
        System.out.println("Is Available : " + this.isAvailable);
        System.out.println("Discount : " + this.discount);
        System.out.println("Rating : " + this.rating);
        System.out.println("Storage Instructions : " + this.storageInstructions);
    }
}

