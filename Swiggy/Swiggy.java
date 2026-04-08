class Swiggy {

    SwiggyOrder orders[] = new SwiggyOrder[5];
    int index;

    public boolean addOrder(SwiggyOrder order) {

        boolean isOrderAdded = false;

        boolean isOrderIdValid = false;
        boolean isRestaurantNameValid = false;
        boolean isAmountValid = false;
        boolean isItemValid = false;
        boolean isQuantityValid = false;
        boolean isStatusValid = false;
        boolean isDeliveryTimeValid = false;

        int orderId = order.getOrderId();
        if (orderId > 0) {
            isOrderIdValid = true;
        }

        String restaurantName = order.getRestaurantName();
        if (restaurantName != null && !restaurantName.isEmpty()) {
            isRestaurantNameValid = true;
        }

        int amount = order.getAmount();
        if (amount >= 0) {
            isAmountValid = true;
        }

        String item = order.getItem();
        if (item != null && !item.isEmpty()) {
            isItemValid = true;
        }

        int quantity = order.getQuantity();
        if (quantity > 0) {
            isQuantityValid = true;
        }

        String status = order.getStatus();
        if (status != null && !status.isEmpty()) {
            isStatusValid = true;
        }

        int deliveryTime = order.getDeliveryTime();
        if (deliveryTime > 0) {
            isDeliveryTimeValid = true;
        }

        if (isOrderIdValid && isRestaurantNameValid && isAmountValid &&
            isItemValid && isQuantityValid && isStatusValid && isDeliveryTimeValid) {

            isOrderAdded = true;
            orders[index++] = order;
        }

        return isOrderAdded;
    }

    public void getOrderDetails() {

        System.out.println("The Swiggy order details are as follows :");

        for (SwiggyOrder order : orders) {

            if (order != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Order Id : " + order.getOrderId());
                System.out.println("Restaurant Name : " + order.getRestaurantName());
                System.out.println("Amount : " + order.getAmount());
                System.out.println("Item : " + order.getItem());
                System.out.println("Quantity : " + order.getQuantity());
                System.out.println("Status : " + order.getStatus());
                System.out.println("Delivery Time (minutes) : " + order.getDeliveryTime());
                System.out.println("--------------------------------------------");
            }
        }
    }
}