class PlasticPaper {

    String brandName;
    String materialType; 
    String color;
    double pricePerSheet;
    double length; 
    double width;  
    boolean isWaterproof;
    boolean isRecyclable;
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
    String texture; 

    PlasticPaper() {
		this("PolySheet", "Polypropylene", "Transparent", 15.0, 30.0, 20.0, true, true, "01-03-2026", "01-03-2030", "PolyTech Ltd.", "India", 500, "PS20260301", true, "Pack", 5.0, 4.7, "Use for craft or covering surfaces", "Smooth");
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    PlasticPaper(String brandName, String materialType, String color, double pricePerSheet, double length, double width, boolean isWaterproof, boolean isRecyclable, String manufacturingDate, String expiryDate, String manufacturer, String countryOfOrigin, int stockQuantity, String batchNumber, boolean isAvailable, String packagingType, double discount, double rating, String usageInstructions, String texture) {
        this();
		this.brandName = brandName;
        this.materialType = materialType;
        this.color = color;
        this.pricePerSheet = pricePerSheet;
        this.length = length;
        this.width = width;
        this.isWaterproof = isWaterproof;
        this.isRecyclable = isRecyclable;
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
        this.texture = texture;
    }

    public void getPlasticPaperDetails() {
        System.out.println("Brand Name : " + this.brandName);
        System.out.println("Material Type : " + this.materialType);
        System.out.println("Color : " + this.color);
        System.out.println("Price per Sheet : " + this.pricePerSheet);
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
        System.out.println("Is Waterproof : " + this.isWaterproof);
        System.out.println("Is Recyclable : " + this.isRecyclable);
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
        System.out.println("Texture : " + this.texture);
    }
}

