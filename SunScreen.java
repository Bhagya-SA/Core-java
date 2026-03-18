class SunScreen {

    String brandName;
    String productType; 
    double price;
    double volume; 
    int spf; 
    boolean isWaterResistant;
    boolean isForFace;
    boolean isForBody;
    String manufacturingDate;
    String expiryDate;
    String ingredients;
    String manufacturer;
    String countryOfOrigin;
    String fragrance;
    int stockQuantity;
    String batchNumber;
    boolean isAvailable;
    String packagingType;
    double discount;
    double rating;

    SunScreen() {
		this("SunShield", "Lotion", 350.0, 100.0, 50, true, true, true, "01-03-2026", "01-03-2028", "Zinc Oxide, Aloe Vera, Vitamin E", "SunShield Ltd.", "India", "Fresh Citrus", 250, "SS20260301", true, "Tube", 12.0, 4.9);
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    SunScreen(String brandName, String productType, double price, double volume, int spf, boolean isWaterResistant, boolean isForFace, boolean isForBody, String manufacturingDate, String expiryDate, String ingredients, String manufacturer, String countryOfOrigin, String fragrance, int stockQuantity, String batchNumber, boolean isAvailable, String packagingType, double discount, double rating) {
        this.brandName = brandName;
        this.productType = productType;
        this.price = price;
        this.volume = volume;
        this.spf = spf;
        this.isWaterResistant = isWaterResistant;
        this.isForFace = isForFace;
        this.isForBody = isForBody;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.ingredients = ingredients;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.fragrance = fragrance;
        this.stockQuantity = stockQuantity;
        this.batchNumber = batchNumber;
        this.isAvailable = isAvailable;
        this.packagingType = packagingType;
        this.discount = discount;
        this.rating = rating;
    }

    public void getSunScreenDetails() {
        System.out.println("Brand Name : " + this.brandName);
        System.out.println("Product Type : " + this.productType);
        System.out.println("Price : " + this.price);
        System.out.println("Volume : " + this.volume);
        System.out.println("SPF : " + this.spf);
        System.out.println("Is Water Resistant : " + this.isWaterResistant);
        System.out.println("Is For Face : " + this.isForFace);
        System.out.println("Is For Body : " + this.isForBody);
        System.out.println("Manufacturing Date : " + this.manufacturingDate);
        System.out.println("Expiry Date : " + this.expiryDate);
        System.out.println("Ingredients : " + this.ingredients);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country Of Origin : " + this.countryOfOrigin);
        System.out.println("Fragrance : " + this.fragrance);
        System.out.println("Stock Quantity : " + this.stockQuantity);
        System.out.println("Batch Number : " + this.batchNumber);
        System.out.println("Is Available : " + this.isAvailable);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Discount : " + this.discount);
        System.out.println("Rating : " + this.rating);
    }
}

