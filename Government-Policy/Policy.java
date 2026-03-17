class Policy {

    int policyId;
    String policyName;
    String policyType;

     public Policy(int policyId, String policyName, String policyType) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.policyType = policyType;
    }

    public void displayPolicyInfo() {
        System.out.println("Policy Id : " + this.policyId);
        System.out.println("Policy Name : " + this.policyName);
        System.out.println("Policy Type : " + this.policyType);
    }
}
