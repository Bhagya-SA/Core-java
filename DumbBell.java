class DumbBell {

    int id;
    String brand;
    String material;
    double weight;
    double price;
    String color;
    int quantity;
    String type;
    String usage;
    String gripType;
    boolean adjustable;
    String coating;
    String shape;
    String manufacturer;
    String country;
    String packaging;
    double rating;
    String warranty;
    boolean antiSlip;
    String status;

    
    public DumbBell(int id, String brand, String material, double weight, double price, String color,int quantity, String type, String usage, String gripType, boolean adjustable,String coating, String shape, String manufacturer, String country,String packaging, double rating, String warranty, boolean antiSlip, String status) {

        this.id = id;
        this.brand = brand;
        this.material = material;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
        this.type = type;
        this.usage = usage;
        this.gripType = gripType;
        this.adjustable = adjustable;
        this.coating = coating;
        this.shape = shape;
        this.manufacturer = manufacturer;
        this.country = country;
        this.packaging = packaging;
        this.rating = rating;
        this.warranty = warranty;
        this.antiSlip = antiSlip;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Quantity: " + quantity);
        System.out.println("Type: " + type);
        System.out.println("Usage: " + usage);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Coating: " + coating);
        System.out.println("Shape: " + shape);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Packaging: " + packaging);
        System.out.println("Rating: " + rating);
        System.out.println("Warranty: " + warranty);
        System.out.println("Anti Slip: " + antiSlip);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}