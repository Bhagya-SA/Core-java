class NetFlix {

    NetFlixMoviePage movies[] = new NetFlixMoviePage[5];
    int index;

    public boolean addMovie(NetFlixMoviePage movie) {

        boolean isMovieAdded = false;

        boolean isMovieIdValid = false;
        boolean isTitleValid = false;
        boolean isSeasonsValid = false;
        boolean isGenreValid = false;
        boolean isYearValid = false;
        boolean isLanguageValid = false;
        boolean isRatingValid = false;

        int movieId = movie.getMovieId();
        if (movieId > 0) {
            isMovieIdValid = true;
        }

        String title = movie.getTitle();
        if (title != null && !title.isEmpty()) {
            isTitleValid = true;
        }

        int seasons = movie.getSeasons();
        if (seasons >= 0) {
            isSeasonsValid = true;
        }

        String genre = movie.getGenre();
        if (genre != null && !genre.isEmpty()) {
            isGenreValid = true;
        }

        int year = movie.getYear();
        if (year > 1900) {
            isYearValid = true;
        }

        String language = movie.getLanguage();
        if (language != null && !language.isEmpty()) {
            isLanguageValid = true;
        }

        int rating = movie.getRating();
        if (rating >= 0 && rating <= 10) {
            isRatingValid = true;
        }

        if (isMovieIdValid && isTitleValid && isSeasonsValid &&
            isGenreValid && isYearValid && isLanguageValid &&
            isRatingValid) {

            isMovieAdded = true;
            movies[index++] = movie;
        }

        return isMovieAdded;
    }

    public void getMovieDetails() {

        System.out.println("The Netflix movie details are as follows :");

        for (NetFlixMoviePage movie : movies) {

            if (movie != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Movie Id : " + movie.getMovieId());
                System.out.println("Title : " + movie.getTitle());
                System.out.println("Seasons : " + movie.getSeasons());
                System.out.println("Genre : " + movie.getGenre());
                System.out.println("Year : " + movie.getYear());
                System.out.println("Language : " + movie.getLanguage());
                System.out.println("Rating : " + movie.getRating() + "/10");
                System.out.println("--------------------------------------------");
            }
        }
    }
}