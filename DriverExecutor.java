class DriverExecutor {

    public static void main(String[] drivers) {

        Driver driver1 = new Driver(101);
        System.out.println("Driver Id : " + driver1.driverId);

        Driver driver2 = new Driver("John");
        System.out.println("First Name : " + driver2.firstName);

        Driver driver3 = new Driver("Jane", "Doe");
        System.out.println("First Name : " + driver3.firstName);
        System.out.println("Last Name : " + driver3.lastName);

        Driver driver4 = new Driver(30, "Mike");
        System.out.println("Age : " + driver4.age);
        System.out.println("First Name : " + driver4.firstName);

        Driver driver5 = new Driver("1234567890", "jane@example.com", 28);
        System.out.println("Phone : " + driver5.phone);
        System.out.println("Email : " + driver5.email);
        System.out.println("Age : " + driver5.age);

        Driver driver6 = new Driver("123 Main St", "LIC12345", true);
        System.out.println("Address : " + driver6.address);
        System.out.println("License Number : " + driver6.licenseNumber);
        System.out.println("Is Active : " + driver6.isActive);

        Driver driver7 = new Driver("Car", 5);
        System.out.println("Vehicle Type : " + driver7.vehicleType);
        System.out.println("Experience : " + driver7.experience);

        Driver driver8 = new Driver("2022-01-01", true);
        System.out.println("Joining Date : " + driver8.joiningDate);
        System.out.println("Is Active : " + driver8.isActive);

        Driver driver9 = new Driver(false);
        System.out.println("Is Active : " + driver9.isActive);

        Driver driver10 = new Driver(101, "Alice" , true);
        System.out.println("Driver Id : " + driver10.driverId);
        System.out.println("First Name : " + driver10.firstName);
		System.out.println("Is Active : " + driver10.isActive);

        Driver driver11 = new Driver("Bike", "LIC98765", true, 25);
        System.out.println("Vehicle Type : " + driver11.vehicleType);
        System.out.println("License Number : " + driver11.licenseNumber);
        System.out.println("Is Active : " + driver11.isActive);
        System.out.println("Age : " + driver11.age);

        Driver driver12 = new Driver("Tom", "Hanks", "456 Elm St");
        System.out.println("First Name : " + driver12.firstName);
        System.out.println("Last Name : " + driver12.lastName);
        System.out.println("Address : " + driver12.address);

    }
}