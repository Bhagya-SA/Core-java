class Formula1Executor {

	public static void main(String[] ids) {

		/*Formula1 formula1 = new Formula1();
		formula1.id = 1;
		formula1.driverName = "Ram";
		formula1.carNumber = "GR-4562";
		formula1.teamName = "Warriors";
		Franchisie franchisie1 = new Franchisie();
		franchisie1.franchisieId = 6678;
		franchisie1.franchisieName = "Kiros";
		franchisie1.country = "Russia";
		formula1.franchisie = franchisie1;
		formula1.displayFomula1Info();


		Formula1 formula2 = new Formula1();
		formula2.id = 2;
		formula2.driverName = "John";
		formula2.carNumber = "GR-4563";
		formula2.teamName = "SpeedStars";
		Franchisie franchisie2 = new Franchisie();
		franchisie2.franchisieId = 6679;
		franchisie2.franchisieName = "Falcons";
		franchisie2.country = "USA";
		formula2.franchisie = franchisie2;
		formula2.displayFomula1Info();


		Formula1 formula3 = new Formula1();
		formula3.id = 3;
		formula3.driverName = "Arjun";
		formula3.carNumber = "GR-4564";
		formula3.teamName = "Thunder";
		Franchisie franchisie3 = new Franchisie();
		franchisie3.franchisieId = 6680;
		franchisie3.franchisieName = "Blazers";
		franchisie3.country = "India";
		formula3.franchisie = franchisie3;
		formula3.displayFomula1Info();


		Formula1 formula4 = new Formula1();
		formula4.id = 4;
		formula4.driverName = "David";
		formula4.carNumber = "GR-4565";
		formula4.teamName = "Storm";
		Franchisie franchisie4 = new Franchisie();
		franchisie4.franchisieId = 6681;
		franchisie4.franchisieName = "Titans";
		franchisie4.country = "UK";
		formula4.franchisie = franchisie4;
		formula4.displayFomula1Info();


		Formula1 formula5 = new Formula1();
		formula5.id = 5;
		formula5.driverName = "Ravi";
		formula5.carNumber = "GR-4566";
		formula5.teamName = "Racers";
		Franchisie franchisie5 = new Franchisie();
		franchisie5.franchisieId = 6682;
		franchisie5.franchisieName = "Kings";
		franchisie5.country = "Australia";
		formula5.franchisie = franchisie5;
		formula5.displayFomula1Info();


		Formula1 formula6 = new Formula1();
		formula6.id = 6;
		formula6.driverName = "Alex";
		formula6.carNumber = "GR-4567";
		formula6.teamName = "Velocity";
		Franchisie franchisie6 = new Franchisie();
		franchisie6.franchisieId = 6683;
		franchisie6.franchisieName = "Dragons";
		franchisie6.country = "China";
		formula6.franchisie = franchisie6;
		formula6.displayFomula1Info();


		Formula1 formula7 = new Formula1();
		formula7.id = 7;
		formula7.driverName = "Kiran";
		formula7.carNumber = "GR-4568";
		formula7.teamName = "Blaze";
		Franchisie franchisie7 = new Franchisie();
		franchisie7.franchisieId = 6684;
		franchisie7.franchisieName = "Riders";
		franchisie7.country = "Germany";
		formula7.franchisie = franchisie7;
		formula7.displayFomula1Info();


		Formula1 formula8 = new Formula1();
		formula8.id = 8;
		formula8.driverName = "Leo";
		formula8.carNumber = "GR-4569";
		formula8.teamName = "Turbo";
		Franchisie franchisie8 = new Franchisie();
		franchisie8.franchisieId = 6685;
		franchisie8.franchisieName = "Stormers";
		franchisie8.country = "France";
		formula8.franchisie = franchisie8;
		formula8.displayFomula1Info();


		Formula1 formula9 = new Formula1();
		formula9.id = 9;
		formula9.driverName = "Rohan";
		formula9.carNumber = "GR-4570";
		formula9.teamName = "SpeedForce";
		Franchisie franchisie9 = new Franchisie();
		franchisie9.franchisieId = 6686;
		franchisie9.franchisieName = "Panthers";
		franchisie9.country = "Canada";
		formula9.franchisie = franchisie9;
		formula9.displayFomula1Info();


		Formula1 formula10 = new Formula1();
		formula10.id = 10;
		formula10.driverName = "Sam";
		formula10.carNumber = "GR-4571";
		formula10.teamName = "Nitro";
		Franchisie franchisie10 = new Franchisie();
		franchisie10.franchisieId = 6687;
		franchisie10.franchisieName = "Warlocks";
		franchisie10.country = "Italy";
		formula10.franchisie = franchisie10;
		formula10.displayFomula1Info();


		Formula1 formula11 = new Formula1();
		formula11.id = 11;
		formula11.driverName = "Amit";
		formula11.carNumber = "GR-4572";
		formula11.teamName = "Rapid";
		Franchisie franchisie11 = new Franchisie();
		franchisie11.franchisieId = 6688;
		franchisie11.franchisieName = "Giants";
		franchisie11.country = "India";
		formula11.franchisie = franchisie11;
		formula11.displayFomula1Info();


		Formula1 formula12 = new Formula1();
		formula12.id = 12;
		formula12.driverName = "Chris";
		formula12.carNumber = "GR-4573";
		formula12.teamName = "Lightning";
		Franchisie franchisie12 = new Franchisie();
		franchisie12.franchisieId = 6689;
		franchisie12.franchisieName = "FalconX";
		franchisie12.country = "USA";
		formula12.franchisie = franchisie12;
		formula12.displayFomula1Info();


		Formula1 formula13 = new Formula1();
		formula13.id = 13;
		formula13.driverName = "Vikram";
		formula13.carNumber = "GR-4574";
		formula13.teamName = "Rocket";
		Franchisie franchisie13 = new Franchisie();
		franchisie13.franchisieId = 6690;
		franchisie13.franchisieName = "TitansX";
		franchisie13.country = "Spain";
		formula13.franchisie = franchisie13;
		formula13.displayFomula1Info();


		Formula1 formula14 = new Formula1();
		formula14.id = 14;
		formula14.driverName = "Rahul";
		formula14.carNumber = "GR-4575";
		formula14.teamName = "Blizzard";
		Franchisie franchisie14 = new Franchisie();
		franchisie14.franchisieId = 6691;
		franchisie14.franchisieName = "Hawks";
		franchisie14.country = "Brazil";
		formula14.franchisie = franchisie14;
		formula14.displayFomula1Info();


		Formula1 formula15 = new Formula1();
		formula15.id = 15;
		formula15.driverName = "Daniel";
		formula15.carNumber = "GR-4576";
		formula15.teamName = "Flash";
		Franchisie franchisie15 = new Franchisie();
		franchisie15.franchisieId = 6692;
		franchisie15.franchisieName = "Cyclones";
		franchisie15.country = "Mexico";
		formula15.franchisie = franchisie15;
		formula15.displayFomula1Info();


		Formula1 formula16 = new Formula1();
		formula16.id = 16;
		formula16.driverName = "Karthik";
		formula16.carNumber = "GR-4577";
		formula16.teamName = "Inferno";
		Franchisie franchisie16 = new Franchisie();
		franchisie16.franchisieId = 6693;
		franchisie16.franchisieName = "Raptors";
		franchisie16.country = "India";
		formula16.franchisie = franchisie16;
		formula16.displayFomula1Info();


		Formula1 formula17 = new Formula1();
		formula17.id = 17;
		formula17.driverName = "Victor";
		formula17.carNumber = "GR-4578";
		formula17.teamName = "Vortex";
		Franchisie franchisie17 = new Franchisie();
		franchisie17.franchisieId = 6694;
		franchisie17.franchisieName = "Phoenix";
		franchisie17.country = "Japan";
		formula17.franchisie = franchisie17;
		formula17.displayFomula1Info();


		Formula1 formula18 = new Formula1();
		formula18.id = 18;
		formula18.driverName = "Surya";
		formula18.carNumber = "GR-4579";
		formula18.teamName = "StormX";
		Franchisie franchisie18 = new Franchisie();
		franchisie18.franchisieId = 6695;
		franchisie18.franchisieName = "Gladiators";
		franchisie18.country = "India";
		formula18.franchisie = franchisie18;
		formula18.displayFomula1Info();


		Formula1 formula19 = new Formula1();
		formula19.id = 19;
		formula19.driverName = "Nikhil";
		formula19.carNumber = "GR-4580";
		formula19.teamName = "RapidX";
		Franchisie franchisie19 = new Franchisie();
		franchisie19.franchisieId = 6696;
		franchisie19.franchisieName = "Chargers";
		franchisie19.country = "Germany";
		formula19.franchisie = franchisie19;
		formula19.displayFomula1Info();


		Formula1 formula20 = new Formula1();
		formula20.id = 20;
		formula20.driverName = "Aditya";
		formula20.carNumber = "GR-4581";
		formula20.teamName = "SpeedX";
		Franchisie franchisie20 = new Franchisie();
		franchisie20.franchisieId = 6697;
		franchisie20.franchisieName = "Legends";
		franchisie20.country = "UK";
		formula20.franchisie = franchisie20;
		formula20.displayFomula1Info();*/

		Franchisie franchisie1 = new Franchisie(6678, "Kiros", "Russia");
        Formula1 formula1 = new Formula1(1, "Ram", "GR-4562", "Warriors", franchisie1);
        formula1.displayFomula1Info();

        Franchisie franchisie2 = new Franchisie(6679, "Falcons", "USA");
        Formula1 formula2 = new Formula1(2, "John", "GR-4563", "SpeedStars", franchisie2);
        formula2.displayFomula1Info();

        Franchisie franchisie3 = new Franchisie(6680, "Blazers", "India");
        Formula1 formula3 = new Formula1(3, "Arjun", "GR-4564", "Thunder", franchisie3);
        formula3.displayFomula1Info();

        Franchisie franchisie4 = new Franchisie(6681, "Titans", "UK");
        Formula1 formula4 = new Formula1(4, "David", "GR-4565", "Storm", franchisie4);
        formula4.displayFomula1Info();

        Franchisie franchisie5 = new Franchisie(6682, "Kings", "Australia");
        Formula1 formula5 = new Formula1(5, "Ravi", "GR-4566", "Racers", franchisie5);
        formula5.displayFomula1Info();

        Franchisie franchisie6 = new Franchisie(6683, "Dragons", "China");
        Formula1 formula6 = new Formula1(6, "Alex", "GR-4567", "Velocity", franchisie6);
        formula6.displayFomula1Info();

        Franchisie franchisie7 = new Franchisie(6684, "Riders", "Germany");
        Formula1 formula7 = new Formula1(7, "Kiran", "GR-4568", "Blaze", franchisie7);
        formula7.displayFomula1Info();

        Franchisie franchisie8 = new Franchisie(6685, "Stormers", "France");
        Formula1 formula8 = new Formula1(8, "Leo", "GR-4569", "Turbo", franchisie8);
        formula8.displayFomula1Info();

        Franchisie franchisie9 = new Franchisie(6686, "Panthers", "Canada");
        Formula1 formula9 = new Formula1(9, "Rohan", "GR-4570", "SpeedForce", franchisie9);
        formula9.displayFomula1Info();

        Franchisie franchisie10 = new Franchisie(6687, "Warlocks", "Italy");
        Formula1 formula10 = new Formula1(10, "Sam", "GR-4571", "Nitro", franchisie10);
        formula10.displayFomula1Info();

        Franchisie franchisie11 = new Franchisie(6688, "Giants", "India");
        Formula1 formula11 = new Formula1(11, "Amit", "GR-4572", "Rapid", franchisie11);
        formula11.displayFomula1Info();

        Franchisie franchisie12 = new Franchisie(6689, "FalconX", "USA");
        Formula1 formula12 = new Formula1(12, "Chris", "GR-4573", "Lightning", franchisie12);
        formula12.displayFomula1Info();

        Franchisie franchisie13 = new Franchisie(6690, "TitansX", "Spain");
        Formula1 formula13 = new Formula1(13, "Vikram", "GR-4574", "Rocket", franchisie13);
        formula13.displayFomula1Info();

        Franchisie franchisie14 = new Franchisie(6691, "Hawks", "Brazil");
        Formula1 formula14 = new Formula1(14, "Rahul", "GR-4575", "Blizzard", franchisie14);
        formula14.displayFomula1Info();

        Franchisie franchisie15 = new Franchisie(6692, "Cyclones", "Mexico");
        Formula1 formula15 = new Formula1(15, "Daniel", "GR-4576", "Flash", franchisie15);
        formula15.displayFomula1Info();

        Franchisie franchisie16 = new Franchisie(6693, "Raptors", "India");
        Formula1 formula16 = new Formula1(16, "Karthik", "GR-4577", "Inferno", franchisie16);
        formula16.displayFomula1Info();

        Franchisie franchisie17 = new Franchisie(6694, "Phoenix", "Japan");
        Formula1 formula17 = new Formula1(17, "Victor", "GR-4578", "Vortex", franchisie17);
        formula17.displayFomula1Info();

        Franchisie franchisie18 = new Franchisie(6695, "Gladiators", "India");
        Formula1 formula18 = new Formula1(18, "Surya", "GR-4579", "StormX", franchisie18);
        formula18.displayFomula1Info();

        Franchisie franchisie19 = new Franchisie(6696, "Chargers", "Germany");
        Formula1 formula19 = new Formula1(19, "Nikhil", "GR-4580", "RapidX", franchisie19);
        formula19.displayFomula1Info();

        Franchisie franchisie20 = new Franchisie(6697, "Legends", "UK");
        Formula1 formula20 = new Formula1(20, "Aditya", "GR-4581", "SpeedX", franchisie20);
        formula20.displayFomula1Info();

		

	}
}
