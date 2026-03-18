class TediBarLotion {

    String brandName;
    String productType;
    double price;
    double volume; 
    String manufacturingDate;
    String expiryDate;
    String ingredients;
    String manufacturer;
    String countryOfOrigin;
    String usageInstructions;
    boolean isForDrySkin;
    boolean isForOilySkin;
    String fragrance;
    int stockQuantity;
    String batchNumber;
    boolean isAvailable;
    String packagingType;
    double discount;
    double rating;
    String color;
    
    TediBarLotion() {
		this("TediBar", "Moisturizing Lotion", 250.0, 200.0, "05-03-2026", "05-03-2028", "Aloe Vera, Vitamin E, Shea Butter", "Tedi Cosmetics", "India", "Apply evenly on skin twice a day", true, false, "Floral", 300, "TB20260305", true, "Bottle", 15.0, 4.7, "Light Yellow");
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    TediBarLotion(String brandName, String productType, double price, double volume, String manufacturingDate, String expiryDate, String ingredients, String manufacturer, String countryOfOrigin, String usageInstructions, boolean isForDrySkin, boolean isForOilySkin, String fragrance, int stockQuantity, String batchNumber, boolean isAvailable, String packagingType, double discount, double rating, String color) {
        this.brandName = brandName;
        this.productType = productType;
        this.price = price;
        this.volume = volume;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.ingredients = ingredients;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.usageInstructions = usageInstructions;
        this.isForDrySkin = isForDrySkin;
        this.isForOilySkin = isForOilySkin;
        this.fragrance = fragrance;
        this.stockQuantity = stockQuantity;
        this.batchNumber = batchNumber;
        this.isAvailable = isAvailable;
        this.packagingType = packagingType;
        this.discount = discount;
        this.rating = rating;
        this.color = color;
    }

    public void getTediBarLotionDetails() {
        System.out.println("Brand Name : " + this.brandName);
        System.out.println("Product Type : " + this.productType);
        System.out.println("Price : " + this.price);
        System.out.println("Volume : " + this.volume);
        System.out.println("Manufacturing Date : " + this.manufacturingDate);
        System.out.println("Expiry Date : " + this.expiryDate);
        System.out.println("Ingredients : " + this.ingredients);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country Of Origin : " + this.countryOfOrigin);
        System.out.println("Usage Instructions : " + this.usageInstructions);
        System.out.println("Is For Dry Skin : " + this.isForDrySkin);
        System.out.println("Is For Oily Skin : " + this.isForOilySkin);
        System.out.println("Fragrance : " + this.fragrance);
        System.out.println("Stock Quantity : " + this.stockQuantity);
        System.out.println("Batch Number : " + this.batchNumber);
        System.out.println("Is Available : " + this.isAvailable);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Discount : " + this.discount);
        System.out.println("Rating : " + this.rating);
        System.out.println("Color : " + this.color);
    }
}

