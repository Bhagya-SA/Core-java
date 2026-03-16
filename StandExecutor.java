class StandExecutor {

    public static void main(String[] stand) {

        Stand s1 = new Stand(1,"Mobile Stand","Plastic","Black",150.0,"Portronics",10,5,"Rectangle","Mobile Holder",0.3,"Portronics","India",1,true,"Simple","Box","ABC Traders",4.5,"Available");
        Stand s2 = new Stand(2,"Laptop Stand","Aluminum","Silver",1200.0,"AmazonBasics",15,10,"Rectangle","Laptop Support",1.2,"Amazon","USA",2,true,"Modern","Box","XYZ Traders",4.6,"Available");
        Stand s3 = new Stand(3,"TV Stand","Wood","Brown",3500.0,"Ikea",50,30,"Rectangle","TV Holder",12.0,"Ikea","Sweden",3,false,"Classic","Box","Home Store",4.4,"Available");
        Stand s4 = new Stand(4,"Mic Stand","Steel","Black",800.0,"Boya",40,20,"Round","Microphone",2.5,"Boya","China",2,true,"Professional","Box","Music Shop",4.3,"Available");
        Stand s5 = new Stand(5,"Book Stand","Plastic","Blue",200.0,"Classmate",12,8,"Triangle","Reading",0.5,"ITC","India",1,true,"Student","Packet","Book Store",4.2,"Available");
        Stand s6 = new Stand(6,"Camera Stand","Aluminum","Black",2500.0,"Canon",60,25,"Tripod","Camera",3.0,"Canon","Japan",2,true,"Tripod","Box","Photo Store",4.7,"Available");
        Stand s7 = new Stand(7,"Tablet Stand","Plastic","White",300.0,"Logitech",14,7,"Rectangle","Tablet Holder",0.6,"Logitech","USA",1,true,"Modern","Box","Tech Store",4.3,"Available");
        Stand s8 = new Stand(8,"Flower Stand","Iron","Black",900.0,"HomeDecor",35,15,"Round","Decoration",4.0,"Decor Ltd","India",2,false,"Vintage","Box","Decor Store",4.4,"Available");
        Stand s9 = new Stand(9,"Speaker Stand","Steel","Black",1800.0,"JBL",45,20,"Rectangle","Speaker",5.0,"JBL","USA",2,false,"Professional","Box","Music Shop",4.6,"Available");
        Stand s10 = new Stand(10,"Monitor Stand","Plastic","Gray",700.0,"HP",18,12,"Rectangle","Monitor Support",1.5,"HP","USA",1,false,"Office","Box","Office Store",4.5,"Available");

        s1.toDisplayDetails();
        s2.toDisplayDetails();
        s3.toDisplayDetails();
        s4.toDisplayDetails();
        s5.toDisplayDetails();
        s6.toDisplayDetails();
        s7.toDisplayDetails();
        s8.toDisplayDetails();
        s9.toDisplayDetails();
        s10.toDisplayDetails();
    }
}