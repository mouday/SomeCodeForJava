package getnumber;

import java.util.Scanner;

public class getnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int count=0;
		while(number>0)
		{
			number=number/10;
			count=count+1;
			
			System.out.println("number="+number+",count="+count);
		}
		System.out.println(count);
	}

}
