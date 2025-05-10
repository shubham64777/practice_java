package hello;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number:");
		double number1 = Double.parseDouble(sc.nextLine());
		System.out.print("enter the Second number:");
		double number2 = Double.parseDouble(sc.nextLine());
		System.out.print("what operation do you want to perform (ex - add,sub,mul,div):");
		String operation = sc.nextLine();
		if(operation.equals("add")) {
			System.out.printf("%f + %f = %f",number1,number2,number1+number2);
		}
		else if(operation.equals("sub")) {
			System.out.printf("%f - %f = %f",number1,number2,number1-number2);
		}
		else if(operation.equals("mul")) {
			System.out.printf("%f * %f = %f",number1,number2,number1*number2);
		}
		else if(operation.equals("div")) {
			if(number2 == 0) {
				System.out.println("you cannot divide number by zero");
			}
			else {				
				System.out.printf("%f / %f = %f",number1,number2,number1/number2);
			}
		}
		else{
			System.out.println("invalid input");
		}
		sc.close();
	}

}
