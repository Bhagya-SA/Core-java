class OrderSystem {

    public static void sendToKitchen(String order) {
        System.out.println("OrderSystem: Sending order '" + order + "' to kitchen");
        Kitchen.receiveOrder(order);
    }
}