package hello;

public class logicalor {
	
    public static void main(String[] args) {
	int a = 18;
	int b = 17;
	int c = 27;
	boolean bool = (a > b || a == b);
	System.out.println(bool);
	boolean bool2 = (a>=b && b>=c);
	System.out.println(bool2);
	System.out.println(a!=b);
   }
}
