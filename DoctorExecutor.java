class DoctorExecutor {

    public static void main(String[] doctors) {

        Doctor d1 = new Doctor(101);
        System.out.println("Doctor Id : " + d1.doctorId);

        Doctor d2 = new Doctor("Ram");
        System.out.println("First Name : " + d2.firstName);

        Doctor d3 = new Doctor("Ram","Sharma");
        System.out.println("First Name : " + d3.firstName);
        System.out.println("Last Name : " + d3.lastName);

        Doctor d4 = new Doctor(40,"Male");
        System.out.println("Age : " + d4.age);
        System.out.println("Gender : " + d4.gender);

        Doctor d5 = new Doctor("Cardiologist", true);
        System.out.println("Specialization : " + d5.specialization);

        Doctor d6 = new Doctor("9876543210", 1234567890L);
        System.out.println("Phone : " + d6.phone);

        Doctor d7 = new Doctor("City Hospital", 15);
        System.out.println("Hospital Name : " + d7.hospitalName);
        System.out.println("Experience : " + d7.experience);

        Doctor d8 = new Doctor(500.0);
        System.out.println("Consultation Fee : " + d8.consultationFee);

        Doctor d9 = new Doctor(true);
        System.out.println("Is Available : " + d9.isAvailable);

        Doctor d10 = new Doctor(102,"Lakshmi");
        System.out.println("Doctor Id : " + d10.doctorId);
        System.out.println("First Name : " + d10.firstName);

        Doctor d11 = new Doctor("Neurologist", 700.0);
        System.out.println("Specialization : " + d11.specialization);
        System.out.println("Consultation Fee : " + d11.consultationFee);

        Doctor d12 = new Doctor("Sita","Rao","City Hospital");
        System.out.println("First Name : " + d12.firstName);
        System.out.println("Last Name : " + d12.lastName);
        System.out.println("Hospital Name : " + d12.hospitalName);
    }
}