class CustomerExecutor {

	public static void main(String[] customers) {
	
		Customer c1 = new Customer(1);
		System.out.println("Customer Id : " + c1.customerId);

		Customer c2 = new Customer("Ram");
		System.out.println("First Name : " + c2.firstName);

		Customer c3 = new Customer("Ram","Sharma");
		System.out.println("First Name : " + c3.firstName);
		System.out.println("Last Name : " + c3.lastName);

		Customer c4 = new Customer(25,"Male");
		System.out.println("Age : " + c4.age);
		System.out.println("Gender : " + c4.gender);

		Customer c5 = new Customer("ram@gmail.com","9876543210",true);
		System.out.println("Email : " + c5.email);
		System.out.println("Phone : " + c5.phone);

		Customer c6 = new Customer("MG Road","Bangalore","Karnataka");
		System.out.println("Address : " + c6.address);
		System.out.println("City : " + c6.city);
		System.out.println("State : " + c6.state);

		Customer c7 = new Customer("Karnataka","India",30);
		System.out.println("State : " + c7.state);
		System.out.println("Country : " + c7.country);

		Customer c8 = new Customer(true);
		System.out.println("Premium Member : " + c8.isPremiumMember);

		Customer c9 = new Customer(101,"Lakshmi","Rao");
		System.out.println("Customer Id : " + c9.customerId);
		System.out.println("First Name : " + c9.firstName);
		System.out.println("Last Name : " + c9.lastName);

		Customer c10 = new Customer("lakshmi@gmail.com",true);
		System.out.println("Email : " + c10.email);
		System.out.println("Premium Member : " + c10.isPremiumMember);

		Customer c11 = new Customer(30,"Mysore","Karnataka","India");
		System.out.println("Age : " + c11.age);
		System.out.println("City : " + c11.city);
		System.out.println("State : " + c11.state);
		System.out.println("Country : " + c11.country);

		Customer c12 = new Customer("Sita","Rao","Indiranagar","Bangalore");
		System.out.println("First Name : " + c12.firstName);
		System.out.println("Last Name : " + c12.lastName);
		System.out.println("Address : " + c12.address);
		System.out.println("City : " + c12.city);
	}
}