import java.util.Scanner;
class Pattern83
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==n/2-i || j==n/2+i)
					System.out.print(n/2-i+1);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}		