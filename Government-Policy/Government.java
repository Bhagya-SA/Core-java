class Government {

    int governmentId;
    String governmentName;
    String country;
    Policy policy;

     public Government(int governmentId, String governmentName, String country, Policy policy) {
        this.governmentId = governmentId;
        this.governmentName = governmentName;
        this.country = country;
        this.policy = policy;
    }

    public void displayGovernmentInfo() {
        System.out.println("Government Id : " + this.governmentId);
        System.out.println("Government Name : " + this.governmentName);
        System.out.println("Country : " + this.country);
        this.policy.displayPolicyInfo();
        System.out.println("--------------------------------------------------");
    }
}



