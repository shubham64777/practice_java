package hello;

public class Ebook extends Book{
	private String format;
	Ebook(String title, String author,int pages, String format){
		super(title,author,pages);
		this.format = format;
	}
}
