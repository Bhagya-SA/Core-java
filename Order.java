class Order {

    int orderId;
    int customerId;
    String orderDate;
    double totalAmount;
    String status;
    String paymentMethod;
    String shippingAddress;
    String billingAddress;
    int itemCount;
    double discount;
    double tax;
    boolean isDelivered;
	String deliveryDate;

    Order(int orderId){
        this.orderId = orderId;
    }

    Order(int customerId , String orderDate){
        this.customerId = customerId;
		this.orderDate = orderDate;
    }

    Order(String orderDate){
        this.orderDate = orderDate;
    }

    Order(double totalAmount){
        this.totalAmount = totalAmount;
    }

    Order(String status, String paymentMethod){
        this.status = status;
        this.paymentMethod = paymentMethod;
    }

    Order(String shippingAddress, String billingAddress, double totalAmount){
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
		this.totalAmount = totalAmount;
    }

    Order(int itemCount, double discount){
        this.itemCount = itemCount;
        this.discount = discount;
    }

    Order(double tax, boolean isDelivered){
        this.tax = tax;
        this.isDelivered = isDelivered;
    }

    Order(int orderId, int customerId){
        this.orderId = orderId;
        this.customerId = customerId;
    }

    Order(String status, double totalAmount){
        this.status = status;
        this.totalAmount = totalAmount;
    }

    Order(int itemCount, double discount, double tax){
        this.itemCount = itemCount;
        this.discount = discount;
        this.tax = tax;
    }

    Order(String orderDate, String deliveryDate, boolean isDelivered){
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.isDelivered = isDelivered;
    }
}