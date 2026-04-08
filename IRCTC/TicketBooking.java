public class TicketBooking {

	private int ticketId;
	private String train;
	private int seats;
	private String classType;
	private double price;
	private String source;
	private String duration;
	
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getTicketId() {
		return ticketId;
	}
	
	public void setTrain(String train) {
		this.train = train;
	}
	public String getTrain() {
		return train;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getSeats() {
		return seats;
	}
	
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public String getClassType() {
		return classType;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	public String getSource() {
		return source;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDuration() {
		return duration;
	}
	
	
	
	
}