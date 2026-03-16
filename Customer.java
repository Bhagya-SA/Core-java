class Customer {

    int customerId;
    String firstName;
    String lastName;
    int age;
    String gender;
    String email;
    String phone;
    String address;
    String city;
    String state;
    String country;
    boolean isPremiumMember;

    
    Customer(int customerId){
        this.customerId = customerId;
    }

    
    Customer(String firstName){
        this.firstName = firstName;
    }

    
    Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    Customer(int age, String gender){
        this.age = age;
        this.gender = gender;
    }

    
    Customer(String email, String phone, boolean isPremiumMember){
        this.email = email;
        this.phone = phone;
        this.isPremiumMember = isPremiumMember;
    }

    
    Customer(String address, String city, String state){
        this.address = address;
        this.city = city;
        this.state = state;
    }

    
    Customer(String state, String country, int age){
        this.state = state;
        this.country = country;
        this.age = age;
    }

    
    Customer(boolean isPremiumMember){
        this.isPremiumMember = isPremiumMember;
    }

    
    Customer(int customerId, String firstName, String lastName){
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    Customer(String email, boolean isPremiumMember){
        this.email = email;
        this.isPremiumMember = isPremiumMember;
    }

    
    Customer(int age, String city, String state, String country){
        this.age = age;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    
    Customer(String firstName, String lastName, String address, String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
    }
}