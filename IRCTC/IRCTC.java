class IRCTC {
	
	TicketBooking ticketBook;
	
	public boolean addTicket(TicketBooking ticketBook) {
		
		boolean isTicketCreated = false;
		
		boolean isTicketIdValid = false;
		boolean isTrainValid = false;
		boolean isSeatsValid = false;
		boolean isClassTypeValid = false;
		boolean isPriceValid = false;
		boolean isSourceValid = false;
		boolean isDurationValid = false;
		
		int ticketId = ticketBook.getTicketId();
		if(ticketId > 0) {
			isTicketIdValid = true;
		}
		
		String train = ticketBook.getTrain();
		if(train != null && !train.isEmpty()) {
			isTrainValid = true;
		}
		
		int seats = ticketBook.getSeats();
		if(seats > 0) {
			isSeatsValid = true;
		}
		
		String classType = ticketBook.getClassType();
		if(classType != null && !classType.isEmpty()) {
			isClassTypeValid = true;
		}
		
		double price = ticketBook.getPrice();
		if(price > 0.0) {
			isPriceValid = true;
		}
		
		String source = ticketBook.getSource();
		if(source != null && !source.isEmpty()) {
			isSourceValid = true;
		}
		
		String duration = ticketBook.getDuration();
		if(duration != null && !duration.isEmpty()) {
			isDurationValid  = true;
		}
		
		if(isTicketIdValid && isTrainValid && isSeatsValid && isClassTypeValid && isPriceValid && isSourceValid && isDurationValid) {
			isTicketCreated = true;
			this.ticketBook = ticketBook;
			
		}
		
		
		return isTicketCreated;
		
	}
	
	public void getTicketBookingdetails() {
		if(ticketBook != null) {
			System.out.println("Ticket Id : " + ticketBook.getTicketId());
			System.out.println("Train name : " + ticketBook.getTrain());
			System.out.println("No of seats : " + ticketBook.getSeats());
			System.out.println("Class type : " + ticketBook.getClassType());
			System.out.println("Price : " + ticketBook.getPrice());
			System.out.println("Source : " + ticketBook.getSource());
			System.out.println("Duration : " + ticketBook.getDuration());
			
		}
	}


}