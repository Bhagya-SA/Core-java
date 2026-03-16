class HospitalExecutor {

    public static void main(String[] hospitals) {

        Hospital hospital1 = new Hospital(101);
        System.out.println("Hospital Id : " + hospital1.hospitalId);

        Hospital hospital2 = new Hospital("City Hospital");
        System.out.println("Hospital Name : " + hospital2.name);

        Hospital hospital3 = new Hospital("Downtown", "9876543210");
        System.out.println("Location : " + hospital3.location);
        System.out.println("Phone : " + hospital3.phone);

        Hospital hospital4 = new Hospital("info@cityhospital.com", 200);
        System.out.println("Email : " + hospital4.email);
        System.out.println("Total Beds : " + hospital4.totalBeds);

        Hospital hospital5 = new Hospital(50, 20);
        System.out.println("Available Beds : " + hospital5.availableBeds);
        System.out.println("Doctors Count : " + hospital5.doctorsCount);

        Hospital hospital6 = new Hospital(30, "911");
        System.out.println("Nurses Count : " + hospital6.nursesCount);
        System.out.println("Emergency Contact : " + hospital6.emergencyContact);

        Hospital hospital7 = new Hospital("Dr. Smith", true);
        System.out.println("Director Name : " + hospital7.directorName);
        System.out.println("Has Emergency : " + hospital7.hasEmergency);

        Hospital hospital8 = new Hospital(false);
        System.out.println("Has Emergency : " + hospital8.hasEmergency);

        Hospital hospital9 = new Hospital(102, "Green Valley Hospital", "Uptown");
        System.out.println("Hospital Id : " + hospital9.hospitalId);
        System.out.println("Hospital Name : " + hospital9.name);
		System.out.println("Location : " + hospital9.location);

        Hospital hospital10 = new Hospital("Uptown", 150 , 102);
        System.out.println("Location : " + hospital10.location);
        System.out.println("Total Beds : " + hospital10.totalBeds);
		System.out.println("Hospital Id : " + hospital10.hospitalId);
		

        Hospital hospital11 = new Hospital("1234567890", "contact@uptown.com", true);
        System.out.println("Phone : " + hospital11.phone);
        System.out.println("Email : " + hospital11.email);
        System.out.println("Has Emergency : " + hospital11.hasEmergency);

        Hospital hospital12 = new Hospital("Dr. Rao", "9876543210", 25);
        System.out.println("Director Name : " + hospital12.directorName);
        System.out.println("Established Date : " + hospital12.emergencyContact);
        System.out.println("Doctors Count : " + hospital12.doctorsCount);
    }
}