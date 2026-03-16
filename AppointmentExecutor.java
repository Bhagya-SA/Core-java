class AppointmentExecutor {

	public static void main(String[] appoints) {
	
		Appointment appointment1 = new Appointment(1);
		System.out.println("AppointmaentId : " + appointment1.appointmentId);
		
		Appointment appointment2 = new Appointment(67 , 101);
		System.out.println("PatientId is : " + appointment2.patientId);
		System.out.println("DoctorId is : " + appointment2.doctorId);
		
		
		Appointment appointment3 = new Appointment("15/3/20206");
		System.out.println("Appointment Date : " + appointment3.appointmentDate);
		
		Appointment appointment4 = new Appointment("10:00 AM" , "Available");
		System.out.println("Appointment Timings : " + appointment4.appointmentTime);
		System.out.println("Status : " + appointment4.status);
		
		Appointment appointment5 = new Appointment("Fever" , 101);
		System.out.println("Reason : " + appointment5.reason);
		System.out.println("Doctor Id is : " + appointment5.doctorId);
		
		Appointment appointment6 = new Appointment("RamLakshman Health Care" , 500.00);
		System.out.println("Hospital Name : " + appointment6.hospitalName);
		System.out.println("Consultation fees : " + appointment6.consultationFee);
		
		Appointment appointment7 = new Appointment(456);
		System.out.println("Room number : " + appointment7.roomNumber);
		System.out.println("Is Appointment confirmed : " + appointment7.isConfirmed);
		System.out.println("Consultation Fee : " + appointment7.consultationFee);
		
		Appointment appointment8 = new Appointment(true);
		System.out.println("Is appointment confirmed : " + appointment8.isConfirmed);
		
		Appointment appointment9 = new Appointment(1,"15/3/32026");
		System.out.println("Appointment ID : " + appointment9.appointmentId);
		System.out.println("Appointment Date : " + appointment9.appointmentDate);
		
		Appointment appointment10 = new Appointment("Available" , true);
		System.out.println("Status : " + appointment10.status);
		System.out.println("Is appointment confirmed : " + appointment10.isConfirmed);
		
		Appointment appointment11 = new Appointment("4/3/2025" , 67 , 101);
		System.out.println("Created Date  : " + appointment11.createdDate);
		System.out.println("PatientId is : " + appointment11.patientId);
		System.out.println("DoctorId is : " + appointment11.doctorId);
		
		Appointment appointment12 = new Appointment(1,67,101);
		System.out.println("AppointmaentId : " + appointment12.appointmentId);
		System.out.println("PatientId is : " + appointment12.patientId);
		System.out.println("DoctorId is : " + appointment12.doctorId);
		
		
	}

}