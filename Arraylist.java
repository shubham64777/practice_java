package hello;
import java.util.ArrayList;
import java.util.Comparator;
public class Arraylist {

	public static void main(String[] args) {
     ArrayList<Integer> number = new ArrayList<Integer>();
     number.add(1);//adds value in the array from 0th index
     number.add(2);
     number.add(3);
     number.add(4);
     number.add(5);
     number.add(6);
     number.add(7);
     number.add(8);
     number.remove(4);//removes through index
     number.remove(Integer.valueOf(6));//removes elements through their value 
     System.out.println(number.toString());//converts the array into string
     number.set(1, Integer.valueOf(21));//replace value of the index with given value
     number.sort(Comparator.naturalOrder());//sorts the array in natural order
     System.out.println(number.toString());
     number.sort(Comparator.reverseOrder());//sorts the array in reverse order
     System.out.println(number.toString());
     System.out.println("The size of array is " + number.size());
     System.out.println("The value at 3rd index is  " + number.get(3));//gets value from particular index
     System.out.println("DO, the array contains 3" + number.contains(Integer.valueOf(3)));
     number.clear();//clears the whole array
     System.out.println(number.toString());
    System.out.println(number.isEmpty());//checks whether the array is empty or not 
    
	}

}
