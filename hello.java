package hello;

public class hello {

	public static void main(String[] args) {
     System.out.println("hello world");
     int age =19;
     double  age1 = age;
     System.out.println(age1);
//     int age2 = age1; integer cannot be converted into double
     int age3 = (int)age1;
     System.out.println(age3);
     System.out.println("I am " + age +" years old");
	}

}
