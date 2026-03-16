class Appointment {

    int appointmentId;
    int patientId;
    int doctorId;
    String appointmentDate;
    String appointmentTime;
    String status;
    String reason;
    String hospitalName;
    double consultationFee;
    String roomNumber;
    boolean isConfirmed;
    String createdDate;

    Appointment(int appointmentId){
        this.appointmentId = appointmentId;
    }

    Appointment(int patientId, int doctorId){
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    Appointment(String appointmentDate){
        this.appointmentDate = appointmentDate;
    }

    Appointment(String appointmentTime, String status){
        this.appointmentTime = appointmentTime;
        this.status = status;
    }

    Appointment(String reason , int doctorId){
        this.reason = reason;
		this.doctorId = doctorId;
    }

    Appointment(String hospitalName, double consultationFee){
        this.hospitalName = hospitalName;
        this.consultationFee = consultationFee;
    }

    Appointment(String roomNumber , boolean isConfirmed , double consultationFee){
        this.roomNumber = roomNumber;
		this.isConfirmed = isConfirmed;
		this.consultationFee = consultationFee;
    }

    Appointment(boolean isConfirmed){
        this.isConfirmed = isConfirmed;
    }

    Appointment(int appointmentId, String appointmentDate){
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
    }

    Appointment(String status, boolean isConfirmed){
        this.status = status;
        this.isConfirmed = isConfirmed;
    }

    Appointment(String createdDate , int patientId , int doctorId){
        this.createdDate = createdDate;
		this.patientId = patientId;
		this.doctorId = doctorId;
    }

    Appointment(int appointmentId, int patientId, int doctorId){
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }
}