package ����ʹ��;

import java.util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x;
		double sum=0;
		int cnt=0;
		int[] numbers=new int[100];
		x=in.nextInt();
		while(x!=-1)
		{
			numbers[cnt]=x;
			sum+=x;
			cnt++;
			x=in.nextInt();
			
		}
		if( cnt>0 )
		{
			double average=sum/cnt;
			for ( int i=0;i<cnt;i++)
			{
				if ( numbers[i]>average )
				{
					System.out.println(numbers[i]);
				}
			}
					
		}
	}

}
