class VVPuramExecutor {

    public static void main(String[] foodStreet) {

        /*VVPuram v1 = new VVPuram();
        v1.streetId = 101;
        v1.visitorName = "Rahul";
        v1.city = "Bangalore";
        FoodStreet f1 = new FoodStreet();
        f1.foodId = 201;
        f1.foodName = "Masala Dosa";
        f1.price = 60;
        v1.foodStreet = f1;
        v1.displayStreetInfo();

        VVPuram v2 = new VVPuram();
        v2.streetId = 102;
        v2.visitorName = "Anita";
        v2.city = "Bangalore";
        FoodStreet f2 = new FoodStreet();
        f2.foodId = 202;
        f2.foodName = "Pani Puri";
        f2.price = 40;
        v2.foodStreet = f2;
        v2.displayStreetInfo();

        VVPuram v3 = new VVPuram();
        v3.streetId = 103;
        v3.visitorName = "Kiran";
        v3.city = "Bangalore";
        FoodStreet f3 = new FoodStreet();
        f3.foodId = 203;
        f3.foodName = "Chole Bhature";
        f3.price = 80;
        v3.foodStreet = f3;
        v3.displayStreetInfo();

        VVPuram v4 = new VVPuram();
        v4.streetId = 104;
        v4.visitorName = "Sneha";
        v4.city = "Bangalore";
        FoodStreet f4 = new FoodStreet();
        f4.foodId = 204;
        f4.foodName = "Pav Bhaji";
        f4.price = 90;
        v4.foodStreet = f4;
        v4.displayStreetInfo();

        VVPuram v5 = new VVPuram();
        v5.streetId = 105;
        v5.visitorName = "Arjun";
        v5.city = "Bangalore";
        FoodStreet f5 = new FoodStreet();
        f5.foodId = 205;
        f5.foodName = "Vada Pav";
        f5.price = 35;
        v5.foodStreet = f5;
        v5.displayStreetInfo();

        VVPuram v6 = new VVPuram();
        v6.streetId = 106;
        v6.visitorName = "Meera";
        v6.city = "Bangalore";
        FoodStreet f6 = new FoodStreet();
        f6.foodId = 206;
        f6.foodName = "Bhel Puri";
        f6.price = 50;
        v6.foodStreet = f6;
        v6.displayStreetInfo();

        VVPuram v7 = new VVPuram();
        v7.streetId = 107;
        v7.visitorName = "Ravi";
        v7.city = "Bangalore";
        FoodStreet f7 = new FoodStreet();
        f7.foodId = 207;
        f7.foodName = "Gobi Manchurian";
        f7.price = 70;
        v7.foodStreet = f7;
        v7.displayStreetInfo();

        VVPuram v8 = new VVPuram();
        v8.streetId = 108;
        v8.visitorName = "Priya";
        v8.city = "Bangalore";
        FoodStreet f8 = new FoodStreet();
        f8.foodId = 208;
        f8.foodName = "Idli";
        f8.price = 30;
        v8.foodStreet = f8;
        v8.displayStreetInfo();

        VVPuram v9 = new VVPuram();
        v9.streetId = 109;
        v9.visitorName = "Manoj";
        v9.city = "Bangalore";
        FoodStreet f9 = new FoodStreet();
        f9.foodId = 209;
        f9.foodName = "Ragi Dosa";
        f9.price = 65;
        v9.foodStreet = f9;
        v9.displayStreetInfo();

        VVPuram v10 = new VVPuram();
        v10.streetId = 110;
        v10.visitorName = "Pooja";
        v10.city = "Bangalore";
        FoodStreet f10 = new FoodStreet();
        f10.foodId = 210;
        f10.foodName = "Mysore Pak";
        f10.price = 50;
        v10.foodStreet = f10;
        v10.displayStreetInfo();

        VVPuram v11 = new VVPuram();
        v11.streetId = 111;
        v11.visitorName = "Sanjay";
        v11.city = "Bangalore";
        FoodStreet f11 = new FoodStreet();
        f11.foodId = 211;
        f11.foodName = "Jalebi";
        f11.price = 45;
        v11.foodStreet = f11;
        v11.displayStreetInfo();

        VVPuram v12 = new VVPuram();
        v12.streetId = 112;
        v12.visitorName = "Divya";
        v12.city = "Bangalore";
        FoodStreet f12 = new FoodStreet();
        f12.foodId = 212;
        f12.foodName = "Kachori";
        f12.price = 40;
        v12.foodStreet = f12;
        v12.displayStreetInfo();

        VVPuram v13 = new VVPuram();
        v13.streetId = 113;
        v13.visitorName = "Akash";
        v13.city = "Bangalore";
        FoodStreet f13 = new FoodStreet();
        f13.foodId = 213;
        f13.foodName = "Paneer Tikka";
        f13.price = 120;
        v13.foodStreet = f13;
        v13.displayStreetInfo();

        VVPuram v14 = new VVPuram();
        v14.streetId = 114;
        v14.visitorName = "Lakshmi";
        v14.city = "Bangalore";
        FoodStreet f14 = new FoodStreet();
        f14.foodId = 214;
        f14.foodName = "Samosa";
        f14.price = 25;
        v14.foodStreet = f14;
        v14.displayStreetInfo();

        VVPuram v15 = new VVPuram();
        v15.streetId = 115;
        v15.visitorName = "Rohit";
        v15.city = "Bangalore";
        FoodStreet f15 = new FoodStreet();
        f15.foodId = 215;
        f15.foodName = "Dahi Puri";
        f15.price = 50;
        v15.foodStreet = f15;
        v15.displayStreetInfo();

        VVPuram v16 = new VVPuram();
        v16.streetId = 116;
        v16.visitorName = "Neha";
        v16.city = "Bangalore";
        FoodStreet f16 = new FoodStreet();
        f16.foodId = 216;
        f16.foodName = "Falooda";
        f16.price = 70;
        v16.foodStreet = f16;
        v16.displayStreetInfo();

        VVPuram v17 = new VVPuram();
        v17.streetId = 117;
        v17.visitorName = "Karthik";
        v17.city = "Bangalore";
        FoodStreet f17 = new FoodStreet();
        f17.foodId = 217;
        f17.foodName = "Ice Cream";
        f17.price = 60;
        v17.foodStreet = f17;
        v17.displayStreetInfo();

        VVPuram v18 = new VVPuram();
        v18.streetId = 118;
        v18.visitorName = "Deepa";
        v18.city = "Bangalore";
        FoodStreet f18 = new FoodStreet();
        f18.foodId = 218;
        f18.foodName = "Kulfi";
        f18.price = 55;
        v18.foodStreet = f18;
        v18.displayStreetInfo();

        VVPuram v19 = new VVPuram();
        v19.streetId = 119;
        v19.visitorName = "Vikram";
        v19.city = "Bangalore";
        FoodStreet f19 = new FoodStreet();
        f19.foodId = 219;
        f19.foodName = "Badam Milk";
        f19.price = 45;
        v19.foodStreet = f19;
        v19.displayStreetInfo();

        VVPuram v20 = new VVPuram();
        v20.streetId = 120;
        v20.visitorName = "Anil";
        v20.city = "Bangalore";
        FoodStreet f20 = new FoodStreet();
        f20.foodId = 220;
        f20.foodName = "Gulab Jamun";
        f20.price = 40;
        v20.foodStreet = f20;
        v20.displayStreetInfo();*/

        VVPuram v1 = new VVPuram(101, "Rahul", "Bangalore", new FoodStreet(201, "Masala Dosa", 60));
        v1.displayStreetInfo();

        VVPuram v2 = new VVPuram(102, "Anita", "Bangalore", new FoodStreet(202, "Pani Puri", 40));
        v2.displayStreetInfo();

        VVPuram v3 = new VVPuram(103, "Kiran", "Bangalore", new FoodStreet(203, "Chole Bhature", 80));
        v3.displayStreetInfo();

        VVPuram v4 = new VVPuram(104, "Sneha", "Bangalore", new FoodStreet(204, "Pav Bhaji", 90));
        v4.displayStreetInfo();

        VVPuram v5 = new VVPuram(105, "Arjun", "Bangalore", new FoodStreet(205, "Vada Pav", 35));
        v5.displayStreetInfo();

        VVPuram v6 = new VVPuram(106, "Meera", "Bangalore", new FoodStreet(206, "Bhel Puri", 50));
        v6.displayStreetInfo();

        VVPuram v7 = new VVPuram(107, "Ravi", "Bangalore", new FoodStreet(207, "Gobi Manchurian", 70));
        v7.displayStreetInfo();

        VVPuram v8 = new VVPuram(108, "Priya", "Bangalore", new FoodStreet(208, "Idli", 30));
        v8.displayStreetInfo();

        VVPuram v9 = new VVPuram(109, "Manoj", "Bangalore", new FoodStreet(209, "Ragi Dosa", 65));
        v9.displayStreetInfo();

        VVPuram v10 = new VVPuram(110, "Pooja", "Bangalore", new FoodStreet(210, "Mysore Pak", 50));
        v10.displayStreetInfo();

        VVPuram v11 = new VVPuram(111, "Sanjay", "Bangalore", new FoodStreet(211, "Jalebi", 45));
        v11.displayStreetInfo();

        VVPuram v12 = new VVPuram(112, "Divya", "Bangalore", new FoodStreet(212, "Kachori", 40));
        v12.displayStreetInfo();

        VVPuram v13 = new VVPuram(113, "Akash", "Bangalore", new FoodStreet(213, "Paneer Tikka", 120));
        v13.displayStreetInfo();

        VVPuram v14 = new VVPuram(114, "Lakshmi", "Bangalore", new FoodStreet(214, "Samosa", 25));
        v14.displayStreetInfo();

        VVPuram v15 = new VVPuram(115, "Rohit", "Bangalore", new FoodStreet(215, "Dahi Puri", 50));
        v15.displayStreetInfo();

        VVPuram v16 = new VVPuram(116, "Neha", "Bangalore", new FoodStreet(216, "Falooda", 70));
        v16.displayStreetInfo();

        VVPuram v17 = new VVPuram(117, "Karthik", "Bangalore", new FoodStreet(217, "Ice Cream", 60));
        v17.displayStreetInfo();

        VVPuram v18 = new VVPuram(118, "Deepa", "Bangalore", new FoodStreet(218, "Kulfi", 55));
        v18.displayStreetInfo();

        VVPuram v19 = new VVPuram(119, "Vikram", "Bangalore", new FoodStreet(219, "Badam Milk", 45));
        v19.displayStreetInfo();

        VVPuram v20 = new VVPuram(120, "Anil", "Bangalore", new FoodStreet(220, "Gulab Jamun", 40));
        v20.displayStreetInfo();

        
    }
}
