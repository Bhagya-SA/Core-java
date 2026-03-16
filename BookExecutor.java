class BookExecutor {

	public static void main(String[] books) {
	
		Book book1 = new Book(1);
		System.out.println("Book Id : " + book1.bookId);
		
		Book book2 = new Book("Java Programming");
		System.out.println("Title : " + book2.title);
		
		Book book3 = new Book("James Gosling", "Sun Publications");
		System.out.println("Author : " + book3.author);
		System.out.println("Publisher : " + book3.publisher);
		
		Book book4 = new Book(3, "ISBN12345");
		System.out.println("Edition : " + book4.edition);
		System.out.println("ISBN : " + book4.isbn);
		
		Book book5 = new Book(450L);
		System.out.println("Pages : " + book5.pages);
		
		Book book6 = new Book("Programming", 599.99);
		System.out.println("Category : " + book6.category);
		System.out.println("Price : " + book6.price);
		
		Book book7 = new Book(true);
		System.out.println("Available : " + book7.available);
		
		Book book8 = new Book("Shelf A1", 101);
		System.out.println("Shelf Location : " + book8.shelfLocation);
		System.out.println("Book Id : " + book8.bookId);
		
		Book book9 = new Book("English", 450.50, true);
		System.out.println("Language : " + book9.language);
		System.out.println("Price : " + book9.price);
		System.out.println("Available : " + book9.available);
		
		Book book10 = new Book(10, "Data Structures", "Mark Allen");
		System.out.println("Book Id : " + book10.bookId);
		System.out.println("Title : " + book10.title);
		System.out.println("Author : " + book10.author);
		
		Book book11 = new Book(799.99, true);
		System.out.println("Price : " + book11.price);
		System.out.println("Available : " + book11.available);
		
		Book book12 = new Book("Python Basics", "Guido", "Programming");
		System.out.println("Title : " + book12.title);
		System.out.println("Author : " + book12.author);
		System.out.println("Category : " + book12.category);
	}
}