class HospitalExecutor {

	public static void main(String[] args) {
	
		Hospital hospital = new Hospital();
		
		Doctor doctorOne = new Doctor();
		
		doctorOne.setDoctorId(1001);
		doctorOne.setDoctorName("Chandana");
		hospital.addDoctor(doctorOne);
		
		Doctor doctorTwo = new Doctor();
		doctorTwo.setDoctorId(1002);
		doctorTwo.setDoctorName("Hima");
		hospital.addDoctor(doctorTwo);
		
		Doctor doctorThree = new Doctor();
		doctorThree.setDoctorId(1003);
		doctorThree.setDoctorName("Bhagyashree");
		hospital.addDoctor(doctorThree);
		
		
		hospital.getDoctorDetails();
	
	}


}