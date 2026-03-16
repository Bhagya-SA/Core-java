class ShampooExecutor {

    public static void main(String[] shampoo) {

        Shampoo s1 = new Shampoo(1,"Pantene","Smooth & Silky",200,250,"White","Floral",true,true,"All","Procter & Gamble","India","2026-12-31","B001","Water, Sodium Laureth Sulfate, Glycerin",5.5,"Daily",4.5,true,"Available");
        Shampoo s2 = new Shampoo(2,"Head & Shoulders","Anti Dandruff",180,220,"Blue","Mint",true,false,"Oily","P&G","India","2025-11-30","B002","Zinc Pyrithione, Water, Sodium Laureth Sulfate",6.0,"Daily",4.6,false,"Available");
        Shampoo s3 = new Shampoo(3,"Dove","Nutritive Solutions",250,300,"Cream","Coconut",true,true,"Dry","Unilever","India","2026-10-31","B003","Water, Sodium Laureth Sulfate, Glycerin",5.8,"Daily",4.7,true,"Available");
        Shampoo s4 = new Shampoo(4,"L'Oreal","Total Repair 5",200,280,"Gold","Vanilla",false,true,"Damaged","L'Oreal","France","2025-09-30","B004","Aqua, Sodium Laureth Sulfate, Dimethicone",6.2,"Daily",4.4,false,"Available");
        Shampoo s5 = new Shampoo(5,"Tresemme","Keratin Smooth",190,260,"Black","Floral",true,true,"All","Unilever","India","2026-08-31","B005","Water, Sodium Laureth Sulfate, Keratin",5.6,"Daily",4.5,true,"Available");
        Shampoo s6 = new Shampoo(6,"Himalaya","Anti Hair Fall",200,240,"Green","Herbal",true,true,"All","Himalaya","India","2025-07-31","B006","Aqua, Butea Frondosa Extract, Eclipta Alba Extract",5.4,"Daily",4.6,true,"Available");
        Shampoo s7 = new Shampoo(7,"Clinic Plus","Strong & Long",180,200,"Blue","Mild",true,false,"All","Hindustan Unilever","India","2026-06-30","B007","Water, Sodium Laureth Sulfate, Coconut Oil",5.8,"Daily",4.3,false,"Available");
        Shampoo s8 = new Shampoo(8,"Garnier","Fructis",250,320,"Green","Fruity",true,true,"Normal","L'Oreal","France","2025-05-31","B008","Water, Sodium Laureth Sulfate, Fruit Extracts",5.7,"Daily",4.5,true,"Available");
        Shampoo s9 = new Shampoo(9,"Herbal Essences","Bio:Renew",200,310,"Transparent","Herbal",true,true,"All","Procter & Gamble","USA","2026-04-30","B009","Aqua, Aloe Vera Extract, Chamomile Extract",5.5,"Daily",4.6,true,"Available");
        Shampoo s10 = new Shampoo(10,"Wow","Apple Cider Vinegar",180,270,"Brown","Apple",true,true,"Oily","Wow Skin Science","India","2025-03-31","B010","Water, Apple Cider Vinegar, Glycerin",5.6,"Daily",4.4,true,"Available");

        s1.toDisplayDetails();
        s2.toDisplayDetails();
        s3.toDisplayDetails();
        s4.toDisplayDetails();
        s5.toDisplayDetails();
        s6.toDisplayDetails();
        s7.toDisplayDetails();
        s8.toDisplayDetails();
        s9.toDisplayDetails();
        s10.toDisplayDetails();
    }
}