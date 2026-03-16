class InvoiceExecutor {

    public static void main(String[] invoices) {

        Invoice invoice1 = new Invoice(101);
        System.out.println("Invoice Id : " + invoice1.invoiceId);

        Invoice invoice2 = new Invoice(5001, 1200.50);
        System.out.println("Order Id : " + invoice2.orderId);
        System.out.println("Total Amount : " + invoice2.totalAmount);

        Invoice invoice3 = new Invoice("2026-03-14");
        System.out.println("Invoice Date : " + invoice3.invoiceDate);

        Invoice invoice4 = new Invoice(1000.0, 80.0);
        System.out.println("Subtotal : " + invoice4.subtotal);
        System.out.println("Tax : " + invoice4.tax);

        Invoice invoice5 = new Invoice(50.0);
        System.out.println("Discount : " + invoice5.discount);

        Invoice invoice6 = new Invoice("Paid", "2026-03-20");
        System.out.println("Payment Status : " + invoice6.paymentStatus);
        System.out.println("Due Date : " + invoice6.dueDate);

        Invoice invoice7 = new Invoice("123 Main St", 1000.0);
        System.out.println("Billing Address : " + invoice7.billingAddress);
        System.out.println("Subtotal : " + invoice7.subtotal);

        Invoice invoice8 = new Invoice("John Doe", true);
        System.out.println("Customer Name : " + invoice8.customerName);
        System.out.println("Is Paid : " + invoice8.isPaid);

        Invoice invoice9 = new Invoice(102, "2026-03-10");
        System.out.println("Invoice Id : " + invoice9.invoiceId);
        System.out.println("Invoice Date : " + invoice9.invoiceDate);

        Invoice invoice10 = new Invoice(1200.50, false);
        System.out.println("Total Amount : " + invoice10.totalAmount);
        System.out.println("Is Paid : " + invoice10.isPaid);

        Invoice invoice11 = new Invoice("Special Discount", 103);
        System.out.println("Notes : " + invoice11.notes);
        System.out.println("Invoice Id : " + invoice11.invoiceId);

        Invoice invoice12 = new Invoice("Alice", "456 Elm St", 1500.0);
        System.out.println("Customer Name : " + invoice12.customerName);
        System.out.println("Billing Address : " + invoice12.billingAddress);
        System.out.println("Total Amount : " + invoice12.totalAmount);

    }
}