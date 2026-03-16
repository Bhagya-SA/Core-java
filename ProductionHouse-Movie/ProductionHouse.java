class ProductionHouse {

    int productionHouseId;
    String productionHouseName;
    String location;
    Movie movie;

    public void displayProductionHouseInfo() {
        System.out.println("Production House Id : " + this.productionHouseId);
        System.out.println("Production House Name : " + this.productionHouseName);
        System.out.println("Location : " + this.location);
        this.movie.displayMovieInfo();
        System.out.println("--------------------------------------------------");
    }
}



