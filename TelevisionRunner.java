class TelevisionRunner {

    public static void main(String[] channel) {
    
        Television tv = new Television();
        
        tv.addChannelName("Sun TV");
        tv.addChannelName("Star Plus");
        tv.addChannelName("Zee TV");
        tv.addChannelName("Colors TV");
        tv.addChannelName("Sony Entertainment Television");
        tv.addChannelName("DD National");
        tv.addChannelName("Star Sports");
        tv.addChannelName("Sony Sports");
        tv.addChannelName("Discovery Channel");
        tv.addChannelName("National Geographic");
        tv.addChannelName("History TV18");
        tv.addChannelName("MTV India");
        tv.addChannelName("VH1 India");
        tv.addChannelName("Cartoon Network");
        tv.addChannelName("Nickelodeon");
        tv.addChannelName("Disney Channel");
        tv.addChannelName("Sun Music");
        
        tv.getChannelNames();
    }
}