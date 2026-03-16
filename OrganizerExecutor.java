class OrganizerExecutor {

    public static void main(String[] organizer) {

        Organizer o1 = new Organizer(1,"Desk Organizer","Stationery","Plastic","Blue",30,20,10,500,6,true,true,"OfficeMate","OM Pvt Ltd","India",1200,"Office","Modern",4.5,"Available");
        Organizer o2 = new Organizer(2,"Drawer Organizer","Stationery","Wood","Brown",35,25,12,700,8,false,true,"WoodWorks","WW Pvt Ltd","India",1500,"Home","Classic",4.6,"Available");
        Organizer o3 = new Organizer(3,"Travel Organizer","Travel","Fabric","Black",25,15,8,400,5,true,true,"TravelPro","TP Inc","USA",1800,"Travel","Compact",4.4,"Available");
        Organizer o4 = new Organizer(4,"Cosmetic Organizer","Personal Care","Acrylic","Transparent",20,15,10,350,4,false,true,"BeautyMate","BM Pvt Ltd","India",1000,"Vanity","Elegant",4.5,"Available");
        Organizer o5 = new Organizer(5,"Jewelry Organizer","Personal Care","Leather","Red",18,12,8,300,6,true,true,"Jewels","JJ Pvt Ltd","Italy",2500,"Jewelry","Premium",4.7,"Available");
        Organizer o6 = new Organizer(6,"Stationery Organizer","Stationery","Metal","Silver",28,18,10,600,7,true,false,"MetalWorks","MW Pvt Ltd","India",1400,"Office","Sleek",4.3,"Available");
        Organizer o7 = new Organizer(7,"Book Organizer","Stationery","Wood","Brown",40,25,15,900,10,false,false,"BookMate","BM Inc","USA",2000,"Library","Classic",4.6,"Available");
        Organizer o8 = new Organizer(8,"Makeup Organizer","Personal Care","Acrylic","Pink",22,18,12,450,5,true,true,"GlamUp","GU Pvt Ltd","India",1300,"Vanity","Trendy",4.5,"Available");
        Organizer o9 = new Organizer(9,"Cable Organizer","Electronics","Silicone","Black",15,10,5,150,3,true,true,"TechMate","TM Inc","China",800,"Cables","Compact",4.4,"Available");
        Organizer o10 = new Organizer(10,"Art Supplies Organizer","Stationery","Plastic","Green",30,20,12,550,8,false,true,"ArtBox","AB Pvt Ltd","India",1600,"Art","Colorful",4.5,"Available");

        o1.toDisplayDetails();
        o2.toDisplayDetails();
        o3.toDisplayDetails();
        o4.toDisplayDetails();
        o5.toDisplayDetails();
        o6.toDisplayDetails();
        o7.toDisplayDetails();
        o8.toDisplayDetails();
        o9.toDisplayDetails();
        o10.toDisplayDetails();
    }
}