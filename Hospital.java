class Hospital {

	Doctor doctors[] = new Doctor[3];
	int index;
	
	public boolean addDoctor(Doctor doctor) {
	
		boolean isDoctorAdded = false;
		HospitalValidator validator = new HospitalValidator();
		
		boolean isDoctorDetailsValidated = validator.validateDoctor(doctor);
		
		
		if(isDoctorDetailsValidated == true) {
			isDoctorAdded = true;
			this.doctors[index++] = doctor;	
			
		}
		return isDoctorAdded;
	}
	public void getDoctorDetails() {
		
		for(Doctor doctor : doctors) {
			if(doctor != null) {
			System.out.println("---------------------------------------------");
			System.out.println("Doctor Id is : " + doctor.getDoctorId());
			System.out.println("Doctor name is : " + doctor.getDoctorName());
			System.out.println("---------------------------------------------");
		}
		}
	}

}