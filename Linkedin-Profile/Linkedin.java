class Linkedin {

    int linkedinId;
    String userName;
    String email;
    Profile profile;

    public void displayLinkedinInfo() {
        System.out.println("LinkedIn Id : " + this.linkedinId);
        System.out.println("User Name : " + this.userName);
        System.out.println("Email : " + this.email);
        this.profile.displayProfileInfo();
        System.out.println("--------------------------------------------------");
    }
}



