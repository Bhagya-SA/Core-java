class Kitchen {

    public static void receiveOrder(String order) {
        System.out.println("Kitchen: Order received for '" + order + "'");
        HeadChef.cook(order);
    }
}