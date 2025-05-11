package hello;
public class details {

	public static void main(String[] args) {
     user localuser = new user("shubham soni","2005-03-30" );
     System.out.printf("%s was born on %s and is %s years old currently",localuser.getname(),localuser.getbirthDay(),localuser.age());
     Book book = new Book("Atomic Habits", "James Clear", 270);
     Audiobook ikigai = new Audiobook("Ikigai", "Francesc Miralles", 3000);
     Ebook jeeves = new Ebook("Carry On Jeeves", "P .G .Wodhouse", 280, "PDF");
     localuser.borrow(book);
     System.out.printf("\n%s borrowed these books %s",localuser.getname(),localuser.books.toString());
     System.out.println(ikigai.toString());
     System.out.println(jeeves.toString());
	}

}
