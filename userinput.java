package hello;
import java.util.Scanner;
public class userinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("enter your name:");
//	    String name =sc.nextLine();
//	    System.out.println("Your name is "+name);
	    System.out.println("what is your name?");
	    String name1 = sc.nextLine();
	    System.out.printf("hello %s, How are you?\n",name1);
	    System.out.printf("%s how old are you",name1);
	    int age = sc.nextInt();
	    System.out.printf("%s, %d is a good age to start coding\n", name1,age);
	    sc.nextLine();
	    System.out.printf("what coding language do you prefer\n");
	    String language = sc.nextLine();
	    System.out.printf("%s, %s is a great language to begin with",name1,language);
	    sc.close();
	}

}
