class Diamond {
    int diamondId;
    String diamondName;
    String diamondOrigin;

    public Diamond(int diamondId, String diamondName, String diamondOrigin) {
        this.diamondId = diamondId;
        this.diamondName = diamondName;
        this.diamondOrigin = diamondOrigin;
    }

    public void displayDiamondInfo() {
        System.out.println("Diamond Id : " + this.diamondId);
        System.out.println("Diamond Name : " + this.diamondName);
        System.out.println("Diamond Origin : " + this.diamondOrigin);
    }
}
