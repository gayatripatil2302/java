package constructor;

public class Book {
	String bookName;
	int bookId;
	String author;
	int price;
	
	public Book(String bookName, int bookId ) {
		this.bookName = bookName;
		this.bookId = bookId;
	}
		
	public Book( String bookName, int bookId,String author,int price) {
		this.bookName = bookName;
		this.bookId = bookId;
		this.author = author;
		this.price = price;
	}

}
