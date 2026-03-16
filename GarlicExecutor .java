class GarlicExecutor {

    public static void main(String[] vegetable) {

        Garlic g1 = new Garlic(1,"Single Clove","White",120.0,"India","FreshFarm",50,"High","Net Bag","A",2.0,"Strong","Small","Winter","USA",true,"ABC Traders","Dry",4.5,"Available");
        Garlic g2 = new Garlic(2,"Multi Clove","Off White",110.0,"China","SpiceHub",40,"Premium","Packet","A",1.8,"Strong","Medium","Winter","UK",false,"XYZ Traders","Cool",4.2,"Available");
        Garlic g3 = new Garlic(3,"Organic","White",150.0,"India","OrganicLife",30,"Premium","Box","A",2.2,"Strong","Large","Winter","Canada",true,"Green Farms","Dry",4.6,"Available");
        Garlic g4 = new Garlic(4,"Local","White",90.0,"India","LocalFarm",60,"Standard","Net Bag","B",1.9,"Medium","Small","Summer","Australia",false,"Village Traders","Cool",4.0,"Available");
        Garlic g5 = new Garlic(5,"Chinese","Light White",100.0,"China","GlobalSpice",45,"High","Packet","A",2.1,"Strong","Medium","Spring","Germany",false,"Asia Traders","Dry",4.3,"Available");
        Garlic g6 = new Garlic(6,"Organic","Cream",160.0,"India","NatureFresh",25,"Premium","Box","A",2.3,"Strong","Large","Winter","France",true,"Organic Traders","Cool",4.7,"Available");
        Garlic g7 = new Garlic(7,"Local","White",95.0,"India","FarmFresh",55,"Good","Net Bag","B",2.0,"Medium","Small","Summer","Japan",false,"Local Traders","Dry",4.1,"Available");
        Garlic g8 = new Garlic(8,"Single Clove","White",130.0,"India","FreshFarm",35,"High","Packet","A",1.7,"Strong","Medium","Winter","Italy",true,"ABC Traders","Cool",4.4,"Available");
        Garlic g9 = new Garlic(9,"Organic","White",155.0,"India","OrganicLife",20,"Premium","Box","A",2.4,"Strong","Large","Winter","USA",true,"Green Farms","Dry",4.8,"Available");
        Garlic g10 = new Garlic(10,"Chinese","Off White",105.0,"China","SpiceHub",42,"High","Packet","A",2.0,"Strong","Medium","Spring","UK",false,"XYZ Traders","Cool",4.3,"Available");

        g1.toDisplayDetails();
        g2.toDisplayDetails();
        g3.toDisplayDetails();
        g4.toDisplayDetails();
        g5.toDisplayDetails();
        g6.toDisplayDetails();
        g7.toDisplayDetails();
        g8.toDisplayDetails();
        g9.toDisplayDetails();
        g10.toDisplayDetails();
    }
}