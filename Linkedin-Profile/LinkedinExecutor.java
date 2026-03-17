class LinkedinExecutor {

    public static void main(String[] args) {

        /*Linkedin l1 = new Linkedin();
        l1.linkedinId = 101;
        l1.userName = "Rahul";
        l1.email = "rahul@gmail.com";
        Profile p1 = new Profile();
        p1.profileId = 201;
        p1.designation = "Software Engineer";
        p1.company = "TCS";
        l1.profile = p1;
        l1.displayLinkedinInfo();

        Linkedin l2 = new Linkedin();
        l2.linkedinId = 102;
        l2.userName = "Anita";
        l2.email = "anita@gmail.com";
        Profile p2 = new Profile();
        p2.profileId = 202;
        p2.designation = "Data Analyst";
        p2.company = "Infosys";
        l2.profile = p2;
        l2.displayLinkedinInfo();

        Linkedin l3 = new Linkedin();
        l3.linkedinId = 103;
        l3.userName = "Kiran";
        l3.email = "kiran@gmail.com";
        Profile p3 = new Profile();
        p3.profileId = 203;
        p3.designation = "Web Developer";
        p3.company = "Wipro";
        l3.profile = p3;
        l3.displayLinkedinInfo();

        Linkedin l4 = new Linkedin();
        l4.linkedinId = 104;
        l4.userName = "Sneha";
        l4.email = "sneha@gmail.com";
        Profile p4 = new Profile();
        p4.profileId = 204;
        p4.designation = "Cloud Engineer";
        p4.company = "Amazon";
        l4.profile = p4;
        l4.displayLinkedinInfo();

        Linkedin l5 = new Linkedin();
        l5.linkedinId = 105;
        l5.userName = "Arjun";
        l5.email = "arjun@gmail.com";
        Profile p5 = new Profile();
        p5.profileId = 205;
        p5.designation = "AI Engineer";
        p5.company = "Google";
        l5.profile = p5;
        l5.displayLinkedinInfo();

        Linkedin l6 = new Linkedin();
        l6.linkedinId = 106;
        l6.userName = "Meera";
        l6.email = "meera@gmail.com";
        Profile p6 = new Profile();
        p6.profileId = 206;
        p6.designation = "System Engineer";
        p6.company = "IBM";
        l6.profile = p6;
        l6.displayLinkedinInfo();

        Linkedin l7 = new Linkedin();
        l7.linkedinId = 107;
        l7.userName = "Ravi";
        l7.email = "ravi@gmail.com";
        Profile p7 = new Profile();
        p7.profileId = 207;
        p7.designation = "DevOps Engineer";
        p7.company = "Oracle";
        l7.profile = p7;
        l7.displayLinkedinInfo();

        Linkedin l8 = new Linkedin();
        l8.linkedinId = 108;
        l8.userName = "Priya";
        l8.email = "priya@gmail.com";
        Profile p8 = new Profile();
        p8.profileId = 208;
        p8.designation = "UI/UX Designer";
        p8.company = "Adobe";
        l8.profile = p8;
        l8.displayLinkedinInfo();

        Linkedin l9 = new Linkedin();
        l9.linkedinId = 109;
        l9.userName = "Manoj";
        l9.email = "manoj@gmail.com";
        Profile p9 = new Profile();
        p9.profileId = 209;
        p9.designation = "Security Analyst";
        p9.company = "Cisco";
        l9.profile = p9;
        l9.displayLinkedinInfo();

        Linkedin l10 = new Linkedin();
        l10.linkedinId = 110;
        l10.userName = "Pooja";
        l10.email = "pooja@gmail.com";
        Profile p10 = new Profile();
        p10.profileId = 210;
        p10.designation = "Database Administrator";
        p10.company = "Accenture";
        l10.profile = p10;
        l10.displayLinkedinInfo();

        Linkedin l11 = new Linkedin();
        l11.linkedinId = 111;
        l11.userName = "Sanjay";
        l11.email = "sanjay@gmail.com";
        Profile p11 = new Profile();
        p11.profileId = 211;
        p11.designation = "Backend Developer";
        p11.company = "Meta";
        l11.profile = p11;
        l11.displayLinkedinInfo();

        Linkedin l12 = new Linkedin();
        l12.linkedinId = 112;
        l12.userName = "Divya";
        l12.email = "divya@gmail.com";
        Profile p12 = new Profile();
        p12.profileId = 212;
        p12.designation = "Mobile Developer";
        p12.company = "Samsung";
        l12.profile = p12;
        l12.displayLinkedinInfo();

        Linkedin l13 = new Linkedin();
        l13.linkedinId = 113;
        l13.userName = "Akash";
        l13.email = "akash@gmail.com";
        Profile p13 = new Profile();
        p13.profileId = 213;
        p13.designation = "Full Stack Developer";
        p13.company = "Flipkart";
        l13.profile = p13;
        l13.displayLinkedinInfo();

        Linkedin l14 = new Linkedin();
        l14.linkedinId = 114;
        l14.userName = "Lakshmi";
        l14.email = "lakshmi@gmail.com";
        Profile p14 = new Profile();
        p14.profileId = 214;
        p14.designation = "QA Engineer";
        p14.company = "Capgemini";
        l14.profile = p14;
        l14.displayLinkedinInfo();

        Linkedin l15 = new Linkedin();
        l15.linkedinId = 115;
        l15.userName = "Rohit";
        l15.email = "rohit@gmail.com";
        Profile p15 = new Profile();
        p15.profileId = 215;
        p15.designation = "Machine Learning Engineer";
        p15.company = "Microsoft";
        l15.profile = p15;
        l15.displayLinkedinInfo();

        Linkedin l16 = new Linkedin();
        l16.linkedinId = 116;
        l16.userName = "Neha";
        l16.email = "neha@gmail.com";
        Profile p16 = new Profile();
        p16.profileId = 216;
        p16.designation = "Product Manager";
        p16.company = "Uber";
        l16.profile = p16;
        l16.displayLinkedinInfo();

        Linkedin l17 = new Linkedin();
        l17.linkedinId = 117;
        l17.userName = "Karthik";
        l17.email = "karthik@gmail.com";
        Profile p17 = new Profile();
        p17.profileId = 217;
        p17.designation = "Blockchain Developer";
        p17.company = "Coinbase";
        l17.profile = p17;
        l17.displayLinkedinInfo();

        Linkedin l18 = new Linkedin();
        l18.linkedinId = 118;
        l18.userName = "Deepa";
        l18.email = "deepa@gmail.com";
        Profile p18 = new Profile();
        p18.profileId = 218;
        p18.designation = "Network Engineer";
        p18.company = "Juniper";
        l18.profile = p18;
        l18.displayLinkedinInfo();

        Linkedin l19 = new Linkedin();
        l19.linkedinId = 119;
        l19.userName = "Vikram";
        l19.email = "vikram@gmail.com";
        Profile p19 = new Profile();
        p19.profileId = 219;
        p19.designation = "Game Developer";
        p19.company = "Unity";
        l19.profile = p19;
        l19.displayLinkedinInfo();

        Linkedin l20 = new Linkedin();
        l20.linkedinId = 120;
        l20.userName = "Anil";
        l20.email = "anil@gmail.com";
        Profile p20 = new Profile();
        p20.profileId = 220;
        p20.designation = "Cyber Security Engineer";
        p20.company = "Palo Alto";
        l20.profile = p20;
        l20.displayLinkedinInfo(); */

         Profile p1 = new Profile(201, "Software Engineer", "TCS");
        Linkedin l1 = new Linkedin(101, "Rahul", "rahul@gmail.com", p1);
        l1.displayLinkedinInfo();

        Profile p2 = new Profile(202, "Data Analyst", "Infosys");
        Linkedin l2 = new Linkedin(102, "Anita", "anita@gmail.com", p2);
        l2.displayLinkedinInfo();

        Profile p3 = new Profile(203, "Web Developer", "Wipro");
        Linkedin l3 = new Linkedin(103, "Kiran", "kiran@gmail.com", p3);
        l3.displayLinkedinInfo();

        Profile p4 = new Profile(204, "Cloud Engineer", "Amazon");
        Linkedin l4 = new Linkedin(104, "Sneha", "sneha@gmail.com", p4);
        l4.displayLinkedinInfo();

        Profile p5 = new Profile(205, "AI Engineer", "Google");
        Linkedin l5 = new Linkedin(105, "Arjun", "arjun@gmail.com", p5);
        l5.displayLinkedinInfo();

        Profile p6 = new Profile(206, "System Engineer", "IBM");
        Linkedin l6 = new Linkedin(106, "Meera", "meera@gmail.com", p6);
        l6.displayLinkedinInfo();

        Profile p7 = new Profile(207, "DevOps Engineer", "Oracle");
        Linkedin l7 = new Linkedin(107, "Ravi", "ravi@gmail.com", p7);
        l7.displayLinkedinInfo();

        Profile p8 = new Profile(208, "UI/UX Designer", "Adobe");
        Linkedin l8 = new Linkedin(108, "Priya", "priya@gmail.com", p8);
        l8.displayLinkedinInfo();

        Profile p9 = new Profile(209, "Security Analyst", "Cisco");
        Linkedin l9 = new Linkedin(109, "Manoj", "manoj@gmail.com", p9);
        l9.displayLinkedinInfo();

        Profile p10 = new Profile(210, "Database Administrator", "Accenture");
        Linkedin l10 = new Linkedin(110, "Pooja", "pooja@gmail.com", p10);
        l10.displayLinkedinInfo();

        Profile p11 = new Profile(211, "Backend Developer", "Meta");
        Linkedin l11 = new Linkedin(111, "Sanjay", "sanjay@gmail.com", p11);
        l11.displayLinkedinInfo();

        Profile p12 = new Profile(212, "Mobile Developer", "Samsung");
        Linkedin l12 = new Linkedin(112, "Divya", "divya@gmail.com", p12);
        l12.displayLinkedinInfo();

        Profile p13 = new Profile(213, "Full Stack Developer", "Flipkart");
        Linkedin l13 = new Linkedin(113, "Akash", "akash@gmail.com", p13);
        l13.displayLinkedinInfo();

        Profile p14 = new Profile(214, "QA Engineer", "Capgemini");
        Linkedin l14 = new Linkedin(114, "Lakshmi", "lakshmi@gmail.com", p14);
        l14.displayLinkedinInfo();

        Profile p15 = new Profile(215, "Machine Learning Engineer", "Microsoft");
        Linkedin l15 = new Linkedin(115, "Rohit", "rohit@gmail.com", p15);
        l15.displayLinkedinInfo();

        Profile p16 = new Profile(216, "Product Manager", "Uber");
        Linkedin l16 = new Linkedin(116, "Neha", "neha@gmail.com", p16);
        l16.displayLinkedinInfo();

        Profile p17 = new Profile(217, "Blockchain Developer", "Coinbase");
        Linkedin l17 = new Linkedin(117, "Karthik", "karthik@gmail.com", p17);
        l17.displayLinkedinInfo();

        Profile p18 = new Profile(218, "Network Engineer", "Juniper");
        Linkedin l18 = new Linkedin(118, "Deepa", "deepa@gmail.com", p18);
        l18.displayLinkedinInfo();

        Profile p19 = new Profile(219, "Game Developer", "Unity");
        Linkedin l19 = new Linkedin(119, "Vikram", "vikram@gmail.com", p19);
        l19.displayLinkedinInfo();

        Profile p20 = new Profile(220, "Cyber Security Engineer", "Palo Alto");
        Linkedin l20 = new Linkedin(120, "Anil", "anil@gmail.com", p20);
        l20.displayLinkedinInfo();
    }
}
