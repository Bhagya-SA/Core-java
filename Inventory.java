class Inventory {

    int inventoryId;
    int productId;
    long quantityInStock;
    int reorderLevel;
    int reorderQuantity;
    String warehouseLocation;
    String lastUpdated;
    String supplierName;
    double costPrice;
    double sellingPrice;
    String batchNumber;
    boolean isExpired;
	String expiryDate;

    Inventory(int inventoryId){
        this.inventoryId = inventoryId;
    }

    Inventory(int productId, long quantityInStock){
        this.productId = productId;
        this.quantityInStock = quantityInStock;
    }

    Inventory(int reorderLevel, int reorderQuantity){
        this.reorderLevel = reorderLevel;
        this.reorderQuantity = reorderQuantity;
    }

    Inventory(String warehouseLocation){
        this.warehouseLocation = warehouseLocation;
    }

    Inventory(String lastUpdated, String supplierName){
        this.lastUpdated = lastUpdated;
        this.supplierName = supplierName;
    }

    Inventory(double costPrice){
        this.costPrice = costPrice;
    }

    Inventory(double sellingPrice, boolean isExpired){
        this.sellingPrice = sellingPrice;
        this.isExpired = isExpired;
    }

    Inventory(String batchNumber , long quantityInStock){
        this.batchNumber = batchNumber;
		this.quantityInStock = quantityInStock;
    }

    Inventory(String expiryDate, boolean isExpired){
        this.expiryDate = expiryDate;
        this.isExpired = isExpired;
    }

    Inventory(int inventoryId, int productId ,boolean isExpired ){
        this.inventoryId = inventoryId;
        this.productId = productId;
		this.isExpired = isExpired;
    }

    Inventory(String warehouseLocation, double costPrice){
        this.warehouseLocation = warehouseLocation;
        this.costPrice = costPrice;
    }

    Inventory(String batchNumber, String expiryDate, boolean isExpired){
        this.batchNumber = batchNumber;
        this.expiryDate = expiryDate;
        this.isExpired = isExpired;
    }
}