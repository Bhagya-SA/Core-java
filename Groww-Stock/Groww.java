class Groww {

    int growwId;
    String userName;
    String accountType;
    Stock stock;

     public Groww(int growwId, String userName, String accountType, Stock stock) {
        this.growwId = growwId;
        this.userName = userName;
        this.accountType = accountType;
        this.stock = stock;
    }

    public void displayGrowwInfo() {
        System.out.println("Groww Id : " + this.growwId);
        System.out.println("User Name : " + this.userName);
        System.out.println("Account Type : " + this.accountType);
        this.stock.displayStockInfo();
        System.out.println("--------------------------------------------------");
    }
}



