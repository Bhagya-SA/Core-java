class LibraryExecutor {

    public static void main(String[] libraries) {

        Library lib1 = new Library(301);
        System.out.println("Library Id : " + lib1.libraryId);

        Library lib2 = new Library("Central Library");
        System.out.println("Library Name : " + lib2.name);

        Library lib3 = new Library("Downtown", 50000);
        System.out.println("Location : " + lib3.location);
        System.out.println("Total Books : " + lib3.totalBooks);

        Library lib4 = new Library(45000L);
        System.out.println("Available Books : " + lib4.availableBooks);

        Library lib5 = new Library(2000, "Alice Johnson", 45000L);
        System.out.println("Issued Books : " + lib5.issuedBooks);
        System.out.println("Librarian Name : " + lib5.librarianName);
        System.out.println("Available Books : " + lib5.availableBooks);

        Library lib6 = new Library("123-456-7890", "library@central.edu");
        System.out.println("Phone : " + lib6.phone);
        System.out.println("Email : " + lib6.email);

        Library lib7 = new Library(true);
        System.out.println("Digital Library : " + lib7.digitalLibrary);

        Library lib8 = new Library("09:00 AM", 1.5);
        System.out.println("Opening Time : " + lib8.openingTime);
        System.out.println("Fine Per Day : " + lib8.finePerDay);

        Library lib9 = new Library(302, "East Wing Library");
        System.out.println("Library Id : " + lib9.libraryId);
        System.out.println("Library Name : " + lib9.name);

        Library lib10 = new Library(50000, 45000L);
        System.out.println("Total Books : " + lib10.totalBooks);
        System.out.println("Available Books : " + lib10.availableBooks);

        Library lib11 = new Library(2.0, true);
        System.out.println("Fine Per Day : " + lib11.finePerDay);
        System.out.println("Digital Library : " + lib11.digitalLibrary);

        Library lib12 = new Library("West Library", "West Side", "John Smith");
        System.out.println("Library Name : " + lib12.name);
        System.out.println("Location : " + lib12.location);
        System.out.println("Librarian Name : " + lib12.librarianName);
    }
}