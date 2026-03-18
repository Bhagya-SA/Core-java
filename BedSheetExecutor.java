class BedSheetExecutor {
	
    public static void main(String[] sheet) {
		
        BedSheet bedSheet = new BedSheet("SleepWell", "Cotton", "Blue", "Striped", 1200.0, 220.0, 180.0, true, true, "01-02-2026", "01-02-2030", "SleepWell Ltd.", "India", 150, "SW20260201", true, "Pack", 10.0, 4.8, "300 TC");

        bedSheet.getBedSheetDetails();
    }
}