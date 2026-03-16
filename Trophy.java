class Trophy {

    int id;
    String name;
    String type;
    String material;
    String color;
    double height;
    double weight;
    double price;
    String manufacturer;
    String country;
    String event;
    int year;
    String category;
    String winnerName;
    String organizer;
    String engraving;
    String packaging;
    double rating;
    boolean limitedEdition;
    String status;

    
    public Trophy(int id, String name, String type, String material, String color, double height,double weight, double price, String manufacturer, String country, String event,int year, String category, String winnerName, String organizer, String engraving,String packaging, double rating, boolean limitedEdition, String status) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.material = material;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.price = price;
        this.manufacturer = manufacturer;
        this.country = country;
        this.event = event;
        this.year = year;
        this.category = category;
        this.winnerName = winnerName;
        this.organizer = organizer;
        this.engraving = engraving;
        this.packaging = packaging;
        this.rating = rating;
        this.limitedEdition = limitedEdition;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Event: " + event);
        System.out.println("Year: " + year);
        System.out.println("Category: " + category);
        System.out.println("Winner Name: " + winnerName);
        System.out.println("Organizer: " + organizer);
        System.out.println("Engraving: " + engraving);
        System.out.println("Packaging: " + packaging);
        System.out.println("Rating: " + rating);
        System.out.println("Limited Edition: " + limitedEdition);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}