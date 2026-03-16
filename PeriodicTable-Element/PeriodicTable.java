class PeriodicTable {
    int tableId;
    String tableName;
    String discoveryLocation;
    int totalElements;
    Element element;

    public void displayTableInfo() {
        System.out.println("Table Id : " + this.tableId);
        System.out.println("Table Name : " + this.tableName);
        System.out.println("Discovery Location : " + this.discoveryLocation);
        System.out.println("Total Elements : " + this.totalElements);
        this.element.displayElementInfo();
        System.out.println("----------------------------------------");
    }
}