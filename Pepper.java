class Pepper {

    int id;
    String type;
    String color;
    double price;
    String origin;
    String brand;
    int quantity;
    String quality;
    String packaging;
    String grade;
    double weight;
    String flavor;
    String size;
    String harvestSeason;
    String exportCountry;
    boolean organic;
    String supplier;
    String storageType;
    double rating;
    String status;

    
    public Pepper(int id, String type, String color, double price, String origin, String brand,int quantity, String quality, String packaging, String grade, double weight,String flavor, String size, String harvestSeason, String exportCountry,boolean organic, String supplier, String storageType, double rating, String status) {

        this.id = id;
        this.type = type;
        this.color = color;
        this.price = price;
        this.origin = origin;
        this.brand = brand;
        this.quantity = quantity;
        this.quality = quality;
        this.packaging = packaging;
        this.grade = grade;
        this.weight = weight;
        this.flavor = flavor;
        this.size = size;
        this.harvestSeason = harvestSeason;
        this.exportCountry = exportCountry;
        this.organic = organic;
        this.supplier = supplier;
        this.storageType = storageType;
        this.rating = rating;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Origin: " + origin);
        System.out.println("Brand: " + brand);
        System.out.println("Quantity: " + quantity);
        System.out.println("Quality: " + quality);
        System.out.println("Packaging: " + packaging);
        System.out.println("Grade: " + grade);
        System.out.println("Weight: " + weight);
        System.out.println("Flavor: " + flavor);
        System.out.println("Size: " + size);
        System.out.println("Harvest Season: " + harvestSeason);
        System.out.println("Export Country: " + exportCountry);
        System.out.println("Organic: " + organic);
        System.out.println("Supplier: " + supplier);
        System.out.println("Storage Type: " + storageType);
        System.out.println("Rating: " + rating);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}