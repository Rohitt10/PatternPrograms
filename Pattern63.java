import java.util.Scanner;
class Pattern63
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0,k=n/2;j<=n/2;j++)
			{
				if(i<=n/2 && j>=n/2-i)
					System.out.printf("%c",65+k--);
				else if(i>n/2 && j>=i-n/2)
					System.out.printf("%c",65+k--);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}