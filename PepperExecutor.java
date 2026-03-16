class PepperExecutor {

    public static void main(String[] args) {

        Pepper p1 = new Pepper(1,"Black","Black",500.0,"India","Everest",10,"High","Packet","A",1.0,"Spicy","Small","Winter","USA",true,"ABC Traders","Dry",4.5,"Available");
        Pepper p2 = new Pepper(2,"White","White",600.0,"Vietnam","MDH",8,"Premium","Bottle","A",0.8,"Mild","Medium","Summer","UK",false,"XYZ Traders","Cool",4.2,"Available");
        Pepper p3 = new Pepper(3,"Green","Green",450.0,"India","Catch",12,"Good","Packet","B",1.2,"Fresh","Small","Rainy","Canada",true,"Fresh Farms","Dry",4.0,"Available");
        Pepper p4 = new Pepper(4,"Red","Red",550.0,"China","SpiceHub",9,"High","Box","A",1.1,"Hot","Medium","Winter","Australia",false,"Global Spices","Cool",4.3,"Available");
        Pepper p5 = new Pepper(5,"Black","Dark Black",520.0,"India","Aachi",11,"Premium","Packet","A",1.3,"Strong","Large","Summer","Germany",true,"South Traders","Dry",4.6,"Available");
        Pepper p6 = new Pepper(6,"White","Cream",610.0,"Indonesia","Everest",7,"High","Bottle","A",0.7,"Mild","Small","Spring","France",false,"Ocean Traders","Cool",4.1,"Available");
        Pepper p7 = new Pepper(7,"Green","Light Green",480.0,"Sri Lanka","Catch",10,"Good","Packet","B",1.0,"Fresh","Medium","Rainy","Japan",true,"Island Spices","Dry",4.0,"Available");
        Pepper p8 = new Pepper(8,"Red","Bright Red",570.0,"Thailand","MDH",8,"Premium","Box","A",1.2,"Hot","Large","Winter","Italy",false,"Euro Traders","Cool",4.4,"Available");
        Pepper p9 = new Pepper(9,"Black","Jet Black",530.0,"India","Aachi",12,"High","Packet","A",1.4,"Strong","Medium","Summer","USA",true,"Spice World","Dry",4.7,"Available");
        Pepper p10 = new Pepper(10,"White","Off White",620.0,"Vietnam","Everest",6,"Premium","Bottle","A",0.9,"Mild","Small","Spring","UK",false,"Global Foods","Cool",4.3,"Available");

        p1.toDisplayDetails();
        p2.toDisplayDetails();
        p3.toDisplayDetails();
        p4.toDisplayDetails();
        p5.toDisplayDetails();
        p6.toDisplayDetails();
        p7.toDisplayDetails();
        p8.toDisplayDetails();
        p9.toDisplayDetails();
        p10.toDisplayDetails();
    }
}