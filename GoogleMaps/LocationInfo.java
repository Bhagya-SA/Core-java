public class LocationInfo {

    private int placeId;
    private String name;
    private int ratings;
    private String city;
    private int reviews;
    private String category;
    private double distance;

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }
    public int getPlaceId() {
        return placeId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
    public int getRatings() {
        return ratings;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }


    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
    public int getReviews() {
        return reviews;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    public double getDistance() {
        return distance;
    }
}