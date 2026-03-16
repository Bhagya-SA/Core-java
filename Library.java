class Library {

    int libraryId;
    String name;
    String location;
    int totalBooks;
    long availableBooks;
    int issuedBooks;
    String librarianName;
    String phone;
    String email;
    boolean digitalLibrary;
    String openingTime;
    double finePerDay;

    
    Library(int libraryId){
        this.libraryId = libraryId;
    }

    
    Library(String name){
        this.name = name;
    }

    
    Library(String location, int totalBooks){
        this.location = location;
        this.totalBooks = totalBooks;
    }

    
    Library(long availableBooks){
        this.availableBooks = availableBooks;
    }

    
    Library(int issuedBooks, String librarianName , long availableBooks){
        this.issuedBooks = issuedBooks;
        this.librarianName = librarianName;
		this.availableBooks = availableBooks;
    }

    
    Library(String phone, String email){
        this.phone = phone;
        this.email = email;
    }

    
    Library(boolean digitalLibrary){
        this.digitalLibrary = digitalLibrary;
    }

    
    Library(String openingTime, double finePerDay){
        this.openingTime = openingTime;
        this.finePerDay = finePerDay;
    }

    
    Library(int libraryId, String name){
        this.libraryId = libraryId;
        this.name = name;
    }

    
    Library(int totalBooks, long availableBooks){
        this.totalBooks = totalBooks;
        this.availableBooks = availableBooks;
    }

    
    Library(double finePerDay, boolean digitalLibrary){
        this.finePerDay = finePerDay;
        this.digitalLibrary = digitalLibrary;
    }

    
    Library(String name, String location, String librarianName){
        this.name = name;
        this.location = location;
        this.librarianName = librarianName;
    }
}