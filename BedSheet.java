class BedSheet {

    String brandName;
    String material;
    String color;
    String pattern;
    double price;
    double length; 
    double width;  
    boolean isKingSize;
    boolean isMachineWashable;
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
    String threadCount;

    BedSheet() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    BedSheet(String brandName, String material, String color, String pattern, double price, double length, double width, boolean isKingSize, boolean isMachineWashable, String manufacturingDate, String expiryDate, String manufacturer, String countryOfOrigin, int stockQuantity, String batchNumber, boolean isAvailable, String packagingType, double discount, double rating, String threadCount) {
        this();
		this.brandName = brandName;
        this.material = material;
        this.color = color;
        this.pattern = pattern;
        this.price = price;
        this.length = length;
        this.width = width;
        this.isKingSize = isKingSize;
        this.isMachineWashable = isMachineWashable;
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
        this.threadCount = threadCount;
    }

    public void getBedSheetDetails() {
        System.out.println("Brand Name : " + this.brandName);
        System.out.println("Material : " + this.material);
        System.out.println("Color : " + this.color);
        System.out.println("Pattern : " + this.pattern);
        System.out.println("Price : " + this.price);
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
        System.out.println("Is King Size : " + this.isKingSize);
        System.out.println("Is Machine Washable : " + this.isMachineWashable);
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
        System.out.println("Thread Count : " + this.threadCount);
    }
}

