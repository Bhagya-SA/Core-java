class DanceExecutor {

	public static void main(String[] dancing) {

		/*Dance dance1 = new Dance();
		dance1.danceId = 121;
		dance1.danceName = "Bharatanatyam";
		dance1.originCountry = "India";
		Form form1 = new Form();
		form1.formId = 143;
		form1.formName = "Classical";
		form1.style = "Temple Dance";
		dance1.form = form1;
		dance1.displayDanceInfo();


		Dance dance2 = new Dance();
		dance2.danceId = 122;
		dance2.danceName = "Kathak";
		dance2.originCountry = "India";
		Form form2 = new Form();
		form2.formId = 144;
		form2.formName = "Classical";
		form2.style = "Storytelling";
		dance2.form = form2;
		dance2.displayDanceInfo();


		Dance dance3 = new Dance();
		dance3.danceId = 123;
		dance3.danceName = "Kuchipudi";
		dance3.originCountry = "India";
		Form form3 = new Form();
		form3.formId = 145;
		form3.formName = "Classical";
		form3.style = "Dramatic Dance";
		dance3.form = form3;
		dance3.displayDanceInfo();


		Dance dance4 = new Dance();
		dance4.danceId = 124;
		dance4.danceName = "Kathakali";
		dance4.originCountry = "India";
		Form form4 = new Form();
		form4.formId = 146;
		form4.formName = "Classical";
		form4.style = "Dance Drama";
		dance4.form = form4;
		dance4.displayDanceInfo();


		Dance dance5 = new Dance();
		dance5.danceId = 125;
		dance5.danceName = "Odissi";
		dance5.originCountry = "India";
		Form form5 = new Form();
		form5.formId = 147;
		form5.formName = "Classical";
		form5.style = "Graceful Dance";
		dance5.form = form5;
		dance5.displayDanceInfo();


		Dance dance6 = new Dance();
		dance6.danceId = 126;
		dance6.danceName = "Mohiniyattam";
		dance6.originCountry = "India";
		Form form6 = new Form();
		form6.formId = 148;
		form6.formName = "Classical";
		form6.style = "Feminine Dance";
		dance6.form = form6;
		dance6.displayDanceInfo();


		Dance dance7 = new Dance();
		dance7.danceId = 127;
		dance7.danceName = "Manipuri";
		dance7.originCountry = "India";
		Form form7 = new Form();
		form7.formId = 149;
		form7.formName = "Classical";
		form7.style = "Devotional Dance";
		dance7.form = form7;
		dance7.displayDanceInfo();


		Dance dance8 = new Dance();
		dance8.danceId = 128;
		dance8.danceName = "Salsa";
		dance8.originCountry = "Cuba";
		Form form8 = new Form();
		form8.formId = 150;
		form8.formName = "Latin";
		form8.style = "Partner Dance";
		dance8.form = form8;
		dance8.displayDanceInfo();


		Dance dance9 = new Dance();
		dance9.danceId = 129;
		dance9.danceName = "Hip Hop";
		dance9.originCountry = "USA";
		Form form9 = new Form();
		form9.formId = 151;
		form9.formName = "Street";
		form9.style = "Freestyle";
		dance9.form = form9;
		dance9.displayDanceInfo();


		Dance dance10 = new Dance();
		dance10.danceId = 130;
		dance10.danceName = "Ballet";
		dance10.originCountry = "Italy";
		Form form10 = new Form();
		form10.formId = 152;
		form10.formName = "Classical";
		form10.style = "Graceful";
		dance10.form = form10;
		dance10.displayDanceInfo();


		Dance dance11 = new Dance();
		dance11.danceId = 131;
		dance11.danceName = "Breakdance";
		dance11.originCountry = "USA";
		Form form11 = new Form();
		form11.formId = 153;
		form11.formName = "Street";
		form11.style = "Power Moves";
		dance11.form = form11;
		dance11.displayDanceInfo();


		Dance dance12 = new Dance();
		dance12.danceId = 132;
		dance12.danceName = "Tap Dance";
		dance12.originCountry = "USA";
		Form form12 = new Form();
		form12.formId = 154;
		form12.formName = "Modern";
		form12.style = "Rhythmic";
		dance12.form = form12;
		dance12.displayDanceInfo();


		Dance dance13 = new Dance();
		dance13.danceId = 133;
		dance13.danceName = "Flamenco";
		dance13.originCountry = "Spain";
		Form form13 = new Form();
		form13.formId = 155;
		form13.formName = "Folk";
		form13.style = "Expressive";
		dance13.form = form13;
		dance13.displayDanceInfo();


		Dance dance14 = new Dance();
		dance14.danceId = 134;
		dance14.danceName = "Cha Cha";
		dance14.originCountry = "Cuba";
		Form form14 = new Form();
		form14.formId = 156;
		form14.formName = "Latin";
		form14.style = "Ballroom";
		dance14.form = form14;
		dance14.displayDanceInfo();


		Dance dance15 = new Dance();
		dance15.danceId = 135;
		dance15.danceName = "Waltz";
		dance15.originCountry = "Austria";
		Form form15 = new Form();
		form15.formId = 157;
		form15.formName = "Ballroom";
		form15.style = "Smooth";
		dance15.form = form15;
		dance15.displayDanceInfo();


		Dance dance16 = new Dance();
		dance16.danceId = 136;
		dance16.danceName = "Tango";
		dance16.originCountry = "Argentina";
		Form form16 = new Form();
		form16.formId = 158;
		form16.formName = "Ballroom";
		form16.style = "Passionate";
		dance16.form = form16;
		dance16.displayDanceInfo();


		Dance dance17 = new Dance();
		dance17.danceId = 137;
		dance17.danceName = "Garba";
		dance17.originCountry = "India";
		Form form17 = new Form();
		form17.formId = 159;
		form17.formName = "Folk";
		form17.style = "Group Dance";
		dance17.form = form17;
		dance17.displayDanceInfo();


		Dance dance18 = new Dance();
		dance18.danceId = 138;
		dance18.danceName = "Bhangra";
		dance18.originCountry = "India";
		Form form18 = new Form();
		form18.formId = 160;
		form18.formName = "Folk";
		form18.style = "Energetic";
		dance18.form = form18;
		dance18.displayDanceInfo();


		Dance dance19 = new Dance();
		dance19.danceId = 139;
		dance19.danceName = "Kolkali";
		dance19.originCountry = "India";
		Form form19 = new Form();
		form19.formId = 161;
		form19.formName = "Folk";
		form19.style = "Stick Dance";
		dance19.form = form19;
		dance19.displayDanceInfo();


		Dance dance20 = new Dance();
		dance20.danceId = 140;
		dance20.danceName = "Samba";
		dance20.originCountry = "Brazil";
		Form form20 = new Form();
		form20.formId = 162;
		form20.formName = "Latin";
		form20.style = "Festival Dance";
		dance20.form = form20;
		dance20.displayDanceInfo(); */

		Form f1 = new Form(143, "Classical", "Temple Dance");
        Dance d1 = new Dance(121, "Bharatanatyam", "India", "Classical", f1);
        d1.displayDanceInfo();

        Form f2 = new Form(144, "Classical", "Storytelling");
        Dance d2 = new Dance(122, "Kathak", "India", "Classical", f2);
        d2.displayDanceInfo();

        Form f3 = new Form(145, "Classical", "Dramatic Dance");
        Dance d3 = new Dance(123, "Kuchipudi", "India", "Classical", f3);
        d3.displayDanceInfo();

        Form f4 = new Form(146, "Classical", "Dance Drama");
        Dance d4 = new Dance(124, "Kathakali", "India", "Classical", f4);
        d4.displayDanceInfo();

        Form f5 = new Form(147, "Classical", "Graceful Dance");
        Dance d5 = new Dance(125, "Odissi", "India", "Classical", f5);
        d5.displayDanceInfo();

        Form f6 = new Form(148, "Classical", "Feminine Dance");
        Dance d6 = new Dance(126, "Mohiniyattam", "India", "Classical", f6);
        d6.displayDanceInfo();

        Form f7 = new Form(149, "Classical", "Devotional Dance");
        Dance d7 = new Dance(127, "Manipuri", "India", "Classical", f7);
        d7.displayDanceInfo();

        Form f8 = new Form(150, "Latin", "Partner Dance");
        Dance d8 = new Dance(128, "Salsa", "Cuba", "Latin", f8);
        d8.displayDanceInfo();

        Form f9 = new Form(151, "Street", "Freestyle");
        Dance d9 = new Dance(129, "Hip Hop", "USA", "Street", f9);
        d9.displayDanceInfo();

        Form f10 = new Form(152, "Classical", "Graceful");
        Dance d10 = new Dance(130, "Ballet", "Italy", "Classical", f10);
        d10.displayDanceInfo();

        Form f11 = new Form(153, "Street", "Power Moves");
        Dance d11 = new Dance(131, "Breakdance", "USA", "Street", f11);
        d11.displayDanceInfo();

        Form f12 = new Form(154, "Modern", "Rhythmic");
        Dance d12 = new Dance(132, "Tap Dance", "USA", "Modern", f12);
        d12.displayDanceInfo();

        Form f13 = new Form(155, "Folk", "Expressive");
        Dance d13 = new Dance(133, "Flamenco", "Spain", "Folk", f13);
        d13.displayDanceInfo();

        Form f14 = new Form(156, "Latin", "Ballroom");
        Dance d14 = new Dance(134, "Cha Cha", "Cuba", "Latin", f14);
        d14.displayDanceInfo();

        Form f15 = new Form(157, "Ballroom", "Smooth");
        Dance d15 = new Dance(135, "Waltz", "Austria", "Ballroom", f15);
        d15.displayDanceInfo();

        Form f16 = new Form(158, "Ballroom", "Passionate");
        Dance d16 = new Dance(136, "Tango", "Argentina", "Ballroom", f16);
        d16.displayDanceInfo();

        Form f17 = new Form(159, "Folk", "Group Dance");
        Dance d17 = new Dance(137, "Garba", "India", "Folk", f17);
        d17.displayDanceInfo();

        Form f18 = new Form(160, "Folk", "Energetic");
        Dance d18 = new Dance(138, "Bhangra", "India", "Folk", f18);
        d18.displayDanceInfo();

        Form f19 = new Form(161, "Folk", "Stick Dance");
        Dance d19 = new Dance(139, "Kolkali", "India", "Folk", f19);
        d19.displayDanceInfo();

        Form f20 = new Form(162, "Latin", "Festival Dance");
        Dance d20 = new Dance(140, "Samba", "Brazil", "Latin", f20);
        d20.displayDanceInfo();

	}
}
