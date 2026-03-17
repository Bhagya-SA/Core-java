class ProductionHouse {

    int productionHouseId;
    String productionHouseName;
    String location;
    Movie movie;

    public ProductionHouse(int productionHouseId, String productionHouseName, String location, Movie movie) {
        this.productionHouseId = productionHouseId;
        this.productionHouseName = productionHouseName;
        this.location = location;
        this.movie = movie;
    }

    public void displayProductionHouseInfo() {
        System.out.println("Production House Id : " + this.productionHouseId);
        System.out.println("Production House Name : " + this.productionHouseName);
        System.out.println("Location : " + this.location);
        this.movie.displayMovieInfo();
        System.out.println("--------------------------------------------------");
    }
}



