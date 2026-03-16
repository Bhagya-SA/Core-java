class TrainExecutor {

	public static void main(String[] bullet) {

		Train train1 = new Train();
		train1.trainId = 1;
		train1.trainNo = 345678;
		train1.trainName = "SiddagangaExpress";
		train1.sourceStation = "Bangalore";
		train1.destinationStation = "Davangere";
		Compartment compartment1 = new Compartment();
		compartment1.compartmentId = 101;
		compartment1.compartmentType = "AC";
		compartment1.seatCapacity = 30;
		train1.compartment = compartment1;
		train1.displayTrainInfo();


		Train train2 = new Train();
		train2.trainId = 2;
		train2.trainNo = 345679;
		train2.trainName = "MysoreExpress";
		train2.sourceStation = "Bangalore";
		train2.destinationStation = "Mysore";
		Compartment compartment2 = new Compartment();
		compartment2.compartmentId = 102;
		compartment2.compartmentType = "Sleeper";
		compartment2.seatCapacity = 40;
		train2.compartment = compartment2;
		train2.displayTrainInfo();


		Train train3 = new Train();
		train3.trainId = 3;
		train3.trainNo = 345680;
		train3.trainName = "HampiExpress";
		train3.sourceStation = "Bangalore";
		train3.destinationStation = "Hospet";
		Compartment compartment3 = new Compartment();
		compartment3.compartmentId = 103;
		compartment3.compartmentType = "AC";
		compartment3.seatCapacity = 35;
		train3.compartment = compartment3;
		train3.displayTrainInfo();


		Train train4 = new Train();
		train4.trainId = 4;
		train4.trainNo = 345681;
		train4.trainName = "GolGumbazExpress";
		train4.sourceStation = "Mysore";
		train4.destinationStation = "Bijapur";
		Compartment compartment4 = new Compartment();
		compartment4.compartmentId = 104;
		compartment4.compartmentType = "General";
		compartment4.seatCapacity = 50;
		train4.compartment = compartment4;
		train4.displayTrainInfo();


		Train train5 = new Train();
		train5.trainId = 5;
		train5.trainNo = 345682;
		train5.trainName = "UdyanExpress";
		train5.sourceStation = "Bangalore";
		train5.destinationStation = "Mumbai";
		Compartment compartment5 = new Compartment();
		compartment5.compartmentId = 105;
		compartment5.compartmentType = "AC";
		compartment5.seatCapacity = 28;
		train5.compartment = compartment5;
		train5.displayTrainInfo();


		Train train6 = new Train();
		train6.trainId = 6;
		train6.trainNo = 345683;
		train6.trainName = "ShatabdiExpress";
		train6.sourceStation = "Bangalore";
		train6.destinationStation = "Chennai";
		Compartment compartment6 = new Compartment();
		compartment6.compartmentId = 106;
		compartment6.compartmentType = "AC";
		compartment6.seatCapacity = 32;
		train6.compartment = compartment6;
		train6.displayTrainInfo();


		Train train7 = new Train();
		train7.trainId = 7;
		train7.trainNo = 345684;
		train7.trainName = "RajdhaniExpress";
		train7.sourceStation = "Bangalore";
		train7.destinationStation = "Delhi";
		Compartment compartment7 = new Compartment();
		compartment7.compartmentId = 107;
		compartment7.compartmentType = "AC";
		compartment7.seatCapacity = 36;
		train7.compartment = compartment7;
		train7.displayTrainInfo();


		Train train8 = new Train();
		train8.trainId = 8;
		train8.trainNo = 345685;
		train8.trainName = "IntercityExpress";
		train8.sourceStation = "Hubli";
		train8.destinationStation = "Bangalore";
		Compartment compartment8 = new Compartment();
		compartment8.compartmentId = 108;
		compartment8.compartmentType = "Sleeper";
		compartment8.seatCapacity = 45;
		train8.compartment = compartment8;
		train8.displayTrainInfo();


		Train train9 = new Train();
		train9.trainId = 9;
		train9.trainNo = 345686;
		train9.trainName = "JanShatabdi";
		train9.sourceStation = "Bangalore";
		train9.destinationStation = "Mangalore";
		Compartment compartment9 = new Compartment();
		compartment9.compartmentId = 109;
		compartment9.compartmentType = "AC";
		compartment9.seatCapacity = 30;
		train9.compartment = compartment9;
		train9.displayTrainInfo();


		Train train10 = new Train();
		train10.trainId = 10;
		train10.trainNo = 345687;
		train10.trainName = "ChamundiExpress";
		train10.sourceStation = "Mysore";
		train10.destinationStation = "Bangalore";
		Compartment compartment10 = new Compartment();
		compartment10.compartmentId = 110;
		compartment10.compartmentType = "General";
		compartment10.seatCapacity = 55;
		train10.compartment = compartment10;
		train10.displayTrainInfo();


		Train train11 = new Train();
		train11.trainId = 11;
		train11.trainNo = 345688;
		train11.trainName = "KaveriExpress";
		train11.sourceStation = "Mysore";
		train11.destinationStation = "Chennai";
		Compartment compartment11 = new Compartment();
		compartment11.compartmentId = 111;
		compartment11.compartmentType = "Sleeper";
		compartment11.seatCapacity = 40;
		train11.compartment = compartment11;
		train11.displayTrainInfo();


		Train train12 = new Train();
		train12.trainId = 12;
		train12.trainNo = 345689;
		train12.trainName = "BrindavanExpress";
		train12.sourceStation = "Bangalore";
		train12.destinationStation = "Chennai";
		Compartment compartment12 = new Compartment();
		compartment12.compartmentId = 112;
		compartment12.compartmentType = "AC";
		compartment12.seatCapacity = 30;
		train12.compartment = compartment12;
		train12.displayTrainInfo();


		Train train13 = new Train();
		train13.trainId = 13;
		train13.trainNo = 345690;
		train13.trainName = "TungabhadraExpress";
		train13.sourceStation = "Bangalore";
		train13.destinationStation = "Hyderabad";
		Compartment compartment13 = new Compartment();
		compartment13.compartmentId = 113;
		compartment13.compartmentType = "Sleeper";
		compartment13.seatCapacity = 42;
		train13.compartment = compartment13;
		train13.displayTrainInfo();


		Train train14 = new Train();
		train14.trainId = 14;
		train14.trainNo = 345691;
		train14.trainName = "HassanExpress";
		train14.sourceStation = "Bangalore";
		train14.destinationStation = "Hassan";
		Compartment compartment14 = new Compartment();
		compartment14.compartmentId = 114;
		compartment14.compartmentType = "General";
		compartment14.seatCapacity = 50;
		train14.compartment = compartment14;
		train14.displayTrainInfo();


		Train train15 = new Train();
		train15.trainId = 15;
		train15.trainNo = 345692;
		train15.trainName = "MalnadExpress";
		train15.sourceStation = "Bangalore";
		train15.destinationStation = "Shimoga";
		Compartment compartment15 = new Compartment();
		compartment15.compartmentId = 115;
		compartment15.compartmentType = "Sleeper";
		compartment15.seatCapacity = 38;
		train15.compartment = compartment15;
		train15.displayTrainInfo();


		Train train16 = new Train();
		train16.trainId = 16;
		train16.trainNo = 345693;
		train16.trainName = "CoorgExpress";
		train16.sourceStation = "Bangalore";
		train16.destinationStation = "Madikeri";
		Compartment compartment16 = new Compartment();
		compartment16.compartmentId = 116;
		compartment16.compartmentType = "AC";
		compartment16.seatCapacity = 26;
		train16.compartment = compartment16;
		train16.displayTrainInfo();


		Train train17 = new Train();
		train17.trainId = 17;
		train17.trainNo = 345694;
		train17.trainName = "BelgaumExpress";
		train17.sourceStation = "Bangalore";
		train17.destinationStation = "Belgaum";
		Compartment compartment17 = new Compartment();
		compartment17.compartmentId = 117;
		compartment17.compartmentType = "Sleeper";
		compartment17.seatCapacity = 40;
		train17.compartment = compartment17;
		train17.displayTrainInfo();


		Train train18 = new Train();
		train18.trainId = 18;
		train18.trainNo = 345695;
		train18.trainName = "HubliExpress";
		train18.sourceStation = "Bangalore";
		train18.destinationStation = "Hubli";
		Compartment compartment18 = new Compartment();
		compartment18.compartmentId = 118;
		compartment18.compartmentType = "General";
		compartment18.seatCapacity = 48;
		train18.compartment = compartment18;
		train18.displayTrainInfo();


		Train train19 = new Train();
		train19.trainId = 19;
		train19.trainNo = 345696;
		train19.trainName = "KarwarExpress";
		train19.sourceStation = "Bangalore";
		train19.destinationStation = "Karwar";
		Compartment compartment19 = new Compartment();
		compartment19.compartmentId = 119;
		compartment19.compartmentType = "AC";
		compartment19.seatCapacity = 34;
		train19.compartment = compartment19;
		train19.displayTrainInfo();


		Train train20 = new Train();
		train20.trainId = 20;
		train20.trainNo = 345697;
		train20.trainName = "MangaloreExpress";
		train20.sourceStation = "Bangalore";
		train20.destinationStation = "Mangalore";
		Compartment compartment20 = new Compartment();
		compartment20.compartmentId = 120;
		compartment20.compartmentType = "Sleeper";
		compartment20.seatCapacity = 40;
		train20.compartment = compartment20;
		train20.displayTrainInfo();

	}
}