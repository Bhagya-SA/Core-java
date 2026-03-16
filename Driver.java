class Driver {

    int driverId;
    String firstName;
    String lastName;
    int age;
    String phone;
    String email;
    String address;
    String licenseNumber;
    String vehicleType;
    int experience;
    String joiningDate;
    boolean isActive;

    Driver(int driverId){
        this.driverId = driverId;
    }

    Driver(String firstName){
        this.firstName = firstName;
    }

    Driver(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Driver(int age , String firstName){
        this.age = age;
		this.firstName = firstName;
    }

    Driver(String phone, String email , int age){
        this.phone = phone;
        this.email = email;
		this.age = age;
    }

    Driver(String address, String licenseNumber , boolean isActive){
        this.address = address;
        this.licenseNumber = licenseNumber;
		this.isActive = isActive;
    }

    Driver(String vehicleType, int experience){
        this.vehicleType = vehicleType;
        this.experience = experience;
    }

    Driver(String joiningDate , boolean isActive){
        this.joiningDate = joiningDate;
		this.isActive = isActive;
		
    }

    Driver(boolean isActive){
        this.isActive = isActive;
    }

    Driver(int driverId, String firstName , boolean isActive){
        this.driverId = driverId;
        this.firstName = firstName;
		this.isActive = isActive;
    }

    Driver(String vehicleType, String licenseNumber, boolean isActive, int age){
        this.vehicleType = vehicleType;
        this.licenseNumber = licenseNumber;
        this.isActive = isActive;
		this.age = age;
    }

    Driver(String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}