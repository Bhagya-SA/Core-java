class Zomato {

    RestaurantPage restaurants[] = new RestaurantPage[5];
    int index;

    public boolean addRestaurant(RestaurantPage restaurant) {

        boolean isRestaurantAdded = false;

        boolean isIdValid = false;
        boolean isNameValid = false;
        boolean isRatingValid = false;
        boolean isCuisineValid = false;
        boolean isCostValid = false;
        boolean isLocationValid = false;
        boolean isReviewsValid = false;

        int id = restaurant.getId();
        if (id > 0) {
            isIdValid = true;
        }

        String name = restaurant.getName();
        if (name != null && !name.isEmpty()) {
            isNameValid = true;
        }

        int rating = restaurant.getRating();
        if (rating >= 0) {
            isRatingValid = true;
        }

        String cuisine = restaurant.getCuisine();
        if (cuisine != null && !cuisine.isEmpty()) {
            isCuisineValid = true;
        }

        int costForTwo = restaurant.getCostForTwo();
        if (costForTwo >= 0) {
            isCostValid = true;
        }

        String location = restaurant.getLocation();
        if (location != null && !location.isEmpty()) {
            isLocationValid = true;
        }

        int reviews = restaurant.getReviews();
        if (reviews >= 0) {
            isReviewsValid = true;
        }

        if (isIdValid && isNameValid && isRatingValid && isCuisineValid &&
            isCostValid && isLocationValid && isReviewsValid) {

            isRestaurantAdded = true;
            restaurants[index++] = restaurant;
        }

        return isRestaurantAdded;
    }

    public void getRestaurantDetails() {

        System.out.println("The restaurant details are as follows :");

        for (RestaurantPage restaurant : restaurants) {

            if (restaurant != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Restaurant Id : " + restaurant.getId());
                System.out.println("Name : " + restaurant.getName());
                System.out.println("Rating : " + restaurant.getRating());
                System.out.println("Cuisine : " + restaurant.getCuisine());
                System.out.println("Cost for Two : " + restaurant.getCostForTwo());
                System.out.println("Location : " + restaurant.getLocation());
                System.out.println("Number of Reviews : " + restaurant.getReviews());
                System.out.println("--------------------------------------------");
            }
        }
    }
}