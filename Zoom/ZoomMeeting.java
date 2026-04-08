class ZoomMeeting {
    private int meetingId;
    private String host;
    private int participants;
    private String topic;
    private String duration;
    private String status;
    private int recordings;

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public int getMeetingId() {
        return meetingId;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public int getParticipants() {
        return participants;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setRecordings(int recordings) {
        this.recordings = recordings;
    }

    public int getRecordings() {
        return recordings;
    }
}