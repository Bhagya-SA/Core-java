class ConditionerExecutor {

    public static void main(String[] conditioner) {

        Conditioner c1 = new Conditioner(1,"Pantene","Smooth & Silky",200,270,"White","Floral",true,true,"All","Procter & Gamble","India","2026-12-31","C001","Water, Glycerin, Dimethicone",5.5,"Daily",4.5,true,"Available");
        Conditioner c2 = new Conditioner(2,"Dove","Nutritive Solutions",250,300,"Cream","Coconut",true,true,"Dry","Unilever","India","2026-10-31","C002","Water, Glycerin, Stearic Acid",5.8,"Daily",4.6,true,"Available");
        Conditioner c3 = new Conditioner(3,"L'Oreal","Total Repair 5",200,290,"Gold","Vanilla",false,true,"Damaged","L'Oreal","France","2025-09-30","C003","Aqua, Dimethicone, Cetearyl Alcohol",6.2,"Daily",4.4,false,"Available");
        Conditioner c4 = new Conditioner(4,"Tresemme","Keratin Smooth",190,260,"Black","Floral",true,true,"All","Unilever","India","2026-08-31","C004","Water, Keratin, Glycerin",5.6,"Daily",4.5,true,"Available");
        Conditioner c5 = new Conditioner(5,"Himalaya","Anti Hair Fall",200,250,"Green","Herbal",true,true,"All","Himalaya","India","2025-07-31","C005","Aqua, Butea Frondosa Extract, Eclipta Alba Extract",5.4,"Daily",4.6,true,"Available");
        Conditioner c6 = new Conditioner(6,"Clinic Plus","Strong & Long",180,230,"Blue","Mild",true,false,"All","Hindustan Unilever","India","2026-06-30","C006","Water, Coconut Oil, Glycerin",5.8,"Daily",4.3,false,"Available");
        Conditioner c7 = new Conditioner(7,"Garnier","Fructis",250,320,"Green","Fruity",true,true,"Normal","L'Oreal","France","2025-05-31","C007","Water, Fruit Extracts, Dimethicone",5.7,"Daily",4.5,true,"Available");
        Conditioner c8 = new Conditioner(8,"Herbal Essences","Bio:Renew",200,310,"Transparent","Herbal",true,true,"All","Procter & Gamble","USA","2026-04-30","C008","Aqua, Aloe Vera Extract, Chamomile Extract",5.5,"Daily",4.6,true,"Available");
        Conditioner c9 = new Conditioner(9,"Wow","Apple Cider Vinegar",180,280,"Brown","Apple",true,true,"Oily","Wow Skin Science","India","2025-03-31","C009","Water, Apple Cider Vinegar, Glycerin",5.6,"Daily",4.4,true,"Available");
        Conditioner c10 = new Conditioner(10,"Sunsilk","Soft & Smooth",200,260,"Yellow","Floral",false,true,"All","Unilever","India","2026-02-28","C010","Water, Dimethicone, Fragrance",5.5,"Daily",4.5,false,"Available");

        c1.toDisplayDetails();
        c2.toDisplayDetails();
        c3.toDisplayDetails();
        c4.toDisplayDetails();
        c5.toDisplayDetails();
        c6.toDisplayDetails();
        c7.toDisplayDetails();
        c8.toDisplayDetails();
        c9.toDisplayDetails();
        c10.toDisplayDetails();
    }
}