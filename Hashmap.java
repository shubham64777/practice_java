package hello;
import java.util.HashMap;
public class Hashmap {

	public static void main(String[] args) {
     HashMap<String, Integer> examScores = new HashMap<String, Integer>();
     examScores.put("maths",95);
     examScores.put("english",91);
     examScores.put("science",75);
     examScores.put("drawing",89);
     examScores.put("socialScience",75);
     System.out.println(examScores);
	examScores.forEach((subject,marks)->{
		examScores.replace(subject, marks+5);
//		System.out.println("you scored " + marks + " in "+subject);
	});
	examScores.putIfAbsent("games", 100);
	System.out.println(examScores.toString());
	System.out.println(examScores.get("maths"));
	System.out.println(examScores.getOrDefault("hindi" ,-1));
	examScores.remove("socialScience");
	System.out.println(examScores.toString());
	System.out.println(examScores.containsKey("maths"));
	examScores.clear();
	System.out.println(examScores.isEmpty());
	System.out.println(examScores.containsValue(100));
	}
}
