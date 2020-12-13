import java.util.Map;
import java.util.HashMap;


public class Test {

	public static void main(String[] args) {
		
		Map<String, String> mp = new HashMap<String, String>();
		
		mp.put("Ian", "Jhumel");
		mp.put("Jackie", "Lou");
		mp.put("Rhea", "Lyn");
		
		System.out.print("Map: " + mp.get("Jackie"));

	}

}
