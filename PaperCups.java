class PaperCups {

    String brandName;
    String material; 
    String color;
    double pricePerPack;
    int quantityPerPack;
    double volume; 
    boolean isEcoFriendly;
    boolean isMicrowaveSafe;
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
    String pattern; 

    PaperCups() {
		this("EcoSip", "Biodegradable Paper", "White", 250.0, 50, 250.0, true, false, "01-03-2026", "01-03-2030", "EcoSip Ltd.", "India", 300, "ES20260301", true, "Box", 10.0, 4.7, "Use for cold or hot beverages only", "Polka Dots");
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    PaperCups(String brandName, String material, String color, double pricePerPack, int quantityPerPack, double volume, boolean isEcoFriendly, boolean isMicrowaveSafe, String manufacturingDate, String expiryDate, String manufacturer, String countryOfOrigin, int stockQuantity, String batchNumber, boolean isAvailable, String packagingType, double discount, double rating, String usageInstructions, String pattern) {
        this();
		this.brandName = brandName;
        this.material = material;
        this.color = color;
        this.pricePerPack = pricePerPack;
        this.quantityPerPack = quantityPerPack;
        this.volume = volume;
        this.isEcoFriendly = isEcoFriendly;
        this.isMicrowaveSafe = isMicrowaveSafe;
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
        this.pattern = pattern;
    }

    public void getPaperCupsDetails() {
        System.out.println("Brand Name : " + this.brandName);
        System.out.println("Material : " + this.material);
        System.out.println("Color : " + this.color);
        System.out.println("Price Per Pack : " + this.pricePerPack);
        System.out.println("Quantity Per Pack : " + this.quantityPerPack);
        System.out.println("Volume : " + this.volume);
        System.out.println("Is Eco Friendly : " + this.isEcoFriendly);
        System.out.println("Is Microwave Safe : " + this.isMicrowaveSafe);
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
        System.out.println("Pattern : " + this.pattern);
    }
}

