import java.util.Scanner;
class Pattern91
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=n/2)
				{
					if(j==n/2+i || j==n/2-i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else if(i>n/2)
				{
					if(j==i-n/2 || j==n-i+n/2-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}