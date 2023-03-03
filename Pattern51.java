import java.util.Scanner;
class Pattern51
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:  ");
		int n=sc.nextInt();
		for(int i=0,k=n;i<=n/2;i++,k--)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=i && j<=n-1-i)
					System.out.printf("%c",64+k);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}