class Profile {

    int profileId;
    String designation;
    String company;

    public void displayProfileInfo() {
        System.out.println("Profile Id : " + this.profileId);
        System.out.println("Designation : " + this.designation);
        System.out.println("Company : " + this.company);
    }
}