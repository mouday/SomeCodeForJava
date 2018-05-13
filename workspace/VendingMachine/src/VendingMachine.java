
public class VendingMachine {
	double price;
	double balance;
	int total;
	VendingMachine(int price)
	{
		this.balance=price;
	}
	VendingMachine(double price)
	{
		this.balance=price;
	}
	void showPrompt()
	{
		System.out.println("welcome!");
	}
	
	void showbalance()
	{
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm =new VendingMachine(6.5);
		vm.showbalance();
		
	}

}
