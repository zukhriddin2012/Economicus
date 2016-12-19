import java.util.Scanner;
public class Books {
	String name, publisher, author;
	int year, pages;
	Scanner ob = new Scanner(System.in);
	Books(String name, String publisher, int year, int pages, String author){
		this.name = name;
		this.pages = pages;
		this.publisher = publisher;
		this.year = year;
		this.author = author;
	}
	
	void disp(){
		System.out.println("Book: "+name+"\nAuthor: "+author+"\nPublisher: "+publisher+"\nPages: "+pages+"\nYear: "+year);
		
	}
}
