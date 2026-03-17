class SalonExecutor {

    public static void main(String[] salons) {

        /*Salon s1 = new Salon();
        s1.salonId = 101;
        s1.customerName = "Rahul";
        s1.location = "Bangalore";
        Service se1 = new Service();
        se1.serviceId = 201;
        se1.serviceName = "Hair Cut";
        se1.price = 250;
        s1.service = se1;
        s1.displaySalonInfo();

        Salon s2 = new Salon();
        s2.salonId = 102;
        s2.customerName = "Anita";
        s2.location = "Bangalore";
        Service se2 = new Service();
        se2.serviceId = 202;
        se2.serviceName = "Hair Styling";
        se2.price = 400;
        s2.service = se2;
        s2.displaySalonInfo();

        Salon s3 = new Salon();
        s3.salonId = 103;
        s3.customerName = "Kiran";
        s3.location = "Bangalore";
        Service se3 = new Service();
        se3.serviceId = 203;
        se3.serviceName = "Facial";
        se3.price = 700;
        s3.service = se3;
        s3.displaySalonInfo();

        Salon s4 = new Salon();
        s4.salonId = 104;
        s4.customerName = "Sneha";
        s4.location = "Bangalore";
        Service se4 = new Service();
        se4.serviceId = 204;
        se4.serviceName = "Hair Coloring";
        se4.price = 1200;
        s4.service = se4;
        s4.displaySalonInfo();

        Salon s5 = new Salon();
        s5.salonId = 105;
        s5.customerName = "Arjun";
        s5.location = "Bangalore";
        Service se5 = new Service();
        se5.serviceId = 205;
        se5.serviceName = "Beard Trim";
        se5.price = 150;
        s5.service = se5;
        s5.displaySalonInfo();

        Salon s6 = new Salon();
        s6.salonId = 106;
        s6.customerName = "Meera";
        s6.location = "Bangalore";
        Service se6 = new Service();
        se6.serviceId = 206;
        se6.serviceName = "Manicure";
        se6.price = 500;
        s6.service = se6;
        s6.displaySalonInfo();

        Salon s7 = new Salon();
        s7.salonId = 107;
        s7.customerName = "Ravi";
        s7.location = "Bangalore";
        Service se7 = new Service();
        se7.serviceId = 207;
        se7.serviceName = "Pedicure";
        se7.price = 550;
        s7.service = se7;
        s7.displaySalonInfo();

        Salon s8 = new Salon();
        s8.salonId = 108;
        s8.customerName = "Priya";
        s8.location = "Bangalore";
        Service se8 = new Service();
        se8.serviceId = 208;
        se8.serviceName = "Hair Spa";
        se8.price = 900;
        s8.service = se8;
        s8.displaySalonInfo();

        Salon s9 = new Salon();
        s9.salonId = 109;
        s9.customerName = "Manoj";
        s9.location = "Bangalore";
        Service se9 = new Service();
        se9.serviceId = 209;
        se9.serviceName = "Head Massage";
        se9.price = 300;
        s9.service = se9;
        s9.displaySalonInfo();

        Salon s10 = new Salon();
        s10.salonId = 110;
        s10.customerName = "Pooja";
        s10.location = "Bangalore";
        Service se10 = new Service();
        se10.serviceId = 210;
        se10.serviceName = "Threading";
        se10.price = 120;
        s10.service = se10;
        s10.displaySalonInfo();

        Salon s11 = new Salon();
        s11.salonId = 111;
        s11.customerName = "Sanjay";
        s11.location = "Bangalore";
        Service se11 = new Service();
        se11.serviceId = 211;
        se11.serviceName = "Hair Wash";
        se11.price = 200;
        s11.service = se11;
        s11.displaySalonInfo();

        Salon s12 = new Salon();
        s12.salonId = 112;
        s12.customerName = "Divya";
        s12.location = "Bangalore";
        Service se12 = new Service();
        se12.serviceId = 212;
        se12.serviceName = "Bridal Makeup";
        se12.price = 5000;
        s12.service = se12;
        s12.displaySalonInfo();

        Salon s13 = new Salon();
        s13.salonId = 113;
        s13.customerName = "Akash";
        s13.location = "Bangalore";
        Service se13 = new Service();
        se13.serviceId = 213;
        se13.serviceName = "Shaving";
        se13.price = 100;
        s13.service = se13;
        s13.displaySalonInfo();

        Salon s14 = new Salon();
        s14.salonId = 114;
        s14.customerName = "Lakshmi";
        s14.location = "Bangalore";
        Service se14 = new Service();
        se14.serviceId = 214;
        se14.serviceName = "Hair Straightening";
        se14.price = 2500;
        s14.service = se14;
        s14.displaySalonInfo();

        Salon s15 = new Salon();
        s15.salonId = 115;
        s15.customerName = "Rohit";
        s15.location = "Bangalore";
        Service se15 = new Service();
        se15.serviceId = 215;
        se15.serviceName = "Hair Smoothening";
        se15.price = 3000;
        s15.service = se15;
        s15.displaySalonInfo();

        Salon s16 = new Salon();
        s16.salonId = 116;
        s16.customerName = "Neha";
        s16.location = "Bangalore";
        Service se16 = new Service();
        se16.serviceId = 216;
        se16.serviceName = "Nail Art";
        se16.price = 600;
        s16.service = se16;
        s16.displaySalonInfo();

        Salon s17 = new Salon();
        s17.salonId = 117;
        s17.customerName = "Karthik";
        s17.location = "Bangalore";
        Service se17 = new Service();
        se17.serviceId = 217;
        se17.serviceName = "Hair Treatment";
        se17.price = 1500;
        s17.service = se17;
        s17.displaySalonInfo();

        Salon s18 = new Salon();
        s18.salonId = 118;
        s18.customerName = "Deepa";
        s18.location = "Bangalore";
        Service se18 = new Service();
        se18.serviceId = 218;
        se18.serviceName = "Waxing";
        se18.price = 800;
        s18.service = se18;
        s18.displaySalonInfo();

        Salon s19 = new Salon();
        s19.salonId = 119;
        s19.customerName = "Vikram";
        s19.location = "Bangalore";
        Service se19 = new Service();
        se19.serviceId = 219;
        se19.serviceName = "Beard Styling";
        se19.price = 200;
        s19.service = se19;
        s19.displaySalonInfo();

        Salon s20 = new Salon();
        s20.salonId = 120;
        s20.customerName = "Anil";
        s20.location = "Bangalore";
        Service se20 = new Service();
        se20.serviceId = 220;
        se20.serviceName = "Hair Spa Premium";
        se20.price = 1200;
        s20.service = se20;
        s20.displaySalonInfo();*/

        Service se1 = new Service(201, "Hair Cut", 250);
        Salon s1 = new Salon(101, "Rahul", "Bangalore", se1);
        s1.displaySalonInfo();

       
        Service se2 = new Service(202, "Hair Styling", 400);
        Salon s2 = new Salon(102, "Anita", "Bangalore", se2);
        s2.displaySalonInfo();

        
        Service se3 = new Service(203, "Facial", 700);
        Salon s3 = new Salon(103, "Kiran", "Bangalore", se3);
        s3.displaySalonInfo();

        
        Service se4 = new Service(204, "Hair Coloring", 1200);
        Salon s4 = new Salon(104, "Sneha", "Bangalore", se4);
        s4.displaySalonInfo();

        
        Service se5 = new Service(205, "Beard Trim", 150);
        Salon s5 = new Salon(105, "Arjun", "Bangalore", se5);
        s5.displaySalonInfo();

        
        Service se6 = new Service(206, "Manicure", 500);
        Salon s6 = new Salon(106, "Meera", "Bangalore", se6);
        s6.displaySalonInfo();

        
        Service se7 = new Service(207, "Pedicure", 550);
        Salon s7 = new Salon(107, "Ravi", "Bangalore", se7);
        s7.displaySalonInfo();

       
        Service se8 = new Service(208, "Hair Spa", 900);
        Salon s8 = new Salon(108, "Priya", "Bangalore", se8);
        s8.displaySalonInfo();

        
        Service se9 = new Service(209, "Head Massage", 300);
        Salon s9 = new Salon(109, "Manoj", "Bangalore", se9);
        s9.displaySalonInfo();

        
        Service se10 = new Service(210, "Threading", 120);
        Salon s10 = new Salon(110, "Pooja", "Bangalore", se10);
        s10.displaySalonInfo();

       
        Service se11 = new Service(211, "Hair Wash", 200);
        Salon s11 = new Salon(111, "Sanjay", "Bangalore", se11);
        s11.displaySalonInfo();

       
        Service se12 = new Service(212, "Bridal Makeup", 5000);
        Salon s12 = new Salon(112, "Divya", "Bangalore", se12);
        s12.displaySalonInfo();

        
        Service se13 = new Service(213, "Shaving", 100);
        Salon s13 = new Salon(113, "Akash", "Bangalore", se13);
        s13.displaySalonInfo();

        
        Service se14 = new Service(214, "Hair Straightening", 2500);
        Salon s14 = new Salon(114, "Lakshmi", "Bangalore", se14);
        s14.displaySalonInfo();

        
        Service se15 = new Service(215, "Hair Smoothening", 3000);
        Salon s15 = new Salon(115, "Rohit", "Bangalore", se15);
        s15.displaySalonInfo();

       
        Service se16 = new Service(216, "Nail Art", 600);
        Salon s16 = new Salon(116, "Neha", "Bangalore", se16);
        s16.displaySalonInfo();

        
        Service se17 = new Service(217, "Hair Treatment", 1500);
        Salon s17 = new Salon(117, "Karthik", "Bangalore", se17);
        s17.displaySalonInfo();

        
        Service se18 = new Service(218, "Waxing", 800);
        Salon s18 = new Salon(118, "Deepa", "Bangalore", se18);
        s18.displaySalonInfo();

       
        Service se19 = new Service(219, "Beard Styling", 200);
        Salon s19 = new Salon(119, "Vikram", "Bangalore", se19);
        s19.displaySalonInfo();

       
        Service se20 = new Service(220, "Hair Spa Premium", 1200);
        Salon s20 = new Salon(120, "Anil", "Bangalore", se20);
        s20.displaySalonInfo();

        
    }
}
