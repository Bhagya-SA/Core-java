class TheoBromaBakery {

    String bakeryName;
    String productType; 
    String flavor;
    double price;
    double weight; 
    String manufacturingDate;
    String expiryDate;
    String ingredients;
    String manufacturer;
    String countryOfOrigin;
    boolean isVegetarian;
    boolean containsNuts;
    String packagingType;
    int stockQuantity;
    String batchNumber;
    boolean isAvailable;
    double discount;
    double rating;
    String storageInstructions;
    String shelfLife; // e.g., 3 days, 1 week

    TheoBromaBakery() {
		this("TheoBroma", "Cake", "Chocolate", 1200.0, 1.0, "01-03-2026", "05-03-2026","Flour, Sugar, Cocoa, Eggs, Butter", "TheoBroma Ltd.", "India", true, false, "Box", 50, "TB20260301", true, 10.0, 4.9, "Keep refrigerated", "3 days");
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    TheoBromaBakery(String bakeryName, String productType, String flavor, double price, double weight, String manufacturingDate, String expiryDate, String ingredients, String manufacturer, String countryOfOrigin, boolean isVegetarian, boolean containsNuts, String packagingType, int stockQuantity, String batchNumber, boolean isAvailable, double discount, double rating, String storageInstructions, String shelfLife) {
        this.bakeryName = bakeryName;
        this.productType = productType;
        this.flavor = flavor;
        this.price = price;
        this.weight = weight;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.ingredients = ingredients;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.isVegetarian = isVegetarian;
        this.containsNuts = containsNuts;
        this.packagingType = packagingType;
        this.stockQuantity = stockQuantity;
        this.batchNumber = batchNumber;
        this.isAvailable = isAvailable;
        this.discount = discount;
        this.rating = rating;
        this.storageInstructions = storageInstructions;
        this.shelfLife = shelfLife;
    }

    public void getTheoBromaBakeryDetails() {
        System.out.println("Bakery Name : " + this.bakeryName);
        System.out.println("Product Type : " + this.productType);
        System.out.println("Flavor : " + this.flavor);
        System.out.println("Price : " + this.price);
        System.out.println("Weight : " + this.weight);
        System.out.println("Manufacturing Date : " + this.manufacturingDate);
        System.out.println("Expiry Date : " + this.expiryDate);
        System.out.println("Ingredients : " + this.ingredients);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country Of Origin : " + this.countryOfOrigin);
        System.out.println("Is Vegetarian : " + this.isVegetarian);
        System.out.println("Contains Nuts : " + this.containsNuts);
        System.out.println("Packaging Type : " + this.packagingType);
        System.out.println("Stock Quantity : " + this.stockQuantity);
        System.out.println("Batch Number : " + this.batchNumber);
        System.out.println("Is Available : " + this.isAvailable);
        System.out.println("Discount : " + this.discount);
        System.out.println("Rating : " + this.rating);
        System.out.println("Storage Instructions : " + this.storageInstructions);
        System.out.println("Shelf Life : " + this.shelfLife);
    }
}

