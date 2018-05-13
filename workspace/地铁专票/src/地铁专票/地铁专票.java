package 地铁专票;

import java.util.Scanner;

public class 地铁专票 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请投币：");
		Scanner in= new Scanner(System.in);
		int amount=in.nextInt();
		System.out.println(amount);
		System.out.println(amount>=10);
		if (amount>=10)
		{
			System.out.println("****************");
			System.out.println("***地铁专票*****");
			System.out.println("******无座******");
			System.out.println("*****10圆*******");
			System.out.println("****************");
//计算并打印找零
			System.out.println("找零："+(amount-10));
			
		}
	}

}
