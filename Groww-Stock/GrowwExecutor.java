class GrowwExecutor {

    public static void main(String[] args) {

        /*Groww g1 = new Groww();
        g1.growwId = 101;
        g1.userName = "Rahul";
        g1.accountType = "Premium";
        Stock s1 = new Stock();
        s1.stockId = 201;
        s1.stockName = "TCS";
        s1.sector = "IT";
        g1.stock = s1;
        g1.displayGrowwInfo();

        Groww g2 = new Groww();
        g2.growwId = 102;
        g2.userName = "Amit";
        g2.accountType = "Basic";
        Stock s2 = new Stock();
        s2.stockId = 202;
        s2.stockName = "Infosys";
        s2.sector = "IT";
        g2.stock = s2;
        g2.displayGrowwInfo();

        Groww g3 = new Groww();
        g3.growwId = 103;
        g3.userName = "Sneha";
        g3.accountType = "Premium";
        Stock s3 = new Stock();
        s3.stockId = 203;
        s3.stockName = "Reliance";
        s3.sector = "Energy";
        g3.stock = s3;
        g3.displayGrowwInfo();

        Groww g4 = new Groww();
        g4.growwId = 104;
        g4.userName = "Kiran";
        g4.accountType = "Basic";
        Stock s4 = new Stock();
        s4.stockId = 204;
        s4.stockName = "HDFC Bank";
        s4.sector = "Banking";
        g4.stock = s4;
        g4.displayGrowwInfo();

        Groww g5 = new Groww();
        g5.growwId = 105;
        g5.userName = "Anita";
        g5.accountType = "Premium";
        Stock s5 = new Stock();
        s5.stockId = 205;
        s5.stockName = "ICICI Bank";
        s5.sector = "Banking";
        g5.stock = s5;
        g5.displayGrowwInfo();

        Groww g6 = new Groww();
        g6.growwId = 106;
        g6.userName = "Ravi";
        g6.accountType = "Basic";
        Stock s6 = new Stock();
        s6.stockId = 206;
        s6.stockName = "Wipro";
        s6.sector = "IT";
        g6.stock = s6;
        g6.displayGrowwInfo();

        Groww g7 = new Groww();
        g7.growwId = 107;
        g7.userName = "Meera";
        g7.accountType = "Premium";
        Stock s7 = new Stock();
        s7.stockId = 207;
        s7.stockName = "HCL Tech";
        s7.sector = "IT";
        g7.stock = s7;
        g7.displayGrowwInfo();

        Groww g8 = new Groww();
        g8.growwId = 108;
        g8.userName = "Arjun";
        g8.accountType = "Basic";
        Stock s8 = new Stock();
        s8.stockId = 208;
        s8.stockName = "Adani Ports";
        s8.sector = "Logistics";
        g8.stock = s8;
        g8.displayGrowwInfo();

        Groww g9 = new Groww();
        g9.growwId = 109;
        g9.userName = "Priya";
        g9.accountType = "Premium";
        Stock s9 = new Stock();
        s9.stockId = 209;
        s9.stockName = "Bharti Airtel";
        s9.sector = "Telecom";
        g9.stock = s9;
        g9.displayGrowwInfo();

        Groww g10 = new Groww();
        g10.growwId = 110;
        g10.userName = "Vikram";
        g10.accountType = "Basic";
        Stock s10 = new Stock();
        s10.stockId = 210;
        s10.stockName = "Tata Motors";
        s10.sector = "Automobile";
        g10.stock = s10;
        g10.displayGrowwInfo();

        Groww g11 = new Groww();
        g11.growwId = 111;
        g11.userName = "Deepa";
        g11.accountType = "Premium";
        Stock s11 = new Stock();
        s11.stockId = 211;
        s11.stockName = "Maruti Suzuki";
        s11.sector = "Automobile";
        g11.stock = s11;
        g11.displayGrowwInfo();

        Groww g12 = new Groww();
        g12.growwId = 112;
        g12.userName = "Sanjay";
        g12.accountType = "Basic";
        Stock s12 = new Stock();
        s12.stockId = 212;
        s12.stockName = "Asian Paints";
        s12.sector = "Manufacturing";
        g12.stock = s12;
        g12.displayGrowwInfo();

        Groww g13 = new Groww();
        g13.growwId = 113;
        g13.userName = "Neha";
        g13.accountType = "Premium";
        Stock s13 = new Stock();
        s13.stockId = 213;
        s13.stockName = "Nestle India";
        s13.sector = "FMCG";
        g13.stock = s13;
        g13.displayGrowwInfo();

        Groww g14 = new Groww();
        g14.growwId = 114;
        g14.userName = "Rohit";
        g14.accountType = "Basic";
        Stock s14 = new Stock();
        s14.stockId = 214;
        s14.stockName = "ITC";
        s14.sector = "FMCG";
        g14.stock = s14;
        g14.displayGrowwInfo();

        Groww g15 = new Groww();
        g15.growwId = 115;
        g15.userName = "Lakshmi";
        g15.accountType = "Premium";
        Stock s15 = new Stock();
        s15.stockId = 215;
        s15.stockName = "Power Grid";
        s15.sector = "Energy";
        g15.stock = s15;
        g15.displayGrowwInfo();

        Groww g16 = new Groww();
        g16.growwId = 116;
        g16.userName = "Karthik";
        g16.accountType = "Basic";
        Stock s16 = new Stock();
        s16.stockId = 216;
        s16.stockName = "ONGC";
        s16.sector = "Oil & Gas";
        g16.stock = s16;
        g16.displayGrowwInfo();

        Groww g17 = new Groww();
        g17.growwId = 117;
        g17.userName = "Divya";
        g17.accountType = "Premium";
        Stock s17 = new Stock();
        s17.stockId = 217;
        s17.stockName = "NTPC";
        s17.sector = "Power";
        g17.stock = s17;
        g17.displayGrowwInfo();

        Groww g18 = new Groww();
        g18.growwId = 118;
        g18.userName = "Manoj";
        g18.accountType = "Basic";
        Stock s18 = new Stock();
        s18.stockId = 218;
        s18.stockName = "Coal India";
        s18.sector = "Mining";
        g18.stock = s18;
        g18.displayGrowwInfo();

        Groww g19 = new Groww();
        g19.growwId = 119;
        g19.userName = "Pooja";
        g19.accountType = "Premium";
        Stock s19 = new Stock();
        s19.stockId = 219;
        s19.stockName = "Zomato";
        s19.sector = "Food Tech";
        g19.stock = s19;
        g19.displayGrowwInfo();

        Groww g20 = new Groww();
        g20.growwId = 120;
        g20.userName = "Akash";
        g20.accountType = "Basic";
        Stock s20 = new Stock();
        s20.stockId = 220;
        s20.stockName = "Paytm";
        s20.sector = "FinTech";
        g20.stock = s20;
        g20.displayGrowwInfo();*/
        class GrowwExecutor {

    public static void main(String[] args) {

        Groww g1 = new Groww();
        g1.growwId = 101;
        g1.userName = "Rahul";
        g1.accountType = "Premium";
        Stock s1 = new Stock();
        s1.stockId = 201;
        s1.stockName = "TCS";
        s1.sector = "IT";
        g1.stock = s1;
        g1.displayGrowwInfo();

        Groww g2 = new Groww();
        g2.growwId = 102;
        g2.userName = "Amit";
        g2.accountType = "Basic";
        Stock s2 = new Stock();
        s2.stockId = 202;
        s2.stockName = "Infosys";
        s2.sector = "IT";
        g2.stock = s2;
        g2.displayGrowwInfo();

        Groww g3 = new Groww();
        g3.growwId = 103;
        g3.userName = "Sneha";
        g3.accountType = "Premium";
        Stock s3 = new Stock();
        s3.stockId = 203;
        s3.stockName = "Reliance";
        s3.sector = "Energy";
        g3.stock = s3;
        g3.displayGrowwInfo();

        Groww g4 = new Groww();
        g4.growwId = 104;
        g4.userName = "Kiran";
        g4.accountType = "Basic";
        Stock s4 = new Stock();
        s4.stockId = 204;
        s4.stockName = "HDFC Bank";
        s4.sector = "Banking";
        g4.stock = s4;
        g4.displayGrowwInfo();

        Groww g5 = new Groww();
        g5.growwId = 105;
        g5.userName = "Anita";
        g5.accountType = "Premium";
        Stock s5 = new Stock();
        s5.stockId = 205;
        s5.stockName = "ICICI Bank";
        s5.sector = "Banking";
        g5.stock = s5;
        g5.displayGrowwInfo();

        Groww g6 = new Groww();
        g6.growwId = 106;
        g6.userName = "Ravi";
        g6.accountType = "Basic";
        Stock s6 = new Stock();
        s6.stockId = 206;
        s6.stockName = "Wipro";
        s6.sector = "IT";
        g6.stock = s6;
        g6.displayGrowwInfo();

        Groww g7 = new Groww();
        g7.growwId = 107;
        g7.userName = "Meera";
        g7.accountType = "Premium";
        Stock s7 = new Stock();
        s7.stockId = 207;
        s7.stockName = "HCL Tech";
        s7.sector = "IT";
        g7.stock = s7;
        g7.displayGrowwInfo();

        Groww g8 = new Groww();
        g8.growwId = 108;
        g8.userName = "Arjun";
        g8.accountType = "Basic";
        Stock s8 = new Stock();
        s8.stockId = 208;
        s8.stockName = "Adani Ports";
        s8.sector = "Logistics";
        g8.stock = s8;
        g8.displayGrowwInfo();

        Groww g9 = new Groww();
        g9.growwId = 109;
        g9.userName = "Priya";
        g9.accountType = "Premium";
        Stock s9 = new Stock();
        s9.stockId = 209;
        s9.stockName = "Bharti Airtel";
        s9.sector = "Telecom";
        g9.stock = s9;
        g9.displayGrowwInfo();

        Groww g10 = new Groww();
        g10.growwId = 110;
        g10.userName = "Vikram";
        g10.accountType = "Basic";
        Stock s10 = new Stock();
        s10.stockId = 210;
        s10.stockName = "Tata Motors";
        s10.sector = "Automobile";
        g10.stock = s10;
        g10.displayGrowwInfo();

        Groww g11 = new Groww();
        g11.growwId = 111;
        g11.userName = "Deepa";
        g11.accountType = "Premium";
        Stock s11 = new Stock();
        s11.stockId = 211;
        s11.stockName = "Maruti Suzuki";
        s11.sector = "Automobile";
        g11.stock = s11;
        g11.displayGrowwInfo();

        Groww g12 = new Groww();
        g12.growwId = 112;
        g12.userName = "Sanjay";
        g12.accountType = "Basic";
        Stock s12 = new Stock();
        s12.stockId = 212;
        s12.stockName = "Asian Paints";
        s12.sector = "Manufacturing";
        g12.stock = s12;
        g12.displayGrowwInfo();

        Groww g13 = new Groww();
        g13.growwId = 113;
        g13.userName = "Neha";
        g13.accountType = "Premium";
        Stock s13 = new Stock();
        s13.stockId = 213;
        s13.stockName = "Nestle India";
        s13.sector = "FMCG";
        g13.stock = s13;
        g13.displayGrowwInfo();

        Groww g14 = new Groww();
        g14.growwId = 114;
        g14.userName = "Rohit";
        g14.accountType = "Basic";
        Stock s14 = new Stock();
        s14.stockId = 214;
        s14.stockName = "ITC";
        s14.sector = "FMCG";
        g14.stock = s14;
        g14.displayGrowwInfo();

        Groww g15 = new Groww();
        g15.growwId = 115;
        g15.userName = "Lakshmi";
        g15.accountType = "Premium";
        Stock s15 = new Stock();
        s15.stockId = 215;
        s15.stockName = "Power Grid";
        s15.sector = "Energy";
        g15.stock = s15;
        g15.displayGrowwInfo();

        Groww g16 = new Groww();
        g16.growwId = 116;
        g16.userName = "Karthik";
        g16.accountType = "Basic";
        Stock s16 = new Stock();
        s16.stockId = 216;
        s16.stockName = "ONGC";
        s16.sector = "Oil & Gas";
        g16.stock = s16;
        g16.displayGrowwInfo();

        Groww g17 = new Groww();
        g17.growwId = 117;
        g17.userName = "Divya";
        g17.accountType = "Premium";
        Stock s17 = new Stock();
        s17.stockId = 217;
        s17.stockName = "NTPC";
        s17.sector = "Power";
        g17.stock = s17;
        g17.displayGrowwInfo();

        Groww g18 = new Groww();
        g18.growwId = 118;
        g18.userName = "Manoj";
        g18.accountType = "Basic";
        Stock s18 = new Stock();
        s18.stockId = 218;
        s18.stockName = "Coal India";
        s18.sector = "Mining";
        g18.stock = s18;
        g18.displayGrowwInfo();

        Groww g19 = new Groww();
        g19.growwId = 119;
        g19.userName = "Pooja";
        g19.accountType = "Premium";
        Stock s19 = new Stock();
        s19.stockId = 219;
        s19.stockName = "Zomato";
        s19.sector = "Food Tech";
        g19.stock = s19;
        g19.displayGrowwInfo();

        Groww g20 = new Groww();
        g20.growwId = 120;
        g20.userName = "Akash";
        g20.accountType = "Basic";
        Stock s20 = new Stock();
        s20.stockId = 220;
        s20.stockName = "Paytm";
        s20.sector = "FinTech";
        g20.stock = s20;
        g20.displayGrowwInfo();
    }
}
    }
}
