class Waiter {

    public static void takeOrder(int tableNumber, String order) {
        System.out.println("Waiter: Taking order '" + order + "' from table " + tableNumber);
        OrderSystem.sendToKitchen(order);
    }
}