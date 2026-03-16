class Shampoo {

    int id;
    String brand;
    String variant;
    double volume; 
    double price;
    String color;
    String scent;
    boolean sulfateFree;
    boolean parabenFree;
    String hairType;
    String manufacturer;
    String country;
    String expiryDate;
    String batchNumber;
    String ingredients;
    double phLevel;
    String usage;
    double rating;
    boolean organic;
    String status;

    
    public Shampoo(int id, String brand, String variant, double volume, double price,String color, String scent, boolean sulfateFree, boolean parabenFree,String hairType, String manufacturer, String country, String expiryDate,String batchNumber, String ingredients, double phLevel, String usage,double rating, boolean organic, String status) {

        this.id = id;
        this.brand = brand;
        this.variant = variant;
        this.volume = volume;
        this.price = price;
        this.color = color;
        this.scent = scent;
        this.sulfateFree = sulfateFree;
        this.parabenFree = parabenFree;
        this.hairType = hairType;
        this.manufacturer = manufacturer;
        this.country = country;
        this.expiryDate = expiryDate;
        this.batchNumber = batchNumber;
        this.ingredients = ingredients;
        this.phLevel = phLevel;
        this.usage = usage;
        this.rating = rating;
        this.organic = organic;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Variant: " + variant);
        System.out.println("Volume: " + volume + "ml");
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Scent: " + scent);
        System.out.println("Sulfate Free: " + sulfateFree);
        System.out.println("Paraben Free: " + parabenFree);
        System.out.println("Hair Type: " + hairType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Usage: " + usage);
        System.out.println("Rating: " + rating);
        System.out.println("Organic: " + organic);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}