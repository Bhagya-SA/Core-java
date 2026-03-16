class TV {

    int tvId;
    String tvName;
    String country;
    Channel channel;

    public void displayTVInfo() {
        System.out.println("TV Id : " + this.tvId);
        System.out.println("TV Name : " + this.tvName);
        System.out.println("Country : " + this.country);
        this.channel.displayChannelInfo();
        System.out.println("--------------------------------------------------");
    }
}