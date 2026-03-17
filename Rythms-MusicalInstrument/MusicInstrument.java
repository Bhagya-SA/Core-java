class MusicInstrument {
    int instrumentId;
    String instrumentName;
    String instrumentType;
    
     public MusicInstrument(int instrumentId, String instrumentName, String instrumentType) {
        this.instrumentId = instrumentId;
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
    }

    public void displayInstrumentInfo() {
        System.out.println("Instrument Id : " + this.instrumentId);
        System.out.println("Instrument Name : " + this.instrumentName);
        System.out.println("Instrument Type : " + this.instrumentType);
    }
}
