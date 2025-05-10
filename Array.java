package hello;
import java.util.Array;
import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		char vowels[] = new char[5];
		vowels[0] = 'a';
		vowels[1] = 'e';
		vowels[2] = 'i';
		vowels[3] = 'o';
		vowels[4] = 'u';
		System.out.println(Arrays.toString(vowels));
		int numbers[] = {5,4,3,2,1};
		Arrays.sort(numbers,1,4);//sorts section of array 4th index is not included
		System.out.println(Arrays.toString(numbers));
		int key = 3;
		int foundAtIndex = Arrays.binarySearch(numbers,1,4,key);//searches between 1st and 4th index excluding 4th
		System.out.println("found at index "+foundAtIndex);
	}

} 
