class Wire {

    String brandName;
    String wireType;
    double pricePerMeter;
    double length; 
    String material;
    String color;
    String insulationType;
    double currentRating; 
    String manufacturingDate;
    String expiryDate;
    String manufacturer;
    String countryOfOrigin;
    boolean isFlexible;
    boolean isWaterResistant;
    double weight; 
    String batchNumber;
    boolean isAvailable;
    String packagingType;
    double discount;
    double rating;

    Wire() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    Wire(String brandName, String wireType, double pricePerMeter, double length, String material, String color, String insulationType, double currentRating, String manufacturingDate, String expiryDate, String manufacturer, String countryOfOrigin, boolean isFlexible, boolean isWaterResistant, double weight, String batchNumber, boolean isAvailable, String packagingType, double discount, double rating) {
        this();
		this.brandName = brandName;
        this.wireType = wireType;
        this.pricePerMeter = pricePerMeter;
        this.length = length;
        this.material = material;
        this.color = color;
        this.insulationType = insulationType;
        this.currentRating = currentRating;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.isFlexible = isFlexible;
        this.isWaterResistant = isWaterResistant;
        this.weight = weight;
        this.batchNumber = batchNumber;
        this.isAvailable = isAvailable;
        this.packagingType = packagingType;
        this.discount = discount;
        this.rating = rating;
    }

    public void getWireDetails() {
        System.out.println("Brand Name : " + this.brandName);
        System.out.println("Wire Type : " + this.wireType);
        System.out.println("Price per Meter : " + this.pricePerMeter);
        System.out.println("Length : " + this.length);
        System.out.println("Material : " + this.material);
        System.out.println("Color : " + this.color);
        System.out.println("Insulation Type : " + this.insulationType);
        System.out.println("Current Rating : " + this.currentRating);
        System.out.println("Manufacturing Date : " + this.manufacturingDate);
        System.out.println("Expiry Date : " + this.expiryDate);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country Of Origin : " + this.countryOfOrigin);
        System.out.println("Is Flexible : " + this.isFlexible);
        System.out.println("Is Water Resistant : " + this.isWaterResistant);
        System.out.println("Weight : " + this.weight);
        System.out.println("Batch Number : " + this.batchNumber);
        System.out.println("Is Available : " + this.isAvailable);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Discount : " + this.discount);
        System.out.println("Rating : " + this.rating);
    }
}

