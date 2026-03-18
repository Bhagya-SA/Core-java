class WireExecutor {
	
    public static void main(String[] wires) {
		
        Wire wire = new Wire("PowerLine", "Copper Wire", 15.0, 100.0, "Copper", "Red", "PVC", 10.0, "01-02-2026", "01-02-2030", "PowerTech Ltd.", "India", true, true, 12.5, "PL20260201", true, "Roll", 5.0, 4.6);

        wire.getWireDetails();
    }
}