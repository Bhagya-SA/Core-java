class PVRExecutor {

    public static void main(String[] pvr) {

        PVR p1 = new PVR(1,"PVR Cinemas","MG Road",8,1200,true,"IMAX",300,"Bangalore","Karnataka","India","Rajesh Kumar","08012345678","WiFi, Recliners",true,true,"www.pvrcinemas.com",4.5,"10:00 AM","12:00 AM");
        PVR p2 = new PVR(2,"PVR Plaza","Whitefield",6,900,true,"Standard",250,"Bangalore","Karnataka","India","Anil Sharma","08087654321","WiFi, Snack Bar",true,true,"www.pvrcinemas.com",4.3,"10:00 AM","11:30 PM");
        PVR p3 = new PVR(3,"PVR Orion","Rajajinagar",7,1000,true,"IMAX",320,"Bangalore","Karnataka","India","Sunil Reddy","08023456789","Parking, Recliners",true,true,"www.pvrcinemas.com",4.6,"09:30 AM","12:00 AM");
        PVR p4 = new PVR(4,"PVR Forum","Koramangala",5,800,false,"Standard",280,"Bangalore","Karnataka","India","Deepak Jain","08034567890","WiFi, Snack Bar",true,true,"www.pvrcinemas.com",4.4,"10:00 AM","11:45 PM");
        PVR p5 = new PVR(5,"PVR Phoenix","Indiranagar",6,850,true,"IMAX",300,"Bangalore","Karnataka","India","Vikram Singh","08045678901","Recliners, Food Court",true,true,"www.pvrcinemas.com",4.5,"10:00 AM","12:00 AM");
        PVR p6 = new PVR(6,"PVR Central","Jayanagar",4,700,false,"Standard",220,"Bangalore","Karnataka","India","Ramesh Gupta","08056789012","WiFi, Parking",false,true,"www.pvrcinemas.com",4.2,"10:30 AM","11:30 PM");
        PVR p7 = new PVR(7,"PVR Utsav","HSR Layout",5,750,true,"IMAX",310,"Bangalore","Karnataka","India","Suresh Menon","08067890123","Recliners, Snack Bar",true,true,"www.pvrcinemas.com",4.4,"10:00 AM","12:00 AM");
        PVR p8 = new PVR(8,"PVR Cinepolis","Whitefield",6,900,true,"Standard",260,"Bangalore","Karnataka","India","Naveen Kumar","08078901234","WiFi, Food Court",true,true,"www.pvrcinemas.com",4.3,"10:00 AM","11:45 PM");
        PVR p9 = new PVR(9,"PVR Vega","Rajajinagar",7,1000,true,"IMAX",320,"Bangalore","Karnataka","India","Ajay Sharma","08089012345","Parking, Recliners",true,true,"www.pvrcinemas.com",4.6,"09:30 AM","12:00 AM");
        PVR p10 = new PVR(10,"PVR Alpha","Koramangala",5,800,false,"Standard",270,"Bangalore","Karnataka","India","Rohit Verma","08090123456","WiFi, Snack Bar",true,true,"www.pvrcinemas.com",4.4,"10:00 AM","11:45 PM");

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