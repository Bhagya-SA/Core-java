class Map {

    int id;
    String type;
    String region;
    String scale;
    String color;
    double price;
    String publisher;
    int year;
    String language;
    String material;
    double width;
    double height;
    String projection;
    boolean laminated;
    String usage;
    String country;
    String manufacturer;
    String packaging;
    double rating;
    String status;

    
    public Map(int id, String type, String region, String scale, String color, double price,String publisher, int year, String language, String material, double width,double height, String projection, boolean laminated, String usage,String country, String manufacturer, String packaging, double rating, String status) {

        this.id = id;
        this.type = type;
        this.region = region;
        this.scale = scale;
        this.color = color;
        this.price = price;
        this.publisher = publisher;
        this.year = year;
        this.language = language;
        this.material = material;
        this.width = width;
        this.height = height;
        this.projection = projection;
        this.laminated = laminated;
        this.usage = usage;
        this.country = country;
        this.manufacturer = manufacturer;
        this.packaging = packaging;
        this.rating = rating;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Region: " + region);
        System.out.println("Scale: " + scale);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Language: " + language);
        System.out.println("Material: " + material);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Projection: " + projection);
        System.out.println("Laminated: " + laminated);
        System.out.println("Usage: " + usage);
        System.out.println("Country: " + country);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Packaging: " + packaging);
        System.out.println("Rating: " + rating);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}