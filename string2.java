package hello;

public class string2 {
	public static void main(String[] args) {
		String name ="Shubham Soni";
		int age = 20;
		String address = "Jharkhand";
		String details = String.format("My name is %s. I am %d years old. I live in %s",name,age,address);
		System.out.println(details);
		System.out.println(name.length());
		System.out.println(details.replace("live", "was born"));
		System.out.println(details.toUpperCase());
		System.out.println(details.toLowerCase());
		System.out.printf("my name is %s. I live in %s, I am %d years old",name,address,age);
	}
}
