class Rythms {
    int storeId;
    String storeName;
    String location;
    int totalInstruments;
    MusicInstrument instrument;

     public Rythms(int storeId, String storeName, String location, int totalInstruments, MusicInstrument instrument) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.totalInstruments = totalInstruments;
        this.instrument = instrument;
    }


    public void displayStoreInfo() {
        System.out.println("Store Id : " + this.storeId);
        System.out.println("Store Name : " + this.storeName);
        System.out.println("Store Location : " + this.location);
        System.out.println("Total Instruments : " + this.totalInstruments);
        this.instrument.displayInstrumentInfo();
        System.out.println("----------------------------------------");
    }
}
