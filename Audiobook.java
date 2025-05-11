package hello;

public class Audiobook extends Book{
private int runtime;
Audiobook(String title, String author,int runtime){
	super(title,author,0);
	this.runtime = runtime;
}
}
