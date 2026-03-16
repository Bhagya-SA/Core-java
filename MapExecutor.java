class MapExecutor {

    public static void main(String[] maps) {

        Map m1 = new Map(1,"Political","World","1:1000000","Multicolor",300,"Oxford",2022,"English","Paper",100,70,"Mercator",true,"Education","India","Oxford","Roll",4.5,"Available");
        Map m2 = new Map(2,"Physical","Asia","1:800000","Multicolor",250,"National Geo",2021,"English","Paper",90,60,"Mercator",true,"Study","USA","NG","Roll",4.4,"Available");
        Map m3 = new Map(3,"Road","India","1:500000","Color",200,"Survey India",2020,"English","Paper",85,55,"Lambert",false,"Navigation","India","Govt","Fold",4.2,"Available");
        Map m4 = new Map(4,"Tourist","Europe","1:700000","Color",280,"LonelyPlanet",2023,"English","Paper",95,65,"Mercator",true,"Travel","UK","LP","Roll",4.6,"Available");
        Map m5 = new Map(5,"Political","India","1:600000","Multicolor",220,"Oxford",2021,"English","Paper",88,58,"Mercator",false,"Education","India","Oxford","Fold",4.3,"Available");
        Map m6 = new Map(6,"Weather","World","1:900000","Blue",320,"ClimateOrg",2022,"English","Paper",105,75,"Mercator",true,"Research","USA","ClimateOrg","Roll",4.5,"Available");
        Map m7 = new Map(7,"Historical","World","1:850000","Brown",260,"HistoryPub",2019,"English","Paper",92,62,"Mercator",false,"Study","UK","HistoryPub","Fold",4.1,"Available");
        Map m8 = new Map(8,"Political","Africa","1:750000","Color",240,"Oxford",2020,"English","Paper",87,57,"Mercator",true,"Education","India","Oxford","Roll",4.2,"Available");
        Map m9 = new Map(9,"Physical","India","1:650000","Color",230,"Survey India",2021,"English","Paper",90,60,"Lambert",false,"Study","India","Govt","Fold",4.4,"Available");
        Map m10 = new Map(10,"Tourist","USA","1:700000","Color",300,"LonelyPlanet",2023,"English","Paper",100,70,"Mercator",true,"Travel","USA","LP","Roll",4.7,"Available");

        m1.toDisplayDetails();
        m2.toDisplayDetails();
        m3.toDisplayDetails();
        m4.toDisplayDetails();
        m5.toDisplayDetails();
        m6.toDisplayDetails();
        m7.toDisplayDetails();
        m8.toDisplayDetails();
        m9.toDisplayDetails();
        m10.toDisplayDetails();
    }
}