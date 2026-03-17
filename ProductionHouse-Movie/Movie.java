class Movie {

    int movieId;
    String movieName;
    String genre;

     public Movie(int movieId, String movieName, String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
    }

    public void displayMovieInfo() {
        System.out.println("Movie Id : " + this.movieId);
        System.out.println("Movie Name : " + this.movieName);
        System.out.println("Genre : " + this.genre);
    }
}
