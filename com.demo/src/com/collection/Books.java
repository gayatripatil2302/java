package com.collection;

public class Books {
	private int bookId;
	private String bookName;
	private String author;
	
	public Books() {
		super();
	}
	
	public Books(int bookId,String bookName,String author ) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}
	
	public int getBookID() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	

	public String getBooName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

}
