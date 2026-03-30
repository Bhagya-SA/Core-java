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
		System.out.println("---------------------------------------------------------");
		
		System.out.println(state.gethighwayNameByIndex(7));
		System.out.println("---------------------------------------------------------");
		
		System.out.println(state.getIndexByhighwayName("NH 19"));
		System.out.println("---------------------------------------------------------");
		
		state.updateHighwayName("NH 66" , "NH 68");
		System.out.println("The updated highway names is as follows :");
		state.getHighwayNames();
		System.out.println("---------------------------------------------------------");
		
		
		
        
    }
}