public class RestaurantPage {

    private int id;
    private String name;
    private int rating;
    private String cuisine;
    private int costForTwo;
    private String location;
    private int reviews;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCostForTwo(int costForTwo) {
        this.costForTwo = costForTwo;
    }

    public int getCostForTwo() {
        return costForTwo;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public int getReviews() {
        return reviews;
    }
}