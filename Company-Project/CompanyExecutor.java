class CompanyExecutor {

    public static void main(String[] companies) {

       /* Company company1 = new Company();
        company1.companyId = 101;
        company1.companyName = "TechCorp";
        company1.location = "USA";
        Project project1 = new Project();
        project1.projectId = 201;
        project1.projectName = "AI Development";
        project1.projectType = "Research";
        company1.project = project1;
        company1.displayCompanyInfo();

        Company company2 = new Company();
        company2.companyId = 102;
        company2.companyName = "BuildIt";
        company2.location = "Germany";
        Project project2 = new Project();
        project2.projectId = 202;
        project2.projectName = "Infrastructure Upgrade";
        project2.projectType = "Construction";
        company2.project = project2;
        company2.displayCompanyInfo();

        Company company3 = new Company();
        company3.companyId = 103;
        company3.companyName = "FinServe";
        company3.location = "India";
        Project project3 = new Project();
        project3.projectId = 203;
        project3.projectName = "Mobile Banking App";
        project3.projectType = "Software";
        company3.project = project3;
        company3.displayCompanyInfo();

        Company company4 = new Company();
        company4.companyId = 104;
        company4.companyName = "GreenEnergy";
        company4.location = "Norway";
        Project project4 = new Project();
        project4.projectId = 204;
        project4.projectName = "Solar Plant Expansion";
        project4.projectType = "Renewable Energy";
        company4.project = project4;
        company4.displayCompanyInfo();

        Company company5 = new Company();
        company5.companyId = 105;
        company5.companyName = "MediHealth";
        company5.location = "UK";
        Project project5 = new Project();
        project5.projectId = 205;
        project5.projectName = "Telemedicine Platform";
        project5.projectType = "Healthcare";
        company5.project = project5;
        company5.displayCompanyInfo();

        Company company6 = new Company();
        company6.companyId = 106;
        company6.companyName = "EduSmart";
        company6.location = "Canada";
        Project project6 = new Project();
        project6.projectId = 206;
        project6.projectName = "Online Learning App";
        project6.projectType = "Education";
        company6.project = project6;
        company6.displayCompanyInfo();

        Company company7 = new Company();
        company7.companyId = 107;
        company7.companyName = "AutoMotion";
        company7.location = "Japan";
        Project project7 = new Project();
        project7.projectId = 207;
        project7.projectName = "Electric Vehicle Development";
        project7.projectType = "Automotive";
        company7.project = project7;
        company7.displayCompanyInfo();

        Company company8 = new Company();
        company8.companyId = 108;
        company8.companyName = "FashionHub";
        company8.location = "Italy";
        Project project8 = new Project();
        project8.projectId = 208;
        project8.projectName = "Sustainable Clothing Line";
        project8.projectType = "Fashion";
        company8.project = project8;
        company8.displayCompanyInfo();

        Company company9 = new Company();
        company9.companyId = 109;
        company9.companyName = "Foodies";
        company9.location = "France";
        Project project9 = new Project();
        project9.projectId = 209;
        project9.projectName = "Organic Restaurant Chain";
        project9.projectType = "Hospitality";
        company9.project = project9;
        company9.displayCompanyInfo();

        Company company10 = new Company();
        company10.companyId = 110;
        company10.companyName = "SpaceXplore";
        company10.location = "USA";
        Project project10 = new Project();
        project10.projectId = 210;
        project10.projectName = "Satellite Launch Program";
        project10.projectType = "Aerospace";
        company10.project = project10;
        company10.displayCompanyInfo();

        Company company11 = new Company();
        company11.companyId = 111;
        company11.companyName = "FinTechPro";
        company11.location = "Singapore";
        Project project11 = new Project();
        project11.projectId = 211;
        project11.projectName = "Blockchain Payment System";
        project11.projectType = "Finance";
        company11.project = project11;
        company11.displayCompanyInfo();

        Company company12 = new Company();
        company12.companyId = 112;
        company12.companyName = "SmartHome";
        company12.location = "Germany";
        Project project12 = new Project();
        project12.projectId = 212;
        project12.projectName = "IoT Home Devices";
        project12.projectType = "Technology";
        company12.project = project12;
        company12.displayCompanyInfo();

        Company company13 = new Company();
        company13.companyId = 113;
        company13.companyName = "TravelEase";
        company13.location = "Australia";
        Project project13 = new Project();
        project13.projectId = 213;
        project13.projectName = "Travel Booking App";
        project13.projectType = "Tourism";
        company13.project = project13;
        company13.displayCompanyInfo();

        Company company14 = new Company();
        company14.companyId = 114;
        company14.companyName = "EcoPack";
        company14.location = "Sweden";
        Project project14 = new Project();
        project14.projectId = 214;
        project14.projectName = "Biodegradable Packaging";
        project14.projectType = "Sustainability";
        company14.project = project14;
        company14.displayCompanyInfo();

        Company company15 = new Company();
        company15.companyId = 115;
        company15.companyName = "GameSphere";
        company15.location = "South Korea";
        Project project15 = new Project();
        project15.projectId = 215;
        project15.projectName = "VR Gaming Platform";
        project15.projectType = "Entertainment";
        company15.project = project15;
        company15.displayCompanyInfo();

        Company company16 = new Company();
        company16.companyId = 116;
        company16.companyName = "AgriGrow";
        company16.location = "India";
        Project project16 = new Project();
        project16.projectId = 216;
        project16.projectName = "Smart Farming Solutions";
        project16.projectType = "Agriculture";
        company16.project = project16;
        company16.displayCompanyInfo();

        Company company17 = new Company();
        company17.companyId = 117;
        company17.companyName = "LogiTrack";
        company17.location = "Netherlands";
        Project project17 = new Project();
        project17.projectId = 217;
        project17.projectName = "Supply Chain Management";
        project17.projectType = "Logistics";
        company17.project = project17;
        company17.displayCompanyInfo();

        Company company18 = new Company();
        company18.companyId = 118;
        company18.companyName = "CleanWater";
        company18.location = "Kenya";
        Project project18 = new Project();
        project18.projectId = 218;
        project18.projectName = "Water Purification Systems";
        project18.projectType = "Environmental";
        company18.project = project18;
        company18.displayCompanyInfo();

        Company company19 = new Company();
        company19.companyId = 119;
        company19.companyName = "MediPharma";
        company19.location = "Switzerland";
        Project project19 = new Project();
        project19.projectId = 219;
        project19.projectName = "Vaccine Development";
        project19.projectType = "Healthcare";
        company19.project = project19;
        company19.displayCompanyInfo();

        Company company20 = new Company();
        company20.companyId = 120;
        company20.companyName = "TechNova";
        company20.location = "USA";
        Project project20 = new Project();
        project20.projectId = 220;
        project20.projectName = "Next-Gen AI Platform";
        project20.projectType = "Technology";
        company20.project = project20;
        company20.displayCompanyInfo(); */

        Project p1 = new Project(201, "AI Development", "Research");
        Company c1 = new Company(101, "TechCorp", "USA", p1);
        c1.displayCompanyInfo();

        Project p2 = new Project(202, "Infrastructure Upgrade", "Construction");
        Company c2 = new Company(102, "BuildIt", "Germany", p2);
        c2.displayCompanyInfo();

        Project p3 = new Project(203, "Mobile Banking App", "Software");
        Company c3 = new Company(103, "FinServe", "India", p3);
        c3.displayCompanyInfo();

        Project p4 = new Project(204, "Solar Plant Expansion", "Renewable Energy");
        Company c4 = new Company(104, "GreenEnergy", "Norway", p4);
        c4.displayCompanyInfo();

        Project p5 = new Project(205, "Telemedicine Platform", "Healthcare");
        Company c5 = new Company(105, "MediHealth", "UK", p5);
        c5.displayCompanyInfo();

        Project p6 = new Project(206, "Online Learning App", "Education");
        Company c6 = new Company(106, "EduSmart", "Canada", p6);
        c6.displayCompanyInfo();

        Project p7 = new Project(207, "Electric Vehicle Development", "Automotive");
        Company c7 = new Company(107, "AutoMotion", "Japan", p7);
        c7.displayCompanyInfo();

        Project p8 = new Project(208, "Sustainable Clothing Line", "Fashion");
        Company c8 = new Company(108, "FashionHub", "Italy", p8);
        c8.displayCompanyInfo();

        Project p9 = new Project(209, "Organic Restaurant Chain", "Hospitality");
        Company c9 = new Company(109, "Foodies", "France", p9);
        c9.displayCompanyInfo();

        Project p10 = new Project(210, "Satellite Launch Program", "Aerospace");
        Company c10 = new Company(110, "SpaceXplore", "USA", p10);
        c10.displayCompanyInfo();

        Project p11 = new Project(211, "Blockchain Payment System", "Finance");
        Company c11 = new Company(111, "FinTechPro", "Singapore", p11);
        c11.displayCompanyInfo();

        Project p12 = new Project(212, "IoT Home Devices", "Technology");
        Company c12 = new Company(112, "SmartHome", "Germany", p12);
        c12.displayCompanyInfo();

        Project p13 = new Project(213, "Travel Booking App", "Tourism");
        Company c13 = new Company(113, "TravelEase", "Australia", p13);
        c13.displayCompanyInfo();

        Project p14 = new Project(214, "Biodegradable Packaging", "Sustainability");
        Company c14 = new Company(114, "EcoPack", "Sweden", p14);
        c14.displayCompanyInfo();

        Project p15 = new Project(215, "VR Gaming Platform", "Entertainment");
        Company c15 = new Company(115, "GameSphere", "South Korea", p15);
        c15.displayCompanyInfo();

        Project p16 = new Project(216, "Smart Farming Solutions", "Agriculture");
        Company c16 = new Company(116, "AgriGrow", "India", p16);
        c16.displayCompanyInfo();

        Project p17 = new Project(217, "Supply Chain Management", "Logistics");
        Company c17 = new Company(117, "LogiTrack", "Netherlands", p17);
        c17.displayCompanyInfo();

        Project p18 = new Project(218, "Water Purification Systems", "Environmental");
        Company c18 = new Company(118, "CleanWater", "Kenya", p18);
        c18.displayCompanyInfo();

        Project p19 = new Project(219, "Vaccine Development", "Healthcare");
        Company c19 = new Company(119, "MediPharma", "Switzerland", p19);
        c19.displayCompanyInfo();

        Project p20 = new Project(220, "Next-Gen AI Platform", "Technology");
        Company c20 = new Company(120, "TechNova", "USA", p20);
        c20.displayCompanyInfo();
    }
}
