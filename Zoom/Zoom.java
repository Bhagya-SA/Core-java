class Zoom {

    ZoomMeeting zoomMeets[] = new ZoomMeeting[5];
	int index;
    
    public boolean addZoomMeeting(ZoomMeeting zoomMeet) {
        
        boolean isMeetingAdded = false;
        
        boolean isMeetingIdValid = false;
        boolean isHostValid = false;
        boolean isParticipantsValid = false;
        boolean isTopicValid = false;
        boolean isDurationValid = false;
        boolean isStatusValid = false;
        boolean isRecordingsValid = false;
        
        int meetingId = zoomMeet.getMeetingId();
        if(meetingId > 0) {
            isMeetingIdValid = true;
        }
        
        String host = zoomMeet.getHost();
        if(host != null && !host.isEmpty()) {
            isHostValid = true;
        }
        
        int participants = zoomMeet.getParticipants();
        if(participants > 0) {
            isParticipantsValid = true;
        }
        
        String topic = zoomMeet.getTopic();
        if(topic != null && !topic.isEmpty()) {
            isTopicValid = true;
        }
        
        String duration = zoomMeet.getDuration();
        if(duration != null && !duration.isEmpty()) {
            isDurationValid = true;
        }
        
        String status = zoomMeet.getStatus();
        if(status != null && !status.isEmpty()) {
            isStatusValid = true;
        }
        
        int recordings = zoomMeet.getRecordings();
        if(recordings >= 0) {
            isRecordingsValid = true;
        }
        
        if(isMeetingIdValid && isHostValid && isParticipantsValid && isTopicValid && isDurationValid && isStatusValid && isRecordingsValid) {
            
            isMeetingAdded = true;
            zoomMeets[index++] = zoomMeet;
        }
        
        return isMeetingAdded;
    }
    
    public void getMeetingdetails() {
        
        System.out.println("The meeting details are as follows :");
        
        for(ZoomMeeting zoomMeet : zoomMeets) {
            
			System.out.println("--------------------------------------------------");
            System.out.println("Meeting Id is : " + zoomMeet.getMeetingId());
            System.out.println("Host is : " + zoomMeet.getHost());
            System.out.println("Participants are : " + zoomMeet.getParticipants());
            System.out.println("Topic is : " + zoomMeet.getTopic());
            System.out.println("Duration is : " + zoomMeet.getDuration());
            System.out.println("Status is : " + zoomMeet.getStatus());
            System.out.println("Recordings count is : " + zoomMeet.getRecordings());
			System.out.println("--------------------------------------------------");
        }
    }
}