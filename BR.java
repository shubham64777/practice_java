package hello;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BR {

	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		System.out.print("enter the number of your choice:");
		int n = Integer.parseInt(bf.readLine());
		System.out.printf("number that you entered is %d", n);
		bf.close();
	}

}
