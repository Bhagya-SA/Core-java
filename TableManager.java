class TableManager {

    public static void seatManage(int tableNumber, String order) {
        System.out.println("TableManager: Seating table " + tableNumber);
        Waiter.takeOrder(tableNumber, order);
    }
}