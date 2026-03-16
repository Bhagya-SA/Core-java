class Factory {
    int factoryId;
    String factoryName;
    String location;
    int totalWorkers;
    Machine machine;

    public void displayFactoryInfo() {
        System.out.println("Factory Id : " + this.factoryId);
        System.out.println("Factory Name : " + this.factoryName);
        System.out.println("Factory Location : " + this.location);
        System.out.println("Total Workers : " + this.totalWorkers);
        this.machine.displayMachineInfo();
        System.out.println("----------------------------------------");
    }
}