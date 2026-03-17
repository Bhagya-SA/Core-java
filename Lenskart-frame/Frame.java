class Frame {
	int frameId;
	String frameMaterial;
	String frameSize;
	String frameColor;

	public Frame(int frameId, String frameMaterial, String frameSize, String frameColor) {
        this.frameId = frameId;
        this.frameMaterial = frameMaterial;
        this.frameSize = frameSize;
        this.frameColor = frameColor;
    }
	
	public void getFrameInfo() {
		System.out.println("Frame id is : " + this.frameId);
		System.out.println("Frame material is : " + this.frameMaterial);
		System.out.println("Frame size is : " + this.frameSize);
		System.out.println("Frame color is : ");

	
	}
	

}
