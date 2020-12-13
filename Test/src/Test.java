import java.util.Map;
import java.util.HashMap;


public class Test {

	public static void main(String[] args) {
		
		Map<String, String> mp = new HashMap<String, String>();
		
		
		mp.put("First", "Jhumel");
		mp.put("Second", "Jackie");
		mp.put("Third", "Rhea");
		
		System.out.print("Map: " + mp.get("First"));

	}

}
