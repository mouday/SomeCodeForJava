import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int isprime=1;
		int n=in.nextInt();
		for(int i=2;i<n;i++)
		{
			if (n%i==0)
			{
				isprime=0;
				break;
			}
		}
		if(isprime==1)
		{
			System.out.println(n+"��������");
		}
		else if(isprime==0)
		{
			System.out.println(n+"������������");
		}
	}

}
