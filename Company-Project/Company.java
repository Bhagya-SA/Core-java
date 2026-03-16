class Company {

    int companyId;
    String companyName;
    String location;
    Project project;

    public void displayCompanyInfo() {
        System.out.println("Company Id : " + this.companyId);
        System.out.println("Company Name : " + this.companyName);
        System.out.println("Location : " + this.location);
        this.project.displayProjectInfo();
        System.out.println("--------------------------------------------------");
    }
}