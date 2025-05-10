package hello;
import java.util.Arrays;
public class Array2 {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5};
//		int copy[] = numbers;//reference type
		int copy[] = Arrays.copyOf(numbers,numbers.length);//creates new array
		Arrays.fill(numbers,1,4,0);//startingFrom,endingOn,valueToFill
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(copy));
		int copy2[] = Arrays.copyOfRange(numbers, 1, 4);
		System.out.println(Arrays.toString(copy2));
	}

}
