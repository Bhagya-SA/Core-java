class Salon {

    int salonId;
    String customerName;
    String location;
    Service service;

     public Salon(int salonId, String customerName, String location, Service service) {
        this.salonId = salonId;
        this.customerName = customerName;
        this.location = location;
        this.service = service;
    }

    public void displaySalonInfo() {
        System.out.println("Salon Id : " + this.salonId);
        System.out.println("Customer Name : " + this.customerName);
        System.out.println("Location : " + this.location);
        this.service.displayServiceInfo();
        System.out.println("--------------------------------------------------");
    }
}


