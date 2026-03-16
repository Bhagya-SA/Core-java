class Event {

    int eventId;
    String eventName;
    String organizer;
    String location;
    String eventDate;
    String startTime;
    String endTime;
    int totalParticipants;
    String eventType;
    String sponsor;
    String contactEmail;
    boolean isOnline;

    Event(int eventId){
        this.eventId = eventId;
    }

    Event(String eventName){
        this.eventName = eventName;
    }

    Event(String organizer, String location){
        this.organizer = organizer;
        this.location = location;
    }

    Event(String eventDate, String startTime , int eventId){
        this.eventDate = eventDate;
        this.startTime = startTime;
		this.eventId = eventId;
    }

    Event(String endTime , int eventId){
        this.endTime = endTime;
		this.eventId = eventId;
    }

    Event(int totalParticipants , String endTime){
        this.totalParticipants = totalParticipants;
		this.endTime = endTime;
    }

    Event(String eventType, String sponsor , boolean isOnline){
        this.eventType = eventType;
        this.sponsor = sponsor;
		this.isOnline = isOnline;
    }

    Event(String contactEmail, boolean isOnline){
        this.contactEmail = contactEmail;
		this.isOnline = isOnline;
    }

    Event(boolean isOnline){
        this.isOnline = isOnline;
    }

    Event(int eventId, String eventName , boolean isOnline){
        this.eventId = eventId;
        this.eventName = eventName;
		this.isOnline = isOnline;
    }

    Event(String organizer, int totalParticipants , int eventId){
        this.organizer = organizer;
        this.totalParticipants = totalParticipants;
		this.eventId = eventId;
    }

    Event(String eventName, String location, String eventDate){
        this.eventName = eventName;
        this.location = location;
        this.eventDate = eventDate;
    }
}