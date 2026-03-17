class FactoryExecutor {
    public static void main(String[] factory) {
        
        /*Factory factory1 = new Factory();
        factory1.factoryId = 1;
        factory1.factoryName = "Alpha Factory";
        factory1.location = "Industrial Area 1";
        factory1.totalWorkers = 50;
        Machine machine1 = new Machine();
        machine1.machineId = 101;
        machine1.machineName = "CNC Lathe";
        machine1.machineType = "Metalworking";
        factory1.machine = machine1;
        factory1.displayFactoryInfo();

        
        Factory factory2 = new Factory();
        factory2.factoryId = 2;
        factory2.factoryName = "Beta Factory";
        factory2.location = "Industrial Area 2";
        factory2.totalWorkers = 60;
        Machine machine2 = new Machine();
        machine2.machineId = 102;
        machine2.machineName = "Injection Molder";
        machine2.machineType = "Plastic";
        factory2.machine = machine2;
        factory2.displayFactoryInfo();

        
        Factory factory3 = new Factory();
        factory3.factoryId = 3;
        factory3.factoryName = "Gamma Factory";
        factory3.location = "Industrial Area 3";
        factory3.totalWorkers = 70;
        Machine machine3 = new Machine();
        machine3.machineId = 103;
        machine3.machineName = "3D Printer";
        machine3.machineType = "Prototyping";
        factory3.machine = machine3;
        factory3.displayFactoryInfo();

        
        Factory factory4 = new Factory();
        factory4.factoryId = 4;
        factory4.factoryName = "Delta Factory";
        factory4.location = "Industrial Area 4";
        factory4.totalWorkers = 80;
        Machine machine4 = new Machine();
        machine4.machineId = 104;
        machine4.machineName = "Drill Press";
        machine4.machineType = "Metalworking";
        factory4.machine = machine4;
        factory4.displayFactoryInfo();

        
        Factory factory5 = new Factory();
        factory5.factoryId = 5;
        factory5.factoryName = "Epsilon Factory";
        factory5.location = "Industrial Area 5";
        factory5.totalWorkers = 90;
        Machine machine5 = new Machine();
        machine5.machineId = 105;
        machine5.machineName = "Welding Robot";
        machine5.machineType = "Automation";
        factory5.machine = machine5;
        factory5.displayFactoryInfo();

        
        Factory factory6 = new Factory();
        factory6.factoryId = 6;
        factory6.factoryName = "Zeta Factory";
        factory6.location = "Industrial Area 6";
        factory6.totalWorkers = 55;
        Machine machine6 = new Machine();
        machine6.machineId = 106;
        machine6.machineName = "Conveyor Belt";
        machine6.machineType = "Assembly Line";
        factory6.machine = machine6;
        factory6.displayFactoryInfo();

        
        Factory factory7 = new Factory();
        factory7.factoryId = 7;
        factory7.factoryName = "Eta Factory";
        factory7.location = "Industrial Area 7";
        factory7.totalWorkers = 65;
        Machine machine7 = new Machine();
        machine7.machineId = 107;
        machine7.machineName = "Press Machine";
        machine7.machineType = "Metalworking";
        factory7.machine = machine7;
        factory7.displayFactoryInfo();

        
        Factory factory8 = new Factory();
        factory8.factoryId = 8;
        factory8.factoryName = "Theta Factory";
        factory8.location = "Industrial Area 8";
        factory8.totalWorkers = 75;
        Machine machine8 = new Machine();
        machine8.machineId = 108;
        machine8.machineName = "CNC Router";
        machine8.machineType = "Woodworking";
        factory8.machine = machine8;
        factory8.displayFactoryInfo();

        
        Factory factory9 = new Factory();
        factory9.factoryId = 9;
        factory9.factoryName = "Iota Factory";
        factory9.location = "Industrial Area 9";
        factory9.totalWorkers = 85;
        Machine machine9 = new Machine();
        machine9.machineId = 109;
        machine9.machineName = "Laser Cutter";
        machine9.machineType = "Cutting";
        factory9.machine = machine9;
        factory9.displayFactoryInfo();

        
        Factory factory10 = new Factory();
        factory10.factoryId = 10;
        factory10.factoryName = "Kappa Factory";
        factory10.location = "Industrial Area 10";
        factory10.totalWorkers = 95;
        Machine machine10 = new Machine();
        machine10.machineId = 110;
        machine10.machineName = "Hydraulic Press";
        machine10.machineType = "Pressing";
        factory10.machine = machine10;
        factory10.displayFactoryInfo();

        
        Factory factory11 = new Factory();
        factory11.factoryId = 11;
        factory11.factoryName = "Lambda Factory";
        factory11.location = "Industrial Area 11";
        factory11.totalWorkers = 50;
        Machine machine11 = new Machine();
        machine11.machineId = 111;
        machine11.machineName = "Assembly Robot";
        machine11.machineType = "Automation";
        factory11.machine = machine11;
        factory11.displayFactoryInfo();

        
        Factory factory12 = new Factory();
        factory12.factoryId = 12;
        factory12.factoryName = "Mu Factory";
        factory12.location = "Industrial Area 12";
        factory12.totalWorkers = 60;
        Machine machine12 = new Machine();
        machine12.machineId = 112;
        machine12.machineName = "Packaging Machine";
        machine12.machineType = "Packaging";
        factory12.machine = machine12;
        factory12.displayFactoryInfo();

        
        Factory factory13 = new Factory();
        factory13.factoryId = 13;
        factory13.factoryName = "Nu Factory";
        factory13.location = "Industrial Area 13";
        factory13.totalWorkers = 70;
        Machine machine13 = new Machine();
        machine13.machineId = 113;
        machine13.machineName = "Paint Sprayer";
        machine13.machineType = "Painting";
        factory13.machine = machine13;
        factory13.displayFactoryInfo();

        
        Factory factory14 = new Factory();
        factory14.factoryId = 14;
        factory14.factoryName = "Xi Factory";
        factory14.location = "Industrial Area 14";
        factory14.totalWorkers = 80;
        Machine machine14 = new Machine();
        machine14.machineId = 114;
        machine14.machineName = "Forklift";
        machine14.machineType = "Material Handling";
        factory14.machine = machine14;
        factory14.displayFactoryInfo();

        
        Factory factory15 = new Factory();
        factory15.factoryId = 15;
        factory15.factoryName = "Omicron Factory";
        factory15.location = "Industrial Area 15";
        factory15.totalWorkers = 90;
        Machine machine15 = new Machine();
        machine15.machineId = 115;
        machine15.machineName = "Extruder";
        machine15.machineType = "Plastic Processing";
        factory15.machine = machine15;
        factory15.displayFactoryInfo();

        
        Factory factory16 = new Factory();
        factory16.factoryId = 16;
        factory16.factoryName = "Pi Factory";
        factory16.location = "Industrial Area 16";
        factory16.totalWorkers = 55;
        Machine machine16 = new Machine();
        machine16.machineId = 116;
        machine16.machineName = "Grinding Machine";
        machine16.machineType = "Metalworking";
        factory16.machine = machine16;
        factory16.displayFactoryInfo();

        
        Factory factory17 = new Factory();
        factory17.factoryId = 17;
        factory17.factoryName = "Rho Factory";
        factory17.location = "Industrial Area 17";
        factory17.totalWorkers = 65;
        Machine machine17 = new Machine();
        machine17.machineId = 117;
        machine17.machineName = "Vacuum Forming Machine";
        machine17.machineType = "Plastic";
        factory17.machine = machine17;
        factory17.displayFactoryInfo();

        
        Factory factory18 = new Factory();
        factory18.factoryId = 18;
        factory18.factoryName = "Sigma Factory";
        factory18.location = "Industrial Area 18";
        factory18.totalWorkers = 75;
        Machine machine18 = new Machine();
        machine18.machineId = 118;
        machine18.machineName = "Heat Press";
        machine18.machineType = "Textile";
        factory18.machine = machine18;
        factory18.displayFactoryInfo();

        // Factory 19
        Factory factory19 = new Factory();
        factory19.factoryId = 19;
        factory19.factoryName = "Tau Factory";
        factory19.location = "Industrial Area 19";
        factory19.totalWorkers = 85;
        Machine machine19 = new Machine();
        machine19.machineId = 119;
        machine19.machineName = "Rotary Kiln";
        machine19.machineType = "Ceramics";
        factory19.machine = machine19;
        factory19.displayFactoryInfo();

       
        Factory factory20 = new Factory();
        factory20.factoryId = 20;
        factory20.factoryName = "Upsilon Factory";
        factory20.location = "Industrial Area 20";
        factory20.totalWorkers = 95;
        Machine machine20 = new Machine();
        machine20.machineId = 120;
        machine20.machineName = "CNC Milling Machine";
        machine20.machineType = "Metalworking";
        factory20.machine = machine20;
        factory20.displayFactoryInfo();*/

        Machine m1 = new Machine(101, "CNC Lathe", "Metalworking");
        Factory f1 = new Factory(1, "Alpha Factory", "Industrial Area 1", 50, m1);
        f1.displayFactoryInfo();

        Machine m2 = new Machine(102, "Injection Molder", "Plastic");
        Factory f2 = new Factory(2, "Beta Factory", "Industrial Area 2", 60, m2);
        f2.displayFactoryInfo();

        Machine m3 = new Machine(103, "3D Printer", "Prototyping");
        Factory f3 = new Factory(3, "Gamma Factory", "Industrial Area 3", 70, m3);
        f3.displayFactoryInfo();

        Machine m4 = new Machine(104, "Drill Press", "Metalworking");
        Factory f4 = new Factory(4, "Delta Factory", "Industrial Area 4", 80, m4);
        f4.displayFactoryInfo();

        Machine m5 = new Machine(105, "Welding Robot", "Automation");
        Factory f5 = new Factory(5, "Epsilon Factory", "Industrial Area 5", 90, m5);
        f5.displayFactoryInfo();

        Machine m6 = new Machine(106, "Conveyor Belt", "Assembly Line");
        Factory f6 = new Factory(6, "Zeta Factory", "Industrial Area 6", 55, m6);
        f6.displayFactoryInfo();

        Machine m7 = new Machine(107, "Press Machine", "Metalworking");
        Factory f7 = new Factory(7, "Eta Factory", "Industrial Area 7", 65, m7);
        f7.displayFactoryInfo();

        Machine m8 = new Machine(108, "CNC Router", "Woodworking");
        Factory f8 = new Factory(8, "Theta Factory", "Industrial Area 8", 75, m8);
        f8.displayFactoryInfo();

        Machine m9 = new Machine(109, "Laser Cutter", "Cutting");
        Factory f9 = new Factory(9, "Iota Factory", "Industrial Area 9", 85, m9);
        f9.displayFactoryInfo();

        Machine m10 = new Machine(110, "Hydraulic Press", "Pressing");
        Factory f10 = new Factory(10, "Kappa Factory", "Industrial Area 10", 95, m10);
        f10.displayFactoryInfo();

        Machine m11 = new Machine(111, "Assembly Robot", "Automation");
        Factory f11 = new Factory(11, "Lambda Factory", "Industrial Area 11", 50, m11);
        f11.displayFactoryInfo();

        Machine m12 = new Machine(112, "Packaging Machine", "Packaging");
        Factory f12 = new Factory(12, "Mu Factory", "Industrial Area 12", 60, m12);
        f12.displayFactoryInfo();

        Machine m13 = new Machine(113, "Paint Sprayer", "Painting");
        Factory f13 = new Factory(13, "Nu Factory", "Industrial Area 13", 70, m13);
        f13.displayFactoryInfo();

        Machine m14 = new Machine(114, "Forklift", "Material Handling");
        Factory f14 = new Factory(14, "Xi Factory", "Industrial Area 14", 80, m14);
        f14.displayFactoryInfo();

        Machine m15 = new Machine(115, "Extruder", "Plastic Processing");
        Factory f15 = new Factory(15, "Omicron Factory", "Industrial Area 15", 90, m15);
        f15.displayFactoryInfo();

        Machine m16 = new Machine(116, "Grinding Machine", "Metalworking");
        Factory f16 = new Factory(16, "Pi Factory", "Industrial Area 16", 55, m16);
        f16.displayFactoryInfo();

        Machine m17 = new Machine(117, "Vacuum Forming Machine", "Plastic");
        Factory f17 = new Factory(17, "Rho Factory", "Industrial Area 17", 65, m17);
        f17.displayFactoryInfo();

        Machine m18 = new Machine(118, "Heat Press", "Textile");
        Factory f18 = new Factory(18, "Sigma Factory", "Industrial Area 18", 75, m18);
        f18.displayFactoryInfo();

        Machine m19 = new Machine(119, "Rotary Kiln", "Ceramics");
        Factory f19 = new Factory(19, "Tau Factory", "Industrial Area 19", 85, m19);
        f19.displayFactoryInfo();

        Machine m20 = new Machine(120, "CNC Milling Machine", "Metalworking");
        Factory f20 = new Factory(20, "Upsilon Factory", "Industrial Area 20", 95, m20);
        f20.displayFactoryInfo();
    }
}
