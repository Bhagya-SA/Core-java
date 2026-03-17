class Playstore {
    int storeId;
    String storeName;
    String location;
    int totalDownloads;
    Application application;

     public Playstore(int storeId, String storeName, String location, int totalDownloads, Application application) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.totalDownloads = totalDownloads;
        this.application = application;
    }

    public void displayStoreInfo() {
        System.out.println("Store Id : " + this.storeId);
        System.out.println("Store Name : " + this.storeName);
        System.out.println("Store Location : " + this.location);
        System.out.println("Total Downloads : " + this.totalDownloads);
        this.application.displayAppInfo();
        System.out.println("----------------------------------------");
    }
}
