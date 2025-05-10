package hello;
import java.util.Scanner;
public class userinput2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how old are you?");
		int age = Integer.parseInt(sc.nextLine());
		System.out.printf("oh, you are %d years old",age);
	}

}
