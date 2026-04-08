class NetflixRunner {

    public static void main(String[] series) {

        NetFlix netflix = new NetFlix();

        NetFlixMoviePage movieOne = new NetFlixMoviePage();
        movieOne.setMovieId(1);
        movieOne.setTitle("Stranger Things");
        movieOne.setSeasons(4);
        movieOne.setGenre("Sci-Fi");
        movieOne.setYear(2016);
        movieOne.setLanguage("English");
        movieOne.setRating(9);

        boolean isMovieAdded = netflix.addMovie(movieOne);
        System.out.println(isMovieAdded);

        NetFlixMoviePage movieTwo = new NetFlixMoviePage();
        movieTwo.setMovieId(2);
        movieTwo.setTitle("Money Heist");
        movieTwo.setSeasons(5);
        movieTwo.setGenre("Crime");
        movieTwo.setYear(2017);
        movieTwo.setLanguage("Spanish");
        movieTwo.setRating(8);

        isMovieAdded = netflix.addMovie(movieTwo);
        System.out.println(isMovieAdded);

        NetFlixMoviePage movieThree = new NetFlixMoviePage();
        movieThree.setMovieId(3);
        movieThree.setTitle("The Crown");
        movieThree.setSeasons(5);
        movieThree.setGenre("Historical Drama");
        movieThree.setYear(2016);
        movieThree.setLanguage("English");
        movieThree.setRating(9);

        isMovieAdded = netflix.addMovie(movieThree);
        System.out.println(isMovieAdded);

        NetFlixMoviePage movieFour = new NetFlixMoviePage();
        movieFour.setMovieId(4);
        movieFour.setTitle("Squid Game");
        movieFour.setSeasons(1);
        movieFour.setGenre("Thriller");
        movieFour.setYear(2021);
        movieFour.setLanguage("Korean");
        movieFour.setRating(9);

        isMovieAdded = netflix.addMovie(movieFour);
        System.out.println(isMovieAdded);

        NetFlixMoviePage movieFive = new NetFlixMoviePage();
        movieFive.setMovieId(5);
        movieFive.setTitle("Bridgerton");
        movieFive.setSeasons(2);
        movieFive.setGenre("Romance");
        movieFive.setYear(2020);
        movieFive.setLanguage("English");
        movieFive.setRating(8);

        isMovieAdded = netflix.addMovie(movieFive);
        System.out.println(isMovieAdded);

        netflix.getMovieDetails();
    }
}