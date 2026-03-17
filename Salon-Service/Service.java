class Service {

    int serviceId;
    String serviceName;
    double price;

    public Service(int serviceId, String serviceName, double price) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.price = price;
    }

    public void displayServiceInfo() {
        System.out.println("Service Id : " + this.serviceId);
        System.out.println("Service Name : " + this.serviceName);
        System.out.println("Price : " + this.price);
    }
}
