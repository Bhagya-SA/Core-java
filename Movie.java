class Movie {

    static String movieTitle;
    static String director;
    static String producer;
    static String releaseDate;
    static String genre;

    public static boolean getPropertiesInfo(String title, String dir, String prod, String relDate, String gName) {

        boolean isPropertiesValidate = false;

        boolean isTitleValidate = false;
        boolean isDirectorValidate = false;
        boolean isProducerValidate = false;
        boolean isReleaseDateValidate = false;
        boolean isGenreValidate = false;

        if(title != null && !title.isEmpty()) {
            System.out.println("Movie title is validated");
            movieTitle = title;
            isTitleValidate = true;
        } else {
            System.out.println("Movie title is not validated");
        }

        if(dir != null && !dir.isEmpty()) {
            System.out.println("Director is validated");
            director = dir;
            isDirectorValidate = true;
        } else {
            System.out.println("Director is not validated");
        }

        if(prod != null && !prod.isEmpty()) {
            System.out.println("Producer is validated");
            producer = prod;
            isProducerValidate = true;
        } else {
            System.out.println("Producer is not validated");
        }

        if(relDate != null && !relDate.isEmpty()) {
            System.out.println("Release date is validated");
            releaseDate = relDate;
            isReleaseDateValidate = true;
        } else {
            System.out.println("Release date is not validated");
        }

        if(gName != null && !gName.isEmpty()) {
            System.out.println("Genre is validated");
            genre = gName;
            isGenreValidate = true;
        } else {
            System.out.println("Genre is not validated");
        }

        if(isTitleValidate && isDirectorValidate && isProducerValidate && isReleaseDateValidate && isGenreValidate) {
            isPropertiesValidate = true;
        }

        return isPropertiesValidate;
    }

    public static void displayMovieInfo() {
        System.out.println("Movie Title : " + movieTitle);
        System.out.println("Director : " + director);
        System.out.println("Producer : " + producer);
        System.out.println("Release Date : " + releaseDate);
        System.out.println("Genre : " + genre);
    }

   
}