class Invoice {

    int invoiceId;
    int orderId;
    String invoiceDate;
    double subtotal;
    double tax;
    double discount;
    double totalAmount;
    String paymentStatus;
    String dueDate;
    String billingAddress;
    String customerName;
    boolean isPaid;
	String notes;

    Invoice(int invoiceId){
        this.invoiceId = invoiceId;
    }

    Invoice(int orderId, double totalAmount){
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }

    Invoice(String invoiceDate){
        this.invoiceDate = invoiceDate;
    }

    Invoice(double subtotal, double tax){
        this.subtotal = subtotal;
        this.tax = tax;
    }

    Invoice(double discount){
        this.discount = discount;
    }

    Invoice(String paymentStatus, String dueDate){
        this.paymentStatus = paymentStatus;
        this.dueDate = dueDate;
    }

    Invoice(String billingAddress , double subtotal){
        this.billingAddress = billingAddress;
		this.subtotal = subtotal;
    }

    Invoice(String customerName, boolean isPaid){
        this.customerName = customerName;
        this.isPaid = isPaid;
    }

    Invoice(int invoiceId, String invoiceDate){
        this.invoiceId = invoiceId;
        this.invoiceDate = invoiceDate;
    }

    Invoice(double totalAmount, boolean isPaid){
        this.totalAmount = totalAmount;
        this.isPaid = isPaid;
    }

    Invoice(String notes , int invoiceId){
        this.notes = notes;
		this.invoiceId = invoiceId;
    }

    Invoice(String customerName, String billingAddress, double totalAmount){
        this.customerName = customerName;
        this.billingAddress = billingAddress;
        this.totalAmount = totalAmount;
    }
}