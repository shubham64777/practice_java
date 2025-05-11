package hello;
import java.util.ArrayList;
public class forEachloop {
 public static void main(String[] args) {
	 ArrayList<Integer> numbers = new ArrayList<Integer>();
	 numbers.add(1);
	 numbers.add(3);
	 numbers.add(5);
	 numbers.add(7);
	 numbers.add(9);
	 System.out.println("Before :" + numbers);
	 numbers.forEach(number ->{
		 numbers.set(numbers.indexOf(number), number*2);
	 });
	 System.out.println("After :" + numbers);
 }
}
