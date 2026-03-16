class Book {

    int bookId;
    String title;
    String author;
    String publisher;
    int edition;
    String isbn;
    long pages;
    String category;
    double price;
    boolean available;
    String shelfLocation;
    String language;

    Book(int bookId){
        this.bookId = bookId;
    }

    Book(String title){
        this.title = title;
    }

    Book(String author, String publisher){
        this.author = author;
        this.publisher = publisher;
    }

    Book(int edition, String isbn){
        this.edition = edition;
        this.isbn = isbn;
    }

    Book(long pages){
        this.pages = pages;
    }

    Book(String category, double price){
        this.category = category;
        this.price = price;
    }

    Book(boolean available){
        this.available = available;
    }

    Book(String shelfLocation, int bookId){
        this.shelfLocation = shelfLocation;
        this.bookId = bookId;
    }

    Book(String language, double price, boolean available){
        this.language = language;
        this.price = price;
        this.available = available;
    }

    Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    Book(double price, boolean available){
        this.price = price;
        this.available = available;
    }

    Book(String title, String author, String category){
        this.title = title;
        this.author = author;
        this.category = category;
    }
}