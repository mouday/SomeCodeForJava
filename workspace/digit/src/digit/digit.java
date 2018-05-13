package digit;

import java.util.Scanner;

public class digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int number;
		number=in.nextInt();
		int digit;
		int result=0;
		while( number>0 )
		{
			digit=number%10;
			result=result*10+digit;
			number=number/10;
		}
		System.out.println(result);
	}

}
