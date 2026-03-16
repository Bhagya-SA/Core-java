class DepartmentExecutor {

    public static void main(String[] dept) {

        Department d1 = new Department(101);
        System.out.println("Dept Id : " + d1.deptId);

        Department d2 = new Department("Computer Science");
        System.out.println("Dept Name : " + d2.deptName);

        Department d3 = new Department("Dr. Smith", 20L);
        System.out.println("Head : " + d3.headOfDepartment);
        System.out.println("Number of Teachers : " + d3.numberOfTeachers);

        Department d4 = new Department(500L);
        System.out.println("Number of Students : " + d4.numberOfStudents);

        Department d5 = new Department("Main Building", 3.0);  
        System.out.println("Building : " + d5.building);
        System.out.println("Budget (as dummy value) : " + d5.budget);

        Department d6 = new Department("cs@university.edu", 1000000.0, true);
        System.out.println("Email : " + d6.email);
        System.out.println("Budget : " + d6.budget);
		System.out.println("Has Research center : " + d6.hasResearchCenter);

        Department d7 = new Department(true);
        System.out.println("Has Research Center : " + d7.hasResearchCenter);

        Department d8 = new Department("CS Department", "www.csdept.edu", 0);
        System.out.println("Description : " + d8.description);
        System.out.println("Website : " + d8.website);

        Department d9 = new Department(102, "Mechanical");
        System.out.println("Dept Id : " + d9.deptId);
        System.out.println("Dept Name : " + d9.deptName);

        Department d10 = new Department(15, 300L);
        System.out.println("Number of Teachers : " + d10.numberOfTeachers);
        System.out.println("Number of Students : " + d10.numberOfStudents);

        Department d11 = new Department(2000000.0, false);
        System.out.println("Budget : " + d11.budget);
        System.out.println("Has Research Center : " + d11.hasResearchCenter);

        Department d12 = new Department("Civil", "Dr. John", "Building B");
        System.out.println("Dept Name : " + d12.deptName);
        System.out.println("Head : " + d12.headOfDepartment);
        System.out.println("Building : " + d12.building);
    }
}