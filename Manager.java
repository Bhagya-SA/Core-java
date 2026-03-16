class Manager {

    int managerId;
    String firstName;
    String lastName;
    int age;
    String gender;
    String email;
    String phone;
    String department;
    int teamSize;
    double salary;
    String officeLocation;
    boolean isPermanent;

    Manager(int managerId){
        this.managerId = managerId;
    }

    Manager(String firstName){
        this.firstName = firstName;
    }

    Manager(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Manager(int age, String gender){
        this.age = age;
        this.gender = gender;
    }

    Manager(String email, String phone , int age){
        this.email = email;
        this.phone = phone;
		this.age = age;
		
    }

    Manager(String department, int teamSize){
        this.department = department;
        this.teamSize = teamSize;
    }

    Manager(double salary){
        this.salary = salary;
    }

    Manager(String officeLocation, boolean isPermanent){
        this.officeLocation = officeLocation;
        this.isPermanent = isPermanent;
    }

    Manager(int managerId, String firstName , double salary){
        this.managerId = managerId;
        this.firstName = firstName;
		this.salary = salary;
    }

    Manager(String department, double salary){
        this.department = department;
        this.salary = salary;
    }

    Manager(boolean isPermanent , double salary){
        this.isPermanent = isPermanent;
		this.salary = salary;
    }

    Manager(String firstName, String lastName, String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
}