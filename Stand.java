class Stand {

    int id;
    String type;
    String material;
    String color;
    double price;
    String brand;
    int height;
    int width;
    String shape;
    String usage;
    double weight;
    String manufacturer;
    String country;
    int warranty;
    boolean foldable;
    String design;
    String packaging;
    String supplier;
    double rating;
    String status;

    
    public Stand(int id, String type, String material, String color, double price, String brand,int height, int width, String shape, String usage, double weight,String manufacturer, String country, int warranty, boolean foldabl , String design, String packaging, String supplier, double rating, String status) {

        this.id = id;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.height = height;
        this.width = width;
        this.shape = shape;
        this.usage = usage;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.country = country;
        this.warranty = warranty;
        this.foldable = foldable;
        this.design = design;
        this.packaging = packaging;
        this.supplier = supplier;
        this.rating = rating;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Shape: " + shape);
        System.out.println("Usage: " + usage);
        System.out.println("Weight: " + weight);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Warranty: " + warranty);
        System.out.println("Foldable: " + foldable);
        System.out.println("Design: " + design);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("Rating: " + rating);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}