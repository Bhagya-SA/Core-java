class OrderExecutor {

    public static void main(String[] orders) {


        Order order1 = new Order(1001);
        System.out.println("Order ID: " + order1.orderId);

        Order order2 = new Order(501, "2026-03-14");
        System.out.println("Customer ID: " + order2.customerId + ", Order Date: " + order2.orderDate);

        Order order3 = new Order("2026-03-15");
        System.out.println("Order Date: " + order3.orderDate);

        Order order4 = new Order(250.75);
        System.out.println("Total Amount: $" + order4.totalAmount);

        Order order5 = new Order("Shipped", "Credit Card");
        System.out.println("Status: " + order5.status + ", Payment Method: " + order5.paymentMethod);

        Order order6 = new Order("123 Main St", "456 Elm St", 500.50);
        System.out.println("Shipping Address: " + order6.shippingAddress + ", Billing Address: " + order6.billingAddress + ", Total Amount: $" + order6.totalAmount);

        Order order7 = new Order(5, 20.0);
        System.out.println("Item Count: " + order7.itemCount + ", Discount: $" + order7.discount);

        Order order8 = new Order(15.0, true);
        System.out.println("Tax: $" + order8.tax + ", Delivered: " + order8.isDelivered);

        Order order9 = new Order(1002, 502);
        System.out.println("Order ID: " + order9.orderId + ", Customer ID: " + order9.customerId);

        Order order10 = new Order("Processing", 300.0);
        System.out.println("Status: " + order10.status + ", Total Amount: $" + order10.totalAmount);

        Order order11 = new Order(3, 10.0, 2.5);
        System.out.println("Item Count: " + order11.itemCount + ", Discount: $" + order11.discount + ", Tax: $" + order11.tax);

        Order order12 = new Order("2026-03-14", "2026-03-16", false);
        System.out.println("Order Date: " + order12.orderDate + ", Delivery Date: " + order12.deliveryDate + ", Delivered: " + order12.isDelivered);
    }
}