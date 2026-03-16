class EventExecutor {

    public static void main(String[] events) {

        Event event1 = new Event(101);
        System.out.println("Event Id : " + event1.eventId);

        Event event2 = new Event("Tech Conference");
        System.out.println("Event Name : " + event2.eventName);

        Event event3 = new Event("John Doe", "New York");
        System.out.println("Organizer : " + event3.organizer);
        System.out.println("Location : " + event3.location);

        Event event4 = new Event("2026-03-20", "10:00", 102);
        System.out.println("Event Date : " + event4.eventDate);
        System.out.println("Start Time : " + event4.startTime);
        System.out.println("Event Id : " + event4.eventId);

        Event event5 = new Event("18:00", 103);
        System.out.println("End Time : " + event5.endTime);
        System.out.println("Event Id : " + event5.eventId);

        Event event6 = new Event(150, "20:00");
        System.out.println("Total Participants : " + event6.totalParticipants);
        System.out.println("End Time : " + event6.endTime);

        Event event7 = new Event("Workshop", "Tech Corp", true);
        System.out.println("Event Type : " + event7.eventType);
        System.out.println("Sponsor : " + event7.sponsor);
        System.out.println("Is Online : " + event7.isOnline);

        Event event8 = new Event("contact@event.com" , true);
        System.out.println("Contact Email : " + event8.contactEmail);
		System.out.println("Is Online : " + event8.isOnline);

        Event event9 = new Event(true);
        System.out.println("Is Online : " + event9.isOnline);

        Event event10 = new Event(104, "Networking Meetup", true);
        System.out.println("Event Id : " + event10.eventId);
        System.out.println("Event Name : " + event10.eventName);
        System.out.println("Is Online : " + event10.isOnline);

        Event event11 = new Event("Alice", 200, 105);
        System.out.println("Organizer : " + event11.organizer);
        System.out.println("Total Participants : " + event11.totalParticipants);
        System.out.println("Event Id : " + event11.eventId);

        Event event12 = new Event("Music Fest", "Central Park", "2026-06-10");
        System.out.println("Event Name : " + event12.eventName);
        System.out.println("Location : " + event12.location);
        System.out.println("Event Date : " + event12.eventDate);
    }
}