class Machine {
    int machineId;
    String machineName;
    String machineType;

    public Machine(int machineId, String machineName, String machineType) {
        this.machineId = machineId;
        this.machineName = machineName;
        this.machineType = machineType;
    }

    public void displayMachineInfo() {
        System.out.println("Machine Id : " + this.machineId);
        System.out.println("Machine Name : " + this.machineName);
        System.out.println("Machine Type : " + this.machineType);
    }
}
