class Earth {

    int earthId;
    String earthName;
    String continent;

    public Earth(int earthId, String earthName, String continent) {
        this.earthId = earthId;
        this.earthName = earthName;
        this.continent = continent;
    }

    public void displayEarthInfo() {
        System.out.println("Earth Id : " + this.earthId);
        System.out.println("Earth Name : " + this.earthName);
        System.out.println("Continent : " + this.continent);
    }
}

