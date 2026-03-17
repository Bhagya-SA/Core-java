class MuseumExecutor {
    public static void main(String[] instruments) {
       /* Museum museum1 = new Museum();
        museum1.museumId = 1;
        museum1.museumName = "Gem Museum, New York";
        museum1.location = "New York, USA";
        museum1.totalDiamonds = 50;
        Diamond diamond1 = new Diamond();
        diamond1.diamondId = 101;
        diamond1.diamondName = "Hope Diamond";
        diamond1.diamondOrigin = "India";
        museum1.diamond = diamond1;
        museum1.displayMuseumInfo();

        Museum museum2 = new Museum();
        museum2.museumId = 2;
        museum2.museumName = "London Diamond Museum";
        museum2.location = "London, UK";
        museum2.totalDiamonds = 45;
        Diamond diamond2 = new Diamond();
        diamond2.diamondId = 102;
        diamond2.diamondName = "Koh-i-Noor";
        diamond2.diamondOrigin = "India";
        museum2.diamond = diamond2;
        museum2.displayMuseumInfo();

        Museum museum3 = new Museum();
        museum3.museumId = 3;
        museum3.museumName = "Paris Gem Museum";
        museum3.location = "Paris, France";
        museum3.totalDiamonds = 40;
        Diamond diamond3 = new Diamond();
        diamond3.diamondId = 103;
        diamond3.diamondName = "Regent Diamond";
        diamond3.diamondOrigin = "India";
        museum3.diamond = diamond3;
        museum3.displayMuseumInfo();

        Museum museum4 = new Museum();
        museum4.museumId = 4;
        museum4.museumName = "Amsterdam Diamond Museum";
        museum4.location = "Amsterdam, Netherlands";
        museum4.totalDiamonds = 35;
        Diamond diamond4 = new Diamond();
        diamond4.diamondId = 104;
        diamond4.diamondName = "Cullinan Diamond";
        diamond4.diamondOrigin = "South Africa";
        museum4.diamond = diamond4;
        museum4.displayMuseumInfo();

        Museum museum5 = new Museum();
        museum5.museumId = 5;
        museum5.museumName = "Moscow Diamond Fund";
        museum5.location = "Moscow, Russia";
        museum5.totalDiamonds = 60;
        Diamond diamond5 = new Diamond();
        diamond5.diamondId = 105;
        diamond5.diamondName = "Orlov Diamond";
        diamond5.diamondOrigin = "India";
        museum5.diamond = diamond5;
        museum5.displayMuseumInfo();

        Museum museum6 = new Museum();
        museum6.museumId = 6;
        museum6.museumName = "Dubai Gem Museum";
        museum6.location = "Dubai, UAE";
        museum6.totalDiamonds = 55;
        Diamond diamond6 = new Diamond();
        diamond6.diamondId = 106;
        diamond6.diamondName = "Sancy Diamond";
        diamond6.diamondOrigin = "India";
        museum6.diamond = diamond6;
        museum6.displayMuseumInfo();

        Museum museum7 = new Museum();
        museum7.museumId = 7;
        museum7.museumName = "Toronto Diamond Museum";
        museum7.location = "Toronto, Canada";
        museum7.totalDiamonds = 48;
        Diamond diamond7 = new Diamond();
        diamond7.diamondId = 107;
        diamond7.diamondName = "Dresden Green";
        diamond7.diamondOrigin = "India";
        museum7.diamond = diamond7;
        museum7.displayMuseumInfo();

        Museum museum8 = new Museum();
        museum8.museumId = 8;
        museum8.museumName = "Tokyo Gem Museum";
        museum8.location = "Tokyo, Japan";
        museum8.totalDiamonds = 42;
        Diamond diamond8 = new Diamond();
        diamond8.diamondId = 108;
        diamond8.diamondName = "Koh-i-Tan";
        diamond8.diamondOrigin = "India";
        museum8.diamond = diamond8;
        museum8.displayMuseumInfo();

        Museum museum9 = new Museum();
        museum9.museumId = 9;
        museum9.museumName = "Berlin Diamond Museum";
        museum9.location = "Berlin, Germany";
        museum9.totalDiamonds = 38;
        Diamond diamond9 = new Diamond();
        diamond9.diamondId = 109;
        diamond9.diamondName = "Tiffany Diamond";
        diamond9.diamondOrigin = "South Africa";
        museum9.diamond = diamond9;
        museum9.displayMuseumInfo();

        Museum museum10 = new Museum();
        museum10.museumId = 10;
        museum10.museumName = "Bangkok Gem Museum";
        museum10.location = "Bangkok, Thailand";
        museum10.totalDiamonds = 44;
        Diamond diamond10 = new Diamond();
        diamond10.diamondId = 110;
        diamond10.diamondName = "Blue Heart";
        diamond10.diamondOrigin = "South Africa";
        museum10.diamond = diamond10;
        museum10.displayMuseumInfo();

        Museum museum11 = new Museum();
        museum11.museumId = 11;
        museum11.museumName = "New York Gem Museum-2";
        museum11.location = "New York, USA";
        museum11.totalDiamonds = 50;
        Diamond diamond11 = new Diamond();
        diamond11.diamondId = 111;
        diamond11.diamondName = "Regent II";
        diamond11.diamondOrigin = "India";
        museum11.diamond = diamond11;
        museum11.displayMuseumInfo();

        Museum museum12 = new Museum();
        museum12.museumId = 12;
        museum12.museumName = "London Diamond Museum-2";
        museum12.location = "London, UK";
        museum12.totalDiamonds = 45;
        Diamond diamond12 = new Diamond();
        diamond12.diamondId = 112;
        diamond12.diamondName = "Koh-i-Noor II";
        diamond12.diamondOrigin = "India";
        museum12.diamond = diamond12;
        museum12.displayMuseumInfo();

        Museum museum13 = new Museum();
        museum13.museumId = 13;
        museum13.museumName = "Paris Gem Museum-2";
        museum13.location = "Paris, France";
        museum13.totalDiamonds = 40;
        Diamond diamond13 = new Diamond();
        diamond13.diamondId = 113;
        diamond13.diamondName = "Regent III";
        diamond13.diamondOrigin = "India";
        museum13.diamond = diamond13;
        museum13.displayMuseumInfo();

        Museum museum14 = new Museum();
        museum14.museumId = 14;
        museum14.museumName = "Amsterdam Diamond Museum-2";
        museum14.location = "Amsterdam, Netherlands";
        museum14.totalDiamonds = 35;
        Diamond diamond14 = new Diamond();
        diamond14.diamondId = 114;
        diamond14.diamondName = "Cullinan II";
        diamond14.diamondOrigin = "South Africa";
        museum14.diamond = diamond14;
        museum14.displayMuseumInfo();

        Museum museum15 = new Museum();
        museum15.museumId = 15;
        museum15.museumName = "Moscow Diamond Fund-2";
        museum15.location = "Moscow, Russia";
        museum15.totalDiamonds = 60;
        Diamond diamond15 = new Diamond();
        diamond15.diamondId = 115;
        diamond15.diamondName = "Orlov II";
        diamond15.diamondOrigin = "India";
        museum15.diamond = diamond15;
        museum15.displayMuseumInfo();

        Museum museum16 = new Museum();
        museum16.museumId = 16;
        museum16.museumName = "Dubai Gem Museum-2";
        museum16.location = "Dubai, UAE";
        museum16.totalDiamonds = 55;
        Diamond diamond16 = new Diamond();
        diamond16.diamondId = 116;
        diamond16.diamondName = "Sancy II";
        diamond16.diamondOrigin = "India";
        museum16.diamond = diamond16;
        museum16.displayMuseumInfo();

        Museum museum17 = new Museum();
        museum17.museumId = 17;
        museum17.museumName = "Toronto Diamond Museum-2";
        museum17.location = "Toronto, Canada";
        museum17.totalDiamonds = 48;
        Diamond diamond17 = new Diamond();
        diamond17.diamondId = 117;
        diamond17.diamondName = "Dresden II";
        diamond17.diamondOrigin = "India";
        museum17.diamond = diamond17;
        museum17.displayMuseumInfo();

        Museum museum18 = new Museum();
        museum18.museumId = 18;
        museum18.museumName = "Tokyo Gem Museum-2";
        museum18.location = "Tokyo, Japan";
        museum18.totalDiamonds = 42;
        Diamond diamond18 = new Diamond();
        diamond18.diamondId = 118;
        diamond18.diamondName = "Koh-i-Tan II";
        diamond18.diamondOrigin = "India";
        museum18.diamond = diamond18;
        museum18.displayMuseumInfo();

        Museum museum19 = new Museum();
        museum19.museumId = 19;
        museum19.museumName = "Berlin Diamond Museum-2";
        museum19.location = "Berlin, Germany";
        museum19.totalDiamonds = 38;
        Diamond diamond19 = new Diamond();
        diamond19.diamondId = 119;
        diamond19.diamondName = "Tiffany II";
        diamond19.diamondOrigin = "South Africa";
        museum19.diamond = diamond19;
        museum19.displayMuseumInfo();

        Museum museum20 = new Museum();
        museum20.museumId = 20;
        museum20.museumName = "Bangkok Gem Museum-2";
        museum20.location = "Bangkok, Thailand";
        museum20.totalDiamonds = 44;
        Diamond diamond20 = new Diamond();
        diamond20.diamondId = 120;
        diamond20.diamondName = "Blue Heart II";
        diamond20.diamondOrigin = "South Africa";
        museum20.diamond = diamond20;
        museum20.displayMuseumInfo(); */

        Diamond d1 = new Diamond(101, "Hope Diamond", "India");
        Museum m1 = new Museum(1, "Gem Museum, New York", "New York, USA", 50, d1);
        m1.displayMuseumInfo();

        Diamond d2 = new Diamond(102, "Koh-i-Noor", "India");
        Museum m2 = new Museum(2, "London Diamond Museum", "London, UK", 45, d2);
        m2.displayMuseumInfo();

        Diamond d3 = new Diamond(103, "Regent Diamond", "India");
        Museum m3 = new Museum(3, "Paris Gem Museum", "Paris, France", 40, d3);
        m3.displayMuseumInfo();

        Diamond d4 = new Diamond(104, "Cullinan Diamond", "South Africa");
        Museum m4 = new Museum(4, "Amsterdam Diamond Museum", "Amsterdam, Netherlands", 35, d4);
        m4.displayMuseumInfo();

        Diamond d5 = new Diamond(105, "Orlov Diamond", "India");
        Museum m5 = new Museum(5, "Moscow Diamond Fund", "Moscow, Russia", 60, d5);
        m5.displayMuseumInfo();

        Diamond d6 = new Diamond(106, "Sancy Diamond", "India");
        Museum m6 = new Museum(6, "Dubai Gem Museum", "Dubai, UAE", 55, d6);
        m6.displayMuseumInfo();

        Diamond d7 = new Diamond(107, "Dresden Green", "India");
        Museum m7 = new Museum(7, "Toronto Diamond Museum", "Toronto, Canada", 48, d7);
        m7.displayMuseumInfo();

        Diamond d8 = new Diamond(108, "Koh-i-Tan", "India");
        Museum m8 = new Museum(8, "Tokyo Gem Museum", "Tokyo, Japan", 42, d8);
        m8.displayMuseumInfo();

        Diamond d9 = new Diamond(109, "Tiffany Diamond", "South Africa");
        Museum m9 = new Museum(9, "Berlin Diamond Museum", "Berlin, Germany", 38, d9);
        m9.displayMuseumInfo();

        Diamond d10 = new Diamond(110, "Blue Heart", "South Africa");
        Museum m10 = new Museum(10, "Bangkok Gem Museum", "Bangkok, Thailand", 44, d10);
        m10.displayMuseumInfo();

        Diamond d11 = new Diamond(111, "Regent II", "India");
        Museum m11 = new Museum(11, "New York Gem Museum-2", "New York, USA", 50, d11);
        m11.displayMuseumInfo();

        Diamond d12 = new Diamond(112, "Koh-i-Noor II", "India");
        Museum m12 = new Museum(12, "London Diamond Museum-2", "London, UK", 45, d12);
        m12.displayMuseumInfo();

        Diamond d13 = new Diamond(113, "Regent III", "India");
        Museum m13 = new Museum(13, "Paris Gem Museum-2", "Paris, France", 40, d13);
        m13.displayMuseumInfo();

        Diamond d14 = new Diamond(114, "Cullinan II", "South Africa");
        Museum m14 = new Museum(14, "Amsterdam Diamond Museum-2", "Amsterdam, Netherlands", 35, d14);
        m14.displayMuseumInfo();

        Diamond d15 = new Diamond(115, "Orlov II", "India");
        Museum m15 = new Museum(15, "Moscow Diamond Fund-2", "Moscow, Russia", 60, d15);
        m15.displayMuseumInfo();

        Diamond d16 = new Diamond(116, "Sancy II", "India");
        Museum m16 = new Museum(16, "Dubai Gem Museum-2", "Dubai, UAE", 55, d16);
        m16.displayMuseumInfo();

        Diamond d17 = new Diamond(117, "Dresden II", "India");
        Museum m17 = new Museum(17, "Toronto Diamond Museum-2", "Toronto, Canada", 48, d17);
        m17.displayMuseumInfo();

        Diamond d18 = new Diamond(118, "Koh-i-Tan II", "India");
        Museum m18 = new Museum(18, "Tokyo Gem Museum-2", "Tokyo, Japan", 42, d18);
        m18.displayMuseumInfo();

        Diamond d19 = new Diamond(119, "Tiffany II", "South Africa");
        Museum m19 = new Museum(19, "Berlin Diamond Museum-2", "Berlin, Germany", 38, d19);
        m19.displayMuseumInfo();

        Diamond d20 = new Diamond(120, "Blue Heart II", "South Africa");
        Museum m20 = new Museum(20, "Bangkok Gem Museum-2", "Bangkok, Thailand", 44, d20);
        m20.displayMuseumInfo();
    }
}
