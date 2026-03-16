class Museum {
    int museumId;
    String museumName;
    String location;
    int totalDiamonds;
    Diamond diamond;

    public void displayMuseumInfo() {
        System.out.println("Museum Id : " + this.museumId);
        System.out.println("Museum Name : " + this.museumName);
        System.out.println("Location : " + this.location);
        System.out.println("Total Diamonds : " + this.totalDiamonds);
        this.diamond.displayDiamondInfo();
        System.out.println("----------------------------------------");
    }
}