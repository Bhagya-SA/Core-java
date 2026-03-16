class InventoryExecutor {

    public static void main(String[] invent) {

        Inventory inventory1 = new Inventory(101);
        System.out.println("Inventory Id : " + inventory1.inventoryId);

        Inventory inventory2 = new Inventory(501, 2000L);
        System.out.println("Product Id : " + inventory2.productId);
        System.out.println("Quantity In Stock : " + inventory2.quantityInStock);

        Inventory inventory3 = new Inventory(50, 100);
        System.out.println("Reorder Level : " + inventory3.reorderLevel);
        System.out.println("Reorder Quantity : " + inventory3.reorderQuantity);

        Inventory inventory4 = new Inventory("Warehouse A");
        System.out.println("Warehouse Location : " + inventory4.warehouseLocation);

        Inventory inventory5 = new Inventory("2026-03-14", "ABC Suppliers");
        System.out.println("Last Updated : " + inventory5.lastUpdated);
        System.out.println("Supplier Name : " + inventory5.supplierName);

        Inventory inventory6 = new Inventory(250.75);
        System.out.println("Cost Price : " + inventory6.costPrice);

        Inventory inventory7 = new Inventory(500.0, true);
        System.out.println("Selling Price : " + inventory7.sellingPrice);
        System.out.println("Is Expired : " + inventory7.isExpired);

        Inventory inventory8 = new Inventory("BATCH123", 1500L);
        System.out.println("Batch Number : " + inventory8.batchNumber);
        System.out.println("Quantity In Stock : " + inventory8.quantityInStock);

        Inventory inventory9 = new Inventory("2026-12-31", true);
        System.out.println("Expiry Date : " + inventory9.expiryDate);
        System.out.println("Is Expired : " + inventory9.isExpired);

        Inventory inventory10 = new Inventory(201, 502 , false);
        System.out.println("Inventory Id : " + inventory10.inventoryId);
        System.out.println("Product Id : " + inventory10.productId);
		System.out.println("Is Expired : " + inventory10.isExpired);

        Inventory inventory11 = new Inventory("Warehouse B", 300.50);
        System.out.println("Warehouse Location : " + inventory11.warehouseLocation);
        System.out.println("Cost Price : " + inventory11.costPrice);

        Inventory inventory12 = new Inventory("BATCH789", "2026-09-30", true);
        System.out.println("Batch Number : " + inventory12.batchNumber);
        System.out.println("Expiry Date : " + inventory12.expiryDate);
        System.out.println("Is Expired : " + inventory12.isExpired);

    }
}