package sum;

import java.util.Scanner;

public class sumcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int number;
		int sum=0;
		int count=0;
//		number=in.nextInt();
//		while(number!=-1)
//		{
//			sum=sum+number;
//			count=count+1;
//			number=in.nextInt();
//			
//		}
		do 
		{
			number=in.nextInt();
			if (number!=-1)
			{
				sum=sum+number;
				count=count+1;		
			}
		}	
		while(number!=-1);
		if(count>0)
		{
			System.out.println("ƽ������"+(double)sum/count);
		}
	}

}
