class ToxicExecutor {

    public static void main(String[] toxic) {

        Toxic t1 = new Toxic(1,"Toxic","Action","Kannada","Geethu Mohandas","KVN Productions","Yash","Nayanthara",2025,200,0,150,"Charan Raj","KVN","India","UA",0.0,"Theatre",false,"Upcoming");
        Toxic t2 = new Toxic(2,"Toxic 2","Action","Kannada","Geethu Mohandas","KVN Productions","Yash","Rashmika",2027,250,0,155,"Charan Raj","KVN","India","UA",0.0,"Theatre",true,"Upcoming");
        Toxic t3 = new Toxic(3,"Toxic Rise","Action","Hindi","Rohit Shetty","Reliance","Ranveer Singh","Deepika Padukone",2024,180,350,145,"Pritam","Reliance","India","UA",4.5,"Theatre",false,"Released");
        Toxic t4 = new Toxic(4,"Toxic War","Thriller","English","Christopher Nolan","Warner Bros","John David","Anne Hathaway",2023,300,700,160,"Hans Zimmer","WB","USA","A",4.8,"Theatre",false,"Released");
        Toxic t5 = new Toxic(5,"Toxic City","Crime","Tamil","Lokesh Kanagaraj","Seven Screen","Vijay","Trisha",2022,150,400,148,"Anirudh","Seven Screen","India","UA",4.6,"Theatre",false,"Released");
        Toxic t6 = new Toxic(6,"Toxic Power","Action","Telugu","Sukumar","Mythri","Allu Arjun","Pooja Hegde",2023,170,500,152,"Devi Sri Prasad","Mythri","India","UA",4.7,"Theatre",false,"Released");
        Toxic t7 = new Toxic(7,"Toxic Game","Thriller","Hindi","Sriram Raghavan","TSeries","Ayushmann","Tabu",2021,90,200,135,"Amit Trivedi","TSeries","India","UA",4.2,"OTT",false,"Released");
        Toxic t8 = new Toxic(8,"Toxic Shadow","Action","English","James Gunn","Marvel","Chris Pratt","Zoe Saldana",2022,220,650,140,"Tyler Bates","Marvel","USA","UA",4.4,"Theatre",false,"Released");
        Toxic t9 = new Toxic(9,"Toxic World","SciFi","English","Denis Villeneuve","Legendary","Timothee","Zendaya",2024,250,720,165,"Hans Zimmer","Legendary","USA","UA",4.7,"Theatre",false,"Released");
        Toxic t10 = new Toxic(10,"Toxic Legacy","Drama","Hindi","Rajkumar Hirani","Vinod Chopra","Aamir Khan","Kareena Kapoor",2020,120,300,155,"Shantanu Moitra","Vinod Chopra","India","U",4.3,"OTT",false,"Released");

        t1.toDisplayDetails();
        t2.toDisplayDetails();
        t3.toDisplayDetails();
        t4.toDisplayDetails();
        t5.toDisplayDetails();
        t6.toDisplayDetails();
        t7.toDisplayDetails();
        t8.toDisplayDetails();
        t9.toDisplayDetails();
        t10.toDisplayDetails();
    }
}