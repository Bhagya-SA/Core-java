class Museum {
    int museumId;
    String museumName;
    String location;
    int totalDiamonds;
    Diamond diamond;

     public Museum(int museumId, String museumName, String location, int totalDiamonds, Diamond diamond) {
        this.museumId = museumId;
        this.museumName = museumName;
        this.location = location;
        this.totalDiamonds = totalDiamonds;
        this.diamond diamond;

    public void displayMuseumInfo() {
        System.out.println("Museum Id : " + this.museumId);
        System.out.println("Museum Name : " + this.museumName);
        System.out.println("Location : " + this.location);
        System.out.println("Total Diamonds : " + this.totalDiamonds);
        this.diamond.displayDiamondInfo();
        System.out.println("----------------------------------------");
    }
}
