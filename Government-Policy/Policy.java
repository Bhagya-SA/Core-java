class Policy {

    int policyId;
    String policyName;
    String policyType;

    public void displayPolicyInfo() {
        System.out.println("Policy Id : " + this.policyId);
        System.out.println("Policy Name : " + this.policyName);
        System.out.println("Policy Type : " + this.policyType);
    }
}