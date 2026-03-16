class Google {

    
    int id;
    String productName;
    String category;
    double price;
    String version;
    String developer;
    int releaseYear;
    String platform;
    double rating;
    int users;
    String license;
    String language;
    String size;
    String updateDate;
    boolean isFree;
    String country;
    String supportEmail;
    String website;
    String company;
    String status;

   
    public Google(int id, String productName, String category, double price, String version,String developer, int releaseYear, String platform, double rating, int users,String license, String language, String size, String updateDate, boolean isFree,String country, String supportEmail, String website, String company, String status) {

        this.id = id;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.version = version;
        this.developer = developer;
        this.releaseYear = releaseYear;
        this.platform = platform;
        this.rating = rating;
        this.users = users;
        this.license = license;
        this.language = language;
        this.size = size;
        this.updateDate = updateDate;
        this.isFree = isFree;
        this.country = country;
        this.supportEmail = supportEmail;
        this.website = website;
        this.company = company;
        this.status = status;
    }

    // Method to display details
    public void toDisplayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Version: " + version);
        System.out.println("Developer: " + developer);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Platform: " + platform);
        System.out.println("Rating: " + rating);
        System.out.println("Users: " + users);
        System.out.println("License: " + license);
        System.out.println("Language: " + language);
        System.out.println("Size: " + size);
        System.out.println("Update Date: " + updateDate);
        System.out.println("Is Free: " + isFree);
        System.out.println("Country: " + country);
        System.out.println("Support Email: " + supportEmail);
        System.out.println("Website: " + website);
        System.out.println("Company: " + company);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}

