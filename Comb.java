class Comb {

    String brandName;
    String material;
    String color;
    String type; 
    double price;
    double length; 
    double width;  
    boolean isHeatResistant;
    boolean isAntiStatic;
    String manufacturingDate;
    String expiryDate; 
    String manufacturer;
    String countryOfOrigin;
    int stockQuantity;
    String batchNumber;
    boolean isAvailable;
    String packagingType;
    double discount;
    double rating;
    String usageInstructions;

    Comb() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    Comb(String brandName, String material, String color, String type, double price, double length, double width, boolean isHeatResistant, boolean isAntiStatic, String manufacturingDate, String expiryDate, String manufacturer, String countryOfOrigin, int stockQuantity, String batchNumber, boolean isAvailable, String packagingType, double discount, double rating, String usageInstructions) {
        this();
		this.brandName = brandName;
        this.material = material;
        this.color = color;
        this.type = type;
        this.price = price;
        this.length = length;
        this.width = width;
        this.isHeatResistant = isHeatResistant;
        this.isAntiStatic = isAntiStatic;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.stockQuantity = stockQuantity;
        this.batchNumber = batchNumber;
        this.isAvailable = isAvailable;
        this.packagingType = packagingType;
        this.discount = discount;
        this.rating = rating;
        this.usageInstructions = usageInstructions;
    }

    public void getCombDetails() {
        System.out.println("Brand Name : " + this.brandName);
        System.out.println("Material : " + this.material);
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type);
        System.out.println("Price : " + this.price);
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
        System.out.println("Is Heat Resistant : " + this.isHeatResistant);
        System.out.println("Is Anti Static : " + this.isAntiStatic);
        System.out.println("Manufacturing Date : " + this.manufacturingDate);
        System.out.println("Expiry Date : " + this.expiryDate);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country Of Origin : " + this.countryOfOrigin);
        System.out.println("Stock Quantity : " + this.stockQuantity);
        System.out.println("Batch Number : " + this.batchNumber);
        System.out.println("Is Available : " + this.isAvailable);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Discount : " + this.discount);
        System.out.println("Rating : " + this.rating);
        System.out.println("Usage Instructions : " + this.usageInstructions);
    }
}

