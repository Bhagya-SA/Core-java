class ManagerExecutor {

    public static void main(String[] managers) {

        Manager manager1 = new Manager(201);
        System.out.println("Manager ID: " + manager1.managerId);

        Manager manager2 = new Manager("Alice");
        System.out.println("First Name: " + manager2.firstName);

        Manager manager3 = new Manager("Bob", "Smith");
        System.out.println("Name: " + manager3.firstName + " " + manager3.lastName);

        Manager manager4 = new Manager(35, "Male");
        System.out.println("Age: " + manager4.age + ", Gender: " + manager4.gender);

        Manager manager5 = new Manager("alice@example.com", "1234567890", 30);
        System.out.println("Email: " + manager5.email + ", Phone: " + manager5.phone + ", Age: " + manager5.age);

        Manager manager6 = new Manager("IT", 10);
        System.out.println("Department: " + manager6.department + ", Team Size: " + manager6.teamSize);

        Manager manager7 = new Manager(75000.0);
        System.out.println("Salary: $" + manager7.salary);

        Manager manager8 = new Manager("New York", true);
        System.out.println("Office Location: " + manager8.officeLocation + ", Permanent: " + manager8.isPermanent);

        Manager manager9 = new Manager(102, "Carol", 90000.0);
        System.out.println("Manager ID: " + manager9.managerId + ", Name: " + manager9.firstName + ", Salary: $" + manager9.salary);

        Manager manager10 = new Manager("HR", 80000.0);
        System.out.println("Department: " + manager10.department + ", Salary: $" + manager10.salary);

        Manager manager11 = new Manager(true, 95000.0);
        System.out.println("Permanent: " + manager11.isPermanent + ", Salary: $" + manager11.salary);

        Manager manager12 = new Manager("Finance", "Johnson", "Finance");
        System.out.println("Name: " + manager12.firstName + " " + manager12.lastName + ", Department: " + manager12.department);
    }
}