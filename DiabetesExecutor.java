class DiabetesExecutor {

    public static void main(String[] diabetes) {

        Diabetes d1 = new Diabetes(1,"John Doe",45,"Male",70,1.75,110,140,6.5,true,"Type 2","Metformin","Low Carb","Walking","Dr. Smith","City Hospital","Bangalore","India","Under Control",4.5);
        Diabetes d2 = new Diabetes(2,"Alice Smith",50,"Female",65,1.68,120,150,6.8,false,"Type 2","Glipizide","Low Sugar","Jogging","Dr. Raj","HealthCare Center","Mumbai","India","Under Control",4.4);
        Diabetes d3 = new Diabetes(3,"Robert Brown",60,"Male",80,1.80,130,160,7.0,true,"Type 2","Insulin","Balanced Diet","Gym","Dr. Kumar","Apollo Hospital","Delhi","India","Needs Attention",4.3);
        Diabetes d4 = new Diabetes(4,"Emily Davis",35,"Female",55,1.60,105,130,6.2,false,"Type 1","Insulin","Low Carb","Yoga","Dr. Mehta","Fortis","Chennai","India","Under Control",4.6);
        Diabetes d5 = new Diabetes(5,"Michael Scott",40,"Male",78,1.78,125,155,6.9,true,"Type 2","Metformin","Balanced Diet","Walking","Dr. Sharma","City Hospital","Bangalore","India","Under Control",4.5);
        Diabetes d6 = new Diabetes(6,"Sophia Lee",30,"Female",60,1.65,110,135,6.4,false,"Type 1","Insulin","Low Sugar","Jogging","Dr. Gupta","HealthCare Center","Mumbai","India","Under Control",4.4);
        Diabetes d7 = new Diabetes(7,"David Johnson",55,"Male",85,1.82,140,170,7.5,true,"Type 2","Insulin","Low Carb","Gym","Dr. Reddy","Apollo Hospital","Delhi","India","Needs Attention",4.2);
        Diabetes d8 = new Diabetes(8,"Olivia Wilson",42,"Female",68,1.70,115,145,6.6,false,"Type 2","Metformin","Balanced Diet","Yoga","Dr. Nair","Fortis","Chennai","India","Under Control",4.5);
        Diabetes d9 = new Diabetes(9,"James Anderson",65,"Male",90,1.85,145,175,7.8,true,"Type 2","Insulin","Low Sugar","Walking","Dr. Singh","City Hospital","Bangalore","India","Needs Attention",4.3);
        Diabetes d10 = new Diabetes(10,"Isabella Martinez",38,"Female",62,1.68,108,138,6.3,false,"Type 1","Insulin","Low Carb","Jogging","Dr. Kapoor","HealthCare Center","Mumbai","India","Under Control",4.6);

        d1.toDisplayDetails();
        d2.toDisplayDetails();
        d3.toDisplayDetails();
        d4.toDisplayDetails();
        d5.toDisplayDetails();
        d6.toDisplayDetails();
        d7.toDisplayDetails();
        d8.toDisplayDetails();
        d9.toDisplayDetails();
        d10.toDisplayDetails();
    }
}