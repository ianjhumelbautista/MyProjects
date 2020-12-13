import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
//		Map<String, String> mp = new HashMap<String, String>();
//		
//		mp.put("Ian", "Jhumel");
//		mp.put("Jackie", "Lou");
//		mp.put("Rhea", "Lyn");
//		
//		System.out.print("Map: " + mp.get("Jackie"));

//		int coin1 = 1;
//		int coin5 = 5;
//		int coin10 = 10;
//		int coin25 = 25;
		int coinCount = 0;
		int coinsTotal = 0;
		int counter = 0;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter coin count: ");
		coinCount = sc.nextInt();
		System.out.print("Enter coins total: ");
		coinsTotal = sc.nextInt();
		sc.close();
		
		System.out.println("Coin Count: "+coinCount+" Coins Total: "+coinsTotal);
		
		while(counter==coinCount && total==coinsTotal) {
			if(coinsTotal%10==0) {

			}
		}
		
		
	}

}
