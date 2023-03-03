import java.util.Scanner;
class Pattern89
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==i || j==n-i-1)
					System.out.printf("%c",65+i);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}