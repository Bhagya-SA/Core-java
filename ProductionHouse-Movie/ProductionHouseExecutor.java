class ProductionHouseExecutor {

    public static void main(String[] args) {

        /*ProductionHouse ph1 = new ProductionHouse();
        ph1.productionHouseId = 101;
        ph1.productionHouseName = "Sun Pictures";
        ph1.location = "India";
        Movie m1 = new Movie();
        m1.movieId = 201;
        m1.movieName = "Jailer";
        m1.genre = "Action";
        ph1.movie = m1;
        ph1.displayProductionHouseInfo();

        ProductionHouse ph2 = new ProductionHouse();
        ph2.productionHouseId = 102;
        ph2.productionHouseName = "Warner Bros";
        ph2.location = "USA";
        Movie m2 = new Movie();
        m2.movieId = 202;
        m2.movieName = "Batman";
        m2.genre = "Superhero";
        ph2.movie = m2;
        ph2.displayProductionHouseInfo();

        ProductionHouse ph3 = new ProductionHouse();
        ph3.productionHouseId = 103;
        ph3.productionHouseName = "Yash Raj Films";
        ph3.location = "India";
        Movie m3 = new Movie();
        m3.movieId = 203;
        m3.movieName = "Pathaan";
        m3.genre = "Action";
        ph3.movie = m3;
        ph3.displayProductionHouseInfo();

        ProductionHouse ph4 = new ProductionHouse();
        ph4.productionHouseId = 104;
        ph4.productionHouseName = "Marvel Studios";
        ph4.location = "USA";
        Movie m4 = new Movie();
        m4.movieId = 204;
        m4.movieName = "Avengers";
        m4.genre = "Superhero";
        ph4.movie = m4;
        ph4.displayProductionHouseInfo();

        ProductionHouse ph5 = new ProductionHouse();
        ph5.productionHouseId = 105;
        ph5.productionHouseName = "Dharma Productions";
        ph5.location = "India";
        Movie m5 = new Movie();
        m5.movieId = 205;
        m5.movieName = "Rocky Aur Rani";
        m5.movieName = "Rocky Aur Rani";
        m5.genre = "Romance";
        ph5.movie = m5;
        ph5.displayProductionHouseInfo();

        ProductionHouse ph6 = new ProductionHouse();
        ph6.productionHouseId = 106;
        ph6.productionHouseName = "Paramount Pictures";
        ph6.location = "USA";
        Movie m6 = new Movie();
        m6.movieId = 206;
        m6.movieName = "Mission Impossible";
        m6.genre = "Action";
        ph6.movie = m6;
        ph6.displayProductionHouseInfo();

        ProductionHouse ph7 = new ProductionHouse();
        ph7.productionHouseId = 107;
        ph7.productionHouseName = "Universal Pictures";
        ph7.location = "USA";
        Movie m7 = new Movie();
        m7.movieId = 207;
        m7.movieName = "Jurassic World";
        m7.genre = "Adventure";
        ph7.movie = m7;
        ph7.displayProductionHouseInfo();

        ProductionHouse ph8 = new ProductionHouse();
        ph8.productionHouseId = 108;
        ph8.productionHouseName = "20th Century Studios";
        ph8.location = "USA";
        Movie m8 = new Movie();
        m8.movieId = 208;
        m8.movieName = "Avatar";
        m8.genre = "Sci-Fi";
        ph8.movie = m8;
        ph8.displayProductionHouseInfo();

        ProductionHouse ph9 = new ProductionHouse();
        ph9.productionHouseId = 109;
        ph9.productionHouseName = "Red Chillies Entertainment";
        ph9.location = "India";
        Movie m9 = new Movie();
        m9.movieId = 209;
        m9.movieName = "Chennai Express";
        m9.genre = "Comedy";
        ph9.movie = m9;
        ph9.displayProductionHouseInfo();

        ProductionHouse ph10 = new ProductionHouse();
        ph10.productionHouseId = 110;
        ph10.productionHouseName = "Pixar";
        ph10.location = "USA";
        Movie m10 = new Movie();
        m10.movieId = 210;
        m10.movieName = "Toy Story";
        m10.genre = "Animation";
        ph10.movie = m10;
        ph10.displayProductionHouseInfo();

        ProductionHouse ph11 = new ProductionHouse();
        ph11.productionHouseId = 111;
        ph11.productionHouseName = "DreamWorks";
        ph11.location = "USA";
        Movie m11 = new Movie();
        m11.movieId = 211;
        m11.movieName = "Shrek";
        m11.genre = "Animation";
        ph11.movie = m11;
        ph11.displayProductionHouseInfo();

        ProductionHouse ph12 = new ProductionHouse();
        ph12.productionHouseId = 112;
        ph12.productionHouseName = "Columbia Pictures";
        ph12.location = "USA";
        Movie m12 = new Movie();
        m12.movieId = 212;
        m12.movieName = "Spider-Man";
        m12.genre = "Superhero";
        ph12.movie = m12;
        ph12.displayProductionHouseInfo();

        ProductionHouse ph13 = new ProductionHouse();
        ph13.productionHouseId = 113;
        ph13.productionHouseName = "Village Roadshow";
        ph13.location = "Australia";
        Movie m13 = new Movie();
        m13.movieId = 213;
        m13.movieName = "The Matrix";
        m13.genre = "Sci-Fi";
        ph13.movie = m13;
        ph13.displayProductionHouseInfo();

        ProductionHouse ph14 = new ProductionHouse();
        ph14.productionHouseId = 114;
        ph14.productionHouseName = "Studio Ghibli";
        ph14.location = "Japan";
        Movie m14 = new Movie();
        m14.movieId = 214;
        m14.movieName = "Spirited Away";
        m14.genre = "Fantasy";
        ph14.movie = m14;
        ph14.displayProductionHouseInfo();

        ProductionHouse ph15 = new ProductionHouse();
        ph15.productionHouseId = 115;
        ph15.productionHouseName = "Lionsgate";
        ph15.location = "USA";
        Movie m15 = new Movie();
        m15.movieId = 215;
        m15.movieName = "John Wick";
        m15.genre = "Action";
        ph15.movie = m15;
        ph15.displayProductionHouseInfo();

        ProductionHouse ph16 = new ProductionHouse();
        ph16.productionHouseId = 116;
        ph16.productionHouseName = "A24";
        ph16.location = "USA";
        Movie m16 = new Movie();
        m16.movieId = 216;
        m16.movieName = "Everything Everywhere All At Once";
        m16.genre = "Sci-Fi";
        ph16.movie = m16;
        ph16.displayProductionHouseInfo();

        ProductionHouse ph17 = new ProductionHouse();
        ph17.productionHouseId = 117;
        ph17.productionHouseName = "Blue Sky Studios";
        ph17.location = "USA";
        Movie m17 = new Movie();
        m17.movieId = 217;
        m17.movieName = "Ice Age";
        m17.genre = "Animation";
        ph17.movie = m17;
        ph17.displayProductionHouseInfo();

        ProductionHouse ph18 = new ProductionHouse();
        ph18.productionHouseId = 118;
        ph18.productionHouseName = "Legendary Pictures";
        ph18.location = "USA";
        Movie m18 = new Movie();
        m18.movieId = 218;
        m18.movieName = "Godzilla vs Kong";
        m18.genre = "Monster";
        ph18.movie = m18;
        ph18.displayProductionHouseInfo();

        ProductionHouse ph19 = new ProductionHouse();
        ph19.productionHouseId = 119;
        ph19.productionHouseName = "Plan B Entertainment";
        ph19.location = "USA";
        Movie m19 = new Movie();
        m19.movieId = 219;
        m19.movieName = "World War Z";
        m19.genre = "Thriller";
        ph19.movie = m19;
        ph19.displayProductionHouseInfo();

        ProductionHouse ph20 = new ProductionHouse();
        ph20.productionHouseId = 120;
        ph20.productionHouseName = "Reliance Entertainment";
        ph20.location = "India";
        Movie m20 = new Movie();
        m20.movieId = 220;
        m20.movieName = "Sooryavanshi";
        m20.genre = "Action";
        ph20.movie = m20;
        ph20.displayProductionHouseInfo();*/

        Movie m1 = new Movie(201, "Jailer", "Action");
        ProductionHouse ph1 = new ProductionHouse(101, "Sun Pictures", "India", m1);
        ph1.displayProductionHouseInfo();

        Movie m2 = new Movie(202, "Batman", "Superhero");
        ProductionHouse ph2 = new ProductionHouse(102, "Warner Bros", "USA", m2);
        ph2.displayProductionHouseInfo();

        Movie m3 = new Movie(203, "Pathaan", "Action");
        ProductionHouse ph3 = new ProductionHouse(103, "Yash Raj Films", "India", m3);
        ph3.displayProductionHouseInfo();

        Movie m4 = new Movie(204, "Avengers", "Superhero");
        ProductionHouse ph4 = new ProductionHouse(104, "Marvel Studios", "USA", m4);
        ph4.displayProductionHouseInfo();

        Movie m5 = new Movie(205, "Rocky Aur Rani", "Romance");
        ProductionHouse ph5 = new ProductionHouse(105, "Dharma Productions", "India", m5);
        ph5.displayProductionHouseInfo();

        Movie m6 = new Movie(206, "Mission Impossible", "Action");
        ProductionHouse ph6 = new ProductionHouse(106, "Paramount Pictures", "USA", m6);
        ph6.displayProductionHouseInfo();

        Movie m7 = new Movie(207, "Jurassic World", "Adventure");
        ProductionHouse ph7 = new ProductionHouse(107, "Universal Pictures", "USA", m7);
        ph7.displayProductionHouseInfo();

        Movie m8 = new Movie(208, "Avatar", "Sci-Fi");
        ProductionHouse ph8 = new ProductionHouse(108, "20th Century Studios", "USA", m8);
        ph8.displayProductionHouseInfo();

        Movie m9 = new Movie(209, "Chennai Express", "Comedy");
        ProductionHouse ph9 = new ProductionHouse(109, "Red Chillies Entertainment", "India", m9);
        ph9.displayProductionHouseInfo();

        Movie m10 = new Movie(210, "Toy Story", "Animation");
        ProductionHouse ph10 = new ProductionHouse(110, "Pixar", "USA", m10);
        ph10.displayProductionHouseInfo();

        Movie m11 = new Movie(211, "Shrek", "Animation");
        ProductionHouse ph11 = new ProductionHouse(111, "DreamWorks", "USA", m11);
        ph11.displayProductionHouseInfo();

        Movie m12 = new Movie(212, "Spider-Man", "Superhero");
        ProductionHouse ph12 = new ProductionHouse(112, "Columbia Pictures", "USA", m12);
        ph12.displayProductionHouseInfo();

        Movie m13 = new Movie(213, "The Matrix", "Sci-Fi");
        ProductionHouse ph13 = new ProductionHouse(113, "Village Roadshow", "Australia", m13);
        ph13.displayProductionHouseInfo();

        Movie m14 = new Movie(214, "Spirited Away", "Fantasy");
        ProductionHouse ph14 = new ProductionHouse(114, "Studio Ghibli", "Japan", m14);
        ph14.displayProductionHouseInfo();

        Movie m15 = new Movie(215, "John Wick", "Action");
        ProductionHouse ph15 = new ProductionHouse(115, "Lionsgate", "USA", m15);
        ph15.displayProductionHouseInfo();

        Movie m16 = new Movie(216, "Everything Everywhere All At Once", "Sci-Fi");
        ProductionHouse ph16 = new ProductionHouse(116, "A24", "USA", m16);
        ph16.displayProductionHouseInfo();

        Movie m17 = new Movie(217, "Ice Age", "Animation");
        ProductionHouse ph17 = new ProductionHouse(117, "Blue Sky Studios", "USA", m17);
        ph17.displayProductionHouseInfo();

        Movie m18 = new Movie(218, "Godzilla vs Kong", "Monster");
        ProductionHouse ph18 = new ProductionHouse(118, "Legendary Pictures", "USA", m18);
        ph18.displayProductionHouseInfo();

        Movie m19 = new Movie(219, "World War Z", "Thriller");
        ProductionHouse ph19 = new ProductionHouse(119, "Plan B Entertainment", "USA", m19);
        ph19.displayProductionHouseInfo();

        Movie m20 = new Movie(220, "Sooryavanshi", "Action");
        ProductionHouse ph20 = new ProductionHouse(120, "Reliance Entertainment", "India", m20);
        ph20.displayProductionHouseInfo();
    }
}
