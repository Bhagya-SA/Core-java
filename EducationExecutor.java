class EducationExecutor {

    public static void main(String[] education) {

        Education e1 = new Education(1,"Springfield High School","School","CBSE","Mr. John Doe","Springfield","USA",1995,1200,80,40,5,true,true,false,5000,"Science, Arts, Commerce",4.5,"NAAC A+","Open");
        Education e2 = new Education(2,"Greenfield College","College","State Board","Dr. Alice Smith","Greenfield","India",2000,2500,150,60,10,true,true,true,15000,"Engineering, Management",4.6,"NAAC A","Open");
        Education e3 = new Education(3,"Oxford University","University","UK Board","Prof. Richard Brown","Oxford","UK",1200,20000,1500,500,100,true,true,true,50000,"Science, Arts, Law, Medicine",4.9,"NAAC A++","Open");
        Education e4 = new Education(4,"Sunrise International School","School","ICSE","Ms. Clara Lee","Mumbai","India",1998,1000,70,35,6,true,true,false,6000,"Science, Arts",4.4,"NAAC A","Open");
        Education e5 = new Education(5,"Global Institute of Technology","College","State Board","Dr. Peter Wang","Bangalore","India",2005,4000,250,80,15,true,true,true,20000,"Engineering, Computer Science",4.7,"NAAC A+","Open");
        Education e6 = new Education(6,"Cambridge University","University","UK Board","Prof. Michael White","Cambridge","UK",1209,18000,1200,400,90,true,true,true,52000,"Science, Arts, Law, Business",4.8,"NAAC A++","Open");
        Education e7 = new Education(7,"Horizon School","School","CBSE","Mr. David Kim","Seoul","South Korea",1985,800,50,30,4,true,true,false,5500,"Science, Arts",4.5,"NAAC A","Open");
        Education e8 = new Education(8,"TechVille College","College","State Board","Dr. Susan Green","New York","USA",2010,3000,180,70,12,true,true,true,18000,"Engineering, IT",4.6,"NAAC A+","Open");
        Education e9 = new Education(9,"Harvard University","University","US Board","Prof. Elizabeth Black","Cambridge","USA",1636,22000,1400,450,110,true,true,true,55000,"Science, Arts, Law, Medicine, Business",4.9,"NAAC A++","Open");
        Education e10 = new Education(10,"Maple Leaf School","School","ICSE","Ms. Anna Johnson","Toronto","Canada",1990,950,60,32,5,true,true,false,6000,"Science, Arts",4.5,"NAAC A","Open");

        e1.toDisplayDetails();
        e2.toDisplayDetails();
        e3.toDisplayDetails();
        e4.toDisplayDetails();
        e5.toDisplayDetails();
        e6.toDisplayDetails();
        e7.toDisplayDetails();
        e8.toDisplayDetails();
        e9.toDisplayDetails();
        e10.toDisplayDetails();
    }
}