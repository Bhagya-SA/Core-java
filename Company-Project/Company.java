class Company {

    int companyId;
    String companyName;
    String location;
    Project project;

     public Company(int companyId, String companyName, String location, Project project) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.location = location;
        this.project = project;
    }

    public void displayCompanyInfo() {
        System.out.println("Company Id : " + this.companyId);
        System.out.println("Company Name : " + this.companyName);
        System.out.println("Location : " + this.location);
        this.project.displayProjectInfo();
        System.out.println("--------------------------------------------------");
    }
}
