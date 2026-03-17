class PCExecutor {

	public static void main(String[] laptop) {

		/*PC pc1 = new PC();
		pc1.pcId = 111;
		pc1.pcName = "Lenovo";
		pc1.os = "Windows 10";
		pc1.ramSize = "16 GB";
		pc1.storageSize = "512 GB SSD";
		Hardware hardware1 = new Hardware();
		hardware1.hardwareId = 121;
		hardware1.hardwareName = "CPU";
		hardware1.hardwareType = "Processor";
		hardware1.price = 25000;
		pc1.hardware = hardware1;
		pc1.displayPCInfo();


		PC pc2 = new PC();
		pc2.pcId = 112;
		pc2.pcName = "Dell";
		pc2.os = "Windows 11";
		pc2.ramSize = "8 GB";
		pc2.storageSize = "256 GB SSD";
		Hardware hardware2 = new Hardware();
		hardware2.hardwareId = 122;
		hardware2.hardwareName = "GPU";
		hardware2.hardwareType = "Graphics Card";
		hardware2.price = 30000;
		pc2.hardware = hardware2;
		pc2.displayPCInfo();


		PC pc3 = new PC();
		pc3.pcId = 113;
		pc3.pcName = "HP";
		pc3.os = "Windows 10";
		pc3.ramSize = "16 GB";
		pc3.storageSize = "1 TB HDD";
		Hardware hardware3 = new Hardware();
		hardware3.hardwareId = 123;
		hardware3.hardwareName = "RAM";
		hardware3.hardwareType = "Memory";
		hardware3.price = 8000;
		pc3.hardware = hardware3;
		pc3.displayPCInfo();


		PC pc4 = new PC();
		pc4.pcId = 114;
		pc4.pcName = "Asus";
		pc4.os = "Linux Ubuntu";
		pc4.ramSize = "32 GB";
		pc4.storageSize = "1 TB SSD";
		Hardware hardware4 = new Hardware();
		hardware4.hardwareId = 124;
		hardware4.hardwareName = "Motherboard";
		hardware4.hardwareType = "Internal Component";
		hardware4.price = 15000;
		pc4.hardware = hardware4;
		pc4.displayPCInfo();


		PC pc5 = new PC();
		pc5.pcId = 115;
		pc5.pcName = "Acer";
		pc5.os = "Windows 10";
		pc5.ramSize = "8 GB";
		pc5.storageSize = "512 GB SSD";
		Hardware hardware5 = new Hardware();
		hardware5.hardwareId = 125;
		hardware5.hardwareName = "Power Supply";
		hardware5.hardwareType = "Internal Component";
		hardware5.price = 5000;
		pc5.hardware = hardware5;
		pc5.displayPCInfo();


		PC pc6 = new PC();
		pc6.pcId = 116;
		pc6.pcName = "Apple";
		pc6.os = "macOS";
		pc6.ramSize = "16 GB";
		pc6.storageSize = "512 GB SSD";
		Hardware hardware6 = new Hardware();
		hardware6.hardwareId = 126;
		hardware6.hardwareName = "Keyboard";
		hardware6.hardwareType = "Input Device";
		hardware6.price = 2000;
		pc6.hardware = hardware6;
		pc6.displayPCInfo();


		PC pc7 = new PC();
		pc7.pcId = 117;
		pc7.pcName = "MSI";
		pc7.os = "Windows 11";
		pc7.ramSize = "32 GB";
		pc7.storageSize = "2 TB SSD";
		Hardware hardware7 = new Hardware();
		hardware7.hardwareId = 127;
		hardware7.hardwareName = "GPU";
		hardware7.hardwareType = "Graphics Card";
		hardware7.price = 45000;
		pc7.hardware = hardware7;
		pc7.displayPCInfo();


		PC pc8 = new PC();
		pc8.pcId = 118;
		pc8.pcName = "Dell Inspiron";
		pc8.os = "Windows 10";
		pc8.ramSize = "16 GB";
		pc8.storageSize = "1 TB HDD";
		Hardware hardware8 = new Hardware();
		hardware8.hardwareId = 128;
		hardware8.hardwareName = "CPU";
		hardware8.hardwareType = "Processor";
		hardware8.price = 22000;
		pc8.hardware = hardware8;
		pc8.displayPCInfo();


		PC pc9 = new PC();
		pc9.pcId = 119;
		pc9.pcName = "Lenovo Legion";
		pc9.os = "Windows 11";
		pc9.ramSize = "32 GB";
		pc9.storageSize = "1 TB SSD";
		Hardware hardware9 = new Hardware();
		hardware9.hardwareId = 129;
		hardware9.hardwareName = "Cooling Fan";
		hardware9.hardwareType = "Internal Component";
		hardware9.price = 3000;
		pc9.hardware = hardware9;
		pc9.displayPCInfo();


		PC pc10 = new PC();
		pc10.pcId = 120;
		pc10.pcName = "HP Pavilion";
		pc10.os = "Windows 10";
		pc10.ramSize = "16 GB";
		pc10.storageSize = "512 GB SSD";
		Hardware hardware10 = new Hardware();
		hardware10.hardwareId = 130;
		hardware10.hardwareName = "Motherboard";
		hardware10.hardwareType = "Internal Component";
		hardware10.price = 12000;
		pc10.hardware = hardware10;
		pc10.displayPCInfo();


		PC pc11 = new PC();
		pc11.pcId = 121;
		pc11.pcName = "Asus ROG";
		pc11.os = "Windows 11";
		pc11.ramSize = "64 GB";
		pc11.storageSize = "2 TB SSD";
		Hardware hardware11 = new Hardware();
		hardware11.hardwareId = 131;
		hardware11.hardwareName = "GPU";
		hardware11.hardwareType = "Graphics Card";
		hardware11.price = 50000;
		pc11.hardware = hardware11;
		pc11.displayPCInfo();


		PC pc12 = new PC();
		pc12.pcId = 122;
		pc12.pcName = "Acer Predator";
		pc12.os = "Windows 10";
		pc12.ramSize = "32 GB";
		pc12.storageSize = "1 TB SSD";
		Hardware hardware12 = new Hardware();
		hardware12.hardwareId = 132;
		hardware12.hardwareName = "RAM";
		hardware12.hardwareType = "Memory";
		hardware12.price = 10000;
		pc12.hardware = hardware12;
		pc12.displayPCInfo();


		PC pc13 = new PC();
		pc13.pcId = 123;
		pc13.pcName = "Apple iMac";
		pc13.os = "macOS";
		pc13.ramSize = "16 GB";
		pc13.storageSize = "1 TB SSD";
		Hardware hardware13 = new Hardware();
		hardware13.hardwareId = 133;
		hardware13.hardwareName = "Display";
		hardware13.hardwareType = "Output Device";
		hardware13.price = 35000;
		pc13.hardware = hardware13;
		pc13.displayPCInfo();


		PC pc14 = new PC();
		pc14.pcId = 124;
		pc14.pcName = "MSI Modern";
		pc14.os = "Windows 11";
		pc14.ramSize = "16 GB";
		pc14.storageSize = "512 GB SSD";
		Hardware hardware14 = new Hardware();
		hardware14.hardwareId = 134;
		hardware14.hardwareName = "Keyboard";
		hardware14.hardwareType = "Input Device";
		hardware14.price = 2500;
		pc14.hardware = hardware14;
		pc14.displayPCInfo();


		PC pc15 = new PC();
		pc15.pcId = 125;
		pc15.pcName = "Dell XPS";
		pc15.os = "Windows 11";
		pc15.ramSize = "32 GB";
		pc15.storageSize = "1 TB SSD";
		Hardware hardware15 = new Hardware();
		hardware15.hardwareId = 135;
		hardware15.hardwareName = "Touchpad";
		hardware15.hardwareType = "Input Device";
		hardware15.price = 1500;
		pc15.hardware = hardware15;
		pc15.displayPCInfo();


		PC pc16 = new PC();
		pc16.pcId = 126;
		pc16.pcName = "HP Envy";
		pc16.os = "Windows 10";
		pc16.ramSize = "16 GB";
		pc16.storageSize = "512 GB SSD";
		Hardware hardware16 = new Hardware();
		hardware16.hardwareId = 136;
		hardware16.hardwareName = "GPU";
		hardware16.hardwareType = "Graphics Card";
		hardware16.price = 28000;
		pc16.hardware = hardware16;
		pc16.displayPCInfo();


		PC pc17 = new PC();
		pc17.pcId = 127;
		pc17.pcName = "Lenovo ThinkPad";
		pc17.os = "Windows 10";
		pc17.ramSize = "16 GB";
		pc17.storageSize = "1 TB HDD";
		Hardware hardware17 = new Hardware();
		hardware17.hardwareId = 137;
		hardware17.hardwareName = "CPU";
		hardware17.hardwareType = "Processor";
		hardware17.price = 20000;
		pc17.hardware = hardware17;
		pc17.displayPCInfo();


		PC pc18 = new PC();
		pc18.pcId = 128;
		pc18.pcName = "Acer Swift";
		pc18.os = "Windows 10";
		pc18.ramSize = "8 GB";
		pc18.storageSize = "256 GB SSD";
		Hardware hardware18 = new Hardware();
		hardware18.hardwareId = 138;
		hardware18.hardwareName = "RAM";
		hardware18.hardwareType = "Memory";
		hardware18.price = 7000;
		pc18.hardware = hardware18;
		pc18.displayPCInfo();


		PC pc19 = new PC();
		pc19.pcId = 129;
		pc19.pcName = "Asus Zenbook";
		pc19.os = "Windows 11";
		pc19.ramSize = "16 GB";
		pc19.storageSize = "512 GB SSD";
		Hardware hardware19 = new Hardware();
		hardware19.hardwareId = 139;
		hardware19.hardwareName = "Motherboard";
		hardware19.hardwareType = "Internal Component";
		hardware19.price = 12000;
		pc19.hardware = hardware19;
		pc19.displayPCInfo();


		PC pc20 = new PC();
		pc20.pcId = 130;
		pc20.pcName = "Apple MacBook Pro";
		pc20.os = "macOS";
		pc20.ramSize = "32 GB";
		pc20.storageSize = "1 TB SSD";
		Hardware hardware20 = new Hardware();
		hardware20.hardwareId = 140;
		hardware20.hardwareName = "GPU";
		hardware20.hardwareType = "Graphics Card";
		hardware20.price = 60000;
		pc20.hardware = hardware20;
		pc20.displayPCInfo();*/

		Hardware h1 = new Hardware(121, "CPU", "Processor", 25000);
        PC pc1 = new PC(111, "Lenovo", "Windows 10", "16 GB", "512 GB SSD", h1);
        pc1.displayPCInfo();

        Hardware h2 = new Hardware(122, "GPU", "Graphics Card", 30000);
        PC pc2 = new PC(112, "Dell", "Windows 11", "8 GB", "256 GB SSD", h2);
        pc2.displayPCInfo();

        Hardware h3 = new Hardware(123, "RAM", "Memory", 8000);
        PC pc3 = new PC(113, "HP", "Windows 10", "16 GB", "1 TB HDD", h3);
        pc3.displayPCInfo();

        Hardware h4 = new Hardware(124, "Motherboard", "Internal Component", 15000);
        PC pc4 = new PC(114, "Asus", "Linux Ubuntu", "32 GB", "1 TB SSD", h4);
        pc4.displayPCInfo();

        Hardware h5 = new Hardware(125, "Power Supply", "Internal Component", 5000);
        PC pc5 = new PC(115, "Acer", "Windows 10", "8 GB", "512 GB SSD", h5);
        pc5.displayPCInfo();

        Hardware h6 = new Hardware(126, "Keyboard", "Input Device", 2000);
        PC pc6 = new PC(116, "Apple", "macOS", "16 GB", "512 GB SSD", h6);
        pc6.displayPCInfo();

        Hardware h7 = new Hardware(127, "GPU", "Graphics Card", 45000);
        PC pc7 = new PC(117, "MSI", "Windows 11", "32 GB", "2 TB SSD", h7);
        pc7.displayPCInfo();

        Hardware h8 = new Hardware(128, "CPU", "Processor", 22000);
        PC pc8 = new PC(118, "Dell Inspiron", "Windows 10", "16 GB", "1 TB HDD", h8);
        pc8.displayPCInfo();

        Hardware h9 = new Hardware(129, "Cooling Fan", "Internal Component", 3000);
        PC pc9 = new PC(119, "Lenovo Legion", "Windows 11", "32 GB", "1 TB SSD", h9);
        pc9.displayPCInfo();

        Hardware h10 = new Hardware(130, "Motherboard", "Internal Component", 12000);
        PC pc10 = new PC(120, "HP Pavilion", "Windows 10", "16 GB", "512 GB SSD", h10);
        pc10.displayPCInfo();

        Hardware h11 = new Hardware(131, "GPU", "Graphics Card", 50000);
        PC pc11 = new PC(121, "Asus ROG", "Windows 11", "64 GB", "2 TB SSD", h11);
        pc11.displayPCInfo();

        Hardware h12 = new Hardware(132, "RAM", "Memory", 10000);
        PC pc12 = new PC(122, "Acer Predator", "Windows 10", "32 GB", "1 TB SSD", h12);
        pc12.displayPCInfo();

        Hardware h13 = new Hardware(133, "Display", "Output Device", 35000);
        PC pc13 = new PC(123, "Apple iMac", "macOS", "16 GB", "1 TB SSD", h13);
        pc13.displayPCInfo();

        Hardware h14 = new Hardware(134, "Keyboard", "Input Device", 2500);
        PC pc14 = new PC(124, "MSI Modern", "Windows 11", "16 GB", "512 GB SSD", h14);
        pc14.displayPCInfo();

        Hardware h15 = new Hardware(135, "Touchpad", "Input Device", 1500);
        PC pc15 = new PC(125, "Dell XPS", "Windows 11", "32 GB", "1 TB SSD", h15);
        pc15.displayPCInfo();

        Hardware h16 = new Hardware(136, "GPU", "Graphics Card", 28000);
        PC pc16 = new PC(126, "HP Envy", "Windows 10", "16 GB", "512 GB SSD", h16);
        pc16.displayPCInfo();

        Hardware h17 = new Hardware(137, "CPU", "Processor", 20000);
        PC pc17 = new PC(127, "Lenovo ThinkPad", "Windows 10", "16 GB", "1 TB HDD", h17);
        pc17.displayPCInfo();

        Hardware h18 = new Hardware(138, "RAM", "Memory", 7000);
        PC pc18 = new PC(128, "Acer Swift", "Windows 10", "8 GB", "256 GB SSD", h18);
        pc18.displayPCInfo();

        Hardware h19 = new Hardware(139, "Motherboard", "Internal Component", 12000);
        PC pc19 = new PC(129, "Asus Zenbook", "Windows 11", "16 GB", "512 GB SSD", h19);
        pc19.displayPCInfo();

        Hardware h20 = new Hardware(140, "GPU", "Graphics Card", 60000);
        PC pc20 = new PC(130, "Apple MacBook Pro", "macOS", "32 GB", "1 TB SSD", h20);
        pc20.displayPCInfo();

	}
}
