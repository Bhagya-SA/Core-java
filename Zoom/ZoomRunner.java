class ZoomRunner {

    public static void main(String[] meeting) {
        
        Zoom zoom = new Zoom();
        
        ZoomMeeting meetingOne = new ZoomMeeting();
        meetingOne.setMeetingId(1);
        meetingOne.setHost("Anu");
        meetingOne.setParticipants(10);
        meetingOne.setTopic("Project Discussion");
        meetingOne.setDuration("1 hour");
        meetingOne.setStatus("Scheduled");
        meetingOne.setRecordings(1);
        
        boolean isMeetingAdded = zoom.addZoomMeeting(meetingOne);
		System.out.println(isMeetingAdded);
        
        
        ZoomMeeting meetingTwo = new ZoomMeeting();
        meetingTwo.setMeetingId(2);
        meetingTwo.setHost("Bhuvi");
        meetingTwo.setParticipants(15);
        meetingTwo.setTopic("Sprint Planning");
        meetingTwo.setDuration("2 hours");
        meetingTwo.setStatus("Completed");
        meetingTwo.setRecordings(2);
        
        isMeetingAdded = zoom.addZoomMeeting(meetingTwo);
       System.out.println(isMeetingAdded);
        
        ZoomMeeting meetingThree = new ZoomMeeting();
        meetingThree.setMeetingId(3);
        meetingThree.setHost("Charvi");
        meetingThree.setParticipants(8);
        meetingThree.setTopic("Client Meeting");
        meetingThree.setDuration("45 mins");
        meetingThree.setStatus("Scheduled");
        meetingThree.setRecordings(0);
        
        isMeetingAdded = zoom.addZoomMeeting(meetingThree);
        System.out.println(isMeetingAdded);
        
        ZoomMeeting meetingFour = new ZoomMeeting();
        meetingFour.setMeetingId(4);
        meetingFour.setHost("Dhruthi");
        meetingFour.setParticipants(20);
        meetingFour.setTopic("Team Meeting");
        meetingFour.setDuration("1.5 hours");
        meetingFour.setStatus("Ongoing");
        meetingFour.setRecordings(1);
        
        isMeetingAdded = zoom.addZoomMeeting(meetingFour);
        System.out.println(isMeetingAdded);
        
        ZoomMeeting meetingFive = new ZoomMeeting();
        meetingFive.setMeetingId(5);
        meetingFive.setHost("Gowri");
        meetingFive.setParticipants(5);
        meetingFive.setTopic("Quick Sync");
        meetingFive.setDuration("30 mins");
        meetingFive.setStatus("Completed");
        meetingFive.setRecordings(1);
        
        isMeetingAdded = zoom.addZoomMeeting(meetingFive);
		System.out.println(isMeetingAdded);
		
        zoom.getMeetingdetails();
        
    }
}