class Attendance {

    int attendanceId;
    int studentId;
    int courseId;
    String date;
    String status;
    String timeIn;
    String timeOut;
    String markedBy;
    String remarks;
    String semester;
    int totalClasses;
    int attendedClasses;
    boolean isPresent;

    
    Attendance(int attendanceId){
        this.attendanceId = attendanceId;
    }

    
    Attendance(int studentId, int courseId){
        this.studentId = studentId;
        this.courseId = courseId;
    }

    
    Attendance(String date){
        this.date = date;
    }

    
    Attendance(String status, boolean isPresent){
        this.status = status;
        this.isPresent = isPresent;
    }

    
    Attendance(String timeIn, String timeOut){
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    
    Attendance(String markedBy, int totalClasses){
        this.markedBy = markedBy;
        this.totalClasses = totalClasses;
    }

    
    Attendance(String remarks, String semester, int totalClasses){
        this.remarks = remarks;
        this.semester = semester;
        this.totalClasses = totalClasses;
    }

    
    Attendance(int totalClasses, boolean isPresent){
        this.totalClasses = totalClasses;
        this.isPresent = isPresent;
    }

    
    Attendance(int attendedClasses, boolean isPresent, int studentId){
        this.attendedClasses = attendedClasses;
        this.isPresent = isPresent;
        this.studentId = studentId;
    }

    
    Attendance(int attendanceId, String date){
        this.attendanceId = attendanceId;
        this.date = date;
    }

    
    Attendance(String semester, int totalClasses , int attendanceId){
        this.semester = semester;
        this.totalClasses = totalClasses;
		this.attendanceId = attendanceId;
    }

  
    Attendance(int attendanceId, int studentId, int courseId){
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.courseId = courseId;
    }
}