class WallPaper {

    int id;
    String brand;
    String type;
    String color;
    String design;
    double price;
    int length;
    int width;
    String material;
    String finish;
    boolean washable;
    String roomType;
    String country;
    String manufacturer;
    int warranty;
    double rating;
    String texture;
    String installType;
    String availability;
    String pattern;

    public WallPaper(int id,String brand,String type,String color,String design,double price,int length,int width,String material,String finish,boolean washable,String roomType,String country,String manufacturer,int warranty,double rating,String texture,String installType,String availability,String pattern){

        this.id=id;
        this.brand=brand;
        this.type=type;
        this.color=color;
        this.design=design;
        this.price=price;
        this.length=length;
        this.width=width;
        this.material=material;
        this.finish=finish;
        this.washable=washable;
        this.roomType=roomType;
        this.country=country;
        this.manufacturer=manufacturer;
        this.warranty=warranty;
        this.rating=rating;
        this.texture=texture;
        this.installType=installType;
        this.availability=availability;
        this.pattern=pattern;
    }
	
	public void toDisplayDetails(){
    System.out.println("ID: " + id);
    System.out.println("Brand: " + brand);
    System.out.println("Type: " + type);
    System.out.println("Color: " + color);
    System.out.println("Design: " + design);
    System.out.println("Price: " + price);
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.println("Material: " + material);
    System.out.println("Finish: " + finish);
    System.out.println("Washable: " + washable);
    System.out.println("Room Type: " + roomType);
    System.out.println("Country: " + country);
    System.out.println("Manufacturer: " + manufacturer);
    System.out.println("Warranty: " + warranty);
    System.out.println("Rating: " + rating);
    System.out.println("Texture: " + texture);
    System.out.println("Install Type: " + installType);
    System.out.println("Availability: " + availability);
    System.out.println("Pattern: " + pattern);
    System.out.println("-----------------------------------");
}

    
}

