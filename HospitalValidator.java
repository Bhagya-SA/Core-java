class HospitalValidator {

	public boolean validateDoctor(Doctor doctor) {
		boolean isDoctorDetailsValidated = false;
		
		boolean isDoctorIdValid = false;
		boolean isdoctorNameValid = false;
		
		int doctorId = doctor.getDoctorId();
		String doctorName = doctor.getDoctorName();
		
		if(doctor != null) {
		
			if(doctorId > 0) {
				isDoctorIdValid = true;
			}
			if(doctorName != null && !doctorName.isEmpty()) {
				isdoctorNameValid = true;
			}
		}
		if(isDoctorIdValid && isdoctorNameValid) {
			isDoctorDetailsValidated = true;
		}
		return isDoctorDetailsValidated;
	
	}

}