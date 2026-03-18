class SoapHolder {

    String brandName;
    String material;
    String color;
    String shape;
    double price;
    double length; 
    double width;  
    double height; 
    boolean isWallMounted;
    boolean hasDrainHoles;
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

    SoapHolder() {
		this("BathEase", "Plastic", "White", "Rectangle", 350.0, 15.0, 10.0, 5.0, true, true, "01-03-2026", "01-03-2030", "BathEase Ltd.", "India", 200, "BE20260301", true, "Box", 10.0, 4.8);
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    SoapHolder(String brandName, String material, String color, String shape, double price, double length, double width, double height, boolean isWallMounted, boolean hasDrainHoles, String manufacturingDate, String expiryDate, String manufacturer, String countryOfOrigin, int stockQuantity, String batchNumber, boolean isAvailable, String packagingType, double discount, double rating) {
        this.brandName = brandName;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.length = length;
        this.width = width;
        this.height = height;
        this.isWallMounted = isWallMounted;
        this.hasDrainHoles = hasDrainHoles;
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
    }

    public void getSoapHolderDetails() {
        System.out.println("Brand Name : " + this.brandName);
        System.out.println("Material : " + this.material);
        System.out.println("Color : " + this.color);
        System.out.println("Shape : " + this.shape);
        System.out.println("Price : " + this.price);
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
        System.out.println("Is Wall Mounted : " + this.isWallMounted);
        System.out.println("Has Drain Holes : " + this.hasDrainHoles);
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
    }
}

