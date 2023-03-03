import java.util.Scanner;
class Pattern54
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n/2;j++)
			{
				if(i<=n/2)
				{
					if(j<=i)
						System.out.print("*");
				}
				else if(i>n/2)
				{
					if(j<n-i)
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
					