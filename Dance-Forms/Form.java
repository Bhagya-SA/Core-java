class Form {

	int formId;
	String formName;
	String style;

	 public Form(int formId, String formName, String style) {
        this.formId = formId;
        this.formName = formName;
        this.style = style;
    }
	
	public void displayFormInfo() {
	
		System.out.println("Form Id is : " + this.formId);
		System.out.println("Form Name : " + this.formName);
		System.out.println("Style : " + this.style);
		
	
	}

}
