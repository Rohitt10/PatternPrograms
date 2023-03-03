import java.util.Scanner;
class Pattern55
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int k=n/2;
			for(int  j=0;j<=n/2;j++)
			{
				if(i<=n/2 && j<=i)
					System.out.print(k);
				else if(i>n/2 && j<=n-i-1)
					System.out.print(k);
				k--;
			}
			System.out.println();
		}
	}
}