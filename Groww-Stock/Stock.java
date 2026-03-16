class Stock {

    int stockId;
    String stockName;
    String sector;

    public void displayStockInfo() {
        System.out.println("Stock Id : " + this.stockId);
        System.out.println("Stock Name : " + this.stockName);
        System.out.println("Sector : " + this.sector);
    }
}