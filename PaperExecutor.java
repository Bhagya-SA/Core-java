class PaperExecutor {

    public static void main(String[] args) {

        Paper p1 = new Paper(1,"JK","A4","White",250,"A4",500,"High","Wood","Printing",70,"Thin","JK Papers","India",true,"Smooth","Bundle","ABC Traders",4.5,"Available");
        Paper p2 = new Paper(2,"Classmate","A3","White",300,"A3",400,"Premium","Wood","Drawing",80,"Medium","ITC","India",false,"Smooth","Bundle","XYZ Traders",4.3,"Available");
        Paper p3 = new Paper(3,"Navneet","Chart","Blue",50,"Large",50,"Good","Fiber","Craft",60,"Thick","Navneet","India",true,"Rough","Pack","Craft Store",4.1,"Available");
        Paper p4 = new Paper(4,"JK","Bond","White",200,"A4",300,"High","Wood","Office",75,"Thin","JK Papers","India",false,"Smooth","Bundle","Office Mart",4.4,"Available");
        Paper p5 = new Paper(5,"PaperOne","Glossy","White",350,"A4",250,"Premium","Wood","Photo",90,"Medium","PaperOne","USA",false,"Glossy","Pack","Photo Store",4.6,"Available");
        Paper p6 = new Paper(6,"Classmate","Notebook","White",120,"A4",200,"Good","Wood","Writing",65,"Thin","ITC","India",true,"Smooth","Bundle","School Store",4.2,"Available");
        Paper p7 = new Paper(7,"Navneet","Craft","Brown",80,"Medium",150,"Standard","Fiber","Craft",70,"Thick","Navneet","India",true,"Rough","Pack","Art Shop",4.0,"Available");
        Paper p8 = new Paper(8,"JK","A4","White",260,"A4",450,"High","Wood","Printing",72,"Thin","JK Papers","India",false,"Smooth","Bundle","ABC Traders",4.3,"Available");
        Paper p9 = new Paper(9,"PaperOne","Glossy","White",360,"A4",220,"Premium","Wood","Photo",95,"Medium","PaperOne","USA",false,"Glossy","Pack","Photo Store",4.7,"Available");
        Paper p10 = new Paper(10,"Classmate","Drawing","White",180,"A3",180,"High","Wood","Drawing",85,"Thick","ITC","India",true,"Smooth","Bundle","Art World",4.4,"Available");

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