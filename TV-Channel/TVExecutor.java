class TVExecutor {

    public static void main(String[] television) {

        /*TV tv1 = new TV();
        tv1.tvId = 101;
        tv1.tvName = "Global News";
        tv1.country = "USA";
        Channel ch1 = new Channel();
        ch1.channelId = 201;
        ch1.channelName = "CNN";
        ch1.channelType = "News";
        tv1.channel = ch1;
        tv1.displayTVInfo();

        TV tv2 = new TV();
        tv2.tvId = 102;
        tv2.tvName = "Sports Arena";
        tv2.country = "UK";
        Channel ch2 = new Channel();
        ch2.channelId = 202;
        ch2.channelName = "Sky Sports";
        ch2.channelType = "Sports";
        tv2.channel = ch2;
        tv2.displayTVInfo();

        TV tv3 = new TV();
        tv3.tvId = 103;
        tv3.tvName = "Entertainment Hub";
        tv3.country = "India";
        Channel ch3 = new Channel();
        ch3.channelId = 203;
        ch3.channelName = "Star Plus";
        ch3.channelType = "Entertainment";
        tv3.channel = ch3;
        tv3.displayTVInfo();

        TV tv4 = new TV();
        tv4.tvId = 104;
        tv4.tvName = "Kids World";
        tv4.country = "USA";
        Channel ch4 = new Channel();
        ch4.channelId = 204;
        ch4.channelName = "Cartoon Network";
        ch4.channelType = "Kids";
        tv4.channel = ch4;
        tv4.displayTVInfo();

        TV tv5 = new TV();
        tv5.tvId = 105;
        tv5.tvName = "Music Mania";
        tv5.country = "UK";
        Channel ch5 = new Channel();
        ch5.channelId = 205;
        ch5.channelName = "MTV";
        ch5.channelType = "Music";
        tv5.channel = ch5;
        tv5.displayTVInfo();

        TV tv6 = new TV();
        tv6.tvId = 106;
        tv6.tvName = "Discovery Zone";
        tv6.country = "USA";
        Channel ch6 = new Channel();
        ch6.channelId = 206;
        ch6.channelName = "Discovery";
        ch6.channelType = "Documentary";
        tv6.channel = ch6;
        tv6.displayTVInfo();

        TV tv7 = new TV();
        tv7.tvId = 107;
        tv7.tvName = "Movie Time";
        tv7.country = "India";
        Channel ch7 = new Channel();
        ch7.channelId = 207;
        ch7.channelName = "Sony Max";
        ch7.channelType = "Movies";
        tv7.channel = ch7;
        tv7.displayTVInfo();

        TV tv8 = new TV();
        tv8.tvId = 108;
        tv8.tvName = "Travel Tales";
        tv8.country = "Australia";
        Channel ch8 = new Channel();
        ch8.channelId = 208;
        ch8.channelName = "Nat Geo";
        ch8.channelType = "Travel";
        tv8.channel = ch8;
        tv8.displayTVInfo();

        TV tv9 = new TV();
        tv9.tvId = 109;
        tv9.tvName = "History Now";
        tv9.country = "UK";
        Channel ch9 = new Channel();
        ch9.channelId = 209;
        ch9.channelName = "History Channel";
        ch9.channelType = "History";
        tv9.channel = ch9;
        tv9.displayTVInfo();

        TV tv10 = new TV();
        tv10.tvId = 110;
        tv10.tvName = "Foodies TV";
        tv10.country = "USA";
        Channel ch10 = new Channel();
        ch10.channelId = 210;
        ch10.channelName = "Food Network";
        ch10.channelType = "Cooking";
        tv10.channel = ch10;
        tv10.displayTVInfo();

        TV tv11 = new TV();
        tv11.tvId = 111;
        tv11.tvName = "Animal Planet";
        tv11.country = "USA";
        Channel ch11 = new Channel();
        ch11.channelId = 211;
        ch11.channelName = "Animal Planet";
        ch11.channelType = "Wildlife";
        tv11.channel = ch11;
        tv11.displayTVInfo();

        TV tv12 = new TV();
        tv12.tvId = 112;
        tv12.tvName = "Tech Today";
        tv12.country = "India";
        Channel ch12 = new Channel();
        ch12.channelId = 212;
        ch12.channelName = "Tech Channel";
        ch12.channelType = "Technology";
        tv12.channel = ch12;
        tv12.displayTVInfo();

        TV tv13 = new TV();
        tv13.tvId = 113;
        tv13.tvName = "Fashion TV";
        tv13.country = "France";
        Channel ch13 = new Channel();
        ch13.channelId = 213;
        ch13.channelName = "Fashion TV";
        ch13.channelType = "Fashion";
        tv13.channel = ch13;
        tv13.displayTVInfo();

        TV tv14 = new TV();
        tv14.tvId = 114;
        tv14.tvName = "Crime Watch";
        tv14.country = "USA";
        Channel ch14 = new Channel();
        ch14.channelId = 214;
        ch14.channelName = "Investigation Discovery";
        ch14.channelType = "Crime";
        tv14.channel = ch14;
        tv14.displayTVInfo();

        TV tv15 = new TV();
        tv15.tvId = 115;
        tv15.tvName = "Sports Live";
        tv15.country = "Canada";
        Channel ch15 = new Channel();
        ch15.channelId = 215;
        ch15.channelName = "TSN";
        ch15.channelType = "Sports";
        tv15.channel = ch15;
        tv15.displayTVInfo();

        TV tv16 = new TV();
        tv16.tvId = 116;
        tv16.tvName = "Kids Planet";
        tv16.country = "India";
        Channel ch16 = new Channel();
        ch16.channelId = 216;
        ch16.channelName = "Pogo TV";
        ch16.channelType = "Kids";
        tv16.channel = ch16;
        tv16.displayTVInfo();

        TV tv17 = new TV();
        tv17.tvId = 117;
        tv17.tvName = "Movie Mania";
        tv17.country = "UK";
        Channel ch17 = new Channel();
        ch17.channelId = 217;
        ch17.channelName = "BBC Films";
        ch17.channelType = "Movies";
        tv17.channel = ch17;
        tv17.displayTVInfo();

        TV tv18 = new TV();
        tv18.tvId = 118;
        tv18.tvName = "Discovery Kids";
        tv18.country = "USA";
        Channel ch18 = new Channel();
        ch18.channelId = 218;
        ch18.channelName = "Discovery Kids";
        ch18.channelType = "Kids";
        tv18.channel = ch18;
        tv18.displayTVInfo();

        TV tv19 = new TV();
        tv19.tvId = 119;
        tv19.tvName = "History Channel";
        tv19.country = "India";
        Channel ch19 = new Channel();
        ch19.channelId = 219;
        ch19.channelName = "History TV18";
        ch19.channelType = "History";
        tv19.channel = ch19;
        tv19.displayTVInfo();

        TV tv20 = new TV();
        tv20.tvId = 120;
        tv20.tvName = "Music World";
        tv20.country = "USA";
        Channel ch20 = new Channel();
        ch20.channelId = 220;
        ch20.channelName = "VH1";
        ch20.channelType = "Music";
        tv20.channel = ch20;
        tv20.displayTVInfo(); */

        Channel ch1 = new Channel(201, "CNN", "News");
        TV tv1 = new TV(101, "Global News", "USA", ch1);
        tv1.displayTVInfo();

        Channel ch2 = new Channel(202, "Sky Sports", "Sports");
        TV tv2 = new TV(102, "Sports Arena", "UK", ch2);
        tv2.displayTVInfo();

        Channel ch3 = new Channel(203, "Star Plus", "Entertainment");
        TV tv3 = new TV(103, "Entertainment Hub", "India", ch3);
        tv3.displayTVInfo();

        Channel ch4 = new Channel(204, "Cartoon Network", "Kids");
        TV tv4 = new TV(104, "Kids World", "USA", ch4);
        tv4.displayTVInfo();

        Channel ch5 = new Channel(205, "MTV", "Music");
        TV tv5 = new TV(105, "Music Mania", "UK", ch5);
        tv5.displayTVInfo();

        Channel ch6 = new Channel(206, "Discovery", "Documentary");
        TV tv6 = new TV(106, "Discovery Zone", "USA", ch6);
        tv6.displayTVInfo();

        Channel ch7 = new Channel(207, "Sony Max", "Movies");
        TV tv7 = new TV(107, "Movie Time", "India", ch7);
        tv7.displayTVInfo();

        Channel ch8 = new Channel(208, "Nat Geo", "Travel");
        TV tv8 = new TV(108, "Travel Tales", "Australia", ch8);
        tv8.displayTVInfo();

        Channel ch9 = new Channel(209, "History Channel", "History");
        TV tv9 = new TV(109, "History Now", "UK", ch9);
        tv9.displayTVInfo();

        Channel ch10 = new Channel(210, "Food Network", "Cooking");
        TV tv10 = new TV(110, "Foodies TV", "USA", ch10);
        tv10.displayTVInfo();

        Channel ch11 = new Channel(211, "Animal Planet", "Wildlife");
        TV tv11 = new TV(111, "Animal Planet", "USA", ch11);
        tv11.displayTVInfo();

        Channel ch12 = new Channel(212, "Tech Channel", "Technology");
        TV tv12 = new TV(112, "Tech Today", "India", ch12);
        tv12.displayTVInfo();

        Channel ch13 = new Channel(213, "Fashion TV", "Fashion");
        TV tv13 = new TV(113, "Fashion TV", "France", ch13);
        tv13.displayTVInfo();

        Channel ch14 = new Channel(214, "Investigation Discovery", "Crime");
        TV tv14 = new TV(114, "Crime Watch", "USA", ch14);
        tv14.displayTVInfo();

        Channel ch15 = new Channel(215, "TSN", "Sports");
        TV tv15 = new TV(115, "Sports Live", "Canada", ch15);
        tv15.displayTVInfo();

        Channel ch16 = new Channel(216, "Pogo TV", "Kids");
        TV tv16 = new TV(116, "Kids Planet", "India", ch16);
        tv16.displayTVInfo();

        Channel ch17 = new Channel(217, "BBC Films", "Movies");
        TV tv17 = new TV(117, "Movie Mania", "UK", ch17);
        tv17.displayTVInfo();

        Channel ch18 = new Channel(218, "Discovery Kids", "Kids");
        TV tv18 = new TV(118, "Discovery Kids", "USA", ch18);
        tv18.displayTVInfo();

        Channel ch19 = new Channel(219, "History TV18", "History");
        TV tv19 = new TV(119, "History Channel", "India", ch19);
        tv19.displayTVInfo();

        Channel ch20 = new Channel(220, "VH1", "Music");
        TV tv20 = new TV(120, "Music World", "USA", ch20);
        tv20.displayTVInfo();
    

        
    }
}
