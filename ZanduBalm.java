class ZanduBalm {

    String brandName;
    String productType;
    double price;
    double weight;
    String manufacturingDate;
    String expiryDate;
    String ingredients;
    String manufacturer;
    String countryOfOrigin;
    String usageInstructions;
    boolean isForHeadache;
    boolean isForBodyPain;
    String fragrance;
    int stockQuantity;
    String batchNumber;
    boolean isAvailable;
    String packagingType;
    double discount;
    double rating;
    String color;
	
	ZanduBalm() {
		
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	ZanduBalm(String brandName , String productType , double price , double weight , String manufacturingDate , String expiryDate , String ingredients , String manufacturer , String countryOfOrigin ,  String usageInstructions , boolean isForHeadache , boolean isForBodyPain , String fragrance, int stockQuantity , String batchNumber , boolean isAvailable , String packagingType , double discount , double rating , String color) {
		this();
		this.brandName = brandName;
		this.productType = productType;
		this.price = price;
		this.weight = weight;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.ingredients = ingredients;
		this.manufacturer = manufacturer;
		this.countryOfOrigin = countryOfOrigin;
		this.usageInstructions = usageInstructions;
		this.isForHeadache = isForHeadache;
		this.isForBodyPain = isForBodyPain;
		this.fragrance = fragrance;
		this.stockQuantity = stockQuantity;
		this.batchNumber = batchNumber;  
		this.isAvailable = isAvailable;
		this.packagingType = packagingType;
		this.discount = discount;
		this.rating = rating;
		this.color = color;
		
	}
	public void getZanduBalmDetails() {
		System.out.println("Brand Name : " + this.brandName);
		System.out.println("Product Type : " + this.productType);
        System.out.println("Price : " + this.price);
        System.out.println("Weight : " + this.weight);
        System.out.println("Manufacturing Date : " + this.manufacturingDate);
        System.out.println("Expiry Date : " + this.expiryDate);
        System.out.println("Ingredients : " + this.ingredients);
        System.out.println("Manufacturer : " + this.manufacturer);
        System.out.println("Country Of Origin : " + this.countryOfOrigin);
        System.out.println("Usage Instructions : " + this.usageInstructions);
        System.out.println("Is For Headache : " + this.isForHeadache);
        System.out.println("Is For Body Pain : " + this.isForBodyPain);
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