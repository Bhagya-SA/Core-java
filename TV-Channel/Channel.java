class Channel {

    int channelId;
    String channelName;
    String channelType;

    public Channel(int channelId, String channelName, String channelType) {
        this.channelId = channelId;
        this.channelName = channelName;
        this.channelType = channelType;
    }

    public void displayChannelInfo() {
        System.out.println("Channel Id : " + this.channelId);
        System.out.println("Channel Name : " + this.channelName);
        System.out.println("Channel Type : " + this.channelType);
    }
}
