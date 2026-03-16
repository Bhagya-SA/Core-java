class TrophyExecutor {

    public static void main(String[] trophy) {

        Trophy t1 = new Trophy(1,"Champion Trophy","Gold","Metal","Golden",12.5,2.5,5000,"Elite Crafts","India","Football",2025,"Senior","John Doe","Football Association","Best Player","Box",4.8,true,"Available");
        Trophy t2 = new Trophy(2,"Winner Trophy","Silver","Metal","Silver",10.0,2.0,4000,"Elite Crafts","India","Cricket",2024,"Junior","Alice Smith","Cricket Club","Top Scorer","Box",4.7,true,"Available");
        Trophy t3 = new Trophy(3,"Champion Cup","Gold","Metal","Golden",15.0,3.0,5500,"Craft Masters","India","Basketball",2025,"Senior","Michael Jordan","Basketball League","MVP","Box",4.9,true,"Available");
        Trophy t4 = new Trophy(4,"Excellence Trophy","Bronze","Metal","Bronze",11.0,2.2,3500,"Elite Crafts","India","Swimming",2023,"Junior","Emily Davis","Swimming Federation","Best Swimmer","Box",4.5,false,"Available");
        Trophy t5 = new Trophy(5,"Achievement Trophy","Gold","Metal","Golden",13.0,2.7,5200,"Craft Masters","India","Athletics",2024,"Senior","Robert Brown","Athletics Club","Fastest Runner","Box",4.8,true,"Available");
        Trophy t6 = new Trophy(6,"Best Performer","Silver","Metal","Silver",10.5,2.1,4100,"Elite Crafts","India","Music",2023,"Junior","Sophia Lee","Music Academy","Top Singer","Box",4.6,false,"Available");
        Trophy t7 = new Trophy(7,"Champion Trophy","Gold","Metal","Golden",12.0,2.6,5000,"Craft Masters","India","Tennis",2025,"Senior","Roger Federer","Tennis Association","Winner","Box",4.9,true,"Available");
        Trophy t8 = new Trophy(8,"Winner Trophy","Silver","Metal","Silver",11.5,2.3,4200,"Elite Crafts","India","Badminton",2024,"Junior","PV Sindhu","Badminton Federation","Best Player","Box",4.7,true,"Available");
        Trophy t9 = new Trophy(9,"Excellence Cup","Bronze","Metal","Bronze",13.5,2.8,3600,"Craft Masters","India","Gymnastics",2023,"Junior","Simone Biles","Gymnastics Federation","Top Performer","Box",4.6,false,"Available");
        Trophy t10 = new Trophy(10,"Achievement Trophy","Gold","Metal","Golden",14.0,3.0,5300,"Elite Crafts","India","Chess",2025,"Senior","Magnus Carlsen","Chess Federation","Grandmaster","Box",4.8,true,"Available");

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