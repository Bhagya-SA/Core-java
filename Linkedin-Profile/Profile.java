class Profile {

    int profileId;
    String designation;
    String company;

     public Profile(int profileId, String designation, String company) {
        this.profileId = profileId;
        this.designation = designation;
        this.company = company;
    }

    public void displayProfileInfo() {
        System.out.println("Profile Id : " + this.profileId);
        System.out.println("Designation : " + this.designation);
        System.out.println("Company : " + this.company);
    }
}
