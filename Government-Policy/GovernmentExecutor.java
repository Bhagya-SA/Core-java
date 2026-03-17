class GovernmentExecutor {

    public static void main(String[] args) {

        /*Government g1 = new Government();
        g1.governmentId = 101;
        g1.governmentName = "Central Government";
        g1.country = "India";
        Policy p1 = new Policy();
        p1.policyId = 201;
        p1.policyName = "Digital India";
        p1.policyType = "Technology";
        g1.policy = p1;
        g1.displayGovernmentInfo();

        Government g2 = new Government();
        g2.governmentId = 102;
        g2.governmentName = "Central Government";
        g2.country = "India";
        Policy p2 = new Policy();
        p2.policyId = 202;
        p2.policyName = "Make in India";
        p2.policyType = "Manufacturing";
        g2.policy = p2;
        g2.displayGovernmentInfo();

        Government g3 = new Government();
        g3.governmentId = 103;
        g3.governmentName = "State Government";
        g3.country = "India";
        Policy p3 = new Policy();
        p3.policyId = 203;
        p3.policyName = "Ayushman Bharat";
        p3.policyType = "Healthcare";
        g3.policy = p3;
        g3.displayGovernmentInfo();

        Government g4 = new Government();
        g4.governmentId = 104;
        g4.governmentName = "State Government";
        g4.country = "India";
        Policy p4 = new Policy();
        p4.policyId = 204;
        p4.policyName = "Startup India";
        p4.policyType = "Business";
        g4.policy = p4;
        g4.displayGovernmentInfo();

        Government g5 = new Government();
        g5.governmentId = 105;
        g5.governmentName = "Central Government";
        g5.country = "India";
        Policy p5 = new Policy();
        p5.policyId = 205;
        p5.policyName = "Skill India";
        p5.policyType = "Education";
        g5.policy = p5;
        g5.displayGovernmentInfo();

        Government g6 = new Government();
        g6.governmentId = 106;
        g6.governmentName = "Central Government";
        g6.country = "India";
        Policy p6 = new Policy();
        p6.policyId = 206;
        p6.policyName = "Swachh Bharat";
        p6.policyType = "Sanitation";
        g6.policy = p6;
        g6.displayGovernmentInfo();

        Government g7 = new Government();
        g7.governmentId = 107;
        g7.governmentName = "State Government";
        g7.country = "India";
        Policy p7 = new Policy();
        p7.policyId = 207;
        p7.policyName = "National Education Policy";
        p7.policyType = "Education";
        g7.policy = p7;
        g7.displayGovernmentInfo();

        Government g8 = new Government();
        g8.governmentId = 108;
        g8.governmentName = "Central Government";
        g8.country = "India";
        Policy p8 = new Policy();
        p8.policyId = 208;
        p8.policyName = "Beti Bachao Beti Padhao";
        p8.policyType = "Women Welfare";
        g8.policy = p8;
        g8.displayGovernmentInfo();

        Government g9 = new Government();
        g9.governmentId = 109;
        g9.governmentName = "State Government";
        g9.country = "India";
        Policy p9 = new Policy();
        p9.policyId = 209;
        p9.policyName = "PM Kisan";
        p9.policyType = "Agriculture";
        g9.policy = p9;
        g9.displayGovernmentInfo();

        Government g10 = new Government();
        g10.governmentId = 110;
        g10.governmentName = "Central Government";
        g10.country = "India";
        Policy p10 = new Policy();
        p10.policyId = 210;
        p10.policyName = "Ujjwala Yojana";
        p10.policyType = "Energy";
        g10.policy = p10;
        g10.displayGovernmentInfo();

        Government g11 = new Government();
        g11.governmentId = 111;
        g11.governmentName = "Central Government";
        g11.country = "India";
        Policy p11 = new Policy();
        p11.policyId = 211;
        p11.policyName = "Smart Cities Mission";
        p11.policyType = "Urban Development";
        g11.policy = p11;
        g11.displayGovernmentInfo();

        Government g12 = new Government();
        g12.governmentId = 112;
        g12.governmentName = "State Government";
        g12.country = "India";
        Policy p12 = new Policy();
        p12.policyId = 212;
        p12.policyName = "Atal Pension Yojana";
        p12.policyType = "Finance";
        g12.policy = p12;
        g12.displayGovernmentInfo();

        Government g13 = new Government();
        g13.governmentId = 113;
        g13.governmentName = "Central Government";
        g13.country = "India";
        Policy p13 = new Policy();
        p13.policyId = 213;
        p13.policyName = "Pradhan Mantri Awas Yojana";
        p13.policyType = "Housing";
        g13.policy = p13;
        g13.displayGovernmentInfo();

        Government g14 = new Government();
        g14.governmentId = 114;
        g14.governmentName = "State Government";
        g14.country = "India";
        Policy p14 = new Policy();
        p14.policyId = 214;
        p14.policyName = "Digital Health Mission";
        p14.policyType = "Healthcare";
        g14.policy = p14;
        g14.displayGovernmentInfo();

        Government g15 = new Government();
        g15.governmentId = 115;
        g15.governmentName = "Central Government";
        g15.country = "India";
        Policy p15 = new Policy();
        p15.policyId = 215;
        p15.policyName = "Jal Jeevan Mission";
        p15.policyType = "Water Supply";
        g15.policy = p15;
        g15.displayGovernmentInfo();

        Government g16 = new Government();
        g16.governmentId = 116;
        g16.governmentName = "State Government";
        g16.country = "India";
        Policy p16 = new Policy();
        p16.policyId = 216;
        p16.policyName = "Green India Mission";
        p16.policyType = "Environment";
        g16.policy = p16;
        g16.displayGovernmentInfo();

        Government g17 = new Government();
        g17.governmentId = 117;
        g17.governmentName = "Central Government";
        g17.country = "India";
        Policy p17 = new Policy();
        p17.policyId = 217;
        p17.policyName = "PM Fasal Bima Yojana";
        p17.policyType = "Agriculture";
        g17.policy = p17;
        g17.displayGovernmentInfo();

        Government g18 = new Government();
        g18.governmentId = 118;
        g18.governmentName = "State Government";
        g18.country = "India";
        Policy p18 = new Policy();
        p18.policyId = 218;
        p18.policyName = "Stand Up India";
        p18.policyType = "Entrepreneurship";
        g18.policy = p18;
        g18.displayGovernmentInfo();

        Government g19 = new Government();
        g19.governmentId = 119;
        g19.governmentName = "Central Government";
        g19.country = "India";
        Policy p19 = new Policy();
        p19.policyId = 219;
        p19.policyName = "National Logistics Policy";
        p19.policyType = "Transport";
        g19.policy = p19;
        g19.displayGovernmentInfo();

        Government g20 = new Government();
        g20.governmentId = 120;
        g20.governmentName = "Central Government";
        g20.country = "India";
        Policy p20 = new Policy();
        p20.policyId = 220;
        p20.policyName = "One Nation One Ration Card";
        p20.policyType = "Food Security";
        g20.policy = p20;
        g20.displayGovernmentInfo();*/

        Policy p1 = new Policy(201, "Digital India", "Technology");
        Government g1 = new Government(101, "Central Government", "India", p1);
        g1.displayGovernmentInfo();

        Policy p2 = new Policy(202, "Make in India", "Manufacturing");
        Government g2 = new Government(102, "Central Government", "India", p2);
        g2.displayGovernmentInfo();

        Policy p3 = new Policy(203, "Ayushman Bharat", "Healthcare");
        Government g3 = new Government(103, "State Government", "India", p3);
        g3.displayGovernmentInfo();

        Policy p4 = new Policy(204, "Startup India", "Business");
        Government g4 = new Government(104, "State Government", "India", p4);
        g4.displayGovernmentInfo();

        Policy p5 = new Policy(205, "Skill India", "Education");
        Government g5 = new Government(105, "Central Government", "India", p5);
        g5.displayGovernmentInfo();

        Policy p6 = new Policy(206, "Swachh Bharat", "Sanitation");
        Government g6 = new Government(106, "Central Government", "India", p6);
        g6.displayGovernmentInfo();

        Policy p7 = new Policy(207, "National Education Policy", "Education");
        Government g7 = new Government(107, "State Government", "India", p7);
        g7.displayGovernmentInfo();

        Policy p8 = new Policy(208, "Beti Bachao Beti Padhao", "Women Welfare");
        Government g8 = new Government(108, "Central Government", "India", p8);
        g8.displayGovernmentInfo();

        Policy p9 = new Policy(209, "PM Kisan", "Agriculture");
        Government g9 = new Government(109, "State Government", "India", p9);
        g9.displayGovernmentInfo();

        Policy p10 = new Policy(210, "Ujjwala Yojana", "Energy");
        Government g10 = new Government(110, "Central Government", "India", p10);
        g10.displayGovernmentInfo();

        Policy p11 = new Policy(211, "Smart Cities Mission", "Urban Development");
        Government g11 = new Government(111, "Central Government", "India", p11);
        g11.displayGovernmentInfo();

        Policy p12 = new Policy(212, "Atal Pension Yojana", "Finance");
        Government g12 = new Government(112, "State Government", "India", p12);
        g12.displayGovernmentInfo();

        Policy p13 = new Policy(213, "Pradhan Mantri Awas Yojana", "Housing");
        Government g13 = new Government(113, "Central Government", "India", p13);
        g13.displayGovernmentInfo();

        Policy p14 = new Policy(214, "Digital Health Mission", "Healthcare");
        Government g14 = new Government(114, "State Government", "India", p14);
        g14.displayGovernmentInfo();

        Policy p15 = new Policy(215, "Jal Jeevan Mission", "Water Supply");
        Government g15 = new Government(115, "Central Government", "India", p15);
        g15.displayGovernmentInfo();

        Policy p16 = new Policy(216, "Green India Mission", "Environment");
        Government g16 = new Government(116, "State Government", "India", p16);
        g16.displayGovernmentInfo();

        Policy p17 = new Policy(217, "PM Fasal Bima Yojana", "Agriculture");
        Government g17 = new Government(117, "Central Government", "India", p17);
        g17.displayGovernmentInfo();

        Policy p18 = new Policy(218, "Stand Up India", "Entrepreneurship");
        Government g18 = new Government(118, "State Government", "India", p18);
        g18.displayGovernmentInfo();

        Policy p19 = new Policy(219, "National Logistics Policy", "Transport");
        Government g19 = new Government(119, "Central Government", "India", p19);
        g19.displayGovernmentInfo();

        Policy p20 = new Policy(220, "One Nation One Ration Card", "Food Security");
        Government g20 = new Government(120, "Central Government", "India", p20);
        g20.displayGovernmentInfo();
    }
}
