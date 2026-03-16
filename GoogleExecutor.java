class GoogleExecutor {

    public static void main(String[] args) {

        Google g1 = new Google(1,"Gmail","Communication",0.0,"1.0","Google",2004,"Web",4.5,1000000,"Free","English","50MB","2025-01-01",true,"USA","support@gmail.com","www.gmail.com","Google","Active");
        Google g2 = new Google(2,"YouTube","Entertainment",0.0,"2.0","Google",2005,"Web",4.7,2000000,"Free","English","100MB","2025-02-01",true,"USA","support@youtube.com","www.youtube.com","Google","Active");
        Google g3 = new Google(3,"Google Maps","Navigation",0.0,"3.1","Google",2005,"Mobile",4.6,1500000,"Free","English","120MB","2025-03-01",true,"USA","support@maps.com","www.maps.google.com","Google","Active");
        Google g4 = new Google(4,"Google Drive","Storage",0.0,"2.5","Google",2012,"Web",4.4,1200000,"Free","English","80MB","2025-04-01",true,"USA","support@drive.com","www.drive.google.com","Google","Active");
        Google g5 = new Google(5,"Google Photos","Media",0.0,"5.0","Google",2015,"Mobile",4.5,900000,"Free","English","60MB","2025-05-01",true,"USA","support@photos.com","www.photos.google.com","Google","Active");
        Google g6 = new Google(6,"Google Chrome","Browser",0.0,"10.0","Google",2008,"Desktop",4.8,3000000,"Free","English","200MB","2025-06-01",true,"USA","support@chrome.com","www.chrome.com","Google","Active");
        Google g7 = new Google(7,"Google Meet","Communication",0.0,"4.2","Google",2017,"Web",4.3,800000,"Free","English","70MB","2025-07-01",true,"USA","support@meet.com","www.meet.google.com","Google","Active");
        Google g8 = new Google(8,"Google Docs","Productivity",0.0,"6.1","Google",2006,"Web",4.5,1100000,"Free","English","90MB","2025-08-01",true,"USA","support@docs.com","www.docs.google.com","Google","Active");
        Google g9 = new Google(9,"Google Sheets","Productivity",0.0,"6.0","Google",2006,"Web",4.4,950000,"Free","English","85MB","2025-09-01",true,"USA","support@sheets.com","www.sheets.google.com","Google","Active");
        Google g10 = new Google(10,"Google Classroom","Education",0.0,"3.5","Google",2014,"Web",4.6,700000,"Free","English","75MB","2025-10-01",true,"USA","support@classroom.com","www.classroom.google.com","Google","Active");

        g1.toDisplayDetails();
        g2.toDisplayDetails();
        g3.toDisplayDetails();
        g4.toDisplayDetails();
        g5.toDisplayDetails();
        g6.toDisplayDetails();
        g7.toDisplayDetails();
        g8.toDisplayDetails();
        g9.toDisplayDetails();
        g10.toDisplayDetails();
    }
}