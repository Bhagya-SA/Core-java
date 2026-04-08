class IRCTCRunner {

	public static void main(String[] bookTikcet) {
		
			IRCTC irctc = new IRCTC();
			
			TicketBooking ticketBookOne = new TicketBooking();
			ticketBookOne.setTicketId(101);
			ticketBookOne.setTrain("Siddaganga Express");
			ticketBookOne.setSeats(100);
			ticketBookOne.setClassType("AC");
			ticketBookOne.setPrice(350);
			ticketBookOne.setSource("Bangalore");
			ticketBookOne.setDuration("4 hrs");
			
			boolean isTicketCreated = irctc.addTicket(ticketBookOne);
			System.out.println(isTicketCreated);
			irctc.getTicketBookingdetails();
			System.out.println("-------------------------------------------------------------");
			
			TicketBooking ticketBookTwo = new TicketBooking();
			ticketBookTwo.setTicketId(102);
			ticketBookTwo.setTrain("Vijayapura Express");
			ticketBookTwo.setSeats(510);
			ticketBookTwo.setClassType("General");
			ticketBookTwo.setPrice(250);
			ticketBookTwo.setSource("Bijapur");
			ticketBookTwo.setDuration("6 hrs");
			
			isTicketCreated = irctc.addTicket(ticketBookTwo);
			System.out.println(isTicketCreated);
			irctc.getTicketBookingdetails();
			System.out.println("-------------------------------------------------------------");
			
			TicketBooking ticketBookThree = new TicketBooking();
			ticketBookThree.setTicketId(103);
			ticketBookThree.setTrain("Mysore Express");
			ticketBookThree.setSeats(510);
			ticketBookThree.setClassType("Reservation");
			ticketBookThree.setPrice(450);
			ticketBookThree.setSource("Mysore");
			ticketBookThree.setDuration("6 hrs");
			
			isTicketCreated = irctc.addTicket(ticketBookThree);
			System.out.println(isTicketCreated);
			irctc.getTicketBookingdetails();
			System.out.println("-------------------------------------------------------------");
			
			TicketBooking ticketBookFour = new TicketBooking();
			ticketBookFour.setTicketId(104);
			ticketBookFour.setTrain("Tumukur Express");
			ticketBookFour.setSeats(210);
			ticketBookFour.setClassType("Reservation");
			ticketBookFour.setPrice(250);
			ticketBookFour.setSource("Tumukur");
			ticketBookFour.setDuration("4 hrs");
			
			isTicketCreated = irctc.addTicket(ticketBookFour);
			System.out.println(isTicketCreated);
			irctc.getTicketBookingdetails();
			System.out.println("-------------------------------------------------------------");
			
			TicketBooking ticketBookFive = new TicketBooking();
			ticketBookFive.setTicketId(105);
			ticketBookFive.setTrain("Vande Bharath Express");
			ticketBookFive.setSeats(1000);
			ticketBookFive.setClassType("AC");
			ticketBookFive.setPrice(1000);
			ticketBookFive.setSource("Bangalore");
			ticketBookFive.setDuration("3 hrs");
			
			isTicketCreated = irctc.addTicket(ticketBookFive);
			System.out.println(isTicketCreated);
			irctc.getTicketBookingdetails();
			System.out.println("-------------------------------------------------------------");
			
			
			
	}

}