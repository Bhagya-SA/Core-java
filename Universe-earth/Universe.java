class Universe {

    int universeId;
    String universeName;
    String galaxy;
    Earth earth;

    public void displayUniverseInfo() {
        System.out.println("Universe Id : " + this.universeId);
        System.out.println("Universe Name : " + this.universeName);
        System.out.println("Galaxy : " + this.galaxy);
        this.earth.displayEarthInfo();
        System.out.println("--------------------------------------------------");
    }
}

