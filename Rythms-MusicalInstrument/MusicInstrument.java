class MusicInstrument {
    int instrumentId;
    String instrumentName;
    String instrumentType;

    public void displayInstrumentInfo() {
        System.out.println("Instrument Id : " + this.instrumentId);
        System.out.println("Instrument Name : " + this.instrumentName);
        System.out.println("Instrument Type : " + this.instrumentType);
    }
}