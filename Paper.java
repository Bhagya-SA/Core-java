class Paper {

    int id;
    String brand;
    String type;
    String color;
    double price;
    String size;
    int quantity;
    String quality;
    String material;
    String usage;
    double weight;
    String thickness;
    String manufacturer;
    String country;
    boolean recycled;
    String texture;
    String packaging;
    String supplier;
    double rating;
    String status;

    
    public Paper(int id, String brand, String type, String color, double price, String size, int quantity, String quality, String material, String usage, double weight, String thickness, String manufacturer, String country, boolean recycled,String texture, String packaging, String supplier, double rating, String status) {

        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
        this.quality = quality;
        this.material = material;
        this.usage = usage;
        this.weight = weight;
        this.thickness = thickness;
        this.manufacturer = manufacturer;
        this.country = country;
        this.recycled = recycled;
        this.texture = texture;
        this.packaging = packaging;
        this.supplier = supplier;
        this.rating = rating;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Quantity: " + quantity);
        System.out.println("Quality: " + quality);
        System.out.println("Material: " + material);
        System.out.println("Usage: " + usage);
        System.out.println("Weight: " + weight);
        System.out.println("Thickness: " + thickness);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Recycled: " + recycled);
        System.out.println("Texture: " + texture);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("Rating: " + rating);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}