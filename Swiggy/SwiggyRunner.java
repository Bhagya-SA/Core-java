class SwiggyRunner {

    public static void main(String[] food) {

        Swiggy swiggy = new Swiggy();

        SwiggyOrder orderOne = new SwiggyOrder();
        orderOne.setOrderId(1);
        orderOne.setRestaurantName("The Gourmet Kitchen");
        orderOne.setAmount(500);
        orderOne.setItem("Pasta");
        orderOne.setQuantity(2);
        orderOne.setStatus("Delivered");
        orderOne.setDeliveryTime(30);

        boolean isOrderAdded = swiggy.addOrder(orderOne);
        System.out.println(isOrderAdded);

        SwiggyOrder orderTwo = new SwiggyOrder();
        orderTwo.setOrderId(2);
        orderTwo.setRestaurantName("Spice Villa");
        orderTwo.setAmount(300);
        orderTwo.setItem("Biryani");
        orderTwo.setQuantity(1);
        orderTwo.setStatus("On the way");
        orderTwo.setDeliveryTime(25);

        isOrderAdded = swiggy.addOrder(orderTwo);
        System.out.println(isOrderAdded);

        SwiggyOrder orderThree = new SwiggyOrder();
        orderThree.setOrderId(3);
        orderThree.setRestaurantName("Sushi World");
        orderThree.setAmount(800);
        orderThree.setItem("Sushi Platter");
        orderThree.setQuantity(3);
        orderThree.setStatus("Delivered");
        orderThree.setDeliveryTime(40);

        isOrderAdded = swiggy.addOrder(orderThree);
        System.out.println(isOrderAdded);

        SwiggyOrder orderFour = new SwiggyOrder();
        orderFour.setOrderId(4);
        orderFour.setRestaurantName("Burger Hub");
        orderFour.setAmount(200);
        orderFour.setItem("Cheeseburger");
        orderFour.setQuantity(2);
        orderFour.setStatus("Cancelled");
        orderFour.setDeliveryTime(0);

        isOrderAdded = swiggy.addOrder(orderFour);
        System.out.println(isOrderAdded);

        SwiggyOrder orderFive = new SwiggyOrder();
        orderFive.setOrderId(5);
        orderFive.setRestaurantName("La Fiesta");
        orderFive.setAmount(600);
        orderFive.setItem("Tacos");
        orderFive.setQuantity(3);
        orderFive.setStatus("Delivered");
        orderFive.setDeliveryTime(35);

        isOrderAdded = swiggy.addOrder(orderFive);
        System.out.println(isOrderAdded);

        swiggy.getOrderDetails();
    }
}