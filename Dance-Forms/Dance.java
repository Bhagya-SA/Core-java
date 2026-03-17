class Dance {

	int danceId;
	String danceName;
	String originCountry;
	String danceType;
	Form form;

	public Dance(int danceId, String danceName, String originCountry, String danceType, Form form) {
        this.danceId = danceId;
        this.danceName = danceName;
        this.originCountry = originCountry;
        this.danceType = danceType;
        this.form = form;
    }
	
	public void displayDanceInfo() {
	
		System.out.println("Dance Id : " + this.danceId);
		System.out.println("Dance Name : " + this.danceName);
		System.out.println("Origin Country : " + this.originCountry);
		System.out.println("Dance Type : " + this.danceType);
		this.form.displayFormInfo();
		System.out.println("--------------------------------------------------");
	
	}

}
