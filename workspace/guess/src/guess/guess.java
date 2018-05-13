package guess;

import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int number=(int)(Math.random()*100+1);
		int a;
		int count=0;
		do
		{
			a=in.nextInt();
			count=count+1;
			if (a>number)
			{
				System.out.println("偏大");
			}
			else if(a<number)
			{
				System.out.println("偏小");
			}
		}while(a!=number);
		System.out.println("猜对了，共猜了："+count+"次");
	}

}
