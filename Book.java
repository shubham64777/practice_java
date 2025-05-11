package hello;

public class Book {
   private String title;
   private String author;
   private int pages;
   Book(String title, String author, int pages){
	   this.title = title;
	   this.author = author;
	   this.pages = pages;
   }
   public String toString() {
	  return String.format("%s of author %s having %d pages\n",this.title,this.author,this.pages);
   }
}
