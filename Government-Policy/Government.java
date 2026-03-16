class Government {

    int governmentId;
    String governmentName;
    String country;
    Policy policy;

    public void displayGovernmentInfo() {
        System.out.println("Government Id : " + this.governmentId);
        System.out.println("Government Name : " + this.governmentName);
        System.out.println("Country : " + this.country);
        this.policy.displayPolicyInfo();
        System.out.println("--------------------------------------------------");
    }
}



