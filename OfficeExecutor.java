class OfficeExecutor {

    public static void main(String[] office) {

        Office o1 = new Office(1,"TechCorp","Downtown",5,20,150,1200,"Alice Smith","IT",true,true,"Comcast",true,"USA","New York","09:00","18:00","123-456-7890",4.5,"Open");
        Office o2 = new Office(2,"InnoWorks","Midtown",7,25,200,1500,"Bob Johnson","R&D",true,true,"AT&T",true,"USA","Chicago","09:30","18:30","234-567-8901",4.4,"Open");
        Office o3 = new Office(3,"DesignHub","Uptown",3,15,80,900,"Carol Lee","Design",false,true,"Verizon",true,"USA","San Francisco","08:30","17:30","345-678-9012",4.6,"Open");
        Office o4 = new Office(4,"FinServe","Business District",10,30,250,2000,"David Brown","Finance",true,true,"Comcast",true,"USA","Boston","09:00","19:00","456-789-0123",4.7,"Open");
        Office o5 = new Office(5,"EduTech","Tech Park",4,18,120,1000,"Eva Wilson","Education",true,false,"AT&T",true,"USA","Seattle","09:00","18:00","567-890-1234",4.3,"Open");
        Office o6 = new Office(6,"MediLab","Health Complex",6,22,160,1300,"Frank Martin","Medical",true,true,"Verizon",true,"USA","Houston","08:30","17:30","678-901-2345",4.5,"Open");
        Office o7 = new Office(7,"EcoSolutions","Green Park",2,12,70,800,"Grace Kim","Environmental",false,true,"Comcast",true,"USA","Denver","09:00","17:00","789-012-3456",4.2,"Open");
        Office o8 = new Office(8,"BuildIt","Industrial Area",8,28,220,1800,"Henry Patel","Engineering",true,true,"AT&T",true,"USA","Dallas","09:00","18:30","890-123-4567",4.4,"Open");
        Office o9 = new Office(9,"MediaWorks","City Center",5,20,140,1200,"Isabella Chen","Media",true,false,"Verizon",true,"USA","Los Angeles","09:00","18:00","901-234-5678",4.5,"Open");
        Office o10 = new Office(10,"LawFirm","Downtown",6,18,110,1000,"Jack Thompson","Legal",false,true,"Comcast",true,"USA","Miami","09:00","18:00","012-345-6789",4.3,"Open");

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