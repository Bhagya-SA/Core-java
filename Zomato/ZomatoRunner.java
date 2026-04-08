class ZomatoRunner {

    public static void main(String[] foodApp) {

        Zomato zomato = new Zomato();

        RestaurantPage restaurantOne = new RestaurantPage();
        restaurantOne.setId(1);
        restaurantOne.setName("The Gourmet Kitchen");
        restaurantOne.setRating(5);
        restaurantOne.setCuisine("Italian");
        restaurantOne.setCostForTwo(1200);
        restaurantOne.setLocation("Mumbai");
        restaurantOne.setReviews(250);

        boolean isRestaurantAdded = zomato.addRestaurant(restaurantOne);
        System.out.println(isRestaurantAdded);

        RestaurantPage restaurantTwo = new RestaurantPage();
        restaurantTwo.setId(2);
        restaurantTwo.setName("Spice Villa");
        restaurantTwo.setRating(4);
        restaurantTwo.setCuisine("Indian");
        restaurantTwo.setCostForTwo(800);
        restaurantTwo.setLocation("Delhi");
        restaurantTwo.setReviews(180);

        isRestaurantAdded = zomato.addRestaurant(restaurantTwo);
        System.out.println(isRestaurantAdded);

        RestaurantPage restaurantThree = new RestaurantPage();
        restaurantThree.setId(3);
        restaurantThree.setName("Sushi World");
        restaurantThree.setRating(5);
        restaurantThree.setCuisine("Japanese");
        restaurantThree.setCostForTwo(1500);
        restaurantThree.setLocation("Bangalore");
        restaurantThree.setReviews(220);

        isRestaurantAdded = zomato.addRestaurant(restaurantThree);
        System.out.println(isRestaurantAdded);

        RestaurantPage restaurantFour = new RestaurantPage();
        restaurantFour.setId(4);
        restaurantFour.setName("Burger Hub");
        restaurantFour.setRating(4);
        restaurantFour.setCuisine("Fast Food");
        restaurantFour.setCostForTwo(600);
        restaurantFour.setLocation("Chennai");
        restaurantFour.setReviews(140);

        isRestaurantAdded = zomato.addRestaurant(restaurantFour);
        System.out.println(isRestaurantAdded);

        RestaurantPage restaurantFive = new RestaurantPage();
        restaurantFive.setId(5);
        restaurantFive.setName("La Fiesta");
        restaurantFive.setRating(5);
        restaurantFive.setCuisine("Mexican");
        restaurantFive.setCostForTwo(1000);
        restaurantFive.setLocation("Hyderabad");
        restaurantFive.setReviews(200);

        isRestaurantAdded = zomato.addRestaurant(restaurantFive);
        System.out.println(isRestaurantAdded);

        zomato.getRestaurantDetails();
    }
}