import java.util.Scanner;
class Pattern52
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0,k=0;i<n;i+=2,k++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=k && j<=n-k-1)
					System.out.printf("%c",64+n-i);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}