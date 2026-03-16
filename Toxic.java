class Toxic {

    int id;
    String title;
    String genre;
    String language;
    String director;
    String producer;
    String hero;
    String heroine;
    int releaseYear;
    double budget;
    double collection;
    int duration;
    String musicDirector;
    String productionHouse;
    String country;
    String certificate;
    double rating;
    String platform;
    boolean sequel;
    String status;

    
    public Toxic(int id, String title, String genre, String language, String director,String producer, String hero, String heroine, int releaseYear,double budget, double collection, int duration, String musicDirector,String productionHouse, String country, String certificate,double rating, String platform, boolean sequel, String status) {

        this.id = id;
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.director = director;
        this.producer = producer;
        this.hero = hero;
        this.heroine = heroine;
        this.releaseYear = releaseYear;
        this.budget = budget;
        this.collection = collection;
        this.duration = duration;
        this.musicDirector = musicDirector;
        this.productionHouse = productionHouse;
        this.country = country;
        this.certificate = certificate;
        this.rating = rating;
        this.platform = platform;
        this.sequel = sequel;
        this.status = status;
    }

    
    public void toDisplayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Language: " + language);
        System.out.println("Director: " + director);
        System.out.println("Producer: " + producer);
        System.out.println("Hero: " + hero);
        System.out.println("Heroine: " + heroine);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Budget: " + budget);
        System.out.println("Collection: " + collection);
        System.out.println("Duration: " + duration);
        System.out.println("Music Director: " + musicDirector);
        System.out.println("Production House: " + productionHouse);
        System.out.println("Country: " + country);
        System.out.println("Certificate: " + certificate);
        System.out.println("Rating: " + rating);
        System.out.println("Platform: " + platform);
        System.out.println("Sequel: " + sequel);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}