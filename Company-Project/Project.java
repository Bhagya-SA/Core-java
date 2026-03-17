class Project {

    int projectId;
    String projectName;
    String projectType;

    public Project(int projectId, String projectName, String projectType) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectType = projectType;
    }

    public void displayProjectInfo() {
        System.out.println("Project Id : " + this.projectId);
        System.out.println("Project Name : " + this.projectName);
        System.out.println("Project Type : " + this.projectType);
    }
}
