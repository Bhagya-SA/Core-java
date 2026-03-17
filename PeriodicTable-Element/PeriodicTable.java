class PeriodicTable {
    int tableId;
    String tableName;
    String discoveryLocation;
    int totalElements;
    Element element;

     public PeriodicTable(int tableId, String tableName, String discoveryLocation, int totalElements, Element element) {
        this.tableId = tableId;
        this.tableName = tableName;
        this.discoveryLocation = discoveryLocation;
        this.totalElements = totalElements;
        this.element = element;
    }

    public void displayTableInfo() {
        System.out.println("Table Id : " + this.tableId);
        System.out.println("Table Name : " + this.tableName);
        System.out.println("Discovery Location : " + this.discoveryLocation);
        System.out.println("Total Elements : " + this.totalElements);
        this.element.displayElementInfo();
        System.out.println("----------------------------------------");
    }
}
