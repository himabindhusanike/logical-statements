package com.java;
public class Library {
	
	int book_id;
	String book_title;
	String author_name;
	int available_copies;
	
	static String library_name="Central City Library";
	static String librarian_name="Allen";
	
	void display_Book_Details(){
		System.out.println("Book_Id         : "+book_id);
		System.out.println("Book_title      : "+book_title);
		System.out.println("Author Name     : "+author_name);
		System.out.println("Available copies: "+ available_copies);
		System.out.println("library Name    : "+library_name);
		System.out.println("librarian Name  : "+librarian_name);
		System.out.println();
	}
	void issue_book(){
		available_copies=available_copies-1;
		//  availableCopies--;
	}
	static void display_library_details() {
		System.out.println("library Name    : "+library_name);
		System.out.println("librarian Name  : "+librarian_name);
		System.out.println();
	}
	static void change_librarian() {
		librarian_name="jones";
	}
	public static void main(String[] args) {	
		Library b1=new Library();
		b1.book_id=1001;
		b1.book_title="Wings of Fire";
		b1.author_name="A. P. J. Abdul Kalam";
		b1.available_copies=10;

		b1.display_library_details();
		b1.display_Book_Details();
		
		Library b2=new Library();
		b2.book_id=1002;
		b2.book_title="Rich Dad Poor Dad";
		b2.author_name="Robin Sharma";
		b2.available_copies=20;
		
		b2.display_Book_Details();
		
		Library b3=new Library();
		b3.book_id=1003;
		b3.book_title="Think and Grow Rich";
		b3.author_name="Stephen King";
		b3.available_copies=30;
	
		b3.display_Book_Details();
		
		b1.issue_book();
		b2.issue_book();
		
		change_librarian();
		display_library_details();
			
		System.out.println("***** Updated Book 1 Details *****");
        b1.display_Book_Details();
        
        System.out.println("***** Updated Book 2 Details *****");
        b2.display_Book_Details();
	}
}


