class RamSitaHospital {

	public static String[] findDoctorsBySpecialization(String specialization) {
		//42 specializations
		//15 doctors
		System.out.println("Invoking findDoctorsBySpecialization(String specialization)method");
		
		if(specialization == "Cardiac Sciences") {
			System.out.println("Specialization is compared with Cardiologists");
			String[] cardiacSciencesDoctors = {"Dr. Aadhya","Dr. Teju","Dr. Arjun","Dr. Neel","Dr. Kavi","Dr. Isha","Dr. Rohan","Dr. Tara","Dr. Veer","Dr. Sai","Dr. Ayaan","Dr. Meera","Dr. Ritu","Dr. Om","Dr. Priya"};
			System.out.println("cardiacSciencesDoctors decalred and initialized");
			System.out.println("Sending cardiacSciencesDoctors to main method");
			return cardiacSciencesDoctors;
		}
		
		else if(specialization == "Orthopedicians") {
			//System.out.println("Specialization is compared with Orthopedicians");
			String[] orthopedicianDoctors = {"Dr. Anathya","Dr. Spathami","Dr. Arjun","Dr. Neel","Dr. Kavi","Dr. Isha","Dr. Rohan","Dr. Tara","Dr. Veer","Dr. Sai","Dr. Ayaan","Dr. Meera","Dr. Ritu","Dr. Om","Dr. Priya"};
			//System.out.println("orthopedicianDoctors declared and initialized");
			//System.out.println("Sending orthopedicianDoctors to main method");
			return orthopedicianDoctors;
		}
		
		else if(specialization == "Neurologists") {
			//System.out.println("Specialization is compared with Neurologists");
			String[] neurologistDoctors = {"Dr. Manitha","Dr. Adhvitha","Dr. Arjun","Dr. Neel","Dr. Kavi","Dr. Isha","Dr. Rohan","Dr. Tara","Dr. Veer","Dr. Sai","Dr. Ayaan","Dr. Meera","Dr. Ritu","Dr. Om","Dr. Priya"};
			//System.out.println("neurologistDoctors declared and initialized");
			//System.out.println("Sending neurologistDoctors to main method");
			return neurologistDoctors;
		}
		
		else if(specialization == "Oncologists") {
			//System.out.println("Specialization is compared with Oncologists");
			String[] oncologistDoctors = {"Dr. Bharath","Dr. Bushan","Dr. Arjun","Dr. Neel","Dr. Kavi","Dr. Isha","Dr. Rohan","Dr. Tara","Dr. Veer","Dr. Sai","Dr. Ayaan","Dr. Meera","Dr. Ritu","Dr. Om","Dr. Priya"};
			//System.out.println("oncologistDoctors declared and initialized");
			//System.out.println("Sending oncologistDoctors to main method");
			return oncologistDoctors;
		}
		
		else if(specialization == "Anesthesiologists") {
			//System.out.println("Specialization is compared with Anesthesiologists");
			String[] anesthesiologistDoctors = {"Dr. Anvit","Dr. Bhavya","Dr. Charan","Dr. Divya","Dr. Eshan","Dr. Faiyaz","Dr. Gaurav","Dr. Harin","Dr. Ishir","Dr. Jivan","Dr. Kavya","Dr. Layan","Dr. Mihir","Dr. Nivaan","Dr. Ojas"};
			//System.out.println("anesthesiologistDoctors declared and initialized");
			//System.out.println("Sending anesthesiologistDoctors to main method");
			return anesthesiologistDoctors;
		}
		
		else if(specialization == "ENT specialists") {
			//System.out.println("Specialization is compared with ENT specialists");
			String[] entSpecialistDoctors = {"Dr. Krupathya","Dr. Jeevith","Dr. Aarav","Dr. Bhavin","Dr. Chayan","Dr. Dhiren","Dr. Eshaan","Dr. Farhan","Dr. Gatik","Dr. Hiran","Dr. Ivaan","Dr. Jayan","Dr. Ketan","Dr. Luv","Dr. Manav"};
			//System.out.println("entSpecialistDoctors declared and initialized");
			//System.out.println("Sending entSpecialistDoctors to main method");
			return entSpecialistDoctors;
		}
		
		else if(specialization == "Dental Science") {
			String[] dentalScienceDoctors = {"Dr. Emily Carter", "Dr. Michael Thompson", "Dr. Sophia Martinez", "Dr. Daniel Rodriguez", "Dr. Olivia Bennett", "Dr. James Anderson", "Dr. Isabella Nguyen", "Dr. William Harris", "Dr. Ava Patel", "Dr. Benjamin Clark", "Dr. Mia Robinson", "Dr. Alexander Lewis", "Dr. Charlotte Walker", "Dr. Henry Young", "Dr. Amelia King"};
			return dentalScienceDoctors;
		}
		
		else if(specialization == "Dermatology") {
			String[] dermatologyDoctors = {"Dr. Asha Rao", "Dr. Neha Jain", "Dr. Ravi Shah", "Dr. Kiran Das", "Dr. Meera Iyer", "Dr. Aman Gill", "Dr. Pooja Sen", "Dr. Arjun Roy", "Dr. Nisha Ali", "Dr. Vikas Bhat", "Dr. Ritu Paul", "Dr. Sameer Khan", "Dr. Tina Bose", "Dr. Raj Mal", "Dr. Lata Nair"};
			return dermatologyDoctors;
		}
		
		else if(specialization == "Diabetology") {
			String[] diabetologyDoctors = {"Dr. Rohit Mehta", "Dr. Sneha Kapoor", "Dr. Kunal Verma", "Dr. Priya Nanda", "Dr. Tarun Joshi", "Dr. Anil Arora", "Dr. Divya Sethi", "Dr. Manoj Kulkarni", "Dr. Shreya Desai", "Dr. Nitin Goyal", "Dr. Kavya Menon", "Dr. Deepak Yadav", "Dr. Isha Malhotra", "Dr. Varun Chawla", "Dr. Rohan Bedi"};
			return diabetologyDoctors;
		}
		
		else if(specialization == "Emergency and Trauma") {
			String[] emergencyAndTraumaDoctors = {"Dr. Arvind Rao", "Dr. Neel Khanna", "Dr. Pritam Saha", "Dr. Kavita Rao", "Dr. Harish Pillai", "Dr. Sunita Reddy", "Dr. Vivek Suri", "Dr. Ananya Bose", "Dr. Lokesh Gupta", "Dr. Megha Rao", "Dr. Sandeep Nair", "Dr. Rakesh Soni", "Dr. Bhavna Kapoor", "Dr. Tushar Lal", "Dr. Gaurav Tandon"};
			return emergencyAndTraumaDoctors;
		}
		
		else if(specialization == "Foetal Medicine") {
			String[] foetalMedicineDoctors = {"Dr. Aditi Sharma", "Dr. Rahul Bansal", "Dr. Swati Mishra", "Dr. Vikram Malhotra", "Dr. Poonam Chatterjee", "Dr. Saurabh Tiwari", "Dr. Namita Arora", "Dr. Keshav Prasad", "Dr. Rachna Bhatia", "Dr. Abhishek Kulshreshtha", "Dr. Jyoti Anand", "Dr. Mukul Saxena", "Dr. Tanvi Srivastava", "Dr. Alok Tripathi", "Dr. Seema Vohra"};
			return foetalMedicineDoctors;
		}
		
		else if(specialization == "Gastroenterology and Hepatobiliary Sciences") {
			String[] gastroenterologyAndHepatobiliarySciencesDoctors = {"Dr. Adarsh Kulkarni", "Dr. Bhavesh Trivedi", "Dr. Chirag Vyas", "Dr. Dinesh Borkar", "Dr. Eshan Mukherjee", "Dr. Farhan Qureshi", "Dr. Gopal Krishnan", "Dr. Hitesh Parmar", "Dr. Imran Siddiqui", "Dr. Jatin Oberoi", "Dr. Kartik Iyengar", "Dr. Lalit Wadhwa", "Dr. Mohan Raut", "Dr. Nilesh Pandey", "Dr. Omkar Salgaonkar"};
			return gastroenterologyAndHepatobiliarySciencesDoctors;
		}
		
		else if(specialization == "Haematology") {
			String[] haematologyDoctors = {"Dr. Aarav Sinha", "Dr. Bharti Kulshrestha", "Dr. Chetan Rawal", "Dr. Devika Soman", "Dr. Eklavya Purohit", "Dr. Falguni Mehta", "Dr. Gaurangi Shah", "Dr. Harmeet Chawla", "Dr. Ishaan Kapur", "Dr. Jaya Narayanan", "Dr. Keshvi Talwar", "Dr. Lakshya Ahuja", "Dr. Mitali Saran", "Dr. Nirav Doshi", "Dr. Ojas Bendre"};
			return haematologyDoctors;
		}
		
		else if(specialization == "Infectious Diseases") {
			String[] infectiousDiseasesDoctors = {"Dr. Aarohi Mehra", "Dr. Vivek Nair", "Dr. Tanvi Joshi", "Dr. Rohan Kapoor", "Dr. Meera Iyer", "Dr. Kunal Bhat", "Dr. Nisha Verma", "Dr. Sandeep Rao", "Dr. Priya Malhotra", "Dr. Aman Singh", "Dr. Isha Choudhary", "Dr. Rohit Desai", "Dr. Kavya Sethi", "Dr. Arjun Pillai", "Dr. Shreya Anand"};
			return infectiousDiseasesDoctors;
		}
		
		else if(specialization == "Infertility Medicine") {
			String[] infertilityMedicineDoctors = {"Dr. Ananya Roy", "Dr. Karan Mehta", "Dr. Priya Sharma", "Dr. Rohit Verma", "Dr. Swati Kapoor", "Dr. Vivek Bansal", "Dr. Nisha Iyer", "Dr. Arjun Malhotra", "Dr. Tanvi Desai", "Dr. Rohan Gupta", "Dr. Kavya Nanda", "Dr. Sameer Joshi", "Dr. Ishita Rao", "Dr. Aditya Chawla", "Dr. Meera Singh"};
			return infertilityMedicineDoctors;
		}
		
		else if(specialization == "Internal Medicine") {
			String[] internalMedicineDoctors = {"Dr. Aditi Sharma", "Dr. Rahul Verma", "Dr. Meera Nair", "Dr. Kunal Kapoor", "Dr. Priya Joshi", "Dr. Arjun Bhat", "Dr. Sneha Malhotra", "Dr. Rohan Iyer", "Dr. Kavya Singh", "Dr. Aman Patel", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Tanvi Choudhary", "Dr. Sameer Gupta", "Dr. Ishita Mehta"};
			return internalMedicineDoctors;
		}
		
		else if(specialization == "Mental Health and Behavioural Sciences") {
			String[] mentalHealthAndBehaviouralSciencesDoctors = {"Dr. Aisha Verma", "Dr. Rohan Kapoor", "Dr. Meera Nair", "Dr. Arjun Bhat", "Dr. Priya Sharma", "Dr. Kunal Joshi", "Dr. Sneha Malhotra", "Dr. Tanvi Iyer", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Kavya Choudhary", "Dr. Aditya Patel"};
			return mentalHealthAndBehaviouralSciencesDoctors;
		}
		
		else if(specialization == "Nephrology") {
			String[] nephrologyDoctors = {"Dr. Ananya Sharma", "Dr. Rohit Verma", "Dr. Meera Nair", "Dr. Kunal Kapoor", "Dr. Priya Joshi", "Dr. Arjun Bhat", "Dr. Sneha Malhotra", "Dr. Tanvi Iyer", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Kavya Choudhary", "Dr. Aditya Patel"};
			return nephrologyDoctors;
		}
		
		else if(specialization == "Neurointerventional Radiology") {
			String[] neurointerventionalRadiologyDoctors = {"Dr. Arjun Mehta", "Dr. Priya Sharma", "Dr. Rohit Verma", "Dr. Kavya Iyer", "Dr. Tanvi Joshi", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Meera Nair", "Dr. Kunal Kapoor", "Dr. Sneha Malhotra", "Dr. Aditya Patel", "Dr. Ananya Bhat"};
			return neurointerventionalRadiologyDoctors;
		}
		
		else if(specialization == "Ophthalmology") {
			String[] ophthalmologyDoctors = {"Dr. Aisha Verma", "Dr. Rohan Kapoor", "Dr. Meera Nair", "Dr. Arjun Bhat", "Dr. Priya Sharma", "Dr. Kunal Joshi", "Dr. Sneha Malhotra", "Dr. Tanvi Iyer", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Kavya Choudhary", "Dr. Aditya Patel"};
			return ophthalmologyDoctors;
		}
		
		else if(specialization == "Neurosurgery") {
			String[] neurosurgeryDoctors = {"Dr. Aarav Mehta", "Dr. Priya Sharma", "Dr. Rohan Verma", "Dr. Kavya Iyer", "Dr. Tanvi Joshi", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Meera Nair", "Dr. Kunal Kapoor", "Dr. Sneha Malhotra", "Dr. Aditya Patel", "Dr. Ananya Bhat"};
			return neurosurgeryDoctors;
		}
		
		else if(specialization == "Obstetrics and Gynaecology") {
			String[] obstetricsAndGynaecologyDoctors = {"Dr. Aditi Sharma", "Dr. Meera Nair", "Dr. Priya Joshi", "Dr. Kavya Iyer", "Dr. Tanvi Malhotra", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Arjun Bhat", "Dr. Kunal Kapoor", "Dr. Sneha Verma", "Dr. Aditya Patel", "Dr. Ananya Roy"};
			return obstetricsAndGynaecologyDoctors;
		}
		
		else if(specialization == "Organ Transplant") {
			String[] organTransplantDoctors = {"Dr. Aarav Mehta", "Dr. Priya Sharma", "Dr. Rohan Verma", "Dr. Kavya Iyer", "Dr. Tanvi Joshi", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Meera Nair", "Dr. Kunal Kapoor", "Dr. Sneha Malhotra", "Dr. Aditya Patel", "Dr. Ananya Bhat"};
			return organTransplantDoctors;
		}
		
		else if(specialization == "Paediatrics") {
			String[] paediatricsDoctors = {"Dr. Aisha Verma", "Dr. Rohan Kapoor", "Dr. Meera Nair", "Dr. Arjun Bhat", "Dr. Priya Sharma", "Dr. Kunal Joshi", "Dr. Sneha Malhotra", "Dr. Tanvi Iyer", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Kavya Choudhary", "Dr. Aditya Patel"};
			return paediatricsDoctors;
		}
		
		else if(specialization == "Physiotherapy and Rehabilitation") {
			String[] physiotherapyAndRehabilitationDoctors = {"Dr. Aarav Sharma", "Dr. Priya Verma", "Dr. Rohan Kapoor", "Dr. Kavya Iyer", "Dr. Tanvi Joshi", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Meera Nair", "Dr. Kunal Kapoor", "Dr. Sneha Malhotra", "Dr. Aditya Patel", "Dr. Ananya Bhat"};
			return physiotherapyAndRehabilitationDoctors;
		}
		
		else if(specialization == "Plastic and Reconstructive Surgery") {
			String[] plasticAndReconstructiveSurgeryDoctors = {"Dr. Aarav Mehta", "Dr. Priya Sharma", "Dr. Rohan Verma", "Dr. Kavya Iyer", "Dr. Tanvi Joshi", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Meera Nair", "Dr. Kunal Kapoor", "Dr. Sneha Malhotra", "Dr. Aditya Patel", "Dr. Ananya Bhat"};
			return plasticAndReconstructiveSurgeryDoctors;
		}
		
		else if(specialization == "Pulmonology") {
			String[] pulmonologyDoctors = {"Dr. Aarav Sharma", "Dr. Priya Verma", "Dr. Rohan Kapoor", "Dr. Kavya Iyer", "Dr. Tanvi Joshi", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Meera Nair", "Dr. Kunal Kapoor", "Dr. Sneha Malhotra", "Dr. Aditya Patel", "Dr. Ananya Bhat"};
			return pulmonologyDoctors ;
		}
		
		else if(specialization == "Radiology") {
			String[] radiologyDoctors = {"Dr. Aarav Mehta", "Dr. Priya Sharma", "Dr. Rohan Verma", "Dr. Kavya Iyer", "Dr. Tanvi Joshi", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Meera Nair", "Dr. Kunal Kapoor", "Dr. Sneha Malhotra", "Dr. Aditya Patel", "Dr. Ananya Bhat"};
			return radiologyDoctors;
		}
		
		else if(specialization == "Rheumatology") {
			String[] rheumatologyDoctors = {"Dr. Aarav Sharma", "Dr. Priya Verma", "Dr. Rohan Kapoor", "Dr. Kavya Iyer", "Dr. Tanvi Joshi", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Meera Nair", "Dr. Kunal Kapoor", "Dr. Sneha Malhotra", "Dr. Aditya Patel", "Dr. Ananya Bhat"};
			return rheumatologyDoctors;
		}
		
		else if(specialization == "Support Specialties") {
			String[] supportSpecialtiesDoctors = {"Dr. Aisha Mehra", "Dr. Rohan Verma", "Dr. Meera Nair", "Dr. Arjun Bhat", "Dr. Priya Sharma", "Dr. Kunal Joshi", "Dr. Sneha Malhotra", "Dr. Tanvi Iyer", "Dr. Aman Singh", "Dr. Nisha Rao", "Dr. Varun Desai", "Dr. Ishita Mehta", "Dr. Sameer Gupta", "Dr. Kavya Choudhary", "Dr. Aditya Patel"};
			return supportSpecialtiesDoctors;
		}
		
		else if(specialization == "Thoracic Surgery") {
			String[] thoracicSurgeryDoctors = {"Dr. Kim","Dr. Lee","Dr. Roy","Dr. Tan","Dr. Lim","Dr. Yan","Dr. Ong","Dr. Wu","Dr. Sun","Dr. Ray","Dr. Jay","Dr. Cox","Dr. Fox","Dr. Day","Dr. Kay"};
			return thoracicSurgeryDoctors;
		}
		
		else if(specialization == "Transfusion Medicine") {
			String[] transfusionMedicineDoctors = {"Dr. Raj","Dr. Avi","Dr. Jai","Dr. Dev","Dr. Rajan","Dr. Aru","Dr. Isha","Dr. Neel","Dr. Kiran","Dr. Om","Dr. Tara","Dr. Nikh","Dr. Ritu","Dr. Veer","Dr. Aman"};
			return transfusionMedicineDoctors;
		}
		
		else if(specialization == "Urology") {
			String[] urologyDoctors = {"Dr. Arav","Dr. Sai","Dr. Omkar","Dr. Ragh","Dr. Manu","Dr. Anil","Dr. Ravi","Dr. Varun","Dr. Kesh","Dr. Moh","Dr. Sur","Dr. Akil","Dr. Lax","Dr. Tanu","Dr. Yash"};
			return urologyDoctors;
		}
		
		else if(specialization == "Endocrine Surgery") {
			String[] endocrineSurgeryDoctors = {"Dr. Kavi","Dr. Ishan","Dr. Neha","Dr. Arin","Dr. Veda","Dr. Omra","Dr. Ria","Dr. Jaiy","Dr. Anya","Dr. Veer","Dr. Dhru","Dr. Nila","Dr. Esha","Dr. Milan","Dr. Rosh"};
			return endocrineSurgeryDoctors;
		}
		
		else if(specialization == "Vascular Surgery") {
			String[] vascularSurgeryDoctors = {"Dr. Arush","Dr. Kiran","Dr. Tanvi","Dr. Rohan","Dr. Neel","Dr. Ayan","Dr. Ishaan","Dr. Meera","Dr. Varad","Dr. Dev","Dr. Nisha","Dr. Yuvan","Dr. Pari","Dr. Ritu","Dr. Omkar"};
			return vascularSurgeryDoctors;
		}
		
		else if(specialization == "Liver Transplant and Hepatobiliary Sciences") {
			String[] LiverTransplantAndHepatobiliaryScienceDoctors = {"Dr. Arin","Dr. Kavi","Dr. Neel","Dr. Tara","Dr. Rohan","Dr. Veer","Dr. Ishita","Dr. Aman","Dr. Nikhil","Dr. Priya","Dr. Anaya","Dr. Ritu","Dr. Sai","Dr. Om","Dr. Meera"};
			return LiverTransplantAndHepatobiliaryScienceDoctors;
		}
		
		else if(specialization == "Palliative Medicine") {
			String[] palliativeMedicineDoctors = {"Dr. Arya","Dr. Kabir","Dr. Neha","Dr. Ravi","Dr. Anvi","Dr. Ishan","Dr. Tara","Dr. Veer","Dr. Ria","Dr. Omkar","Dr. Kiran","Dr. Ayaan","Dr. Priya","Dr. Milan","Dr. Esha"};
			return palliativeMedicineDoctors;
		}
		
		else if(specialization == "Medical Genetics") {
			String[] medicalGeneticsDoctors = {"Dr. Arjun","Dr. Neel","Dr. Anaya","Dr. Kavi","Dr. Isha","Dr. Rohan","Dr. Tara","Dr. Veer","Dr. Sai","Dr. Ayaan","Dr. Meera","Dr. Ritu","Dr. Om","Dr. Priya","Dr. Milan"};
			return medicalGeneticsDoctors;
		}
		
		else if(specialization == "Pain and Palliative Medicine") {
			String[] PainAndPalliativeMedicineDoctors = {"Dr. Arya","Dr. Kabir","Dr. Anvi","Dr. Ishan","Dr. Ria","Dr. Omkar","Dr. Kiran","Dr. Ayaan","Dr. Priya","Dr. Milan","Dr. Esha","Dr. Neel","Dr. Tara","Dr. Veer","Dr. Rohan"};
			return PainAndPalliativeMedicineDoctors;
		}
		
		else if(specialization == "Geriatric Medicine") {
			String[] geriatricMedicineDoctors = {"Dr. Arjun","Dr. Neha","Dr. Kavi","Dr. Isha","Dr. Rohan","Dr. Tara","Dr. Veer","Dr. Sai","Dr. Ayaan","Dr. Meera","Dr. Ritu","Dr. Om","Dr. Priya","Dr. Milan","Dr. Anaya"};
			return geriatricMedicineDoctors;
		}
		
		else if(specialization == "Critical Care") {
			String[] criticalCareDoctors = {"Dr. Arav","Dr. Kabir","Dr. Anvi","Dr. Ishan","Dr. Ria","Dr. Omkar","Dr. Kiran","Dr. Ayaan","Dr. Priya","Dr. Milan","Dr. Esha","Dr. Neel","Dr. Tara","Dr. Veer","Dr. Rohan"};
			return criticalCareDoctors;
		}
		
		else if(specialization == "Nuclear Medicine") {
			String[] nuclearMedicineDoctors = {"Dr. Arin","Dr. Kavi","Dr. Neha","Dr. Rohan","Dr. Veer","Dr. Isha","Dr. Aman","Dr. Nikh","Dr. Priya","Dr. Anaya","Dr. Ritu","Dr. Sai","Dr. Om","Dr. Meera","Dr. Milan"};
			return nuclearMedicineDoctors;
		}

		else {
			System.out.println("Cuurently this specialization is not available in our hospital");
		}
		return null;	
	}
	
	public static String[] fetchDoctorNames(String[] doctors) {
		System.out.println("Invocking fetchDoctorNames method");
		for(String doctor : doctors) {
			System.out.println(doctor);
		}
		System.out.println("Feteched doctor names related to specialization");
		return null;
	}
	


}
        