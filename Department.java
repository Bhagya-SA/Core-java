class Department {

    int deptId;
    String deptName;
    String headOfDepartment;
    int numberOfTeachers;
    long numberOfStudents;
    String building;
    String phone;
    String email;
    double budget;
    boolean hasResearchCenter;
    String description;
    String website;

    
    Department(int deptId){
        this.deptId = deptId;
    }

    
    Department(String deptName){
        this.deptName = deptName;
    }

    
    Department(String headOfDepartment, long numberOfTeachers){  
        this.headOfDepartment = headOfDepartment;
        this.numberOfTeachers = (int)numberOfTeachers;
    }

    
    Department(long numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }

   
    Department(String building, double budget){  
        this.building = building;
        this.budget = budget;
    }

   
    Department(String email, double budget, boolean hasResearchCenter){
        this.email = email;
        this.budget = budget;
		this.hasResearchCenter = hasResearchCenter;
    }

    
    Department(boolean hasResearchCenter){
        this.hasResearchCenter = hasResearchCenter;
    }

    
    Department(String description, String website, int dummy){
        this.description = description;
        this.website = website;
    }

    
    Department(int deptId, String deptName){
        this.deptId = deptId;
        this.deptName = deptName;
    }

    
    Department(int numberOfTeachers, long numberOfStudents){
        this.numberOfTeachers = numberOfTeachers;
        this.numberOfStudents = numberOfStudents;
    }

    
    Department(double budget, boolean hasResearchCenter){
        this.budget = budget;
        this.hasResearchCenter = hasResearchCenter;
    }

    
    Department(String deptName, String headOfDepartment, String building){
        this.deptName = deptName;
        this.headOfDepartment = headOfDepartment;
        this.building = building;
    }
}