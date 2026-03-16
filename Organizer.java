class Organizer {

    int id;
    String name;
    String type;
    String material;
    String color;
    double length; // in cm
    double width;  // in cm
    double height; // in cm
    double weight; // in grams
    int compartments;
    boolean lockable;
    boolean portable;
    String brand;
    String manufacturer;
    String country;
    double price;
    String usage;
    String design;
    double rating;
    String status;

    
    public Organizer(int id, String name, String type, String material, String color,double length, double width, double height, double weight, int compartments,boolean lockable, boolean portable, String brand, String manufacturer,String country, double price, String usage, String design, double rating, String status) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.compartments = compartments;
        this.lockable = lockable;
        this.portable = portable;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.usage = usage;
        this.design = design;
        this.rating = rating;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " g");
        System.out.println("Compartments: " + compartments);
        System.out.println("Lockable: " + lockable);
        System.out.println("Portable: " + portable);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Price: " + price);
        System.out.println("Usage: " + usage);
        System.out.println("Design: " + design);
        System.out.println("Rating: " + rating);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}