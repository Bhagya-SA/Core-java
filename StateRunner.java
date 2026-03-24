class StateRunner {

    public static void main(String[] highwayNames) {
    
        State state = new State();
        
        state.addHighwayName("NH 44");
        state.addHighwayName("NH 48");
        state.addHighwayName("NH 16");
        state.addHighwayName("NH 66");
        state.addHighwayName("NH 19");
        state.addHighwayName("NH 27");
        state.addHighwayName("NH 52");
        state.addHighwayName("NH 30");
        state.addHighwayName("NH 75");
        
        state.getHighwayNames();
        
    }
}