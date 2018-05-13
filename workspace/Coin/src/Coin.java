import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames=new HashMap<Integer,String>();
	
	public Coin(){
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolor");
		System.out.println(coinnames.keySet().size());
		System.out.println(coinnames);
		for(Integer k:coinnames.keySet()){
			String s=coinnames.get(k);
			System.out.println(s);
		}
	}
	public String getname(int amount){
		if (coinnames.containsKey(amount))
			return coinnames.get(amount);
		else
			return "not found!";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		 
		 int amount=in.nextInt();
		 Coin coin= new Coin();
		 String name=coin.getname(amount);
		 System.out.println(name);
	}

}
